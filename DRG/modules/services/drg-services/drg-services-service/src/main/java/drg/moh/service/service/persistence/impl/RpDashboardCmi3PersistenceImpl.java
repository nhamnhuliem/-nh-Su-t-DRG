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

import drg.moh.service.exception.NoSuchRpDashboardCmi3Exception;
import drg.moh.service.model.RpDashboardCmi3;
import drg.moh.service.model.RpDashboardCmi3Table;
import drg.moh.service.model.impl.RpDashboardCmi3Impl;
import drg.moh.service.model.impl.RpDashboardCmi3ModelImpl;
import drg.moh.service.service.persistence.RpDashboardCmi3Persistence;

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
 * The persistence implementation for the rp dashboard cmi3 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class RpDashboardCmi3PersistenceImpl
	extends BasePersistenceImpl<RpDashboardCmi3>
	implements RpDashboardCmi3Persistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RpDashboardCmi3Util</code> to access the rp dashboard cmi3 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RpDashboardCmi3Impl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public RpDashboardCmi3PersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("cmiTinh", "_cmi_tinh");
		dbColumnNames.put("cmiTuyen", "_cmi_tuyen");
		dbColumnNames.put("cmiCoSo", "_cmi_coso");

		setDBColumnNames(dbColumnNames);

		setModelClass(RpDashboardCmi3.class);

		setModelImplClass(RpDashboardCmi3Impl.class);
		setModelPKClass(long.class);

		setTable(RpDashboardCmi3Table.INSTANCE);
	}

	/**
	 * Caches the rp dashboard cmi3 in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmi3 the rp dashboard cmi3
	 */
	@Override
	public void cacheResult(RpDashboardCmi3 rpDashboardCmi3) {
		entityCache.putResult(
			RpDashboardCmi3Impl.class, rpDashboardCmi3.getPrimaryKey(),
			rpDashboardCmi3);
	}

	/**
	 * Caches the rp dashboard cmi3s in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmi3s the rp dashboard cmi3s
	 */
	@Override
	public void cacheResult(List<RpDashboardCmi3> rpDashboardCmi3s) {
		for (RpDashboardCmi3 rpDashboardCmi3 : rpDashboardCmi3s) {
			if (entityCache.getResult(
					RpDashboardCmi3Impl.class,
					rpDashboardCmi3.getPrimaryKey()) == null) {

				cacheResult(rpDashboardCmi3);
			}
		}
	}

	/**
	 * Clears the cache for all rp dashboard cmi3s.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RpDashboardCmi3Impl.class);

		finderCache.clearCache(RpDashboardCmi3Impl.class);
	}

	/**
	 * Clears the cache for the rp dashboard cmi3.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RpDashboardCmi3 rpDashboardCmi3) {
		entityCache.removeResult(RpDashboardCmi3Impl.class, rpDashboardCmi3);
	}

	@Override
	public void clearCache(List<RpDashboardCmi3> rpDashboardCmi3s) {
		for (RpDashboardCmi3 rpDashboardCmi3 : rpDashboardCmi3s) {
			entityCache.removeResult(
				RpDashboardCmi3Impl.class, rpDashboardCmi3);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RpDashboardCmi3Impl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(RpDashboardCmi3Impl.class, primaryKey);
		}
	}

	/**
	 * Creates a new rp dashboard cmi3 with the primary key. Does not add the rp dashboard cmi3 to the database.
	 *
	 * @param id the primary key for the new rp dashboard cmi3
	 * @return the new rp dashboard cmi3
	 */
	@Override
	public RpDashboardCmi3 create(long id) {
		RpDashboardCmi3 rpDashboardCmi3 = new RpDashboardCmi3Impl();

		rpDashboardCmi3.setNew(true);
		rpDashboardCmi3.setPrimaryKey(id);

		return rpDashboardCmi3;
	}

	/**
	 * Removes the rp dashboard cmi3 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard cmi3
	 * @return the rp dashboard cmi3 that was removed
	 * @throws NoSuchRpDashboardCmi3Exception if a rp dashboard cmi3 with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi3 remove(long id)
		throws NoSuchRpDashboardCmi3Exception {

		return remove((Serializable)id);
	}

	/**
	 * Removes the rp dashboard cmi3 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rp dashboard cmi3
	 * @return the rp dashboard cmi3 that was removed
	 * @throws NoSuchRpDashboardCmi3Exception if a rp dashboard cmi3 with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi3 remove(Serializable primaryKey)
		throws NoSuchRpDashboardCmi3Exception {

		Session session = null;

		try {
			session = openSession();

			RpDashboardCmi3 rpDashboardCmi3 = (RpDashboardCmi3)session.get(
				RpDashboardCmi3Impl.class, primaryKey);

			if (rpDashboardCmi3 == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRpDashboardCmi3Exception(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(rpDashboardCmi3);
		}
		catch (NoSuchRpDashboardCmi3Exception noSuchEntityException) {
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
	protected RpDashboardCmi3 removeImpl(RpDashboardCmi3 rpDashboardCmi3) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rpDashboardCmi3)) {
				rpDashboardCmi3 = (RpDashboardCmi3)session.get(
					RpDashboardCmi3Impl.class,
					rpDashboardCmi3.getPrimaryKeyObj());
			}

			if (rpDashboardCmi3 != null) {
				session.delete(rpDashboardCmi3);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (rpDashboardCmi3 != null) {
			clearCache(rpDashboardCmi3);
		}

		return rpDashboardCmi3;
	}

	@Override
	public RpDashboardCmi3 updateImpl(RpDashboardCmi3 rpDashboardCmi3) {
		boolean isNew = rpDashboardCmi3.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(rpDashboardCmi3);
			}
			else {
				rpDashboardCmi3 = (RpDashboardCmi3)session.merge(
					rpDashboardCmi3);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RpDashboardCmi3Impl.class, rpDashboardCmi3, false, true);

		if (isNew) {
			rpDashboardCmi3.setNew(false);
		}

		rpDashboardCmi3.resetOriginalValues();

		return rpDashboardCmi3;
	}

	/**
	 * Returns the rp dashboard cmi3 with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rp dashboard cmi3
	 * @return the rp dashboard cmi3
	 * @throws NoSuchRpDashboardCmi3Exception if a rp dashboard cmi3 with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi3 findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRpDashboardCmi3Exception {

		RpDashboardCmi3 rpDashboardCmi3 = fetchByPrimaryKey(primaryKey);

		if (rpDashboardCmi3 == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRpDashboardCmi3Exception(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return rpDashboardCmi3;
	}

	/**
	 * Returns the rp dashboard cmi3 with the primary key or throws a <code>NoSuchRpDashboardCmi3Exception</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi3
	 * @return the rp dashboard cmi3
	 * @throws NoSuchRpDashboardCmi3Exception if a rp dashboard cmi3 with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi3 findByPrimaryKey(long id)
		throws NoSuchRpDashboardCmi3Exception {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the rp dashboard cmi3 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi3
	 * @return the rp dashboard cmi3, or <code>null</code> if a rp dashboard cmi3 with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi3 fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the rp dashboard cmi3s.
	 *
	 * @return the rp dashboard cmi3s
	 */
	@Override
	public List<RpDashboardCmi3> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rp dashboard cmi3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmi3ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmi3s
	 * @param end the upper bound of the range of rp dashboard cmi3s (not inclusive)
	 * @return the range of rp dashboard cmi3s
	 */
	@Override
	public List<RpDashboardCmi3> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rp dashboard cmi3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmi3ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmi3s
	 * @param end the upper bound of the range of rp dashboard cmi3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard cmi3s
	 */
	@Override
	public List<RpDashboardCmi3> findAll(
		int start, int end,
		OrderByComparator<RpDashboardCmi3> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rp dashboard cmi3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmi3ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmi3s
	 * @param end the upper bound of the range of rp dashboard cmi3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard cmi3s
	 */
	@Override
	public List<RpDashboardCmi3> findAll(
		int start, int end,
		OrderByComparator<RpDashboardCmi3> orderByComparator,
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

		List<RpDashboardCmi3> list = null;

		if (useFinderCache) {
			list = (List<RpDashboardCmi3>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RPDASHBOARDCMI3);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RPDASHBOARDCMI3;

				sql = sql.concat(RpDashboardCmi3ModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RpDashboardCmi3>)QueryUtil.list(
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
	 * Removes all the rp dashboard cmi3s from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RpDashboardCmi3 rpDashboardCmi3 : findAll()) {
			remove(rpDashboardCmi3);
		}
	}

	/**
	 * Returns the number of rp dashboard cmi3s.
	 *
	 * @return the number of rp dashboard cmi3s
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_RPDASHBOARDCMI3);

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
		return _SQL_SELECT_RPDASHBOARDCMI3;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RpDashboardCmi3ModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rp dashboard cmi3 persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			RpDashboardCmi3PersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new RpDashboardCmi3ModelArgumentsResolver(),
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
		entityCache.removeCache(RpDashboardCmi3Impl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_RPDASHBOARDCMI3 =
		"SELECT rpDashboardCmi3 FROM RpDashboardCmi3 rpDashboardCmi3";

	private static final String _SQL_COUNT_RPDASHBOARDCMI3 =
		"SELECT COUNT(rpDashboardCmi3) FROM RpDashboardCmi3 rpDashboardCmi3";

	private static final String _ORDER_BY_ENTITY_ALIAS = "rpDashboardCmi3.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RpDashboardCmi3 exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardCmi3PersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"id", "cmiTinh", "cmiTuyen", "cmiCoSo"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class RpDashboardCmi3ModelArgumentsResolver
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

			RpDashboardCmi3ModelImpl rpDashboardCmi3ModelImpl =
				(RpDashboardCmi3ModelImpl)baseModel;

			long columnBitmask = rpDashboardCmi3ModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					rpDashboardCmi3ModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						rpDashboardCmi3ModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					rpDashboardCmi3ModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return RpDashboardCmi3Impl.class.getName();
		}

		@Override
		public String getTableName() {
			return RpDashboardCmi3Table.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			RpDashboardCmi3ModelImpl rpDashboardCmi3ModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						rpDashboardCmi3ModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = rpDashboardCmi3ModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}