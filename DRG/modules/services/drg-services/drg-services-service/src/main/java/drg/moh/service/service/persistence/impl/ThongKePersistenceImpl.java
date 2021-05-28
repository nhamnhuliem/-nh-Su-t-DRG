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

import drg.moh.service.exception.NoSuchThongKeException;
import drg.moh.service.model.ThongKe;
import drg.moh.service.model.ThongKeTable;
import drg.moh.service.model.impl.ThongKeImpl;
import drg.moh.service.model.impl.ThongKeModelImpl;
import drg.moh.service.service.persistence.ThongKePersistence;

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
 * The persistence implementation for the thong ke service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class ThongKePersistenceImpl
	extends BasePersistenceImpl<ThongKe> implements ThongKePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ThongKeUtil</code> to access the thong ke persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ThongKeImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;

	public ThongKePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("maCoSo", "ma_cskcb");
		dbColumnNames.put("nam", "nam_qt");
		dbColumnNames.put("thang", "thang_qt");
		dbColumnNames.put("tongHoSo", "tong_hoso");
		dbColumnNames.put("tienTongChi", "t_tongchi");
		dbColumnNames.put("tienBH", "t_bhtt");

		setDBColumnNames(dbColumnNames);

		setModelClass(ThongKe.class);

		setModelImplClass(ThongKeImpl.class);
		setModelPKClass(long.class);

		setTable(ThongKeTable.INSTANCE);
	}

	/**
	 * Caches the thong ke in the entity cache if it is enabled.
	 *
	 * @param thongKe the thong ke
	 */
	@Override
	public void cacheResult(ThongKe thongKe) {
		entityCache.putResult(
			ThongKeImpl.class, thongKe.getPrimaryKey(), thongKe);
	}

	/**
	 * Caches the thong kes in the entity cache if it is enabled.
	 *
	 * @param thongKes the thong kes
	 */
	@Override
	public void cacheResult(List<ThongKe> thongKes) {
		for (ThongKe thongKe : thongKes) {
			if (entityCache.getResult(
					ThongKeImpl.class, thongKe.getPrimaryKey()) == null) {

				cacheResult(thongKe);
			}
		}
	}

	/**
	 * Clears the cache for all thong kes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ThongKeImpl.class);

		finderCache.clearCache(ThongKeImpl.class);
	}

	/**
	 * Clears the cache for the thong ke.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ThongKe thongKe) {
		entityCache.removeResult(ThongKeImpl.class, thongKe);
	}

	@Override
	public void clearCache(List<ThongKe> thongKes) {
		for (ThongKe thongKe : thongKes) {
			entityCache.removeResult(ThongKeImpl.class, thongKe);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ThongKeImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ThongKeImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new thong ke with the primary key. Does not add the thong ke to the database.
	 *
	 * @param id the primary key for the new thong ke
	 * @return the new thong ke
	 */
	@Override
	public ThongKe create(long id) {
		ThongKe thongKe = new ThongKeImpl();

		thongKe.setNew(true);
		thongKe.setPrimaryKey(id);

		return thongKe;
	}

	/**
	 * Removes the thong ke with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the thong ke
	 * @return the thong ke that was removed
	 * @throws NoSuchThongKeException if a thong ke with the primary key could not be found
	 */
	@Override
	public ThongKe remove(long id) throws NoSuchThongKeException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the thong ke with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the thong ke
	 * @return the thong ke that was removed
	 * @throws NoSuchThongKeException if a thong ke with the primary key could not be found
	 */
	@Override
	public ThongKe remove(Serializable primaryKey)
		throws NoSuchThongKeException {

		Session session = null;

		try {
			session = openSession();

			ThongKe thongKe = (ThongKe)session.get(
				ThongKeImpl.class, primaryKey);

			if (thongKe == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchThongKeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(thongKe);
		}
		catch (NoSuchThongKeException noSuchEntityException) {
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
	protected ThongKe removeImpl(ThongKe thongKe) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thongKe)) {
				thongKe = (ThongKe)session.get(
					ThongKeImpl.class, thongKe.getPrimaryKeyObj());
			}

			if (thongKe != null) {
				session.delete(thongKe);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (thongKe != null) {
			clearCache(thongKe);
		}

		return thongKe;
	}

	@Override
	public ThongKe updateImpl(ThongKe thongKe) {
		boolean isNew = thongKe.isNew();

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(thongKe);
			}
			else {
				thongKe = (ThongKe)session.merge(thongKe);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(ThongKeImpl.class, thongKe, false, true);

		if (isNew) {
			thongKe.setNew(false);
		}

		thongKe.resetOriginalValues();

		return thongKe;
	}

	/**
	 * Returns the thong ke with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the thong ke
	 * @return the thong ke
	 * @throws NoSuchThongKeException if a thong ke with the primary key could not be found
	 */
	@Override
	public ThongKe findByPrimaryKey(Serializable primaryKey)
		throws NoSuchThongKeException {

		ThongKe thongKe = fetchByPrimaryKey(primaryKey);

		if (thongKe == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchThongKeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return thongKe;
	}

	/**
	 * Returns the thong ke with the primary key or throws a <code>NoSuchThongKeException</code> if it could not be found.
	 *
	 * @param id the primary key of the thong ke
	 * @return the thong ke
	 * @throws NoSuchThongKeException if a thong ke with the primary key could not be found
	 */
	@Override
	public ThongKe findByPrimaryKey(long id) throws NoSuchThongKeException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the thong ke with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the thong ke
	 * @return the thong ke, or <code>null</code> if a thong ke with the primary key could not be found
	 */
	@Override
	public ThongKe fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the thong kes.
	 *
	 * @return the thong kes
	 */
	@Override
	public List<ThongKe> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the thong kes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong kes
	 * @param end the upper bound of the range of thong kes (not inclusive)
	 * @return the range of thong kes
	 */
	@Override
	public List<ThongKe> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the thong kes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong kes
	 * @param end the upper bound of the range of thong kes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of thong kes
	 */
	@Override
	public List<ThongKe> findAll(
		int start, int end, OrderByComparator<ThongKe> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the thong kes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong kes
	 * @param end the upper bound of the range of thong kes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of thong kes
	 */
	@Override
	public List<ThongKe> findAll(
		int start, int end, OrderByComparator<ThongKe> orderByComparator,
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

		List<ThongKe> list = null;

		if (useFinderCache) {
			list = (List<ThongKe>)finderCache.getResult(finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_THONGKE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_THONGKE;

				sql = sql.concat(ThongKeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ThongKe>)QueryUtil.list(
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
	 * Removes all the thong kes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ThongKe thongKe : findAll()) {
			remove(thongKe);
		}
	}

	/**
	 * Returns the number of thong kes.
	 *
	 * @return the number of thong kes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_THONGKE);

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
		return "id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_THONGKE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ThongKeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the thong ke persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(ThongKePersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new ThongKeModelArgumentsResolver(),
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
		entityCache.removeCache(ThongKeImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_THONGKE =
		"SELECT thongKe FROM ThongKe thongKe";

	private static final String _SQL_COUNT_THONGKE =
		"SELECT COUNT(thongKe) FROM ThongKe thongKe";

	private static final String _ORDER_BY_ENTITY_ALIAS = "thongKe.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ThongKe exists with the primary key ";

	private static final Log _log = LogFactoryUtil.getLog(
		ThongKePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {
			"maCoSo", "nam", "thang", "tongHoSo", "tienTongChi", "tienBH"
		});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class ThongKeModelArgumentsResolver
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

			ThongKeModelImpl thongKeModelImpl = (ThongKeModelImpl)baseModel;

			long columnBitmask = thongKeModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(thongKeModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						thongKeModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(thongKeModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return ThongKeImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return ThongKeTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			ThongKeModelImpl thongKeModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = thongKeModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = thongKeModelImpl.getColumnValue(columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}