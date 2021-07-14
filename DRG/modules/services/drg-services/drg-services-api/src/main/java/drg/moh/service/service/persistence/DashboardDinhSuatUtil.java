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

import drg.moh.service.model.DashboardDinhSuat;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the dashboard dinh suat service. This utility wraps <code>drg.moh.service.service.persistence.impl.DashboardDinhSuatPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see DashboardDinhSuatPersistence
 * @generated
 */
public class DashboardDinhSuatUtil {

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
	public static void clearCache(DashboardDinhSuat dashboardDinhSuat) {
		getPersistence().clearCache(dashboardDinhSuat);
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
	public static Map<Serializable, DashboardDinhSuat> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DashboardDinhSuat> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DashboardDinhSuat> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DashboardDinhSuat> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DashboardDinhSuat> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DashboardDinhSuat update(
		DashboardDinhSuat dashboardDinhSuat) {

		return getPersistence().update(dashboardDinhSuat);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DashboardDinhSuat update(
		DashboardDinhSuat dashboardDinhSuat, ServiceContext serviceContext) {

		return getPersistence().update(dashboardDinhSuat, serviceContext);
	}

	/**
	 * Returns all the dashboard dinh suats where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard dinh suats
	 */
	public static List<DashboardDinhSuat> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam) {

		return getPersistence().findByORG_MUC_NAM(orgId, mucBc, nam);
	}

	/**
	 * Returns a range of all the dashboard dinh suats where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardDinhSuatModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard dinh suats
	 * @param end the upper bound of the range of dashboard dinh suats (not inclusive)
	 * @return the range of matching dashboard dinh suats
	 */
	public static List<DashboardDinhSuat> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end) {

		return getPersistence().findByORG_MUC_NAM(
			orgId, mucBc, nam, start, end);
	}

