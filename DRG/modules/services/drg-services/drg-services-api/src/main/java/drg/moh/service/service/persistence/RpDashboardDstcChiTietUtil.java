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

import drg.moh.service.model.RpDashboardDstcChiTiet;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the rp dashboard dstc chi tiet service. This utility wraps <code>drg.moh.service.service.persistence.impl.RpDashboardDstcChiTietPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see RpDashboardDstcChiTietPersistence
 * @generated
 */
public class RpDashboardDstcChiTietUtil {

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
	public static void clearCache(
		RpDashboardDstcChiTiet rpDashboardDstcChiTiet) {

		getPersistence().clearCache(rpDashboardDstcChiTiet);
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
	public static Map<Serializable, RpDashboardDstcChiTiet> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RpDashboardDstcChiTiet> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RpDashboardDstcChiTiet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RpDashboardDstcChiTiet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RpDashboardDstcChiTiet> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RpDashboardDstcChiTiet update(
		RpDashboardDstcChiTiet rpDashboardDstcChiTiet) {

		return getPersistence().update(rpDashboardDstcChiTiet);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RpDashboardDstcChiTiet update(
		RpDashboardDstcChiTiet rpDashboardDstcChiTiet,
		ServiceContext serviceContext) {

		return getPersistence().update(rpDashboardDstcChiTiet, serviceContext);
	}

	/**
	 * Caches the rp dashboard dstc chi tiet in the entity cache if it is enabled.
	 *
	 * @param rpDashboardDstcChiTiet the rp dashboard dstc chi tiet
	 */
	public static void cacheResult(
		RpDashboardDstcChiTiet rpDashboardDstcChiTiet) {

		getPersistence().cacheResult(rpDashboardDstcChiTiet);
	}

	/**
	 * Caches the rp dashboard dstc chi tiets in the entity cache if it is enabled.
	 *
	 * @param rpDashboardDstcChiTiets the rp dashboard dstc chi tiets
	 */
	public static void cacheResult(
		List<RpDashboardDstcChiTiet> rpDashboardDstcChiTiets) {

		getPersistence().cacheResult(rpDashboardDstcChiTiets);
	}

	/**
	 * Creates a new rp dashboard dstc chi tiet with the primary key. Does not add the rp dashboard dstc chi tiet to the database.
	 *
	 * @param id the primary key for the new rp dashboard dstc chi tiet
	 * @return the new rp dashboard dstc chi tiet
	 */
	public static RpDashboardDstcChiTiet create(String id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the rp dashboard dstc chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard dstc chi tiet
	 * @return the rp dashboard dstc chi tiet that was removed
	 * @throws NoSuchRpDashboardDstcChiTietException if a rp dashboard dstc chi tiet with the primary key could not be found
	 */
	public static RpDashboardDstcChiTiet remove(String id)
		throws drg.moh.service.exception.NoSuchRpDashboardDstcChiTietException {

		return getPersistence().remove(id);
	}

	public static RpDashboardDstcChiTiet updateImpl(
		RpDashboardDstcChiTiet rpDashboardDstcChiTiet) {

		return getPersistence().updateImpl(rpDashboardDstcChiTiet);
	}

	/**
	 * Returns the rp dashboard dstc chi tiet with the primary key or throws a <code>NoSuchRpDashboardDstcChiTietException</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard dstc chi tiet
	 * @return the rp dashboard dstc chi tiet
	 * @throws NoSuchRpDashboardDstcChiTietException if a rp dashboard dstc chi tiet with the primary key could not be found
	 */
	public static RpDashboardDstcChiTiet findByPrimaryKey(String id)
		throws drg.moh.service.exception.NoSuchRpDashboardDstcChiTietException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the rp dashboard dstc chi tiet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard dstc chi tiet
	 * @return the rp dashboard dstc chi tiet, or <code>null</code> if a rp dashboard dstc chi tiet with the primary key could not be found
	 */
	public static RpDashboardDstcChiTiet fetchByPrimaryKey(String id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the rp dashboard dstc chi tiets.
	 *
	 * @return the rp dashboard dstc chi tiets
	 */
	public static List<RpDashboardDstcChiTiet> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the rp dashboard dstc chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDstcChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dstc chi tiets
	 * @param end the upper bound of the range of rp dashboard dstc chi tiets (not inclusive)
	 * @return the range of rp dashboard dstc chi tiets
	 */
	public static List<RpDashboardDstcChiTiet> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the rp dashboard dstc chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDstcChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dstc chi tiets
	 * @param end the upper bound of the range of rp dashboard dstc chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard dstc chi tiets
	 */
	public static List<RpDashboardDstcChiTiet> findAll(
		int start, int end,
		OrderByComparator<RpDashboardDstcChiTiet> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the rp dashboard dstc chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDstcChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dstc chi tiets
	 * @param end the upper bound of the range of rp dashboard dstc chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard dstc chi tiets
	 */
	public static List<RpDashboardDstcChiTiet> findAll(
		int start, int end,
		OrderByComparator<RpDashboardDstcChiTiet> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the rp dashboard dstc chi tiets from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of rp dashboard dstc chi tiets.
	 *
	 * @return the number of rp dashboard dstc chi tiets
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RpDashboardDstcChiTietPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<RpDashboardDstcChiTietPersistence, RpDashboardDstcChiTietPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			RpDashboardDstcChiTietPersistence.class);

		ServiceTracker
			<RpDashboardDstcChiTietPersistence,
			 RpDashboardDstcChiTietPersistence> serviceTracker =
				new ServiceTracker
					<RpDashboardDstcChiTietPersistence,
					 RpDashboardDstcChiTietPersistence>(
						 bundle.getBundleContext(),
						 RpDashboardDstcChiTietPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}