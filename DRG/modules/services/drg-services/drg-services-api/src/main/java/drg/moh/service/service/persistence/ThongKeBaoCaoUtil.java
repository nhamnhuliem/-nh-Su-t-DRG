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

package drg.moh.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import drg.moh.service.model.ThongKeBaoCao;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the thong ke bao cao service. This utility wraps <code>drg.moh.service.service.persistence.impl.ThongKeBaoCaoPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see ThongKeBaoCaoPersistence
 * @generated
 */
public class ThongKeBaoCaoUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ThongKeBaoCao thongKeBaoCao) {
		getPersistence().clearCache(thongKeBaoCao);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, ThongKeBaoCao> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ThongKeBaoCao> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ThongKeBaoCao> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ThongKeBaoCao> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ThongKeBaoCao> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ThongKeBaoCao update(ThongKeBaoCao thongKeBaoCao) {
		return getPersistence().update(thongKeBaoCao);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ThongKeBaoCao update(
		ThongKeBaoCao thongKeBaoCao, ServiceContext serviceContext) {

		return getPersistence().update(thongKeBaoCao, serviceContext);
	}

	/**
	 * Returns all the thong ke bao caos where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the matching thong ke bao caos
	 */
	public static List<ThongKeBaoCao> findByNam(int nam) {
		return getPersistence().findByNam(nam);
	}

	/**
	 * Returns a range of all the thong ke bao caos where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeBaoCaoModelImpl</code>.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of thong ke bao caos
	 * @param end the upper bound of the range of thong ke bao caos (not inclusive)
	 * @return the range of matching thong ke bao caos
	 */
	public static List<ThongKeBaoCao> findByNam(int nam, int start, int end) {
		return getPersistence().findByNam(nam, start, end);
	}

	/**
	 * Returns an ordered range of all the thong ke bao caos where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeBaoCaoModelImpl</code>.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of thong ke bao caos
	 * @param end the upper bound of the range of thong ke bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong ke bao caos
	 */
	public static List<ThongKeBaoCao> findByNam(
		int nam, int start, int end,
		OrderByComparator<ThongKeBaoCao> orderByComparator) {

		return getPersistence().findByNam(nam, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the thong ke bao caos where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeBaoCaoModelImpl</code>.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of thong ke bao caos
	 * @param end the upper bound of the range of thong ke bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching thong ke bao caos
	 */
	public static List<ThongKeBaoCao> findByNam(
		int nam, int start, int end,
		OrderByComparator<ThongKeBaoCao> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByNam(
			nam, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong ke bao cao
	 * @throws NoSuchThongKeBaoCaoException if a matching thong ke bao cao could not be found
	 */
	public static ThongKeBaoCao findByNam_First(
			int nam, OrderByComparator<ThongKeBaoCao> orderByComparator)
		throws drg.moh.service.exception.NoSuchThongKeBaoCaoException {

		return getPersistence().findByNam_First(nam, orderByComparator);
	}

	/**
	 * Returns the first thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong ke bao cao, or <code>null</code> if a matching thong ke bao cao could not be found
	 */
	public static ThongKeBaoCao fetchByNam_First(
		int nam, OrderByComparator<ThongKeBaoCao> orderByComparator) {

		return getPersistence().fetchByNam_First(nam, orderByComparator);
	}

	/**
	 * Returns the last thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong ke bao cao
	 * @throws NoSuchThongKeBaoCaoException if a matching thong ke bao cao could not be found
	 */
	public static ThongKeBaoCao findByNam_Last(
			int nam, OrderByComparator<ThongKeBaoCao> orderByComparator)
		throws drg.moh.service.exception.NoSuchThongKeBaoCaoException {

		return getPersistence().findByNam_Last(nam, orderByComparator);
	}

	/**
	 * Returns the last thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong ke bao cao, or <code>null</code> if a matching thong ke bao cao could not be found
	 */
	public static ThongKeBaoCao fetchByNam_Last(
		int nam, OrderByComparator<ThongKeBaoCao> orderByComparator) {

		return getPersistence().fetchByNam_Last(nam, orderByComparator);
	}

	/**
	 * Returns the thong ke bao caos before and after the current thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param id the primary key of the current thong ke bao cao
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong ke bao cao
	 * @throws NoSuchThongKeBaoCaoException if a thong ke bao cao with the primary key could not be found
	 */
	public static ThongKeBaoCao[] findByNam_PrevAndNext(
			long id, int nam,
			OrderByComparator<ThongKeBaoCao> orderByComparator)
		throws drg.moh.service.exception.NoSuchThongKeBaoCaoException {

		return getPersistence().findByNam_PrevAndNext(
			id, nam, orderByComparator);
	}

	/**
	 * Removes all the thong ke bao caos where nam = &#63; from the database.
	 *
	 * @param nam the nam
	 */
	public static void removeByNam(int nam) {
		getPersistence().removeByNam(nam);
	}

	/**
	 * Returns the number of thong ke bao caos where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the number of matching thong ke bao caos
	 */
	public static int countByNam(int nam) {
		return getPersistence().countByNam(nam);
	}

	/**
	 * Caches the thong ke bao cao in the entity cache if it is enabled.
	 *
	 * @param thongKeBaoCao the thong ke bao cao
	 */
	public static void cacheResult(ThongKeBaoCao thongKeBaoCao) {
		getPersistence().cacheResult(thongKeBaoCao);
	}

	/**
	 * Caches the thong ke bao caos in the entity cache if it is enabled.
	 *
	 * @param thongKeBaoCaos the thong ke bao caos
	 */
	public static void cacheResult(List<ThongKeBaoCao> thongKeBaoCaos) {
		getPersistence().cacheResult(thongKeBaoCaos);
	}

	/**
	 * Creates a new thong ke bao cao with the primary key. Does not add the thong ke bao cao to the database.
	 *
	 * @param id the primary key for the new thong ke bao cao
	 * @return the new thong ke bao cao
	 */
	public static ThongKeBaoCao create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the thong ke bao cao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the thong ke bao cao
	 * @return the thong ke bao cao that was removed
	 * @throws NoSuchThongKeBaoCaoException if a thong ke bao cao with the primary key could not be found
	 */
	public static ThongKeBaoCao remove(long id)
		throws drg.moh.service.exception.NoSuchThongKeBaoCaoException {

		return getPersistence().remove(id);
	}

	public static ThongKeBaoCao updateImpl(ThongKeBaoCao thongKeBaoCao) {
		return getPersistence().updateImpl(thongKeBaoCao);
	}

	/**
	 * Returns the thong ke bao cao with the primary key or throws a <code>NoSuchThongKeBaoCaoException</code> if it could not be found.
	 *
	 * @param id the primary key of the thong ke bao cao
	 * @return the thong ke bao cao
	 * @throws NoSuchThongKeBaoCaoException if a thong ke bao cao with the primary key could not be found
	 */
	public static ThongKeBaoCao findByPrimaryKey(long id)
		throws drg.moh.service.exception.NoSuchThongKeBaoCaoException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the thong ke bao cao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the thong ke bao cao
	 * @return the thong ke bao cao, or <code>null</code> if a thong ke bao cao with the primary key could not be found
	 */
	public static ThongKeBaoCao fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the thong ke bao caos.
	 *
	 * @return the thong ke bao caos
	 */
	public static List<ThongKeBaoCao> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the thong ke bao caos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeBaoCaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong ke bao caos
	 * @param end the upper bound of the range of thong ke bao caos (not inclusive)
	 * @return the range of thong ke bao caos
	 */
	public static List<ThongKeBaoCao> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the thong ke bao caos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeBaoCaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong ke bao caos
	 * @param end the upper bound of the range of thong ke bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of thong ke bao caos
	 */
	public static List<ThongKeBaoCao> findAll(
		int start, int end,
		OrderByComparator<ThongKeBaoCao> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the thong ke bao caos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeBaoCaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong ke bao caos
	 * @param end the upper bound of the range of thong ke bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of thong ke bao caos
	 */
	public static List<ThongKeBaoCao> findAll(
		int start, int end, OrderByComparator<ThongKeBaoCao> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the thong ke bao caos from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of thong ke bao caos.
	 *
	 * @return the number of thong ke bao caos
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ThongKeBaoCaoPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ThongKeBaoCaoPersistence, ThongKeBaoCaoPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ThongKeBaoCaoPersistence.class);

		ServiceTracker<ThongKeBaoCaoPersistence, ThongKeBaoCaoPersistence>
			serviceTracker =
				new ServiceTracker
					<ThongKeBaoCaoPersistence, ThongKeBaoCaoPersistence>(
						bundle.getBundleContext(),
						ThongKeBaoCaoPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}