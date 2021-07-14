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

import drg.moh.service.model.DashboardBaoHiem;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the dashboard bao hiem service. This utility wraps <code>drg.moh.service.service.persistence.impl.DashboardBaoHiemPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see DashboardBaoHiemPersistence
 * @generated
 */
public class DashboardBaoHiemUtil {

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
	public static void clearCache(DashboardBaoHiem dashboardBaoHiem) {
		getPersistence().clearCache(dashboardBaoHiem);
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
	public static Map<Serializable, DashboardBaoHiem> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DashboardBaoHiem> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DashboardBaoHiem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DashboardBaoHiem> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DashboardBaoHiem> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DashboardBaoHiem update(DashboardBaoHiem dashboardBaoHiem) {
		return getPersistence().update(dashboardBaoHiem);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DashboardBaoHiem update(
		DashboardBaoHiem dashboardBaoHiem, ServiceContext serviceContext) {

		return getPersistence().update(dashboardBaoHiem, serviceContext);
	}

	/**
	 * Returns all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard bao hiems
	 */
	public static List<DashboardBaoHiem> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam) {

		return getPersistence().findByORG_MUC_NAM(orgId, mucBc, nam);
	}

	/**
	 * Returns a range of all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @return the range of matching dashboard bao hiems
	 */
	public static List<DashboardBaoHiem> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end) {

		return getPersistence().findByORG_MUC_NAM(
			orgId, mucBc, nam, start, end);
	}

