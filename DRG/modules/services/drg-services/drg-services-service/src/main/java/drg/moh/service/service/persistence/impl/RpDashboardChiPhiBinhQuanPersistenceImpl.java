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

import drg.moh.service.exception.NoSuchRpDashboardChiPhiBinhQuanException;
import drg.moh.service.model.RpDashboardChiPhiBinhQuan;
import drg.moh.service.model.RpDashboardChiPhiBinhQuanTable;
import drg.moh.service.model.impl.RpDashboardChiPhiBinhQuanImpl;
import drg.moh.service.model.impl.RpDashboardChiPhiBinhQuanModelImpl;
import drg.moh.service.service.persistence.RpDashboardChiPhiBinhQuanPersistence;

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
 * The persistence implementation for the rp dashboard chi phi binh quan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class RpDashboardChiPhiBinhQuanPersistenceImpl
	extends BasePersistenceImpl<RpDashboardChiPhiBinhQuan>
	implements RpDashboardChiPhiBinhQuanPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RpDashboardChiPhiBinhQuanUtil</code> to access the rp dashboard chi phi binh quan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RpDashboardChiPhiBinhQuanImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public RpDashboardChiPhiBinhQuanPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("chiPhi", "_chiphi");
		dbColumnNames.put("binhQuan", "_binhquan");

		setDBColumnNames(dbColumnNames);

		setModelClass(RpDashboardChiPhiBinhQuan.class);

		setModelImplClass(RpDashboardChiPhiBinhQuanImpl.class);
		setModelPKClass(long.class);

		setTable(RpDashboardChiPhiBinhQuanTable.INSTANCE);
	}

	/**
	 * Caches the rp dashboard chi phi binh quan in the entity cache if it is enabled.
	 *
	 * @param rpDashboardChiPhiBinhQuan the rp dashboard chi phi binh quan
	 */
	@Override
	public void cacheResult(
		RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan) {

		entityCache.putResult(
			RpDashboardChiPhiBinhQuanImpl.class,
			rpDashboardChiPhiBinhQuan.getPrimaryKey(),
			rpDashboardChiPhiBinhQuan);
	}

	/**
	 * Caches the rp dashboard chi phi binh quans in the entity cache if it is enabled.
	 *
	 * @param rpDashboardChiPhiBinhQuans the rp dashboard chi phi binh quans
	 */
	@Override
	public void cacheResult(
		List<RpDashboardChiPhiBinhQuan> rpDashboardChiPhiBinhQuans) {

		for (RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan :
				rpDashboardChiPhiBinhQuans) {

			if (entityCache.getResult(
					RpDashboardChiPhiBinhQuanImpl.class,
					rpDashboardChiPhiBinhQuan.getPrimaryKey()) == null) {

				cacheResult(rpDashboardChiPhiBinhQuan);
			}
		}
	}

	/**
	 * Clears the cache for all rp dashboard chi phi binh quans.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RpDashboardChiPhiBinhQuanImpl.class);

		finderCache.clearCache(RpDashboardChiPhiBinhQuanImpl.class);
	}

	/**
	 * Clears the cache for the rp dashboard chi phi binh quan.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan) {

		entityCache.removeResult(
			RpDashboardChiPhiBinhQuanImpl.class, rpDashboardChiPhiBinhQuan);
	}

	@Override
	public void clearCache(
		List<RpDashboardChiPhiBinhQuan> rpDashboardChiPhiBinhQuans) {

		for (RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan :
				rpDashboardChiPhiBinhQuans) {

			entityCache.removeResult(
				RpDashboardChiPhiBinhQuanImpl.class, rpDashboardChiPhiBinhQuan);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RpDashboardChiPhiBinhQuanImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				RpDashboardChiPhiBinhQuanImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new rp dashboard chi phi binh quan with the primary key. Does not add the rp dashboard chi phi binh quan to the database.
	 *
	 * @param id the primary key for the new rp dashboard chi phi binh quan
	 * @return the new rp dashboard chi phi binh quan
	 */
	@Override
	public RpDashboardChiPhiBinhQuan create(long id) {
		RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan =
			new RpDashboardChiPhiBinhQuanImpl();

		rpDashboardChiPhiBinhQuan.setNew(true);
		rpDashboardChiPhiBinhQuan.setPrimaryKey(id);

		return rpDashboardChiPhiBinhQuan;
	}

	/**
	 * Removes the rp dashboard chi phi binh quan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan that was removed
	 * @throws NoSuchRpDashboardChiPhiBinhQuanException if a rp dashboard chi phi binh quan with the primary key could not be found
	 */
	@Override
	public RpDashboardChiPhiBinhQuan remove(long id)
		throws NoSuchRpDashboardChiPhiBinhQuanException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the rp dashboard chi phi binh quan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan that was removed
	 * @throws NoSuchRpDashboardChiPhiBinhQuanException if a rp dashboard chi phi binh quan with the primary key could not be found
	 */
	@Override
	public RpDashboardChiPhiBinhQuan remove(Serializable primaryKey)
		throws NoSuchRpDashboardChiPhiBinhQuanException {

		Session session = null;

		try {
			session = openSession();

			RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan =
				(RpDashboardChiPhiBinhQuan)session.get(
					RpDashboardChiPhiBinhQuanImpl.class, primaryKey);

			if (rpDashboardChiPhiBinhQuan == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRpDashboardChiPhiBinhQuanException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(rpDashboardChiPhiBinhQuan);
		}
		catch (NoSuchRpDashboardChiPhiBinhQuanException noSuchEntityException) {
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
	protected RpDashboardChiPhiBinhQuan removeImpl(
		RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rpDashboardChiPhiBinhQuan)) {
				rpDashboardChiPhiBinhQuan =
					(RpDashboardChiPhiBinhQuan)session.get(
						RpDashboardChiPhiBinhQuanImpl.class,
						rpDashboardChiPhiBinhQuan.getPrimaryKeyObj());
			}

			if (rpDashboardChiPhiBinhQuan != null) {
				session.delete(rpDashboardChiPhiBinhQuan);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (rpDashboardChiPhiBinhQuan != null) {
			clearCache(rpDashboardChiPhiBinhQuan);
		}

		return rpDashboardChiPhiBinhQuan;
	}

	@Override
	public RpDashboardChiPhiBinhQuan updateImpl(
		RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan) {

		boolean isNew = rpDashboardChiPhiBinhQuan.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(rpDashboardChiPhiBinhQuan);
			}
			else {
				rpDashboardChiPhiBinhQuan =
					(RpDashboardChiPhiBinhQuan)session.merge(
						rpDashboardChiPhiBinhQuan);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RpDashboardChiPhiBinhQuanImpl.class, rpDashboardChiPhiBinhQuan,
			false, true);

		if (isNew) {
			rpDashboardChiPhiBinhQuan.setNew(false);
		}

		rpDashboardChiPhiBinhQuan.resetOriginalValues();

		return rpDashboardChiPhiBinhQuan;
	}

	/**
	 * Returns the rp dashboard chi phi binh quan with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan
	 * @throws NoSuchRpDashboardChiPhiBinhQuanException if a rp dashboard chi phi binh quan with the primary key could not be found
	 */
	@Override
	public RpDashboardChiPhiBinhQuan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRpDashboardChiPhiBinhQuanException {

		RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan = fetchByPrimaryKey(
			primaryKey);

		if (rpDashboardChiPhiBinhQuan == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRpDashboardChiPhiBinhQuanException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return rpDashboardChiPhiBinhQuan;
	}

	/**
	 * Returns the rp dashboard chi phi binh quan with the primary key or throws a <code>NoSuchRpDashboardChiPhiBinhQuanException</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan
	 * @throws NoSuchRpDashboardChiPhiBinhQuanException if a rp dashboard chi phi binh quan with the primary key could not be found
	 */
	@Override
	public RpDashboardChiPhiBinhQuan findByPrimaryKey(long id)
		throws NoSuchRpDashboardChiPhiBinhQuanException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the rp dashboard chi phi binh quan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan, or <code>null</code> if a rp dashboard chi phi binh quan with the primary key could not be found
	 */
	@Override
	public RpDashboardChiPhiBinhQuan fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the rp dashboard chi phi binh quans.
	 *
	 * @return the rp dashboard chi phi binh quans
	 */
	@Override
	public List<RpDashboardChiPhiBinhQuan> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rp dashboard chi phi binh quans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardChiPhiBinhQuanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard chi phi binh quans
	 * @param end the upper bound of the range of rp dashboard chi phi binh quans (not inclusive)
	 * @return the range of rp dashboard chi phi binh quans
	 */
	@Override
	public List<RpDashboardChiPhiBinhQuan> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rp dashboard chi phi binh quans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardChiPhiBinhQuanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard chi phi binh quans
	 * @param end the upper bound of the range of rp dashboard chi phi binh quans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard chi phi binh quans
	 */
	@Override
	public List<RpDashboardChiPhiBinhQuan> findAll(
		int start, int end,
		OrderByComparator<RpDashboardChiPhiBinhQuan> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rp dashboard chi phi binh quans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardChiPhiBinhQuanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard chi phi binh quans
	 * @param end the upper bound of the range of rp dashboard chi phi binh quans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard chi phi binh quans
	 */
	@Override
	public List<RpDashboardChiPhiBinhQuan> findAll(
		int start, int end,
		OrderByComparator<RpDashboardChiPhiBinhQuan> orderByComparator,
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

		List<RpDashboardChiPhiBinhQuan> list = null;

		if (useFinderCache) {
			list = (List<RpDashboardChiPhiBinhQuan>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RPDASHBOARDCHIPHIBINHQUAN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RPDASHBOARDCHIPHIBINHQUAN;

				sql = sql.concat(
					RpDashboardChiPhiBinhQuanModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RpDashboardChiPhiBinhQuan>)QueryUtil.list(
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
	 * Removes all the rp dashboard chi phi binh quans from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan : findAll()) {
			remove(rpDashboardChiPhiBinhQuan);
		}
	}

	/**
	 * Returns the number of rp dashboard chi phi binh quans.
	 *
	 * @return the number of rp dashboard chi phi binh quans
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
					_SQL_COUNT_RPDASHBOARDCHIPHIBINHQUAN);

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
		return _SQL_SELECT_RPDASHBOARDCHIPHIBINHQUAN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RpDashboardChiPhiBinhQuanModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rp dashboard chi phi binh quan persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			RpDashboardChiPhiBinhQuanPersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new RpDashboardChiPhiBinhQuanModelArgumentsResolver(),
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
		entityCache.removeCache(RpDashboardChiPhiBinhQuanImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_RPDASHBOARDCHIPHIBINHQUAN =
		"SELECT rpDashboardChiPhiBinhQuan FROM RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan";

	private static final String _SQL_COUNT_RPDASHBOARDCHIPHIBINHQUAN =
		"SELECT COUNT(rpDashboardChiPhiBinhQuan) FROM RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"rpDashboardChiPhiBinhQuan.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RpDashboardChiPhiBinhQuan exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardChiPhiBinhQuanPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"id", "chiPhi", "binhQuan"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class RpDashboardChiPhiBinhQuanModelArgumentsResolver
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

			RpDashboardChiPhiBinhQuanModelImpl
				rpDashboardChiPhiBinhQuanModelImpl =
					(RpDashboardChiPhiBinhQuanModelImpl)baseModel;

			long columnBitmask =
				rpDashboardChiPhiBinhQuanModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					rpDashboardChiPhiBinhQuanModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						rpDashboardChiPhiBinhQuanModelImpl.getColumnBitmask(
							columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					rpDashboardChiPhiBinhQuanModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return RpDashboardChiPhiBinhQuanImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return RpDashboardChiPhiBinhQuanTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			RpDashboardChiPhiBinhQuanModelImpl
				rpDashboardChiPhiBinhQuanModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						rpDashboardChiPhiBinhQuanModelImpl.
							getColumnOriginalValue(columnName);
				}
				else {
					arguments[i] =
						rpDashboardChiPhiBinhQuanModelImpl.getColumnValue(
							columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}