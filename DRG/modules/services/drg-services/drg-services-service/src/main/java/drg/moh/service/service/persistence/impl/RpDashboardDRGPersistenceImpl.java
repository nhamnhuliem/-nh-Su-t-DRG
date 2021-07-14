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

import drg.moh.service.exception.NoSuchRpDashboardDRGException;
import drg.moh.service.model.RpDashboardDRG;
import drg.moh.service.model.RpDashboardDRGTable;
import drg.moh.service.model.impl.RpDashboardDRGImpl;
import drg.moh.service.model.impl.RpDashboardDRGModelImpl;
import drg.moh.service.service.persistence.RpDashboardDRGPersistence;

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
 * The persistence implementation for the rp dashboard drg service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class RpDashboardDRGPersistenceImpl
	extends BasePersistenceImpl<RpDashboardDRG>
	implements RpDashboardDRGPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RpDashboardDRGUtil</code> to access the rp dashboard drg persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RpDashboardDRGImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public RpDashboardDRGPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("drg", "_drg");
		dbColumnNames.put("thang", "_thang");
		dbColumnNames.put("value", "_value");

		setDBColumnNames(dbColumnNames);

		setModelClass(RpDashboardDRG.class);

		setModelImplClass(RpDashboardDRGImpl.class);
		setModelPKClass(long.class);

		setTable(RpDashboardDRGTable.INSTANCE);
	}

	/**
	 * Caches the rp dashboard drg in the entity cache if it is enabled.
	 *
	 * @param rpDashboardDRG the rp dashboard drg
	 */
	@Override
	public void cacheResult(RpDashboardDRG rpDashboardDRG) {
		entityCache.putResult(
			RpDashboardDRGImpl.class, rpDashboardDRG.getPrimaryKey(),
			rpDashboardDRG);
	}

	/**
	 * Caches the rp dashboard drgs in the entity cache if it is enabled.
	 *
	 * @param rpDashboardDRGs the rp dashboard drgs
	 */
	@Override
	public void cacheResult(List<RpDashboardDRG> rpDashboardDRGs) {
		for (RpDashboardDRG rpDashboardDRG : rpDashboardDRGs) {
			if (entityCache.getResult(
					RpDashboardDRGImpl.class, rpDashboardDRG.getPrimaryKey()) ==
						null) {

				cacheResult(rpDashboardDRG);
			}
		}
	}

	/**
	 * Clears the cache for all rp dashboard drgs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RpDashboardDRGImpl.class);

		finderCache.clearCache(RpDashboardDRGImpl.class);
	}

	/**
	 * Clears the cache for the rp dashboard drg.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RpDashboardDRG rpDashboardDRG) {
		entityCache.removeResult(RpDashboardDRGImpl.class, rpDashboardDRG);
	}

	@Override
	public void clearCache(List<RpDashboardDRG> rpDashboardDRGs) {
		for (RpDashboardDRG rpDashboardDRG : rpDashboardDRGs) {
			entityCache.removeResult(RpDashboardDRGImpl.class, rpDashboardDRG);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RpDashboardDRGImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(RpDashboardDRGImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new rp dashboard drg with the primary key. Does not add the rp dashboard drg to the database.
	 *
	 * @param id the primary key for the new rp dashboard drg
	 * @return the new rp dashboard drg
	 */
	@Override
	public RpDashboardDRG create(long id) {
		RpDashboardDRG rpDashboardDRG = new RpDashboardDRGImpl();

		rpDashboardDRG.setNew(true);
		rpDashboardDRG.setPrimaryKey(id);

		return rpDashboardDRG;
	}

	/**
	 * Removes the rp dashboard drg with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard drg
	 * @return the rp dashboard drg that was removed
	 * @throws NoSuchRpDashboardDRGException if a rp dashboard drg with the primary key could not be found
	 */
	@Override
	public RpDashboardDRG remove(long id) throws NoSuchRpDashboardDRGException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the rp dashboard drg with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rp dashboard drg
	 * @return the rp dashboard drg that was removed
	 * @throws NoSuchRpDashboardDRGException if a rp dashboard drg with the primary key could not be found
	 */
	@Override
	public RpDashboardDRG remove(Serializable primaryKey)
		throws NoSuchRpDashboardDRGException {

		Session session = null;

		try {
			session = openSession();

			RpDashboardDRG rpDashboardDRG = (RpDashboardDRG)session.get(
				RpDashboardDRGImpl.class, primaryKey);

			if (rpDashboardDRG == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRpDashboardDRGException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(rpDashboardDRG);
		}
		catch (NoSuchRpDashboardDRGException noSuchEntityException) {
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
	protected RpDashboardDRG removeImpl(RpDashboardDRG rpDashboardDRG) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rpDashboardDRG)) {
				rpDashboardDRG = (RpDashboardDRG)session.get(
					RpDashboardDRGImpl.class,
					rpDashboardDRG.getPrimaryKeyObj());
			}

			if (rpDashboardDRG != null) {
				session.delete(rpDashboardDRG);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (rpDashboardDRG != null) {
			clearCache(rpDashboardDRG);
		}

		return rpDashboardDRG;
	}

	@Override
	public RpDashboardDRG updateImpl(RpDashboardDRG rpDashboardDRG) {
		boolean isNew = rpDashboardDRG.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(rpDashboardDRG);
			}
			else {
				rpDashboardDRG = (RpDashboardDRG)session.merge(rpDashboardDRG);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RpDashboardDRGImpl.class, rpDashboardDRG, false, true);

		if (isNew) {
			rpDashboardDRG.setNew(false);
		}

		rpDashboardDRG.resetOriginalValues();

		return rpDashboardDRG;
	}

	/**
	 * Returns the rp dashboard drg with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rp dashboard drg
	 * @return the rp dashboard drg
	 * @throws NoSuchRpDashboardDRGException if a rp dashboard drg with the primary key could not be found
	 */
	@Override
	public RpDashboardDRG findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRpDashboardDRGException {

		RpDashboardDRG rpDashboardDRG = fetchByPrimaryKey(primaryKey);

		if (rpDashboardDRG == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRpDashboardDRGException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return rpDashboardDRG;
	}

	/**
	 * Returns the rp dashboard drg with the primary key or throws a <code>NoSuchRpDashboardDRGException</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard drg
	 * @return the rp dashboard drg
	 * @throws NoSuchRpDashboardDRGException if a rp dashboard drg with the primary key could not be found
	 */
	@Override
	public RpDashboardDRG findByPrimaryKey(long id)
		throws NoSuchRpDashboardDRGException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the rp dashboard drg with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard drg
	 * @return the rp dashboard drg, or <code>null</code> if a rp dashboard drg with the primary key could not be found
	 */
	@Override
	public RpDashboardDRG fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the rp dashboard drgs.
	 *
	 * @return the rp dashboard drgs
	 */
	@Override
	public List<RpDashboardDRG> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rp dashboard drgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDRGModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard drgs
	 * @param end the upper bound of the range of rp dashboard drgs (not inclusive)
	 * @return the range of rp dashboard drgs
	 */
	@Override
	public List<RpDashboardDRG> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rp dashboard drgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDRGModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard drgs
	 * @param end the upper bound of the range of rp dashboard drgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard drgs
	 */
	@Override
	public List<RpDashboardDRG> findAll(
		int start, int end,
		OrderByComparator<RpDashboardDRG> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rp dashboard drgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDRGModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard drgs
	 * @param end the upper bound of the range of rp dashboard drgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard drgs
	 */
	@Override
	public List<RpDashboardDRG> findAll(
		int start, int end, OrderByComparator<RpDashboardDRG> orderByComparator,
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

		List<RpDashboardDRG> list = null;

		if (useFinderCache) {
			list = (List<RpDashboardDRG>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RPDASHBOARDDRG);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RPDASHBOARDDRG;

				sql = sql.concat(RpDashboardDRGModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RpDashboardDRG>)QueryUtil.list(
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
	 * Removes all the rp dashboard drgs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RpDashboardDRG rpDashboardDRG : findAll()) {
			remove(rpDashboardDRG);
		}
	}

	/**
	 * Returns the number of rp dashboard drgs.
	 *
	 * @return the number of rp dashboard drgs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_RPDASHBOARDDRG);

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
		return _SQL_SELECT_RPDASHBOARDDRG;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RpDashboardDRGModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rp dashboard drg persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			RpDashboardDRGPersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new RpDashboardDRGModelArgumentsResolver(),
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
		entityCache.removeCache(RpDashboardDRGImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_RPDASHBOARDDRG =
		"SELECT rpDashboardDRG FROM RpDashboardDRG rpDashboardDRG";

	private static final String _SQL_COUNT_RPDASHBOARDDRG =
		"SELECT COUNT(rpDashboardDRG) FROM RpDashboardDRG rpDashboardDRG";

	private static final String _ORDER_BY_ENTITY_ALIAS = "rpDashboardDRG.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RpDashboardDRG exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardDRGPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"id", "drg", "thang", "value"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class RpDashboardDRGModelArgumentsResolver
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

			RpDashboardDRGModelImpl rpDashboardDRGModelImpl =
				(RpDashboardDRGModelImpl)baseModel;

			long columnBitmask = rpDashboardDRGModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					rpDashboardDRGModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						rpDashboardDRGModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					rpDashboardDRGModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return RpDashboardDRGImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return RpDashboardDRGTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			RpDashboardDRGModelImpl rpDashboardDRGModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						rpDashboardDRGModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = rpDashboardDRGModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}