	/**
	 * Returns an ordered range of all the dashboard dinh suats where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardDinhSuatModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard dinh suats
	 * @param end the upper bound of the range of dashboard dinh suats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dashboard dinh suats
	 */
	public static List<DashboardDinhSuat> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		OrderByComparator<DashboardDinhSuat> orderByComparator) {

		return getPersistence().findByORG_MUC_NAM(
			orgId, mucBc, nam, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dashboard dinh suats where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardDinhSuatModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard dinh suats
	 * @param end the upper bound of the range of dashboard dinh suats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dashboard dinh suats
	 */
	public static List<DashboardDinhSuat> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		OrderByComparator<DashboardDinhSuat> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByORG_MUC_NAM(
			orgId, mucBc, nam, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dashboard dinh suat in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard dinh suat
	 * @throws NoSuchDashboardDinhSuatException if a matching dashboard dinh suat could not be found
	 */
	public static DashboardDinhSuat findByORG_MUC_NAM_First(
			long orgId, int mucBc, int nam,
			OrderByComparator<DashboardDinhSuat> orderByComparator)
		throws drg.moh.service.exception.NoSuchDashboardDinhSuatException {

		return getPersistence().findByORG_MUC_NAM_First(
			orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Returns the first dashboard dinh suat in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard dinh suat, or <code>null</code> if a matching dashboard dinh suat could not be found
	 */
	public static DashboardDinhSuat fetchByORG_MUC_NAM_First(
		long orgId, int mucBc, int nam,
		OrderByComparator<DashboardDinhSuat> orderByComparator) {

		return getPersistence().fetchByORG_MUC_NAM_First(
			orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Returns the last dashboard dinh suat in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard dinh suat
	 * @throws NoSuchDashboardDinhSuatException if a matching dashboard dinh suat could not be found
	 */
	public static DashboardDinhSuat findByORG_MUC_NAM_Last(
			long orgId, int mucBc, int nam,
			OrderByComparator<DashboardDinhSuat> orderByComparator)
		throws drg.moh.service.exception.NoSuchDashboardDinhSuatException {

		return getPersistence().findByORG_MUC_NAM_Last(
			orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Returns the last dashboard dinh suat in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard dinh suat, or <code>null</code> if a matching dashboard dinh suat could not be found
	 */
	public static DashboardDinhSuat fetchByORG_MUC_NAM_Last(
		long orgId, int mucBc, int nam,
		OrderByComparator<DashboardDinhSuat> orderByComparator) {

		return getPersistence().fetchByORG_MUC_NAM_Last(
			orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Returns the dashboard dinh suats before and after the current dashboard dinh suat in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current dashboard dinh suat
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dashboard dinh suat
	 * @throws NoSuchDashboardDinhSuatException if a dashboard dinh suat with the primary key could not be found
	 */
	public static DashboardDinhSuat[] findByORG_MUC_NAM_PrevAndNext(
			long id, long orgId, int mucBc, int nam,
			OrderByComparator<DashboardDinhSuat> orderByComparator)
		throws drg.moh.service.exception.NoSuchDashboardDinhSuatException {

		return getPersistence().findByORG_MUC_NAM_PrevAndNext(
			id, orgId, mucBc, nam, orderByComparator);
	}

	/**
	 * Removes all the dashboard dinh suats where orgId = &#63; and mucBc = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 */
	public static void removeByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		getPersistence().removeByORG_MUC_NAM(orgId, mucBc, nam);
	}

	/**
	 * Returns the number of dashboard dinh suats where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the number of matching dashboard dinh suats
	 */
	public static int countByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		return getPersistence().countByORG_MUC_NAM(orgId, mucBc, nam);
	}

	/**
	 * Caches the dashboard dinh suat in the entity cache if it is enabled.
	 *
	 * @param dashboardDinhSuat the dashboard dinh suat
	 */
	public static void cacheResult(DashboardDinhSuat dashboardDinhSuat) {
		getPersistence().cacheResult(dashboardDinhSuat);
	}

	/**
	 * Caches the dashboard dinh suats in the entity cache if it is enabled.
	 *
	 * @param dashboardDinhSuats the dashboard dinh suats
	 */
	public static void cacheResult(List<DashboardDinhSuat> dashboardDinhSuats) {
		getPersistence().cacheResult(dashboardDinhSuats);
	}

	/**
	 * Creates a new dashboard dinh suat with the primary key. Does not add the dashboard dinh suat to the database.
	 *
	 * @param id the primary key for the new dashboard dinh suat
	 * @return the new dashboard dinh suat
	 */
	public static DashboardDinhSuat create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the dashboard dinh suat with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dashboard dinh suat
	 * @return the dashboard dinh suat that was removed
	 * @throws NoSuchDashboardDinhSuatException if a dashboard dinh suat with the primary key could not be found
	 */
	public static DashboardDinhSuat remove(long id)
		throws drg.moh.service.exception.NoSuchDashboardDinhSuatException {

		return getPersistence().remove(id);
	}

	public static DashboardDinhSuat updateImpl(
		DashboardDinhSuat dashboardDinhSuat) {

		return getPersistence().updateImpl(dashboardDinhSuat);
	}

	/**
	 * Returns the dashboard dinh suat with the primary key or throws a <code>NoSuchDashboardDinhSuatException</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard dinh suat
	 * @return the dashboard dinh suat
	 * @throws NoSuchDashboardDinhSuatException if a dashboard dinh suat with the primary key could not be found
	 */
	public static DashboardDinhSuat findByPrimaryKey(long id)
		throws drg.moh.service.exception.NoSuchDashboardDinhSuatException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the dashboard dinh suat with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard dinh suat
	 * @return the dashboard dinh suat, or <code>null</code> if a dashboard dinh suat with the primary key could not be found
	 */
	public static DashboardDinhSuat fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the dashboard dinh suats.
	 *
	 * @return the dashboard dinh suats
	 */
	public static List<DashboardDinhSuat> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the dashboard dinh suats.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardDinhSuatModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard dinh suats
	 * @param end the upper bound of the range of dashboard dinh suats (not inclusive)
	 * @return the range of dashboard dinh suats
	 */
	public static List<DashboardDinhSuat> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the dashboard dinh suats.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardDinhSuatModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard dinh suats
	 * @param end the upper bound of the range of dashboard dinh suats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard dinh suats
	 */
	public static List<DashboardDinhSuat> findAll(
		int start, int end,
		OrderByComparator<DashboardDinhSuat> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dashboard dinh suats.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardDinhSuatModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard dinh suats
	 * @param end the upper bound of the range of dashboard dinh suats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard dinh suats
	 */
	public static List<DashboardDinhSuat> findAll(
		int start, int end,
		OrderByComparator<DashboardDinhSuat> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the dashboard dinh suats from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of dashboard dinh suats.
	 *
	 * @return the number of dashboard dinh suats
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DashboardDinhSuatPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<DashboardDinhSuatPersistence, DashboardDinhSuatPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			DashboardDinhSuatPersistence.class);

		ServiceTracker
			<DashboardDinhSuatPersistence, DashboardDinhSuatPersistence>
				serviceTracker =
					new ServiceTracker
						<DashboardDinhSuatPersistence,
						 DashboardDinhSuatPersistence>(
							 bundle.getBundleContext(),
							 DashboardDinhSuatPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}