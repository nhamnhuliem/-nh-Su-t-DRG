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
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import drg.moh.service.model.RpDashboardCphd;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for RpDashboardCphd. This utility wraps
 * <code>drg.moh.service.service.impl.RpDashboardCphdLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author SON
 * @see RpDashboardCphdLocalService
 * @generated
 */
public class RpDashboardCphdLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>drg.moh.service.service.impl.RpDashboardCphdLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the rp dashboard cphd to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCphdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCphd the rp dashboard cphd
	 * @return the rp dashboard cphd that was added
	 */
	public static RpDashboardCphd addRpDashboardCphd(
		RpDashboardCphd rpDashboardCphd) {

		return getService().addRpDashboardCphd(rpDashboardCphd);
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
	 * Creates a new rp dashboard cphd with the primary key. Does not add the rp dashboard cphd to the database.
	 *
	 * @param id the primary key for the new rp dashboard cphd
	 * @return the new rp dashboard cphd
	 */
	public static RpDashboardCphd createRpDashboardCphd(long id) {
		return getService().createRpDashboardCphd(id);
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
	 * Deletes the rp dashboard cphd with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCphdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the rp dashboard cphd
	 * @return the rp dashboard cphd that was removed
	 * @throws PortalException if a rp dashboard cphd with the primary key could not be found
	 */
	public static RpDashboardCphd deleteRpDashboardCphd(long id)
		throws PortalException {

		return getService().deleteRpDashboardCphd(id);
	}

	/**
	 * Deletes the rp dashboard cphd from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCphdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCphd the rp dashboard cphd
	 * @return the rp dashboard cphd that was removed
	 */
	public static RpDashboardCphd deleteRpDashboardCphd(
		RpDashboardCphd rpDashboardCphd) {

		return getService().deleteRpDashboardCphd(rpDashboardCphd);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCphdModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCphdModelImpl</code>.
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

	public static RpDashboardCphd fetchRpDashboardCphd(long id) {
		return getService().fetchRpDashboardCphd(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<RpDashboardCphd> getChiPhiThanhPhan(
		String maDonVi, int type) {

		return getService().getChiPhiThanhPhan(maDonVi, type);
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

	public static List<RpDashboardCphd> getReportChiPhiHoatDong(
		String orgId, int type, String order) {

		return getService().getReportChiPhiHoatDong(orgId, type, order);
	}

	/**
	 * Returns the rp dashboard cphd with the primary key.
	 *
	 * @param id the primary key of the rp dashboard cphd
	 * @return the rp dashboard cphd
	 * @throws PortalException if a rp dashboard cphd with the primary key could not be found
	 */
	public static RpDashboardCphd getRpDashboardCphd(long id)
		throws PortalException {

		return getService().getRpDashboardCphd(id);
	}

	/**
	 * Returns a range of all the rp dashboard cphds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCphdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cphds
	 * @param end the upper bound of the range of rp dashboard cphds (not inclusive)
	 * @return the range of rp dashboard cphds
	 */
	public static List<RpDashboardCphd> getRpDashboardCphds(
		int start, int end) {

		return getService().getRpDashboardCphds(start, end);
	}

	/**
	 * Returns the number of rp dashboard cphds.
	 *
	 * @return the number of rp dashboard cphds
	 */
	public static int getRpDashboardCphdsCount() {
		return getService().getRpDashboardCphdsCount();
	}

	/**
	 * Updates the rp dashboard cphd in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCphdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCphd the rp dashboard cphd
	 * @return the rp dashboard cphd that was updated
	 */
	public static RpDashboardCphd updateRpDashboardCphd(
		RpDashboardCphd rpDashboardCphd) {

		return getService().updateRpDashboardCphd(rpDashboardCphd);
	}

	public static RpDashboardCphdLocalService getService() {
		return _service;
	}

	private static volatile RpDashboardCphdLocalService _service;

}