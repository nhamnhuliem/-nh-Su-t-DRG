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

import drg.moh.service.model.RpDashboardCmi;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the rp dashboard cmi service. This utility wraps <code>drg.moh.service.service.persistence.impl.RpDashboardCmiPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see RpDashboardCmiPersistence
 * @generated
 */
public class RpDashboardCmiUtil {

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
	public static void clearCache(RpDashboardCmi rpDashboardCmi) {
		getPersistence().clearCache(rpDashboardCmi);
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
	public static Map<Serializable, RpDashboardCmi> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<RpDashboardCmi> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RpDashboardCmi> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RpDashboardCmi> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<RpDashboardCmi> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static RpDashboardCmi update(RpDashboardCmi rpDashboardCmi) {
		return getPersistence().update(rpDashboardCmi);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static RpDashboardCmi update(
		RpDashboardCmi rpDashboardCmi, ServiceContext serviceContext) {

		return getPersistence().update(rpDashboardCmi, serviceContext);
	}

	/**
	 * Caches the rp dashboard cmi in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmi the rp dashboard cmi
	 */
	public static void cacheResult(RpDashboardCmi rpDashboardCmi) {
		getPersistence().cacheResult(rpDashboardCmi);
	}

	/**
	 * Caches the rp dashboard cmis in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmis the rp dashboard cmis
	 */
	public static void cacheResult(List<RpDashboardCmi> rpDashboardCmis) {
		getPersistence().cacheResult(rpDashboardCmis);
	}

	/**
	 * Creates a new rp dashboard cmi with the primary key. Does not add the rp dashboard cmi to the database.
	 *
	 * @param id the primary key for the new rp dashboard cmi
	 * @return the new rp dashboard cmi
	 */
	public static RpDashboardCmi create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the rp dashboard cmi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard cmi
	 * @return the rp dashboard cmi that was removed
	 * @throws NoSuchRpDashboardCmiException if a rp dashboard cmi with the primary key could not be found
	 */
	public static RpDashboardCmi remove(long id)
		throws drg.moh.service.exception.NoSuchRpDashboardCmiException {

		return getPersistence().remove(id);
	}

	public static RpDashboardCmi updateImpl(RpDashboardCmi rpDashboardCmi) {
		return getPersistence().updateImpl(rpDashboardCmi);
	}

	/**
	 * Returns the rp dashboard cmi with the primary key or throws a <code>NoSuchRpDashboardCmiException</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi
	 * @return the rp dashboard cmi
	 * @throws NoSuchRpDashboardCmiException if a rp dashboard cmi with the primary key could not be found
	 */
	public static RpDashboardCmi findByPrimaryKey(long id)
		throws drg.moh.service.exception.NoSuchRpDashboardCmiException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the rp dashboard cmi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi
	 * @return the rp dashboard cmi, or <code>null</code> if a rp dashboard cmi with the primary key could not be found
	 */
	public static RpDashboardCmi fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the rp dashboard cmis.
	 *
	 * @return the rp dashboard cmis
	 */
	public static List<RpDashboardCmi> findAll() {
		return getPersistence().findAll();
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
	public static List<RpDashboardCmi> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
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
	public static List<RpDashboardCmi> findAll(
		int start, int end,
		OrderByComparator<RpDashboardCmi> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
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
	public static List<RpDashboardCmi> findAll(
		int start, int end, OrderByComparator<RpDashboardCmi> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the rp dashboard cmis from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of rp dashboard cmis.
	 *
	 * @return the number of rp dashboard cmis
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static RpDashboardCmiPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<RpDashboardCmiPersistence, RpDashboardCmiPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			RpDashboardCmiPersistence.class);

		ServiceTracker<RpDashboardCmiPersistence, RpDashboardCmiPersistence>
			serviceTracker =
				new ServiceTracker
					<RpDashboardCmiPersistence, RpDashboardCmiPersistence>(
						bundle.getBundleContext(),
						RpDashboardCmiPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}