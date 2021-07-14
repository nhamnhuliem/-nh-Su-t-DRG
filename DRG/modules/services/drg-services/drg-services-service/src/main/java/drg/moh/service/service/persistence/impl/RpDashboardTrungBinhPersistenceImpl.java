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

import drg.moh.service.exception.NoSuchRpDashboardTrungBinhException;
import drg.moh.service.model.RpDashboardTrungBinh;
import drg.moh.service.model.RpDashboardTrungBinhTable;
import drg.moh.service.model.impl.RpDashboardTrungBinhImpl;
import drg.moh.service.model.impl.RpDashboardTrungBinhModelImpl;
import drg.moh.service.service.persistence.RpDashboardTrungBinhPersistence;

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
 * The persistence implementation for the rp dashboard trung binh service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class RpDashboardTrungBinhPersistenceImpl
	extends BasePersistenceImpl<RpDashboardTrungBinh>
	implements RpDashboardTrungBinhPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RpDashboardTrungBinhUtil</code> to access the rp dashboard trung binh persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RpDashboardTrungBinhImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public RpDashboardTrungBinhPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("data", "data_");

		setDBColumnNames(dbColumnNames);

		setModelClass(RpDashboardTrungBinh.class);

		setModelImplClass(RpDashboardTrungBinhImpl.class);
		setModelPKClass(String.class);

		setTable(RpDashboardTrungBinhTable.INSTANCE);
	}

	/**
	 * Caches the rp dashboard trung binh in the entity cache if it is enabled.
	 *
	 * @param rpDashboardTrungBinh the rp dashboard trung binh
	 */
	@Override
	public void cacheResult(RpDashboardTrungBinh rpDashboardTrungBinh) {
		entityCache.putResult(
			RpDashboardTrungBinhImpl.class,
			rpDashboardTrungBinh.getPrimaryKey(), rpDashboardTrungBinh);
	}

	/**
	 * Caches the rp dashboard trung binhs in the entity cache if it is enabled.
	 *
	 * @param rpDashboardTrungBinhs the rp dashboard trung binhs
	 */
	@Override
	public void cacheResult(List<RpDashboardTrungBinh> rpDashboardTrungBinhs) {
		for (RpDashboardTrungBinh rpDashboardTrungBinh :
				rpDashboardTrungBinhs) {

			if (entityCache.getResult(
					RpDashboardTrungBinhImpl.class,
					rpDashboardTrungBinh.getPrimaryKey()) == null) {

				cacheResult(rpDashboardTrungBinh);
			}
		}
	}

	/**
	 * Clears the cache for all rp dashboard trung binhs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RpDashboardTrungBinhImpl.class);

		finderCache.clearCache(RpDashboardTrungBinhImpl.class);
	}

	/**
	 * Clears the cache for the rp dashboard trung binh.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RpDashboardTrungBinh rpDashboardTrungBinh) {
		entityCache.removeResult(
			RpDashboardTrungBinhImpl.class, rpDashboardTrungBinh);
	}

	@Override
	public void clearCache(List<RpDashboardTrungBinh> rpDashboardTrungBinhs) {
		for (RpDashboardTrungBinh rpDashboardTrungBinh :
				rpDashboardTrungBinhs) {

			entityCache.removeResult(
				RpDashboardTrungBinhImpl.class, rpDashboardTrungBinh);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RpDashboardTrungBinhImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				RpDashboardTrungBinhImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new rp dashboard trung binh with the primary key. Does not add the rp dashboard trung binh to the database.
	 *
	 * @param data the primary key for the new rp dashboard trung binh
	 * @return the new rp dashboard trung binh
	 */
	@Override
	public RpDashboardTrungBinh create(String data) {
		RpDashboardTrungBinh rpDashboardTrungBinh =
			new RpDashboardTrungBinhImpl();

		rpDashboardTrungBinh.setNew(true);
		rpDashboardTrungBinh.setPrimaryKey(data);

		return rpDashboardTrungBinh;
	}

	/**
	 * Removes the rp dashboard trung binh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param data the primary key of the rp dashboard trung binh
	 * @return the rp dashboard trung binh that was removed
	 * @throws NoSuchRpDashboardTrungBinhException if a rp dashboard trung binh with the primary key could not be found
	 */
	@Override
	public RpDashboardTrungBinh remove(String data)
		throws NoSuchRpDashboardTrungBinhException {

		return remove((Serializable)data);
	}

	/**
	 * Removes the rp dashboard trung binh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rp dashboard trung binh
	 * @return the rp dashboard trung binh that was removed
	 * @throws NoSuchRpDashboardTrungBinhException if a rp dashboard trung binh with the primary key could not be found
	 */
	@Override
	public RpDashboardTrungBinh remove(Serializable primaryKey)
		throws NoSuchRpDashboardTrungBinhException {

		Session session = null;

		try {
			session = openSession();

			RpDashboardTrungBinh rpDashboardTrungBinh =
				(RpDashboardTrungBinh)session.get(
					RpDashboardTrungBinhImpl.class, primaryKey);

			if (rpDashboardTrungBinh == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRpDashboardTrungBinhException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(rpDashboardTrungBinh);
		}
		catch (NoSuchRpDashboardTrungBinhException noSuchEntityException) {
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
	protected RpDashboardTrungBinh removeImpl(
		RpDashboardTrungBinh rpDashboardTrungBinh) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rpDashboardTrungBinh)) {
				rpDashboardTrungBinh = (RpDashboardTrungBinh)session.get(
					RpDashboardTrungBinhImpl.class,
					rpDashboardTrungBinh.getPrimaryKeyObj());
			}

			if (rpDashboardTrungBinh != null) {
				session.delete(rpDashboardTrungBinh);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (rpDashboardTrungBinh != null) {
			clearCache(rpDashboardTrungBinh);
		}

		return rpDashboardTrungBinh;
	}

	@Override
	public RpDashboardTrungBinh updateImpl(
		RpDashboardTrungBinh rpDashboardTrungBinh) {

		boolean isNew = rpDashboardTrungBinh.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(rpDashboardTrungBinh);
			}
			else {
				rpDashboardTrungBinh = (RpDashboardTrungBinh)session.merge(
					rpDashboardTrungBinh);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RpDashboardTrungBinhImpl.class, rpDashboardTrungBinh, false, true);

		if (isNew) {
			rpDashboardTrungBinh.setNew(false);
		}

		rpDashboardTrungBinh.resetOriginalValues();

		return rpDashboardTrungBinh;
	}

	/**
	 * Returns the rp dashboard trung binh with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rp dashboard trung binh
	 * @return the rp dashboard trung binh
	 * @throws NoSuchRpDashboardTrungBinhException if a rp dashboard trung binh with the primary key could not be found
	 */
	@Override
	public RpDashboardTrungBinh findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRpDashboardTrungBinhException {

		RpDashboardTrungBinh rpDashboardTrungBinh = fetchByPrimaryKey(
			primaryKey);

		if (rpDashboardTrungBinh == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRpDashboardTrungBinhException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return rpDashboardTrungBinh;
	}

	/**
	 * Returns the rp dashboard trung binh with the primary key or throws a <code>NoSuchRpDashboardTrungBinhException</code> if it could not be found.
	 *
	 * @param data the primary key of the rp dashboard trung binh
	 * @return the rp dashboard trung binh
	 * @throws NoSuchRpDashboardTrungBinhException if a rp dashboard trung binh with the primary key could not be found
	 */
	@Override
	public RpDashboardTrungBinh findByPrimaryKey(String data)
		throws NoSuchRpDashboardTrungBinhException {

		return findByPrimaryKey((Serializable)data);
	}

	/**
	 * Returns the rp dashboard trung binh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param data the primary key of the rp dashboard trung binh
	 * @return the rp dashboard trung binh, or <code>null</code> if a rp dashboard trung binh with the primary key could not be found
	 */
	@Override
	public RpDashboardTrungBinh fetchByPrimaryKey(String data) {
		return fetchByPrimaryKey((Serializable)data);
	}

	/**
	 * Returns all the rp dashboard trung binhs.
	 *
	 * @return the rp dashboard trung binhs
	 */
	@Override
	public List<RpDashboardTrungBinh> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rp dashboard trung binhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardTrungBinhModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard trung binhs
	 * @param end the upper bound of the range of rp dashboard trung binhs (not inclusive)
	 * @return the range of rp dashboard trung binhs
	 */
	@Override
	public List<RpDashboardTrungBinh> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rp dashboard trung binhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardTrungBinhModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard trung binhs
	 * @param end the upper bound of the range of rp dashboard trung binhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard trung binhs
	 */
	@Override
	public List<RpDashboardTrungBinh> findAll(
		int start, int end,
		OrderByComparator<RpDashboardTrungBinh> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rp dashboard trung binhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardTrungBinhModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard trung binhs
	 * @param end the upper bound of the range of rp dashboard trung binhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard trung binhs
	 */
	@Override
	public List<RpDashboardTrungBinh> findAll(
		int start, int end,
		OrderByComparator<RpDashboardTrungBinh> orderByComparator,
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

		List<RpDashboardTrungBinh> list = null;

		if (useFinderCache) {
			list = (List<RpDashboardTrungBinh>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RPDASHBOARDTRUNGBINH);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RPDASHBOARDTRUNGBINH;

				sql = sql.concat(RpDashboardTrungBinhModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RpDashboardTrungBinh>)QueryUtil.list(
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
	 * Removes all the rp dashboard trung binhs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RpDashboardTrungBinh rpDashboardTrungBinh : findAll()) {
			remove(rpDashboardTrungBinh);
		}
	}

	/**
	 * Returns the number of rp dashboard trung binhs.
	 *
	 * @return the number of rp dashboard trung binhs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_RPDASHBOARDTRUNGBINH);

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
		return "data_";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_RPDASHBOARDTRUNGBINH;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RpDashboardTrungBinhModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rp dashboard trung binh persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			RpDashboardTrungBinhPersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new RpDashboardTrungBinhModelArgumentsResolver(),
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
		entityCache.removeCache(RpDashboardTrungBinhImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_RPDASHBOARDTRUNGBINH =
		"SELECT rpDashboardTrungBinh FROM RpDashboardTrungBinh rpDashboardTrungBinh";

	private static final String _SQL_COUNT_RPDASHBOARDTRUNGBINH =
		"SELECT COUNT(rpDashboardTrungBinh) FROM RpDashboardTrungBinh rpDashboardTrungBinh";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"rpDashboardTrungBinh.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RpDashboardTrungBinh exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardTrungBinhPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"data"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class RpDashboardTrungBinhModelArgumentsResolver
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

			RpDashboardTrungBinhModelImpl rpDashboardTrungBinhModelImpl =
				(RpDashboardTrungBinhModelImpl)baseModel;

			long columnBitmask =
				rpDashboardTrungBinhModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					rpDashboardTrungBinhModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						rpDashboardTrungBinhModelImpl.getColumnBitmask(
							columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					rpDashboardTrungBinhModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return RpDashboardTrungBinhImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return RpDashboardTrungBinhTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			RpDashboardTrungBinhModelImpl rpDashboardTrungBinhModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						rpDashboardTrungBinhModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = rpDashboardTrungBinhModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}