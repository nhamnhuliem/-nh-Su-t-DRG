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

import drg.moh.service.model.RpDashboardDinhSuatChiTiet;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for RpDashboardDinhSuatChiTiet. This utility wraps
 * <code>drg.moh.service.service.impl.RpDashboardDinhSuatChiTietLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author SON
 * @see RpDashboardDinhSuatChiTietLocalService
 * @generated
 */
public class RpDashboardDinhSuatChiTietLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>drg.moh.service.service.impl.RpDashboardDinhSuatChiTietLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the rp dashboard dinh suat chi tiet to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDinhSuatChiTietLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDinhSuatChiTiet the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet that was added
	 */
	public static RpDashboardDinhSuatChiTiet addRpDashboardDinhSuatChiTiet(
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet) {

		return getService().addRpDashboardDinhSuatChiTiet(
			rpDashboardDinhSuatChiTiet);
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
	 * Creates a new rp dashboard dinh suat chi tiet with the primary key. Does not add the rp dashboard dinh suat chi tiet to the database.
	 *
	 * @param id the primary key for the new rp dashboard dinh suat chi tiet
	 * @return the new rp dashboard dinh suat chi tiet
	 */
	public static RpDashboardDinhSuatChiTiet createRpDashboardDinhSuatChiTiet(
		long id) {

		return getService().createRpDashboardDinhSuatChiTiet(id);
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
	 * Deletes the rp dashboard dinh suat chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDinhSuatChiTietLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet that was removed
	 * @throws PortalException if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	public static RpDashboardDinhSuatChiTiet deleteRpDashboardDinhSuatChiTiet(
			long id)
		throws PortalException {

		return getService().deleteRpDashboardDinhSuatChiTiet(id);
	}

	/**
	 * Deletes the rp dashboard dinh suat chi tiet from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDinhSuatChiTietLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDinhSuatChiTiet the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet that was removed
	 */
	public static RpDashboardDinhSuatChiTiet deleteRpDashboardDinhSuatChiTiet(
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet) {

		return getService().deleteRpDashboardDinhSuatChiTiet(
			rpDashboardDinhSuatChiTiet);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDinhSuatChiTietModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDinhSuatChiTietModelImpl</code>.
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

	public static RpDashboardDinhSuatChiTiet fetchRpDashboardDinhSuatChiTiet(
		long id) {

		return getService().fetchRpDashboardDinhSuatChiTiet(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<RpDashboardDinhSuatChiTiet> getDinhSuatChiTiet(
		String maDonVi, int type, int thang) {

		return getService().getDinhSuatChiTiet(maDonVi, type, thang);
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
	 * Returns the rp dashboard dinh suat chi tiet with the primary key.
	 *
	 * @param id the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet
	 * @throws PortalException if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	public static RpDashboardDinhSuatChiTiet getRpDashboardDinhSuatChiTiet(
			long id)
		throws PortalException {

		return getService().getRpDashboardDinhSuatChiTiet(id);
	}

	/**
	 * Returns a range of all the rp dashboard dinh suat chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDinhSuatChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dinh suat chi tiets
	 * @param end the upper bound of the range of rp dashboard dinh suat chi tiets (not inclusive)
	 * @return the range of rp dashboard dinh suat chi tiets
	 */
	public static List<RpDashboardDinhSuatChiTiet>
		getRpDashboardDinhSuatChiTiets(int start, int end) {

		return getService().getRpDashboardDinhSuatChiTiets(start, end);
	}

	/**
	 * Returns the number of rp dashboard dinh suat chi tiets.
	 *
	 * @return the number of rp dashboard dinh suat chi tiets
	 */
	public static int getRpDashboardDinhSuatChiTietsCount() {
		return getService().getRpDashboardDinhSuatChiTietsCount();
	}

	/**
	 * Updates the rp dashboard dinh suat chi tiet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDinhSuatChiTietLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDinhSuatChiTiet the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet that was updated
	 */
	public static RpDashboardDinhSuatChiTiet updateRpDashboardDinhSuatChiTiet(
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet) {

		return getService().updateRpDashboardDinhSuatChiTiet(
			rpDashboardDinhSuatChiTiet);
	}

	public static RpDashboardDinhSuatChiTietLocalService getService() {
		return _service;
	}

	private static volatile RpDashboardDinhSuatChiTietLocalService _service;

}