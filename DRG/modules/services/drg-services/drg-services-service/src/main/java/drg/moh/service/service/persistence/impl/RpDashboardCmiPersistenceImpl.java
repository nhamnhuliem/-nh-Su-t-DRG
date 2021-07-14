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

import drg.moh.service.exception.NoSuchRpDashboardCmiException;
import drg.moh.service.model.RpDashboardCmi;
import drg.moh.service.model.RpDashboardCmiTable;
import drg.moh.service.model.impl.RpDashboardCmiImpl;
import drg.moh.service.model.impl.RpDashboardCmiModelImpl;
import drg.moh.service.service.persistence.RpDashboardCmiPersistence;

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
 * The persistence implementation for the rp dashboard cmi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class RpDashboardCmiPersistenceImpl
	extends BasePersistenceImpl<RpDashboardCmi>
	implements RpDashboardCmiPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RpDashboardCmiUtil</code> to access the rp dashboard cmi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RpDashboardCmiImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public RpDashboardCmiPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("cmiToanQuoc", "_cmi_toanquoc");
		dbColumnNames.put("cmiTinh", "_cmi_tinh");
		dbColumnNames.put("cmiTuyen", "_cmi_tuyen");
		dbColumnNames.put("cmiTrungBinh", "_cmi_trungbinh");
		dbColumnNames.put("cmiTrungMax", "_cmi_trungmax");
		dbColumnNames.put("cmiTrungMin", "_cmi_trungmin");
		dbColumnNames.put("cmiCoSo", "_cmi_coso");

		setDBColumnNames(dbColumnNames);

		setModelClass(RpDashboardCmi.class);

		setModelImplClass(RpDashboardCmiImpl.class);
		setModelPKClass(long.class);

		setTable(RpDashboardCmiTable.INSTANCE);
	}

	/**
	 * Caches the rp dashboard cmi in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmi the rp dashboard cmi
	 */
	@Override
	public void cacheResult(RpDashboardCmi rpDashboardCmi) {
		entityCache.putResult(
			RpDashboardCmiImpl.class, rpDashboardCmi.getPrimaryKey(),
			rpDashboardCmi);
	}

	/**
	 * Caches the rp dashboard cmis in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmis the rp dashboard cmis
	 */
	@Override
	public void cacheResult(List<RpDashboardCmi> rpDashboardCmis) {
		for (RpDashboardCmi rpDashboardCmi : rpDashboardCmis) {
			if (entityCache.getResult(
					RpDashboardCmiImpl.class, rpDashboardCmi.getPrimaryKey()) ==
						null) {

				cacheResult(rpDashboardCmi);
			}
		}
	}

	/**
	 * Clears the cache for all rp dashboard cmis.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RpDashboardCmiImpl.class);

		finderCache.clearCache(RpDashboardCmiImpl.class);
	}

	/**
	 * Clears the cache for the rp dashboard cmi.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RpDashboardCmi rpDashboardCmi) {
		entityCache.removeResult(RpDashboardCmiImpl.class, rpDashboardCmi);
	}

	@Override
	public void clearCache(List<RpDashboardCmi> rpDashboardCmis) {
		for (RpDashboardCmi rpDashboardCmi : rpDashboardCmis) {
			entityCache.removeResult(RpDashboardCmiImpl.class, rpDashboardCmi);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RpDashboardCmiImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(RpDashboardCmiImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new rp dashboard cmi with the primary key. Does not add the rp dashboard cmi to the database.
	 *
	 * @param id the primary key for the new rp dashboard cmi
	 * @return the new rp dashboard cmi
	 */
	@Override
	public RpDashboardCmi create(long id) {
		RpDashboardCmi rpDashboardCmi = new RpDashboardCmiImpl();

		rpDashboardCmi.setNew(true);
		rpDashboardCmi.setPrimaryKey(id);

		return rpDashboardCmi;
	}

	/**
	 * Removes the rp dashboard cmi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard cmi
	 * @return the rp dashboard cmi that was removed
	 * @throws NoSuchRpDashboardCmiException if a rp dashboard cmi with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi remove(long id) throws NoSuchRpDashboardCmiException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the rp dashboard cmi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rp dashboard cmi
	 * @return the rp dashboard cmi that was removed
	 * @throws NoSuchRpDashboardCmiException if a rp dashboard cmi with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi remove(Serializable primaryKey)
		throws NoSuchRpDashboardCmiException {

		Session session = null;

		try {
			session = openSession();

			RpDashboardCmi rpDashboardCmi = (RpDashboardCmi)session.get(
				RpDashboardCmiImpl.class, primaryKey);

			if (rpDashboardCmi == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRpDashboardCmiException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(rpDashboardCmi);
		}
		catch (NoSuchRpDashboardCmiException noSuchEntityException) {
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
	protected RpDashboardCmi removeImpl(RpDashboardCmi rpDashboardCmi) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rpDashboardCmi)) {
				rpDashboardCmi = (RpDashboardCmi)session.get(
					RpDashboardCmiImpl.class,
					rpDashboardCmi.getPrimaryKeyObj());
			}

			if (rpDashboardCmi != null) {
				session.delete(rpDashboardCmi);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (rpDashboardCmi != null) {
			clearCache(rpDashboardCmi);
		}

		return rpDashboardCmi;
	}

	@Override
	public RpDashboardCmi updateImpl(RpDashboardCmi rpDashboardCmi) {
		boolean isNew = rpDashboardCmi.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(rpDashboardCmi);
			}
			else {
				rpDashboardCmi = (RpDashboardCmi)session.merge(rpDashboardCmi);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RpDashboardCmiImpl.class, rpDashboardCmi, false, true);

		if (isNew) {
			rpDashboardCmi.setNew(false);
		}

		rpDashboardCmi.resetOriginalValues();

		return rpDashboardCmi;
	}

	/**
	 * Returns the rp dashboard cmi with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rp dashboard cmi
	 * @return the rp dashboard cmi
	 * @throws NoSuchRpDashboardCmiException if a rp dashboard cmi with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRpDashboardCmiException {

		RpDashboardCmi rpDashboardCmi = fetchByPrimaryKey(primaryKey);

		if (rpDashboardCmi == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRpDashboardCmiException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return rpDashboardCmi;
	}

	/**
	 * Returns the rp dashboard cmi with the primary key or throws a <code>NoSuchRpDashboardCmiException</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi
	 * @return the rp dashboard cmi
	 * @throws NoSuchRpDashboardCmiException if a rp dashboard cmi with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi findByPrimaryKey(long id)
		throws NoSuchRpDashboardCmiException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the rp dashboard cmi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi
	 * @return the rp dashboard cmi, or <code>null</code> if a rp dashboard cmi with the primary key could not be found
	 */
	@Override
	public RpDashboardCmi fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the rp dashboard cmis.
	 *
	 * @return the rp dashboard cmis
	 */
	@Override
	public List<RpDashboardCmi> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rp dashboard cmis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmis
	 * @param end the upper bound of the range of rp dashboard cmis (not inclusive)
	 * @return the range of rp dashboard cmis
	 */
	@Override
	public List<RpDashboardCmi> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rp dashboard cmis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmis
	 * @param end the upper bound of the range of rp dashboard cmis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard cmis
	 */
	@Override
	public List<RpDashboardCmi> findAll(
		int start, int end,
		OrderByComparator<RpDashboardCmi> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rp dashboard cmis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmis
	 * @param end the upper bound of the range of rp dashboard cmis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard cmis
	 */
	@Override
	public List<RpDashboardCmi> findAll(
		int start, int end, OrderByComparator<RpDashboardCmi> orderByComparator,
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

		List<RpDashboardCmi> list = null;

		if (useFinderCache) {
			list = (List<RpDashboardCmi>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RPDASHBOARDCMI);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RPDASHBOARDCMI;

				sql = sql.concat(RpDashboardCmiModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RpDashboardCmi>)QueryUtil.list(
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
	 * Removes all the rp dashboard cmis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RpDashboardCmi rpDashboardCmi : findAll()) {
			remove(rpDashboardCmi);
		}
	}

	/**
	 * Returns the number of rp dashboard cmis.
	 *
	 * @return the number of rp dashboard cmis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_RPDASHBOARDCMI);

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
		return _SQL_SELECT_RPDASHBOARDCMI;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RpDashboardCmiModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rp dashboard cmi persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			RpDashboardCmiPersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new RpDashboardCmiModelArgumentsResolver(),
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
		entityCache.removeCache(RpDashboardCmiImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_RPDASHBOARDCMI =
		"SELECT rpDashboardCmi FROM RpDashboardCmi rpDashboardCmi";

	private static final String _SQL_COUNT_RPDASHBOARDCMI =
		"SELECT COUNT(rpDashboardCmi) FROM RpDashboardCmi rpDashboardCmi";

	private static final String _ORDER_BY_ENTITY_ALIAS = "rpDashboardCmi.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RpDashboardCmi exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardCmiPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {
			"id", "cmiToanQuoc", "cmiTinh", "cmiTuyen", "cmiTrungBinh",
			"cmiTrungMax", "cmiTrungMin", "cmiCoSo"
		});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class RpDashboardCmiModelArgumentsResolver
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

			RpDashboardCmiModelImpl rpDashboardCmiModelImpl =
				(RpDashboardCmiModelImpl)baseModel;

			long columnBitmask = rpDashboardCmiModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					rpDashboardCmiModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						rpDashboardCmiModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					rpDashboardCmiModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return RpDashboardCmiImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return RpDashboardCmiTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			RpDashboardCmiModelImpl rpDashboardCmiModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						rpDashboardCmiModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = rpDashboardCmiModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}