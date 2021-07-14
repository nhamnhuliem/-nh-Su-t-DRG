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

import drg.moh.service.model.DashboardChiPhiHoatDong;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the dashboard chi phi hoat dong service. This utility wraps <code>drg.moh.service.service.persistence.impl.DashboardChiPhiHoatDongPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see DashboardChiPhiHoatDongPersistence
 * @generated
 */
public class DashboardChiPhiHoatDongUtil {

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
		DashboardChiPhiHoatDong dashboardChiPhiHoatDong) {

		getPersistence().clearCache(dashboardChiPhiHoatDong);
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
	public static Map<Serializable, DashboardChiPhiHoatDong> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DashboardChiPhiHoatDong> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DashboardChiPhiHoatDong> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DashboardChiPhiHoatDong> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DashboardChiPhiHoatDong> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DashboardChiPhiHoatDong update(
		DashboardChiPhiHoatDong dashboardChiPhiHoatDong) {

		return getPersistence().update(dashboardChiPhiHoatDong);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DashboardChiPhiHoatDong update(
		DashboardChiPhiHoatDong dashboardChiPhiHoatDong,
		ServiceContext serviceContext) {

		return getPersistence().update(dashboardChiPhiHoatDong, serviceContext);
	}

	/**
	 * Returns all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard chi phi hoat dongs
	 */
	public static List<DashboardChiPhiHoatDong> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam) {

		return getPersistence().findByORG_MUC_NAM(orgId, mucBc, nam);
	}

	/**
	 * Returns a range of all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @return the range of matching dashboard chi phi hoat dongs
	 */
	public static List<DashboardChiPhiHoatDong> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end) {

		return getPersistence().findByORG_MUC_NAM(
			orgId, mucBc, nam, start, end);
	}

	/**
	 * Returns an ordered range of all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dashboard chi phi hoat dongs
	 */
	public static List<DashboardChiPhiHoatDong> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		OrderByComparator<DashboardChiPhiHoatDong> orderByComparator) {

		return getPersistence().findByORG_MUC_NAM(
			orgId, mucBc, nam, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dashboard chi phi hoat dongs
	 */
	public static List<DashboardChiPhiHoatDong> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		OrderByComparator<DashboardChiPhiHoatDong> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByORG_MUC_NAM(
			orgId, mucBc, nam, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard chi phi hoat dong
	 * @throws NoSuchDashboardChiPhiHoatDongException if a matching dashboard chi phi hoat dong could not be found
	 */
	public static DashboardChiPhiHoatDong findByORG_MUC_NAM_First(
			long orgId, int mucBc, int nam,
			OrderByComparator<DashboardChiPhiHoatDong> orderByComparator)
		throws drg.moh.service.exception.
			NoSuchDashboardChiPhiHoatDongException {

		return getPersistence().findByORG_MUC_NAM_First(
			orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Returns the first dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard chi phi hoat dong, or <code>null</code> if a matching dashboard chi phi hoat dong could not be found
	 */
	public static DashboardChiPhiHoatDong fetchByORG_MUC_NAM_First(
		long orgId, int mucBc, int nam,
		OrderByComparator<DashboardChiPhiHoatDong> orderByComparator) {

		return getPersistence().fetchByORG_MUC_NAM_First(
			orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Returns the last dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard chi phi hoat dong
	 * @throws NoSuchDashboardChiPhiHoatDongException if a matching dashboard chi phi hoat dong could not be found
	 */
	public static DashboardChiPhiHoatDong findByORG_MUC_NAM_Last(
			long orgId, int mucBc, int nam,
			OrderByComparator<DashboardChiPhiHoatDong> orderByComparator)
		throws drg.moh.service.exception.
			NoSuchDashboardChiPhiHoatDongException {

		return getPersistence().findByORG_MUC_NAM_Last(
			orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Returns the last dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard chi phi hoat dong, or <code>null</code> if a matching dashboard chi phi hoat dong could not be found
	 */
	public static DashboardChiPhiHoatDong fetchByORG_MUC_NAM_Last(
		long orgId, int mucBc, int nam,
		OrderByComparator<DashboardChiPhiHoatDong> orderByComparator) {

		return getPersistence().fetchByORG_MUC_NAM_Last(
			orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Returns the dashboard chi phi hoat dongs before and after the current dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current dashboard chi phi hoat dong
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dashboard chi phi hoat dong
	 * @throws NoSuchDashboardChiPhiHoatDongException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	public static DashboardChiPhiHoatDong[] findByORG_MUC_NAM_PrevAndNext(
			long id, long orgId, int mucBc, int nam,
			OrderByComparator<DashboardChiPhiHoatDong> orderByComparator)
		throws drg.moh.service.exception.
			NoSuchDashboardChiPhiHoatDongException {

		return getPersistence().findByORG_MUC_NAM_PrevAndNext(
			id, orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Removes all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 */
	public static void removeByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		getPersistence().removeByORG_MUC_NAM(orgId, mucBc, nam);
	}

	/**
	 * Returns the number of dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the number of matching dashboard chi phi hoat dongs
	 */
	public static int countByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		return getPersistence().countByORG_MUC_NAM(orgId, mucBc, nam);
	}

	/**
	 * Caches the dashboard chi phi hoat dong in the entity cache if it is enabled.
	 *
	 * @param dashboardChiPhiHoatDong the dashboard chi phi hoat dong
	 */
	public static void cacheResult(
		DashboardChiPhiHoatDong dashboardChiPhiHoatDong) {

		getPersistence().cacheResult(dashboardChiPhiHoatDong);
	}

	/**
	 * Caches the dashboard chi phi hoat dongs in the entity cache if it is enabled.
	 *
	 * @param dashboardChiPhiHoatDongs the dashboard chi phi hoat dongs
	 */
	public static void cacheResult(
		List<DashboardChiPhiHoatDong> dashboardChiPhiHoatDongs) {

		getPersistence().cacheResult(dashboardChiPhiHoatDongs);
	}

	/**
	 * Creates a new dashboard chi phi hoat dong with the primary key. Does not add the dashboard chi phi hoat dong to the database.
	 *
	 * @param id the primary key for the new dashboard chi phi hoat dong
	 * @return the new dashboard chi phi hoat dong
	 */
	public static DashboardChiPhiHoatDong create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the dashboard chi phi hoat dong with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong that was removed
	 * @throws NoSuchDashboardChiPhiHoatDongException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	public static DashboardChiPhiHoatDong remove(long id)
		throws drg.moh.service.exception.
			NoSuchDashboardChiPhiHoatDongException {

		return getPersistence().remove(id);
	}

	public static DashboardChiPhiHoatDong updateImpl(
		DashboardChiPhiHoatDong dashboardChiPhiHoatDong) {

		return getPersistence().updateImpl(dashboardChiPhiHoatDong);
	}

	/**
	 * Returns the dashboard chi phi hoat dong with the primary key or throws a <code>NoSuchDashboardChiPhiHoatDongException</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong
	 * @throws NoSuchDashboardChiPhiHoatDongException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	public static DashboardChiPhiHoatDong findByPrimaryKey(long id)
		throws drg.moh.service.exception.
			NoSuchDashboardChiPhiHoatDongException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the dashboard chi phi hoat dong with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong, or <code>null</code> if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	public static DashboardChiPhiHoatDong fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the dashboard chi phi hoat dongs.
	 *
	 * @return the dashboard chi phi hoat dongs
	 */
	public static List<DashboardChiPhiHoatDong> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the dashboard chi phi hoat dongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @return the range of dashboard chi phi hoat dongs
	 */
	public static List<DashboardChiPhiHoatDong> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the dashboard chi phi hoat dongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard chi phi hoat dongs
	 */
	public static List<DashboardChiPhiHoatDong> findAll(
		int start, int end,
		OrderByComparator<DashboardChiPhiHoatDong> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dashboard chi phi hoat dongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard chi phi hoat dongs
	 */
	public static List<DashboardChiPhiHoatDong> findAll(
		int start, int end,
		OrderByComparator<DashboardChiPhiHoatDong> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the dashboard chi phi hoat dongs from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of dashboard chi phi hoat dongs.
	 *
	 * @return the number of dashboard chi phi hoat dongs
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DashboardChiPhiHoatDongPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<DashboardChiPhiHoatDongPersistence, DashboardChiPhiHoatDongPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			DashboardChiPhiHoatDongPersistence.class);

		ServiceTracker
			<DashboardChiPhiHoatDongPersistence,
			 DashboardChiPhiHoatDongPersistence> serviceTracker =
				new ServiceTracker
					<DashboardChiPhiHoatDongPersistence,
					 DashboardChiPhiHoatDongPersistence>(
						 bundle.getBundleContext(),
						 DashboardChiPhiHoatDongPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}