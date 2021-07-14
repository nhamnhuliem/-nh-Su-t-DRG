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

import drg.moh.service.model.RpDashboardTrungBinh;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the rp dashboard trung binh service. This utility wraps <code>drg.moh.service.service.persistence.impl.RpDashboardTrungBinhPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see RpDashboardTrungBinhPersistence
 * @generated
 */
public class RpDashboardTrungBinhUtil {

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
	public static void clearCache(RpDashboardTrungBinh rpDashboardTrungBinh) {
		getPersistence().clearCache(rpDashboardTrungBinh);
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
	public static Map<Serializable, RpDashboardTrungBinh> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RpDashboardTrungBinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RpDashboardTrungBinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RpDashboardTrungBinh> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RpDashboardTrungBinh> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RpDashboardTrungBinh update(
		RpDashboardTrungBinh rpDashboardTrungBinh) {

		return getPersistence().update(rpDashboardTrungBinh);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RpDashboardTrungBinh update(
		RpDashboardTrungBinh rpDashboardTrungBinh,
		ServiceContext serviceContext) {

		return getPersistence().update(rpDashboardTrungBinh, serviceContext);
	}

	/**
	 * Caches the rp dashboard trung binh in the entity cache if it is enabled.
	 *
	 * @param rpDashboardTrungBinh the rp dashboard trung binh
	 */
	public static void cacheResult(RpDashboardTrungBinh rpDashboardTrungBinh) {
		getPersistence().cacheResult(rpDashboardTrungBinh);
	}

	/**
	 * Caches the rp dashboard trung binhs in the entity cache if it is enabled.
	 *
	 * @param rpDashboardTrungBinhs the rp dashboard trung binhs
	 */
	public static void cacheResult(
		List<RpDashboardTrungBinh> rpDashboardTrungBinhs) {

		getPersistence().cacheResult(rpDashboardTrungBinhs);
	}

	/**
	 * Creates a new rp dashboard trung binh with the primary key. Does not add the rp dashboard trung binh to the database.
	 *
	 * @param data the primary key for the new rp dashboard trung binh
	 * @return the new rp dashboard trung binh
	 */
	public static RpDashboardTrungBinh create(String data) {
		return getPersistence().create(data);
	}

	/**
	 * Removes the rp dashboard trung binh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param data the primary key of the rp dashboard trung binh
	 * @return the rp dashboard trung binh that was removed
	 * @throws NoSuchRpDashboardTrungBinhException if a rp dashboard trung binh with the primary key could not be found
	 */
	public static RpDashboardTrungBinh remove(String data)
		throws drg.moh.service.exception.NoSuchRpDashboardTrungBinhException {

		return getPersistence().remove(data);
	}

	public static RpDashboardTrungBinh updateImpl(
		RpDashboardTrungBinh rpDashboardTrungBinh) {

		return getPersistence().updateImpl(rpDashboardTrungBinh);
	}

	/**
	 * Returns the rp dashboard trung binh with the primary key or throws a <code>NoSuchRpDashboardTrungBinhException</code> if it could not be found.
	 *
	 * @param data the primary key of the rp dashboard trung binh
	 * @return the rp dashboard trung binh
	 * @throws NoSuchRpDashboardTrungBinhException if a rp dashboard trung binh with the primary key could not be found
	 */
	public static RpDashboardTrungBinh findByPrimaryKey(String data)
		throws drg.moh.service.exception.NoSuchRpDashboardTrungBinhException {

		return getPersistence().findByPrimaryKey(data);
	}

	/**
	 * Returns the rp dashboard trung binh with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param data the primary key of the rp dashboard trung binh
	 * @return the rp dashboard trung binh, or <code>null</code> if a rp dashboard trung binh with the primary key could not be found
	 */
	public static RpDashboardTrungBinh fetchByPrimaryKey(String data) {
		return getPersistence().fetchByPrimaryKey(data);
	}

	/**
	 * Returns all the rp dashboard trung binhs.
	 *
	 * @return the rp dashboard trung binhs
	 */
	public static List<RpDashboardTrungBinh> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the rp dashboard trung binhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardTrungBinhModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard trung binhs
	 * @param end the upper bound of the range of rp dashboard trung binhs (not inclusive)
	 * @return the range of rp dashboard trung binhs
	 */
	public static List<RpDashboardTrungBinh> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the rp dashboard trung binhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardTrungBinhModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard trung binhs
	 * @param end the upper bound of the range of rp dashboard trung binhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard trung binhs
	 */
	public static List<RpDashboardTrungBinh> findAll(
		int start, int end,
		OrderByComparator<RpDashboardTrungBinh> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the rp dashboard trung binhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardTrungBinhModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard trung binhs
	 * @param end the upper bound of the range of rp dashboard trung binhs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard trung binhs
	 */
	public static List<RpDashboardTrungBinh> findAll(
		int start, int end,
		OrderByComparator<RpDashboardTrungBinh> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the rp dashboard trung binhs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of rp dashboard trung binhs.
	 *
	 * @return the number of rp dashboard trung binhs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RpDashboardTrungBinhPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<RpDashboardTrungBinhPersistence, RpDashboardTrungBinhPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			RpDashboardTrungBinhPersistence.class);

		ServiceTracker
			<RpDashboardTrungBinhPersistence, RpDashboardTrungBinhPersistence>
				serviceTracker =
					new ServiceTracker
						<RpDashboardTrungBinhPersistence,
						 RpDashboardTrungBinhPersistence>(
							 bundle.getBundleContext(),
							 RpDashboardTrungBinhPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}