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

import drg.moh.service.model.DashboardChiPhiThanhPhan;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the dashboard chi phi thanh phan service. This utility wraps <code>drg.moh.service.service.persistence.impl.DashboardChiPhiThanhPhanPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see DashboardChiPhiThanhPhanPersistence
 * @generated
 */
public class DashboardChiPhiThanhPhanUtil {

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
		DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan) {

		getPersistence().clearCache(dashboardChiPhiThanhPhan);
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
	public static Map<Serializable, DashboardChiPhiThanhPhan>
		fetchByPrimaryKeys(Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DashboardChiPhiThanhPhan> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DashboardChiPhiThanhPhan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DashboardChiPhiThanhPhan> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DashboardChiPhiThanhPhan> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DashboardChiPhiThanhPhan update(
		DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan) {

		return getPersistence().update(dashboardChiPhiThanhPhan);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DashboardChiPhiThanhPhan update(
		DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan,
		ServiceContext serviceContext) {

		return getPersistence().update(
			dashboardChiPhiThanhPhan, serviceContext);
	}

	/**
	 * Returns the dashboard chi phi thanh phan where orgId = &#63; and mucBc = &#63; and nam = &#63; or throws a <code>NoSuchDashboardChiPhiThanhPhanException</code> if it could not be found.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard chi phi thanh phan
	 * @throws NoSuchDashboardChiPhiThanhPhanException if a matching dashboard chi phi thanh phan could not be found
	 */
	public static DashboardChiPhiThanhPhan findByORG_MUC_NAM(
			long orgId, int mucBc, int nam)
		throws drg.moh.service.exception.
			NoSuchDashboardChiPhiThanhPhanException {

		return getPersistence().findByORG_MUC_NAM(orgId, mucBc, nam);
	}

	/**
	 * Returns the dashboard chi phi thanh phan where orgId = &#63; and mucBc = &#63; and nam = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard chi phi thanh phan, or <code>null</code> if a matching dashboard chi phi thanh phan could not be found
	 */
	public static DashboardChiPhiThanhPhan fetchByORG_MUC_NAM(
		long orgId, int mucBc, int nam) {

		return getPersistence().fetchByORG_MUC_NAM(orgId, mucBc, nam);
	}

	/**
	 * Returns the dashboard chi phi thanh phan where orgId = &#63; and mucBc = &#63; and nam = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dashboard chi phi thanh phan, or <code>null</code> if a matching dashboard chi phi thanh phan could not be found
	 */
	public static DashboardChiPhiThanhPhan fetchByORG_MUC_NAM(
		long orgId, int mucBc, int nam, boolean useFinderCache) {

		return getPersistence().fetchByORG_MUC_NAM(
			orgId, mucBc, nam, useFinderCache);
	}

	/**
	 * Removes the dashboard chi phi thanh phan where orgId = &#63; and mucBc = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the dashboard chi phi thanh phan that was removed
	 */
	public static DashboardChiPhiThanhPhan removeByORG_MUC_NAM(
			long orgId, int mucBc, int nam)
		throws drg.moh.service.exception.
			NoSuchDashboardChiPhiThanhPhanException {

		return getPersistence().removeByORG_MUC_NAM(orgId, mucBc, nam);
	}

	/**
	 * Returns the number of dashboard chi phi thanh phans where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the number of matching dashboard chi phi thanh phans
	 */
	public static int countByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		return getPersistence().countByORG_MUC_NAM(orgId, mucBc, nam);
	}

	/**
	 * Caches the dashboard chi phi thanh phan in the entity cache if it is enabled.
	 *
	 * @param dashboardChiPhiThanhPhan the dashboard chi phi thanh phan
	 */
	public static void cacheResult(
		DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan) {

		getPersistence().cacheResult(dashboardChiPhiThanhPhan);
	}

	/**
	 * Caches the dashboard chi phi thanh phans in the entity cache if it is enabled.
	 *
	 * @param dashboardChiPhiThanhPhans the dashboard chi phi thanh phans
	 */
	public static void cacheResult(
		List<DashboardChiPhiThanhPhan> dashboardChiPhiThanhPhans) {

		getPersistence().cacheResult(dashboardChiPhiThanhPhans);
	}

	/**
	 * Creates a new dashboard chi phi thanh phan with the primary key. Does not add the dashboard chi phi thanh phan to the database.
	 *
	 * @param id the primary key for the new dashboard chi phi thanh phan
	 * @return the new dashboard chi phi thanh phan
	 */
	public static DashboardChiPhiThanhPhan create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the dashboard chi phi thanh phan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan that was removed
	 * @throws NoSuchDashboardChiPhiThanhPhanException if a dashboard chi phi thanh phan with the primary key could not be found
	 */
	public static DashboardChiPhiThanhPhan remove(long id)
		throws drg.moh.service.exception.
			NoSuchDashboardChiPhiThanhPhanException {

		return getPersistence().remove(id);
	}

	public static DashboardChiPhiThanhPhan updateImpl(
		DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan) {

		return getPersistence().updateImpl(dashboardChiPhiThanhPhan);
	}

	/**
	 * Returns the dashboard chi phi thanh phan with the primary key or throws a <code>NoSuchDashboardChiPhiThanhPhanException</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan
	 * @throws NoSuchDashboardChiPhiThanhPhanException if a dashboard chi phi thanh phan with the primary key could not be found
	 */
	public static DashboardChiPhiThanhPhan findByPrimaryKey(long id)
		throws drg.moh.service.exception.
			NoSuchDashboardChiPhiThanhPhanException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the dashboard chi phi thanh phan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan, or <code>null</code> if a dashboard chi phi thanh phan with the primary key could not be found
	 */
	public static DashboardChiPhiThanhPhan fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the dashboard chi phi thanh phans.
	 *
	 * @return the dashboard chi phi thanh phans
	 */
	public static List<DashboardChiPhiThanhPhan> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the dashboard chi phi thanh phans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiThanhPhanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi thanh phans
	 * @param end the upper bound of the range of dashboard chi phi thanh phans (not inclusive)
	 * @return the range of dashboard chi phi thanh phans
	 */
	public static List<DashboardChiPhiThanhPhan> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the dashboard chi phi thanh phans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiThanhPhanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi thanh phans
	 * @param end the upper bound of the range of dashboard chi phi thanh phans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard chi phi thanh phans
	 */
	public static List<DashboardChiPhiThanhPhan> findAll(
		int start, int end,
		OrderByComparator<DashboardChiPhiThanhPhan> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dashboard chi phi thanh phans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiThanhPhanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi thanh phans
	 * @param end the upper bound of the range of dashboard chi phi thanh phans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard chi phi thanh phans
	 */
	public static List<DashboardChiPhiThanhPhan> findAll(
		int start, int end,
		OrderByComparator<DashboardChiPhiThanhPhan> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the dashboard chi phi thanh phans from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of dashboard chi phi thanh phans.
	 *
	 * @return the number of dashboard chi phi thanh phans
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DashboardChiPhiThanhPhanPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<DashboardChiPhiThanhPhanPersistence,
		 DashboardChiPhiThanhPhanPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			DashboardChiPhiThanhPhanPersistence.class);

		ServiceTracker
			<DashboardChiPhiThanhPhanPersistence,
			 DashboardChiPhiThanhPhanPersistence> serviceTracker =
				new ServiceTracker
					<DashboardChiPhiThanhPhanPersistence,
					 DashboardChiPhiThanhPhanPersistence>(
						 bundle.getBundleContext(),
						 DashboardChiPhiThanhPhanPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}