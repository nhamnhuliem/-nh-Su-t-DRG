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

package drg.moh.service.service;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import drg.moh.service.model.DashboardBaoHiem;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for DashboardBaoHiem. This utility wraps
 * <code>drg.moh.service.service.impl.DashboardBaoHiemLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author SON
 * @see DashboardBaoHiemLocalService
 * @generated
 */
public class DashboardBaoHiemLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>drg.moh.service.service.impl.DashboardBaoHiemLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the dashboard bao hiem to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardBaoHiemLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardBaoHiem the dashboard bao hiem
	 * @return the dashboard bao hiem that was added
	 */
	public static DashboardBaoHiem addDashboardBaoHiem(
		DashboardBaoHiem dashboardBaoHiem) {

		return getService().addDashboardBaoHiem(dashboardBaoHiem);
	}

	/**
	 * Creates a new dashboard bao hiem with the primary key. Does not add the dashboard bao hiem to the database.
	 *
	 * @param id the primary key for the new dashboard bao hiem
	 * @return the new dashboard bao hiem
	 */
	public static DashboardBaoHiem createDashboardBaoHiem(long id) {
		return getService().createDashboardBaoHiem(id);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the dashboard bao hiem from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardBaoHiemLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardBaoHiem the dashboard bao hiem
	 * @return the dashboard bao hiem that was removed
	 */
	public static DashboardBaoHiem deleteDashboardBaoHiem(
		DashboardBaoHiem dashboardBaoHiem) {

		return getService().deleteDashboardBaoHiem(dashboardBaoHiem);
	}

	/**
	 * Deletes the dashboard bao hiem with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardBaoHiemLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the dashboard bao hiem
	 * @return the dashboard bao hiem that was removed
	 * @throws PortalException if a dashboard bao hiem with the primary key could not be found
	 */
	public static DashboardBaoHiem deleteDashboardBaoHiem(long id)
		throws PortalException {

		return getService().deleteDashboardBaoHiem(id);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static DashboardBaoHiem fetchDashboardBaoHiem(long id) {
		return getService().fetchDashboardBaoHiem(id);
	}

	public static List<DashboardBaoHiem> findByORG_MUC_NAM(
			long orgId, int mucBaoCao, int nam)
		throws SystemException {

		return getService().findByORG_MUC_NAM(orgId, mucBaoCao, nam);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<DashboardBaoHiem> getBaoHiemData(
		long orgId, int muc, int nam) {

		return getService().getBaoHiemData(orgId, muc, nam);
	}

	/**
	 * Returns the dashboard bao hiem with the primary key.
	 *
	 * @param id the primary key of the dashboard bao hiem
	 * @return the dashboard bao hiem
	 * @throws PortalException if a dashboard bao hiem with the primary key could not be found
	 */
	public static DashboardBaoHiem getDashboardBaoHiem(long id)
		throws PortalException {

		return getService().getDashboardBaoHiem(id);
	}

	/**
	 * Returns a range of all the dashboard bao hiems.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @return the range of dashboard bao hiems
	 */
	public static List<DashboardBaoHiem> getDashboardBaoHiems(
		int start, int end) {

		return getService().getDashboardBaoHiems(start, end);
	}

	/**
	 * Returns the number of dashboard bao hiems.
	 *
	 * @return the number of dashboard bao hiems
	 */
	public static int getDashboardBaoHiemsCount() {
		return getService().getDashboardBaoHiemsCount();
	}

	public static List<String> getDrgBaoHiem(long orgId, int muc, int nam) {
		return getService().getDrgBaoHiem(orgId, muc, nam);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the dashboard bao hiem in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardBaoHiemLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardBaoHiem the dashboard bao hiem
	 * @return the dashboard bao hiem that was updated
	 */
	public static DashboardBaoHiem updateDashboardBaoHiem(
		DashboardBaoHiem dashboardBaoHiem) {

		return getService().updateDashboardBaoHiem(dashboardBaoHiem);
	}

	public static DashboardBaoHiemLocalService getService() {
		return _service;
	}

	private static volatile DashboardBaoHiemLocalService _service;

}