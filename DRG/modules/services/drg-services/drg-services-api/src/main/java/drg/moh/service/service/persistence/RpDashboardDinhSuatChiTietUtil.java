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

import drg.moh.service.model.RpDashboardDinhSuatChiTiet;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the rp dashboard dinh suat chi tiet service. This utility wraps <code>drg.moh.service.service.persistence.impl.RpDashboardDinhSuatChiTietPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see RpDashboardDinhSuatChiTietPersistence
 * @generated
 */
public class RpDashboardDinhSuatChiTietUtil {

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
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet) {

		getPersistence().clearCache(rpDashboardDinhSuatChiTiet);
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
	public static Map<Serializable, RpDashboardDinhSuatChiTiet>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RpDashboardDinhSuatChiTiet> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RpDashboardDinhSuatChiTiet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RpDashboardDinhSuatChiTiet> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RpDashboardDinhSuatChiTiet> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RpDashboardDinhSuatChiTiet update(
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet) {

		return getPersistence().update(rpDashboardDinhSuatChiTiet);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RpDashboardDinhSuatChiTiet update(
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet,
		ServiceContext serviceContext) {

		return getPersistence().update(
			rpDashboardDinhSuatChiTiet, serviceContext);
	}

	/**
	 * Caches the rp dashboard dinh suat chi tiet in the entity cache if it is enabled.
	 *
	 * @param rpDashboardDinhSuatChiTiet the rp dashboard dinh suat chi tiet
	 */
	public static void cacheResult(
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet) {

		getPersistence().cacheResult(rpDashboardDinhSuatChiTiet);
	}

	/**
	 * Caches the rp dashboard dinh suat chi tiets in the entity cache if it is enabled.
	 *
	 * @param rpDashboardDinhSuatChiTiets the rp dashboard dinh suat chi tiets
	 */
	public static void cacheResult(
		List<RpDashboardDinhSuatChiTiet> rpDashboardDinhSuatChiTiets) {

		getPersistence().cacheResult(rpDashboardDinhSuatChiTiets);
	}

	/**
	 * Creates a new rp dashboard dinh suat chi tiet with the primary key. Does not add the rp dashboard dinh suat chi tiet to the database.
	 *
	 * @param id the primary key for the new rp dashboard dinh suat chi tiet
	 * @return the new rp dashboard dinh suat chi tiet
	 */
	public static RpDashboardDinhSuatChiTiet create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the rp dashboard dinh suat chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet that was removed
	 * @throws NoSuchRpDashboardDinhSuatChiTietException if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	public static RpDashboardDinhSuatChiTiet remove(long id)
		throws drg.moh.service.exception.
			NoSuchRpDashboardDinhSuatChiTietException {

		return getPersistence().remove(id);
	}

	public static RpDashboardDinhSuatChiTiet updateImpl(
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet) {

		return getPersistence().updateImpl(rpDashboardDinhSuatChiTiet);
	}

	/**
	 * Returns the rp dashboard dinh suat chi tiet with the primary key or throws a <code>NoSuchRpDashboardDinhSuatChiTietException</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet
	 * @throws NoSuchRpDashboardDinhSuatChiTietException if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	public static RpDashboardDinhSuatChiTiet findByPrimaryKey(long id)
		throws drg.moh.service.exception.
			NoSuchRpDashboardDinhSuatChiTietException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the rp dashboard dinh suat chi tiet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet, or <code>null</code> if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	public static RpDashboardDinhSuatChiTiet fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the rp dashboard dinh suat chi tiets.
	 *
	 * @return the rp dashboard dinh suat chi tiets
	 */
	public static List<RpDashboardDinhSuatChiTiet> findAll() {
		return getPersistence().findAll();
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
	public static List<RpDashboardDinhSuatChiTiet> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<RpDashboardDinhSuatChiTiet> findAll(
		int start, int end,
		OrderByComparator<RpDashboardDinhSuatChiTiet> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<RpDashboardDinhSuatChiTiet> findAll(
		int start, int end,
		OrderByComparator<RpDashboardDinhSuatChiTiet> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the rp dashboard dinh suat chi tiets from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of rp dashboard dinh suat chi tiets.
	 *
	 * @return the number of rp dashboard dinh suat chi tiets
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RpDashboardDinhSuatChiTietPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<RpDashboardDinhSuatChiTietPersistence,
		 RpDashboardDinhSuatChiTietPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			RpDashboardDinhSuatChiTietPersistence.class);

		ServiceTracker
			<RpDashboardDinhSuatChiTietPersistence,
			 RpDashboardDinhSuatChiTietPersistence> serviceTracker =
				new ServiceTracker
					<RpDashboardDinhSuatChiTietPersistence,
					 RpDashboardDinhSuatChiTietPersistence>(
						 bundle.getBundleContext(),
						 RpDashboardDinhSuatChiTietPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}