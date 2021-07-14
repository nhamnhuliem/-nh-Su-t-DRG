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

import drg.moh.service.exception.NoSuchRpDashboardCmi2Exception;
import drg.moh.service.model.RpDashboardCmi2;
import drg.moh.service.model.RpDashboardCmi2Table;
import drg.moh.service.model.impl.RpDashboardCmi2Impl;
import drg.moh.service.model.impl.RpDashboardCmi2ModelImpl;
import drg.moh.service.service.persistence.RpDashboardCmi2Persistence;

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
 * The persistence implementation for the rp dashboard cmi2 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class RpDashboardCmi2PersistenceImpl
	extends BasePersistenceImpl<RpDashboardCmi2>
	implements RpDashboardCmi2Persistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RpDashboardCmi2Util</code> to access the rp dashboard cmi2 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RpDashboardCmi2Impl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public RpDashboardCmi2PersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("cmiTenTuyen", "_cmi_tentuyen");
		dbColumnNames.put("cmiTrungBinh", "_cmi_trungbinh");
		dbColumnNames.put("cmiTrungMax", "_cmi_max");
		dbColumnNames.put("cmiTrungMin", "_cmi_min");

		setDBColumnNames(dbColumnNames);

		setModelClass(RpDashboardCmi2.class);

		setModelImplClass(RpDashboardCmi2Impl.class);
		setModelPKClass(long.class);

		setTable(RpDashboardCmi2Table.INSTANCE);
	}

	/**
	 * Caches the rp dashboard cmi2 in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmi2 the rp dashboard cmi2
	 */
	@Override
	public void cacheResult(RpDashboardCmi2 rpDashboardCmi2) {
		entityCache.putResult(
			RpDashboardCmi2Impl.class, rpDashboardCmi2.getPrimaryKey(),
			rpDashboardCmi2);
	}

	/**
	 * Caches the rp dashboard cmi2s in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmi2s the rp dashboard cmi2s
	 */
	@Override
	public void cacheResult(List<RpDashboardCmi2> rpDashboardCmi2s) {
		for (RpDashboardCmi2 rpDashboardCmi2 : rpDashboardCmi2s) {
			if (entityCache.getResult(
					RpDashboardCmi2Impl.class,
					rpDashboardCmi2.getPrimaryKey()) == null) {

				cacheResult(rpDashboardCmi2);
			}
		}
	}

	/**
	 * Clears the cache for all rp dashboard cmi2s.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RpDashboardCmi2Impl.class);

		finderCache.clearCache(RpDashboardCmi2Impl.class);
	}

	/**
	 * Clears the cache for the rp dashboard cmi2.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RpDashboardCmi2 rpDashboardCmi2) {
		entityCache.removeResult(RpDashboardCmi2Impl.class, rpDashboardCmi2);
	}

	@Override
	public void clearCache(List<RpDashboardCmi2> rpDashboardCmi2s) {
		for (RpDashboardCmi2 rpDashboardCmi2 : rpDashboardCmi2s) {
			entityCache.removeResult(
				RpDashboardCmi2Impl.class, rpDashboardCmi2);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RpDashboardCmi2Impl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(RpDashboardCmi2Impl.class, primaryKey);
		}
	}

	/**
	 * Creates a new rp dashboard cmi2 with the primary key. Does not add the rp dashboard cmi2 to the database.
	 *
	 * @param id the primary key for the new rp dashboard cmi2
	 * @return the new rp dashboard cmi2
	 */
	@Override
	public RpDashboardCmi2 create(long id) {
		RpDashboardCmi2 rpDashboardCmi2 = new RpDashboardCmi2Impl();

		rpDashboardCmi2.setNew(true);
		rpDashboardCmi2.setPrimaryKey(id);

		return rpDashboardCmi2;
	}

	/**
	 * Removes the rp dashboard cmi2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard cmi2
	 * @return the rp dashboard cmi2 that was removed
	 * @throws NoSuchRpDashboardCmi2Exception if a rp dashboard cmi2 with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi2 remove(long id)
		throws NoSuchRpDashboardCmi2Exception {

		return remove((Serializable)id);
	}

	/**
	 * Removes the rp dashboard cmi2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rp dashboard cmi2
	 * @return the rp dashboard cmi2 that was removed
	 * @throws NoSuchRpDashboardCmi2Exception if a rp dashboard cmi2 with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi2 remove(Serializable primaryKey)
		throws NoSuchRpDashboardCmi2Exception {

		Session session = null;

		try {
			session = openSession();

			RpDashboardCmi2 rpDashboardCmi2 = (RpDashboardCmi2)session.get(
				RpDashboardCmi2Impl.class, primaryKey);

			if (rpDashboardCmi2 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRpDashboardCmi2Exception(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(rpDashboardCmi2);
		}
		catch (NoSuchRpDashboardCmi2Exception noSuchEntityException) {
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
	protected RpDashboardCmi2 removeImpl(RpDashboardCmi2 rpDashboardCmi2) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rpDashboardCmi2)) {
				rpDashboardCmi2 = (RpDashboardCmi2)session.get(
					RpDashboardCmi2Impl.class,
					rpDashboardCmi2.getPrimaryKeyObj());
			}

			if (rpDashboardCmi2 != null) {
				session.delete(rpDashboardCmi2);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (rpDashboardCmi2 != null) {
			clearCache(rpDashboardCmi2);
		}

		return rpDashboardCmi2;
	}

	@Override
	public RpDashboardCmi2 updateImpl(RpDashboardCmi2 rpDashboardCmi2) {
		boolean isNew = rpDashboardCmi2.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(rpDashboardCmi2);
			}
			else {
				rpDashboardCmi2 = (RpDashboardCmi2)session.merge(
					rpDashboardCmi2);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RpDashboardCmi2Impl.class, rpDashboardCmi2, false, true);

		if (isNew) {
			rpDashboardCmi2.setNew(false);
		}

		rpDashboardCmi2.resetOriginalValues();

		return rpDashboardCmi2;
	}

	/**
	 * Returns the rp dashboard cmi2 with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rp dashboard cmi2
	 * @return the rp dashboard cmi2
	 * @throws NoSuchRpDashboardCmi2Exception if a rp dashboard cmi2 with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi2 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRpDashboardCmi2Exception {

		RpDashboardCmi2 rpDashboardCmi2 = fetchByPrimaryKey(primaryKey);

		if (rpDashboardCmi2 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRpDashboardCmi2Exception(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return rpDashboardCmi2;
	}

	/**
	 * Returns the rp dashboard cmi2 with the primary key or throws a <code>NoSuchRpDashboardCmi2Exception</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi2
	 * @return the rp dashboard cmi2
	 * @throws NoSuchRpDashboardCmi2Exception if a rp dashboard cmi2 with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi2 findByPrimaryKey(long id)
		throws NoSuchRpDashboardCmi2Exception {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the rp dashboard cmi2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi2
	 * @return the rp dashboard cmi2, or <code>null</code> if a rp dashboard cmi2 with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi2 fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the rp dashboard cmi2s.
	 *
	 * @return the rp dashboard cmi2s
	 */
	@Override
	public List<RpDashboardCmi2> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rp dashboard cmi2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmi2ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmi2s
	 * @param end the upper bound of the range of rp dashboard cmi2s (not inclusive)
	 * @return the range of rp dashboard cmi2s
	 */
	@Override
	public List<RpDashboardCmi2> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rp dashboard cmi2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmi2ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmi2s
	 * @param end the upper bound of the range of rp dashboard cmi2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard cmi2s
	 */
	@Override
	public List<RpDashboardCmi2> findAll(
		int start, int end,
		OrderByComparator<RpDashboardCmi2> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rp dashboard cmi2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmi2ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmi2s
	 * @param end the upper bound of the range of rp dashboard cmi2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard cmi2s
	 */
	@Override
	public List<RpDashboardCmi2> findAll(
		int start, int end,
		OrderByComparator<RpDashboardCmi2> orderByComparator,
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

		List<RpDashboardCmi2> list = null;

		if (useFinderCache) {
			list = (List<RpDashboardCmi2>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RPDASHBOARDCMI2);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RPDASHBOARDCMI2;

				sql = sql.concat(RpDashboardCmi2ModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RpDashboardCmi2>)QueryUtil.list(
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
	 * Removes all the rp dashboard cmi2s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RpDashboardCmi2 rpDashboardCmi2 : findAll()) {
			remove(rpDashboardCmi2);
		}
	}

	/**
	 * Returns the number of rp dashboard cmi2s.
	 *
	 * @return the number of rp dashboard cmi2s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_RPDASHBOARDCMI2);

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
		return _SQL_SELECT_RPDASHBOARDCMI2;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RpDashboardCmi2ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rp dashboard cmi2 persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			RpDashboardCmi2PersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new RpDashboardCmi2ModelArgumentsResolver(),
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
		entityCache.removeCache(RpDashboardCmi2Impl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_RPDASHBOARDCMI2 =
		"SELECT rpDashboardCmi2 FROM RpDashboardCmi2 rpDashboardCmi2";

	private static final String _SQL_COUNT_RPDASHBOARDCMI2 =
		"SELECT COUNT(rpDashboardCmi2) FROM RpDashboardCmi2 rpDashboardCmi2";

	private static final String _ORDER_BY_ENTITY_ALIAS = "rpDashboardCmi2.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RpDashboardCmi2 exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardCmi2PersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {
			"id", "cmiTenTuyen", "cmiTrungBinh", "cmiTrungMax", "cmiTrungMin"
		});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class RpDashboardCmi2ModelArgumentsResolver
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

			RpDashboardCmi2ModelImpl rpDashboardCmi2ModelImpl =
				(RpDashboardCmi2ModelImpl)baseModel;

			long columnBitmask = rpDashboardCmi2ModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					rpDashboardCmi2ModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						rpDashboardCmi2ModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					rpDashboardCmi2ModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return RpDashboardCmi2Impl.class.getName();
		}

		@Override
		public String getTableName() {
			return RpDashboardCmi2Table.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			RpDashboardCmi2ModelImpl rpDashboardCmi2ModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						rpDashboardCmi2ModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = rpDashboardCmi2ModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}