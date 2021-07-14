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

import drg.moh.service.model.RpDashboardCmi2;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the rp dashboard cmi2 service. This utility wraps <code>drg.moh.service.service.persistence.impl.RpDashboardCmi2PersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see RpDashboardCmi2Persistence
 * @generated
 */
public class RpDashboardCmi2Util {

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
	public static void clearCache(RpDashboardCmi2 rpDashboardCmi2) {
		getPersistence().clearCache(rpDashboardCmi2);
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
	public static Map<Serializable, RpDashboardCmi2> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RpDashboardCmi2> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RpDashboardCmi2> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RpDashboardCmi2> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RpDashboardCmi2> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RpDashboardCmi2 update(RpDashboardCmi2 rpDashboardCmi2) {
		return getPersistence().update(rpDashboardCmi2);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RpDashboardCmi2 update(
		RpDashboardCmi2 rpDashboardCmi2, ServiceContext serviceContext) {

		return getPersistence().update(rpDashboardCmi2, serviceContext);
	}

	/**
	 * Caches the rp dashboard cmi2 in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmi2 the rp dashboard cmi2
	 */
	public static void cacheResult(RpDashboardCmi2 rpDashboardCmi2) {
		getPersistence().cacheResult(rpDashboardCmi2);
	}

	/**
	 * Caches the rp dashboard cmi2s in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmi2s the rp dashboard cmi2s
	 */
	public static void cacheResult(List<RpDashboardCmi2> rpDashboardCmi2s) {
		getPersistence().cacheResult(rpDashboardCmi2s);
	}

	/**
	 * Creates a new rp dashboard cmi2 with the primary key. Does not add the rp dashboard cmi2 to the database.
	 *
	 * @param id the primary key for the new rp dashboard cmi2
	 * @return the new rp dashboard cmi2
	 */
	public static RpDashboardCmi2 create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the rp dashboard cmi2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard cmi2
	 * @return the rp dashboard cmi2 that was removed
	 * @throws NoSuchRpDashboardCmi2Exception if a rp dashboard cmi2 with the primary key could not be found
	 */
	public static RpDashboardCmi2 remove(long id)
		throws drg.moh.service.exception.NoSuchRpDashboardCmi2Exception {

		return getPersistence().remove(id);
	}

	public static RpDashboardCmi2 updateImpl(RpDashboardCmi2 rpDashboardCmi2) {
		return getPersistence().updateImpl(rpDashboardCmi2);
	}

	/**
	 * Returns the rp dashboard cmi2 with the primary key or throws a <code>NoSuchRpDashboardCmi2Exception</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi2
	 * @return the rp dashboard cmi2
	 * @throws NoSuchRpDashboardCmi2Exception if a rp dashboard cmi2 with the primary key could not be found
	 */
	public static RpDashboardCmi2 findByPrimaryKey(long id)
		throws drg.moh.service.exception.NoSuchRpDashboardCmi2Exception {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the rp dashboard cmi2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi2
	 * @return the rp dashboard cmi2, or <code>null</code> if a rp dashboard cmi2 with the primary key could not be found
	 */
	public static RpDashboardCmi2 fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the rp dashboard cmi2s.
	 *
	 * @return the rp dashboard cmi2s
	 */
	public static List<RpDashboardCmi2> findAll() {
		return getPersistence().findAll();
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
	public static List<RpDashboardCmi2> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<RpDashboardCmi2> findAll(
		int start, int end,
		OrderByComparator<RpDashboardCmi2> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<RpDashboardCmi2> findAll(
		int start, int end,
		OrderByComparator<RpDashboardCmi2> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the rp dashboard cmi2s from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of rp dashboard cmi2s.
	 *
	 * @return the number of rp dashboard cmi2s
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RpDashboardCmi2Persistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<RpDashboardCmi2Persistence, RpDashboardCmi2Persistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			RpDashboardCmi2Persistence.class);

		ServiceTracker<RpDashboardCmi2Persistence, RpDashboardCmi2Persistence>
			serviceTracker =
				new ServiceTracker
					<RpDashboardCmi2Persistence, RpDashboardCmi2Persistence>(
						bundle.getBundleContext(),
						RpDashboardCmi2Persistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}