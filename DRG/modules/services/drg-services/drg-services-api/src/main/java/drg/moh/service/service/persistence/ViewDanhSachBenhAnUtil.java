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

import drg.moh.service.model.ViewDanhSachBenhAn;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the view danh sach benh an service. This utility wraps <code>drg.moh.service.service.persistence.impl.ViewDanhSachBenhAnPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see ViewDanhSachBenhAnPersistence
 * @generated
 */
public class ViewDanhSachBenhAnUtil {

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
	public static void clearCache(ViewDanhSachBenhAn viewDanhSachBenhAn) {
		getPersistence().clearCache(viewDanhSachBenhAn);
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
	public static Map<Serializable, ViewDanhSachBenhAn> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ViewDanhSachBenhAn> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ViewDanhSachBenhAn> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ViewDanhSachBenhAn> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ViewDanhSachBenhAn> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ViewDanhSachBenhAn update(
		ViewDanhSachBenhAn viewDanhSachBenhAn) {

		return getPersistence().update(viewDanhSachBenhAn);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ViewDanhSachBenhAn update(
		ViewDanhSachBenhAn viewDanhSachBenhAn, ServiceContext serviceContext) {

		return getPersistence().update(viewDanhSachBenhAn, serviceContext);
	}

	/**
	 * Returns all the view danh sach benh ans where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @return the matching view danh sach benh ans
	 */
	public static List<ViewDanhSachBenhAn> findByORG_NAM(long orgId, int nam) {
		return getPersistence().findByORG_NAM(orgId, nam);
	}

	/**
	 * Returns a range of all the view danh sach benh ans where orgId = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ViewDanhSachBenhAnModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param start the lower bound of the range of view danh sach benh ans
	 * @param end the upper bound of the range of view danh sach benh ans (not inclusive)
	 * @return the range of matching view danh sach benh ans
	 */
	public static List<ViewDanhSachBenhAn> findByORG_NAM(
		long orgId, int nam, int start, int end) {

		return getPersistence().findByORG_NAM(orgId, nam, start, end);
	}

	/**
	 * Returns an ordered range of all the view danh sach benh ans where orgId = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ViewDanhSachBenhAnModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param start the lower bound of the range of view danh sach benh ans
	 * @param end the upper bound of the range of view danh sach benh ans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching view danh sach benh ans
	 */
	public static List<ViewDanhSachBenhAn> findByORG_NAM(
		long orgId, int nam, int start, int end,
		OrderByComparator<ViewDanhSachBenhAn> orderByComparator) {

		return getPersistence().findByORG_NAM(
			orgId, nam, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the view danh sach benh ans where orgId = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ViewDanhSachBenhAnModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param start the lower bound of the range of view danh sach benh ans
	 * @param end the upper bound of the range of view danh sach benh ans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching view danh sach benh ans
	 */
	public static List<ViewDanhSachBenhAn> findByORG_NAM(
		long orgId, int nam, int start, int end,
		OrderByComparator<ViewDanhSachBenhAn> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByORG_NAM(
			orgId, nam, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first view danh sach benh an in the ordered set where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching view danh sach benh an
	 * @throws NoSuchViewDanhSachBenhAnException if a matching view danh sach benh an could not be found
	 */
	public static ViewDanhSachBenhAn findByORG_NAM_First(
			long orgId, int nam,
			OrderByComparator<ViewDanhSachBenhAn> orderByComparator)
		throws drg.moh.service.exception.NoSuchViewDanhSachBenhAnException {

		return getPersistence().findByORG_NAM_First(
			orgId, nam, orderByComparator);
	}

	/**
	 * Returns the first view danh sach benh an in the ordered set where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching view danh sach benh an, or <code>null</code> if a matching view danh sach benh an could not be found
	 */
	public static ViewDanhSachBenhAn fetchByORG_NAM_First(
		long orgId, int nam,
		OrderByComparator<ViewDanhSachBenhAn> orderByComparator) {

		return getPersistence().fetchByORG_NAM_First(
			orgId, nam, orderByComparator);
	}

	/**
	 * Returns the last view danh sach benh an in the ordered set where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching view danh sach benh an
	 * @throws NoSuchViewDanhSachBenhAnException if a matching view danh sach benh an could not be found
	 */
	public static ViewDanhSachBenhAn findByORG_NAM_Last(
			long orgId, int nam,
			OrderByComparator<ViewDanhSachBenhAn> orderByComparator)
		throws drg.moh.service.exception.NoSuchViewDanhSachBenhAnException {

		return getPersistence().findByORG_NAM_Last(
			orgId, nam, orderByComparator);
	}

	/**
	 * Returns the last view danh sach benh an in the ordered set where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching view danh sach benh an, or <code>null</code> if a matching view danh sach benh an could not be found
	 */
	public static ViewDanhSachBenhAn fetchByORG_NAM_Last(
		long orgId, int nam,
		OrderByComparator<ViewDanhSachBenhAn> orderByComparator) {

		return getPersistence().fetchByORG_NAM_Last(
			orgId, nam, orderByComparator);
	}

	/**
	 * Returns the view danh sach benh ans before and after the current view danh sach benh an in the ordered set where orgId = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current view danh sach benh an
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next view danh sach benh an
	 * @throws NoSuchViewDanhSachBenhAnException if a view danh sach benh an with the primary key could not be found
	 */
	public static ViewDanhSachBenhAn[] findByORG_NAM_PrevAndNext(
			long id, long orgId, int nam,
			OrderByComparator<ViewDanhSachBenhAn> orderByComparator)
		throws drg.moh.service.exception.NoSuchViewDanhSachBenhAnException {

		return getPersistence().findByORG_NAM_PrevAndNext(
			id, orgId, nam, orderByComparator);
	}

	/**
	 * Removes all the view danh sach benh ans where orgId = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 */
	public static void removeByORG_NAM(long orgId, int nam) {
		getPersistence().removeByORG_NAM(orgId, nam);
	}

	/**
	 * Returns the number of view danh sach benh ans where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @return the number of matching view danh sach benh ans
	 */
	public static int countByORG_NAM(long orgId, int nam) {
		return getPersistence().countByORG_NAM(orgId, nam);
	}

	/**
	 * Caches the view danh sach benh an in the entity cache if it is enabled.
	 *
	 * @param viewDanhSachBenhAn the view danh sach benh an
	 */
	public static void cacheResult(ViewDanhSachBenhAn viewDanhSachBenhAn) {
		getPersistence().cacheResult(viewDanhSachBenhAn);
	}

	/**
	 * Caches the view danh sach benh ans in the entity cache if it is enabled.
	 *
	 * @param viewDanhSachBenhAns the view danh sach benh ans
	 */
	public static void cacheResult(
		List<ViewDanhSachBenhAn> viewDanhSachBenhAns) {

		getPersistence().cacheResult(viewDanhSachBenhAns);
	}

	/**
	 * Creates a new view danh sach benh an with the primary key. Does not add the view danh sach benh an to the database.
	 *
	 * @param id the primary key for the new view danh sach benh an
	 * @return the new view danh sach benh an
	 */
	public static ViewDanhSachBenhAn create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the view danh sach benh an with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the view danh sach benh an
	 * @return the view danh sach benh an that was removed
	 * @throws NoSuchViewDanhSachBenhAnException if a view danh sach benh an with the primary key could not be found
	 */
	public static ViewDanhSachBenhAn remove(long id)
		throws drg.moh.service.exception.NoSuchViewDanhSachBenhAnException {

		return getPersistence().remove(id);
	}

	public static ViewDanhSachBenhAn updateImpl(
		ViewDanhSachBenhAn viewDanhSachBenhAn) {

		return getPersistence().updateImpl(viewDanhSachBenhAn);
	}

	/**
	 * Returns the view danh sach benh an with the primary key or throws a <code>NoSuchViewDanhSachBenhAnException</code> if it could not be found.
	 *
	 * @param id the primary key of the view danh sach benh an
	 * @return the view danh sach benh an
	 * @throws NoSuchViewDanhSachBenhAnException if a view danh sach benh an with the primary key could not be found
	 */
	public static ViewDanhSachBenhAn findByPrimaryKey(long id)
		throws drg.moh.service.exception.NoSuchViewDanhSachBenhAnException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the view danh sach benh an with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the view danh sach benh an
	 * @return the view danh sach benh an, or <code>null</code> if a view danh sach benh an with the primary key could not be found
	 */
	public static ViewDanhSachBenhAn fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the view danh sach benh ans.
	 *
	 * @return the view danh sach benh ans
	 */
	public static List<ViewDanhSachBenhAn> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the view danh sach benh ans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ViewDanhSachBenhAnModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of view danh sach benh ans
	 * @param end the upper bound of the range of view danh sach benh ans (not inclusive)
	 * @return the range of view danh sach benh ans
	 */
	public static List<ViewDanhSachBenhAn> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the view danh sach benh ans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ViewDanhSachBenhAnModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of view danh sach benh ans
	 * @param end the upper bound of the range of view danh sach benh ans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of view danh sach benh ans
	 */
	public static List<ViewDanhSachBenhAn> findAll(
		int start, int end,
		OrderByComparator<ViewDanhSachBenhAn> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the view danh sach benh ans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ViewDanhSachBenhAnModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of view danh sach benh ans
	 * @param end the upper bound of the range of view danh sach benh ans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of view danh sach benh ans
	 */
	public static List<ViewDanhSachBenhAn> findAll(
		int start, int end,
		OrderByComparator<ViewDanhSachBenhAn> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the view danh sach benh ans from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of view danh sach benh ans.
	 *
	 * @return the number of view danh sach benh ans
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ViewDanhSachBenhAnPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ViewDanhSachBenhAnPersistence, ViewDanhSachBenhAnPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			ViewDanhSachBenhAnPersistence.class);

		ServiceTracker
			<ViewDanhSachBenhAnPersistence, ViewDanhSachBenhAnPersistence>
				serviceTracker =
					new ServiceTracker
						<ViewDanhSachBenhAnPersistence,
						 ViewDanhSachBenhAnPersistence>(
							 bundle.getBundleContext(),
							 ViewDanhSachBenhAnPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}