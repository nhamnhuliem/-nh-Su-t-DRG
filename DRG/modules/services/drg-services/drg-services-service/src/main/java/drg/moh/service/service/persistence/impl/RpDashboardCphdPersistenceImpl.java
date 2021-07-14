/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package drg.moh.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.HashMapDictionary;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import drg.moh.service.exception.NoSuchRpDashboardCphdException;
import drg.moh.service.model.RpDashboardCphd;
import drg.moh.service.model.RpDashboardCphdTable;
import drg.moh.service.model.impl.RpDashboardCphdImpl;
import drg.moh.service.model.impl.RpDashboardCphdModelImpl;
import drg.moh.service.service.persistence.RpDashboardCphdPersistence;

import java.io.Serializable;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceRegistration;

/**
 * The persistence implementation for the rp dashboard cphd service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class RpDashboardCphdPersistenceImpl
	extends BasePersistenceImpl<RpDashboardCphd>
	implements RpDashboardCphdPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RpDashboardCphdUtil</code> to access the rp dashboard cphd persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RpDashboardCphdImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public RpDashboardCphdPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("tenTinh", "_ten_tinh");
		dbColumnNames.put("chiPhi", "_chiphi");
		dbColumnNames.put("dinhSuat", "_dinhsuat");
		dbColumnNames.put("drg", "_drg");

		setDBColumnNames(dbColumnNames);

		setModelClass(RpDashboardCphd.class);

		setModelImplClass(RpDashboardCphdImpl.class);
		setModelPKClass(long.class);

		setTable(RpDashboardCphdTable.INSTANCE);
	}

	/**
	 * Caches the rp dashboard cphd in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCphd the rp dashboard cphd
	 */
	@Override
	public void cacheResult(RpDashboardCphd rpDashboardCphd) {
		entityCache.putResult(
			RpDashboardCphdImpl.class, rpDashboardCphd.getPrimaryKey(),
			rpDashboardCphd);
	}

	/**
	 * Caches the rp dashboard cphds in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCphds the rp dashboard cphds
	 */
	@Override
	public void cacheResult(List<RpDashboardCphd> rpDashboardCphds) {
		for (RpDashboardCphd rpDashboardCphd : rpDashboardCphds) {
			if (entityCache.getResult(
					RpDashboardCphdImpl.class,
					rpDashboardCphd.getPrimaryKey()) == null) {

				cacheResult(rpDashboardCphd);
			}
		}
	}

	/**
	 * Clears the cache for all rp dashboard cphds.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RpDashboardCphdImpl.class);

		finderCache.clearCache(RpDashboardCphdImpl.class);
	}

	/**
	 * Clears the cache for the rp dashboard cphd.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RpDashboardCphd rpDashboardCphd) {
		entityCache.removeResult(RpDashboardCphdImpl.class, rpDashboardCphd);
	}

	@Override
	public void clearCache(List<RpDashboardCphd> rpDashboardCphds) {
		for (RpDashboardCphd rpDashboardCphd : rpDashboardCphds) {
			entityCache.removeResult(
				RpDashboardCphdImpl.class, rpDashboardCphd);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RpDashboardCphdImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(RpDashboardCphdImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new rp dashboard cphd with the primary key. Does not add the rp dashboard cphd to the database.
	 *
	 * @param id the primary key for the new rp dashboard cphd
	 * @return the new rp dashboard cphd
	 */
	@Override
	public RpDashboardCphd create(long id) {
		RpDashboardCphd rpDashboardCphd = new RpDashboardCphdImpl();

		rpDashboardCphd.setNew(true);
		rpDashboardCphd.setPrimaryKey(id);

		return rpDashboardCphd;
	}

	/**
	 * Removes the rp dashboard cphd with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard cphd
	 * @return the rp dashboard cphd that was removed
	 * @throws NoSuchRpDashboardCphdException if a rp dashboard cphd with the primary key could not be found
	 */
	@Override
	public RpDashboardCphd remove(long id)
		throws NoSuchRpDashboardCphdException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the rp dashboard cphd with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rp dashboard cphd
	 * @return the rp dashboard cphd that was removed
	 * @throws NoSuchRpDashboardCphdException if a rp dashboard cphd with the primary key could not be found
	 */
	@Override
	public RpDashboardCphd remove(Serializable primaryKey)
		throws NoSuchRpDashboardCphdException {

		Session session = null;

		try {
			session = openSession();

			RpDashboardCphd rpDashboardCphd = (RpDashboardCphd)session.get(
				RpDashboardCphdImpl.class, primaryKey);

			if (rpDashboardCphd == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRpDashboardCphdException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(rpDashboardCphd);
		}
		catch (NoSuchRpDashboardCphdException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected RpDashboardCphd removeImpl(RpDashboardCphd rpDashboardCphd) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rpDashboardCphd)) {
				rpDashboardCphd = (RpDashboardCphd)session.get(
					RpDashboardCphdImpl.class,
					rpDashboardCphd.getPrimaryKeyObj());
			}

			if (rpDashboardCphd != null) {
				session.delete(rpDashboardCphd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (rpDashboardCphd != null) {
			clearCache(rpDashboardCphd);
		}

		return rpDashboardCphd;
	}

	@Override
	public RpDashboardCphd updateImpl(RpDashboardCphd rpDashboardCphd) {
		boolean isNew = rpDashboardCphd.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(rpDashboardCphd);
			}
			else {
				rpDashboardCphd = (RpDashboardCphd)session.merge(
					rpDashboardCphd);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RpDashboardCphdImpl.class, rpDashboardCphd, false, true);

		if (isNew) {
			rpDashboardCphd.setNew(false);
		}

		rpDashboardCphd.resetOriginalValues();

		return rpDashboardCphd;
	}

	/**
	 * Returns the rp dashboard cphd with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rp dashboard cphd
	 * @return the rp dashboard cphd
	 * @throws NoSuchRpDashboardCphdException if a rp dashboard cphd with the primary key could not be found
	 */
	@Override
	public RpDashboardCphd findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRpDashboardCphdException {

		RpDashboardCphd rpDashboardCphd = fetchByPrimaryKey(primaryKey);

		if (rpDashboardCphd == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRpDashboardCphdException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return rpDashboardCphd;
	}

	/**
	 * Returns the rp dashboard cphd with the primary key or throws a <code>NoSuchRpDashboardCphdException</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cphd
	 * @return the rp dashboard cphd
	 * @throws NoSuchRpDashboardCphdException if a rp dashboard cphd with the primary key could not be found
	 */
	@Override
	public RpDashboardCphd findByPrimaryKey(long id)
		throws NoSuchRpDashboardCphdException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the rp dashboard cphd with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cphd
	 * @return the rp dashboard cphd, or <code>null</code> if a rp dashboard cphd with the primary key could not be found
	 */
	@Override
	public RpDashboardCphd fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the rp dashboard cphds.
	 *
	 * @return the rp dashboard cphds
	 */
	@Override
	public List<RpDashboardCphd> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rp dashboard cphds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCphdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cphds
	 * @param end the upper bound of the range of rp dashboard cphds (not inclusive)
	 * @return the range of rp dashboard cphds
	 */
	@Override
	public List<RpDashboardCphd> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rp dashboard cphds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCphdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cphds
	 * @param end the upper bound of the range of rp dashboard cphds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard cphds
	 */
	@Override
	public List<RpDashboardCphd> findAll(
		int start, int end,
		OrderByComparator<RpDashboardCphd> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rp dashboard cphds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCphdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cphds
	 * @param end the upper bound of the range of rp dashboard cphds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard cphds
	 */
	@Override
	public List<RpDashboardCphd> findAll(
		int start, int end,
		OrderByComparator<RpDashboardCphd> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<RpDashboardCphd> list = null;

		if (useFinderCache) {
			list = (List<RpDashboardCphd>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RPDASHBOARDCPHD);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RPDASHBOARDCPHD;

				sql = sql.concat(RpDashboardCphdModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RpDashboardCphd>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the rp dashboard cphds from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RpDashboardCphd rpDashboardCphd : findAll()) {
			remove(rpDashboardCphd);
		}
	}

	/**
	 * Returns the number of rp dashboard cphds.
	 *
	 * @return the number of rp dashboard cphds
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_RPDASHBOARDCPHD);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "_id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RPDASHBOARDCPHD;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RpDashboardCphdModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rp dashboard cphd persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			RpDashboardCphdPersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new RpDashboardCphdModelArgumentsResolver(),
			new HashMapDictionary<>());

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);
	}

	public void destroy() {
		entityCache.removeCache(RpDashboardCphdImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_RPDASHBOARDCPHD =
		"SELECT rpDashboardCphd FROM RpDashboardCphd rpDashboardCphd";

	private static final String _SQL_COUNT_RPDASHBOARDCPHD =
		"SELECT COUNT(rpDashboardCphd) FROM RpDashboardCphd rpDashboardCphd";

	private static final String _ORDER_BY_ENTITY_ALIAS = "rpDashboardCphd.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RpDashboardCphd exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardCphdPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"id", "tenTinh", "chiPhi", "dinhSuat", "drg"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class RpDashboardCphdModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			RpDashboardCphdModelImpl rpDashboardCphdModelImpl =
				(RpDashboardCphdModelImpl)baseModel;

			long columnBitmask = rpDashboardCphdModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					rpDashboardCphdModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						rpDashboardCphdModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					rpDashboardCphdModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return RpDashboardCphdImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return RpDashboardCphdTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			RpDashboardCphdModelImpl rpDashboardCphdModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						rpDashboardCphdModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = rpDashboardCphdModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}