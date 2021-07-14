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

import drg.moh.service.model.RpDashboardTrungBinh;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for RpDashboardTrungBinh. This utility wraps
 * <code>drg.moh.service.service.impl.RpDashboardTrungBinhLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author SON
 * @see RpDashboardTrungBinhLocalService
 * @generated
 */
public class RpDashboardTrungBinhLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>drg.moh.service.service.impl.RpDashboardTrungBinhLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the rp dashboard trung binh to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardTrungBinhLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardTrungBinh the rp dashboard trung binh
	 * @return the rp dashboard trung binh that was added
	 */
	public static RpDashboardTrungBinh addRpDashboardTrungBinh(
		RpDashboardTrungBinh rpDashboardTrungBinh) {

		return getService().addRpDashboardTrungBinh(rpDashboardTrungBinh);
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
	 * Creates a new rp dashboard trung binh with the primary key. Does not add the rp dashboard trung binh to the database.
	 *
	 * @param data the primary key for the new rp dashboard trung binh
	 * @return the new rp dashboard trung binh
	 */
	public static RpDashboardTrungBinh createRpDashboardTrungBinh(String data) {
		return getService().createRpDashboardTrungBinh(data);
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
	 * Deletes the rp dashboard trung binh from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardTrungBinhLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardTrungBinh the rp dashboard trung binh
	 * @return the rp dashboard trung binh that was removed
	 */
	public static RpDashboardTrungBinh deleteRpDashboardTrungBinh(
		RpDashboardTrungBinh rpDashboardTrungBinh) {

		return getService().deleteRpDashboardTrungBinh(rpDashboardTrungBinh);
	}

	/**
	 * Deletes the rp dashboard trung binh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardTrungBinhLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param data the primary key of the rp dashboard trung binh
	 * @return the rp dashboard trung binh that was removed
	 * @throws PortalException if a rp dashboard trung binh with the primary key could not be found
	 */
	public static RpDashboardTrungBinh deleteRpDashboardTrungBinh(String data)
		throws PortalException {

		return getService().deleteRpDashboardTrungBinh(data);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardTrungBinhModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardTrungBinhModelImpl</code>.
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

	public static RpDashboardTrungBinh fetchRpDashboardTrungBinh(String data) {
		return getService().fetchRpDashboardTrungBinh(data);
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
	 * Returns the rp dashboard trung binh with the primary key.
	 *
	 * @param data the primary key of the rp dashboard trung binh
	 * @return the rp dashboard trung binh
	 * @throws PortalException if a rp dashboard trung binh with the primary key could not be found
	 */
	public static RpDashboardTrungBinh getRpDashboardTrungBinh(String data)
		throws PortalException {

		return getService().getRpDashboardTrungBinh(data);
	}

	/**
	 * Returns a range of all the rp dashboard trung binhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardTrungBinhModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard trung binhs
	 * @param end the upper bound of the range of rp dashboard trung binhs (not inclusive)
	 * @return the range of rp dashboard trung binhs
	 */
	public static List<RpDashboardTrungBinh> getRpDashboardTrungBinhs(
		int start, int end) {

		return getService().getRpDashboardTrungBinhs(start, end);
	}

	/**
	 * Returns the number of rp dashboard trung binhs.
	 *
	 * @return the number of rp dashboard trung binhs
	 */
	public static int getRpDashboardTrungBinhsCount() {
		return getService().getRpDashboardTrungBinhsCount();
	}

	public static String getTrungBinh4ChiPhi(
		String maDonVi, int type, int getBy) {

		return getService().getTrungBinh4ChiPhi(maDonVi, type, getBy);
	}

	public static String getTrungBinh4CMI(String maDonVi, int type, int getBy) {
		return getService().getTrungBinh4CMI(maDonVi, type, getBy);
	}

	public static String getTrungBinh4DinhSuat(
		String maDonVi, int type, int getBy) {

		return getService().getTrungBinh4DinhSuat(maDonVi, type, getBy);
	}

	public static String getTrungBinh4Drg(String maDonVi, int type, int getBy) {
		return getService().getTrungBinh4Drg(maDonVi, type, getBy);
	}

	/**
	 * Updates the rp dashboard trung binh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardTrungBinhLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardTrungBinh the rp dashboard trung binh
	 * @return the rp dashboard trung binh that was updated
	 */
	public static RpDashboardTrungBinh updateRpDashboardTrungBinh(
		RpDashboardTrungBinh rpDashboardTrungBinh) {

		return getService().updateRpDashboardTrungBinh(rpDashboardTrungBinh);
	}

	public static RpDashboardTrungBinhLocalService getService() {
		return _service;
	}

	private static volatile RpDashboardTrungBinhLocalService _service;

}