	/**
	 * Returns an ordered range of all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dashboard bao hiems
	 */
	public static List<DashboardBaoHiem> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		OrderByComparator<DashboardBaoHiem> orderByComparator) {

		return getPersistence().findByORG_MUC_NAM(
			orgId, mucBc, nam, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dashboard bao hiems
	 */
	public static List<DashboardBaoHiem> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		OrderByComparator<DashboardBaoHiem> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByORG_MUC_NAM(
			orgId, mucBc, nam, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard bao hiem
	 * @throws NoSuchDashboardBaoHiemException if a matching dashboard bao hiem could not be found
	 */
	public static DashboardBaoHiem findByORG_MUC_NAM_First(
			long orgId, int mucBc, int nam,
			OrderByComparator<DashboardBaoHiem> orderByComparator)
		throws drg.moh.service.exception.NoSuchDashboardBaoHiemException {

		return getPersistence().findByORG_MUC_NAM_First(
			orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Returns the first dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard bao hiem, or <code>null</code> if a matching dashboard bao hiem could not be found
	 */
	public static DashboardBaoHiem fetchByORG_MUC_NAM_First(
		long orgId, int mucBc, int nam,
		OrderByComparator<DashboardBaoHiem> orderByComparator) {

		return getPersistence().fetchByORG_MUC_NAM_First(
			orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Returns the last dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard bao hiem
	 * @throws NoSuchDashboardBaoHiemException if a matching dashboard bao hiem could not be found
	 */
	public static DashboardBaoHiem findByORG_MUC_NAM_Last(
			long orgId, int mucBc, int nam,
			OrderByComparator<DashboardBaoHiem> orderByComparator)
		throws drg.moh.service.exception.NoSuchDashboardBaoHiemException {

		return getPersistence().findByORG_MUC_NAM_Last(
			orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Returns the last dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard bao hiem, or <code>null</code> if a matching dashboard bao hiem could not be found
	 */
	public static DashboardBaoHiem fetchByORG_MUC_NAM_Last(
		long orgId, int mucBc, int nam,
		OrderByComparator<DashboardBaoHiem> orderByComparator) {

		return getPersistence().fetchByORG_MUC_NAM_Last(
			orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Returns the dashboard bao hiems before and after the current dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current dashboard bao hiem
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dashboard bao hiem
	 * @throws NoSuchDashboardBaoHiemException if a dashboard bao hiem with the primary key could not be found
	 */
	public static DashboardBaoHiem[] findByORG_MUC_NAM_PrevAndNext(
			long id, long orgId, int mucBc, int nam,
			OrderByComparator<DashboardBaoHiem> orderByComparator)
		throws drg.moh.service.exception.NoSuchDashboardBaoHiemException {

		return getPersistence().findByORG_MUC_NAM_PrevAndNext(
			id, orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Removes all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 */
	public static void removeByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		getPersistence().removeByORG_MUC_NAM(orgId, mucBc, nam);
	}

	/**
	 * Returns the number of dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the number of matching dashboard bao hiems
	 */
	public static int countByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		return getPersistence().countByORG_MUC_NAM(orgId, mucBc, nam);
	}

	/**
	 * Caches the dashboard bao hiem in the entity cache if it is enabled.
	 *
	 * @param dashboardBaoHiem the dashboard bao hiem
	 */
	public static void cacheResult(DashboardBaoHiem dashboardBaoHiem) {
		getPersistence().cacheResult(dashboardBaoHiem);
	}

	/**
	 * Caches the dashboard bao hiems in the entity cache if it is enabled.
	 *
	 * @param dashboardBaoHiems the dashboard bao hiems
	 */
	public static void cacheResult(List<DashboardBaoHiem> dashboardBaoHiems) {
		getPersistence().cacheResult(dashboardBaoHiems);
	}

	/**
	 * Creates a new dashboard bao hiem with the primary key. Does not add the dashboard bao hiem to the database.
	 *
	 * @param id the primary key for the new dashboard bao hiem
	 * @return the new dashboard bao hiem
	 */
	public static DashboardBaoHiem create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the dashboard bao hiem with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dashboard bao hiem
	 * @return the dashboard bao hiem that was removed
	 * @throws NoSuchDashboardBaoHiemException if a dashboard bao hiem with the primary key could not be found
	 */
	public static DashboardBaoHiem remove(long id)
		throws drg.moh.service.exception.NoSuchDashboardBaoHiemException {

		return getPersistence().remove(id);
	}

	public static DashboardBaoHiem updateImpl(
		DashboardBaoHiem dashboardBaoHiem) {

		return getPersistence().updateImpl(dashboardBaoHiem);
	}

	/**
	 * Returns the dashboard bao hiem with the primary key or throws a <code>NoSuchDashboardBaoHiemException</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard bao hiem
	 * @return the dashboard bao hiem
	 * @throws NoSuchDashboardBaoHiemException if a dashboard bao hiem with the primary key could not be found
	 */
	public static DashboardBaoHiem findByPrimaryKey(long id)
		throws drg.moh.service.exception.NoSuchDashboardBaoHiemException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the dashboard bao hiem with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard bao hiem
	 * @return the dashboard bao hiem, or <code>null</code> if a dashboard bao hiem with the primary key could not be found
	 */
	public static DashboardBaoHiem fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the dashboard bao hiems.
	 *
	 * @return the dashboard bao hiems
	 */
	public static List<DashboardBaoHiem> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the dashboard bao hiems.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @return the range of dashboard bao hiems
	 */
	public static List<DashboardBaoHiem> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the dashboard bao hiems.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard bao hiems
	 */
	public static List<DashboardBaoHiem> findAll(
		int start, int end,
		OrderByComparator<DashboardBaoHiem> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dashboard bao hiems.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard bao hiems
	 */
	public static List<DashboardBaoHiem> findAll(
		int start, int end,
		OrderByComparator<DashboardBaoHiem> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the dashboard bao hiems from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of dashboard bao hiems.
	 *
	 * @return the number of dashboard bao hiems
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DashboardBaoHiemPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<DashboardBaoHiemPersistence, DashboardBaoHiemPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			DashboardBaoHiemPersistence.class);

		ServiceTracker<DashboardBaoHiemPersistence, DashboardBaoHiemPersistence>
			serviceTracker =
				new ServiceTracker
					<DashboardBaoHiemPersistence, DashboardBaoHiemPersistence>(
						bundle.getBundleContext(),
						DashboardBaoHiemPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}