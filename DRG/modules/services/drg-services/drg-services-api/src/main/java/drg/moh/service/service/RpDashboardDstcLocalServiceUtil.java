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

import drg.moh.service.model.RpDashboardDstc;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for RpDashboardDstc. This utility wraps
 * <code>drg.moh.service.service.impl.RpDashboardDstcLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author SON
 * @see RpDashboardDstcLocalService
 * @generated
 */
public class RpDashboardDstcLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>drg.moh.service.service.impl.RpDashboardDstcLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the rp dashboard dstc to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDstcLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDstc the rp dashboard dstc
	 * @return the rp dashboard dstc that was added
	 */
	public static RpDashboardDstc addRpDashboardDstc(
		RpDashboardDstc rpDashboardDstc) {

		return getService().addRpDashboardDstc(rpDashboardDstc);
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
	 * Creates a new rp dashboard dstc with the primary key. Does not add the rp dashboard dstc to the database.
	 *
	 * @param id the primary key for the new rp dashboard dstc
	 * @return the new rp dashboard dstc
	 */
	public static RpDashboardDstc createRpDashboardDstc(String id) {
		return getService().createRpDashboardDstc(id);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the rp dashboard dstc from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDstcLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDstc the rp dashboard dstc
	 * @return the rp dashboard dstc that was removed
	 */
	public static RpDashboardDstc deleteRpDashboardDstc(
		RpDashboardDstc rpDashboardDstc) {

		return getService().deleteRpDashboardDstc(rpDashboardDstc);
	}

	/**
	 * Deletes the rp dashboard dstc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDstcLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the rp dashboard dstc
	 * @return the rp dashboard dstc that was removed
	 * @throws PortalException if a rp dashboard dstc with the primary key could not be found
	 */
	public static RpDashboardDstc deleteRpDashboardDstc(String id)
		throws PortalException {

		return getService().deleteRpDashboardDstc(id);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDstcModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDstcModelImpl</code>.
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

	public static RpDashboardDstc fetchRpDashboardDstc(String id) {
		return getService().fetchRpDashboardDstc(id);
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

	public static List<RpDashboardDstc> getReportDinhSuatTieuChuan(
			String orgId, int type)
		throws SystemException {

		return getService().getReportDinhSuatTieuChuan(orgId, type);
	}

	public static List<RpDashboardDstc> getReportSoLuongBenhNhanDinhSuat(
		String maDonVi, int type, int getBy) {

		return getService().getReportSoLuongBenhNhanDinhSuat(
			maDonVi, type, getBy);
	}

	public static List<RpDashboardDstc> getReportSoLuongBenhNhanDRG(
		String maDonVi, int type, int getBy) {

		return getService().getReportSoLuongBenhNhanDRG(maDonVi, type, getBy);
	}

	/**
	 * Returns the rp dashboard dstc with the primary key.
	 *
	 * @param id the primary key of the rp dashboard dstc
	 * @return the rp dashboard dstc
	 * @throws PortalException if a rp dashboard dstc with the primary key could not be found
	 */
	public static RpDashboardDstc getRpDashboardDstc(String id)
		throws PortalException {

		return getService().getRpDashboardDstc(id);
	}

	/**
	 * Returns a range of all the rp dashboard dstcs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDstcModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dstcs
	 * @param end the upper bound of the range of rp dashboard dstcs (not inclusive)
	 * @return the range of rp dashboard dstcs
	 */
	public static List<RpDashboardDstc> getRpDashboardDstcs(
		int start, int end) {

		return getService().getRpDashboardDstcs(start, end);
	}

	/**
	 * Returns the number of rp dashboard dstcs.
	 *
	 * @return the number of rp dashboard dstcs
	 */
	public static int getRpDashboardDstcsCount() {
		return getService().getRpDashboardDstcsCount();
	}

	/**
	 * Updates the rp dashboard dstc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDstcLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDstc the rp dashboard dstc
	 * @return the rp dashboard dstc that was updated
	 */
	public static RpDashboardDstc updateRpDashboardDstc(
		RpDashboardDstc rpDashboardDstc) {

		return getService().updateRpDashboardDstc(rpDashboardDstc);
	}

	public static RpDashboardDstcLocalService getService() {
		return _service;
	}

	private static volatile RpDashboardDstcLocalService _service;

}