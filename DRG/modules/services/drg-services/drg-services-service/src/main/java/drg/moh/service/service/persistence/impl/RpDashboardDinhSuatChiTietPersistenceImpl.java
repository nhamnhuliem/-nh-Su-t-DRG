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

import drg.moh.service.exception.NoSuchRpDashboardDinhSuatChiTietException;
import drg.moh.service.model.RpDashboardDinhSuatChiTiet;
import drg.moh.service.model.RpDashboardDinhSuatChiTietTable;
import drg.moh.service.model.impl.RpDashboardDinhSuatChiTietImpl;
import drg.moh.service.model.impl.RpDashboardDinhSuatChiTietModelImpl;
import drg.moh.service.service.persistence.RpDashboardDinhSuatChiTietPersistence;

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
 * The persistence implementation for the rp dashboard dinh suat chi tiet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class RpDashboardDinhSuatChiTietPersistenceImpl
	extends BasePersistenceImpl<RpDashboardDinhSuatChiTiet>
	implements RpDashboardDinhSuatChiTietPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>RpDashboardDinhSuatChiTietUtil</code> to access the rp dashboard dinh suat chi tiet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		RpDashboardDinhSuatChiTietImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public RpDashboardDinhSuatChiTietPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("tenTinh", "_tentinh");
		dbColumnNames.put("dinhSuat", "_dinhsuat");

		setDBColumnNames(dbColumnNames);

		setModelClass(RpDashboardDinhSuatChiTiet.class);

		setModelImplClass(RpDashboardDinhSuatChiTietImpl.class);
		setModelPKClass(long.class);

		setTable(RpDashboardDinhSuatChiTietTable.INSTANCE);
	}

	/**
	 * Caches the rp dashboard dinh suat chi tiet in the entity cache if it is enabled.
	 *
	 * @param rpDashboardDinhSuatChiTiet the rp dashboard dinh suat chi tiet
	 */
	@Override
	public void cacheResult(
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet) {

		entityCache.putResult(
			RpDashboardDinhSuatChiTietImpl.class,
			rpDashboardDinhSuatChiTiet.getPrimaryKey(),
			rpDashboardDinhSuatChiTiet);
	}

	/**
	 * Caches the rp dashboard dinh suat chi tiets in the entity cache if it is enabled.
	 *
	 * @param rpDashboardDinhSuatChiTiets the rp dashboard dinh suat chi tiets
	 */
	@Override
	public void cacheResult(
		List<RpDashboardDinhSuatChiTiet> rpDashboardDinhSuatChiTiets) {

		for (RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet :
				rpDashboardDinhSuatChiTiets) {

			if (entityCache.getResult(
					RpDashboardDinhSuatChiTietImpl.class,
					rpDashboardDinhSuatChiTiet.getPrimaryKey()) == null) {

				cacheResult(rpDashboardDinhSuatChiTiet);
			}
		}
	}

	/**
	 * Clears the cache for all rp dashboard dinh suat chi tiets.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(RpDashboardDinhSuatChiTietImpl.class);

		finderCache.clearCache(RpDashboardDinhSuatChiTietImpl.class);
	}

	/**
	 * Clears the cache for the rp dashboard dinh suat chi tiet.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet) {

		entityCache.removeResult(
			RpDashboardDinhSuatChiTietImpl.class, rpDashboardDinhSuatChiTiet);
	}

	@Override
	public void clearCache(
		List<RpDashboardDinhSuatChiTiet> rpDashboardDinhSuatChiTiets) {

		for (RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet :
				rpDashboardDinhSuatChiTiets) {

			entityCache.removeResult(
				RpDashboardDinhSuatChiTietImpl.class,
				rpDashboardDinhSuatChiTiet);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(RpDashboardDinhSuatChiTietImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				RpDashboardDinhSuatChiTietImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new rp dashboard dinh suat chi tiet with the primary key. Does not add the rp dashboard dinh suat chi tiet to the database.
	 *
	 * @param id the primary key for the new rp dashboard dinh suat chi tiet
	 * @return the new rp dashboard dinh suat chi tiet
	 */
	@Override
	public RpDashboardDinhSuatChiTiet create(long id) {
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet =
			new RpDashboardDinhSuatChiTietImpl();

		rpDashboardDinhSuatChiTiet.setNew(true);
		rpDashboardDinhSuatChiTiet.setPrimaryKey(id);

		return rpDashboardDinhSuatChiTiet;
	}

	/**
	 * Removes the rp dashboard dinh suat chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet that was removed
	 * @throws NoSuchRpDashboardDinhSuatChiTietException if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	@Override
	public RpDashboardDinhSuatChiTiet remove(long id)
		throws NoSuchRpDashboardDinhSuatChiTietException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the rp dashboard dinh suat chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet that was removed
	 * @throws NoSuchRpDashboardDinhSuatChiTietException if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	@Override
	public RpDashboardDinhSuatChiTiet remove(Serializable primaryKey)
		throws NoSuchRpDashboardDinhSuatChiTietException {

		Session session = null;

		try {
			session = openSession();

			RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet =
				(RpDashboardDinhSuatChiTiet)session.get(
					RpDashboardDinhSuatChiTietImpl.class, primaryKey);

			if (rpDashboardDinhSuatChiTiet == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRpDashboardDinhSuatChiTietException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(rpDashboardDinhSuatChiTiet);
		}
		catch (NoSuchRpDashboardDinhSuatChiTietException
					noSuchEntityException) {

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
	protected RpDashboardDinhSuatChiTiet removeImpl(
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(rpDashboardDinhSuatChiTiet)) {
				rpDashboardDinhSuatChiTiet =
					(RpDashboardDinhSuatChiTiet)session.get(
						RpDashboardDinhSuatChiTietImpl.class,
						rpDashboardDinhSuatChiTiet.getPrimaryKeyObj());
			}

			if (rpDashboardDinhSuatChiTiet != null) {
				session.delete(rpDashboardDinhSuatChiTiet);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (rpDashboardDinhSuatChiTiet != null) {
			clearCache(rpDashboardDinhSuatChiTiet);
		}

		return rpDashboardDinhSuatChiTiet;
	}

	@Override
	public RpDashboardDinhSuatChiTiet updateImpl(
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet) {

		boolean isNew = rpDashboardDinhSuatChiTiet.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(rpDashboardDinhSuatChiTiet);
			}
			else {
				rpDashboardDinhSuatChiTiet =
					(RpDashboardDinhSuatChiTiet)session.merge(
						rpDashboardDinhSuatChiTiet);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			RpDashboardDinhSuatChiTietImpl.class, rpDashboardDinhSuatChiTiet,
			false, true);

		if (isNew) {
			rpDashboardDinhSuatChiTiet.setNew(false);
		}

		rpDashboardDinhSuatChiTiet.resetOriginalValues();

		return rpDashboardDinhSuatChiTiet;
	}

	/**
	 * Returns the rp dashboard dinh suat chi tiet with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet
	 * @throws NoSuchRpDashboardDinhSuatChiTietException if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	@Override
	public RpDashboardDinhSuatChiTiet findByPrimaryKey(Serializable primaryKey)
		throws NoSuchRpDashboardDinhSuatChiTietException {

		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet =
			fetchByPrimaryKey(primaryKey);

		if (rpDashboardDinhSuatChiTiet == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchRpDashboardDinhSuatChiTietException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return rpDashboardDinhSuatChiTiet;
	}

	/**
	 * Returns the rp dashboard dinh suat chi tiet with the primary key or throws a <code>NoSuchRpDashboardDinhSuatChiTietException</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet
	 * @throws NoSuchRpDashboardDinhSuatChiTietException if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	@Override
	public RpDashboardDinhSuatChiTiet findByPrimaryKey(long id)
		throws NoSuchRpDashboardDinhSuatChiTietException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the rp dashboard dinh suat chi tiet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet, or <code>null</code> if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	@Override
	public RpDashboardDinhSuatChiTiet fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the rp dashboard dinh suat chi tiets.
	 *
	 * @return the rp dashboard dinh suat chi tiets
	 */
	@Override
	public List<RpDashboardDinhSuatChiTiet> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rp dashboard dinh suat chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDinhSuatChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dinh suat chi tiets
	 * @param end the upper bound of the range of rp dashboard dinh suat chi tiets (not inclusive)
	 * @return the range of rp dashboard dinh suat chi tiets
	 */
	@Override
	public List<RpDashboardDinhSuatChiTiet> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rp dashboard dinh suat chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDinhSuatChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dinh suat chi tiets
	 * @param end the upper bound of the range of rp dashboard dinh suat chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard dinh suat chi tiets
	 */
	@Override
	public List<RpDashboardDinhSuatChiTiet> findAll(
		int start, int end,
		OrderByComparator<RpDashboardDinhSuatChiTiet> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the rp dashboard dinh suat chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDinhSuatChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dinh suat chi tiets
	 * @param end the upper bound of the range of rp dashboard dinh suat chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard dinh suat chi tiets
	 */
	@Override
	public List<RpDashboardDinhSuatChiTiet> findAll(
		int start, int end,
		OrderByComparator<RpDashboardDinhSuatChiTiet> orderByComparator,
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

		List<RpDashboardDinhSuatChiTiet> list = null;

		if (useFinderCache) {
			list = (List<RpDashboardDinhSuatChiTiet>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_RPDASHBOARDDINHSUATCHITIET);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_RPDASHBOARDDINHSUATCHITIET;

				sql = sql.concat(
					RpDashboardDinhSuatChiTietModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<RpDashboardDinhSuatChiTiet>)QueryUtil.list(
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
	 * Removes all the rp dashboard dinh suat chi tiets from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet :
				findAll()) {

			remove(rpDashboardDinhSuatChiTiet);
		}
	}

	/**
	 * Returns the number of rp dashboard dinh suat chi tiets.
	 *
	 * @return the number of rp dashboard dinh suat chi tiets
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
					_SQL_COUNT_RPDASHBOARDDINHSUATCHITIET);

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
		return _SQL_SELECT_RPDASHBOARDDINHSUATCHITIET;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return RpDashboardDinhSuatChiTietModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the rp dashboard dinh suat chi tiet persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			RpDashboardDinhSuatChiTietPersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new RpDashboardDinhSuatChiTietModelArgumentsResolver(),
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
		entityCache.removeCache(RpDashboardDinhSuatChiTietImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_RPDASHBOARDDINHSUATCHITIET =
		"SELECT rpDashboardDinhSuatChiTiet FROM RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet";

	private static final String _SQL_COUNT_RPDASHBOARDDINHSUATCHITIET =
		"SELECT COUNT(rpDashboardDinhSuatChiTiet) FROM RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"rpDashboardDinhSuatChiTiet.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No RpDashboardDinhSuatChiTiet exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardDinhSuatChiTietPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"id", "tenTinh", "dinhSuat"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class RpDashboardDinhSuatChiTietModelArgumentsResolver
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

			RpDashboardDinhSuatChiTietModelImpl
				rpDashboardDinhSuatChiTietModelImpl =
					(RpDashboardDinhSuatChiTietModelImpl)baseModel;

			long columnBitmask =
				rpDashboardDinhSuatChiTietModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					rpDashboardDinhSuatChiTietModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						rpDashboardDinhSuatChiTietModelImpl.getColumnBitmask(
							columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					rpDashboardDinhSuatChiTietModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return RpDashboardDinhSuatChiTietImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return RpDashboardDinhSuatChiTietTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			RpDashboardDinhSuatChiTietModelImpl
				rpDashboardDinhSuatChiTietModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						rpDashboardDinhSuatChiTietModelImpl.
							getColumnOriginalValue(columnName);
				}
				else {
					arguments[i] =
						rpDashboardDinhSuatChiTietModelImpl.getColumnValue(
							columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}