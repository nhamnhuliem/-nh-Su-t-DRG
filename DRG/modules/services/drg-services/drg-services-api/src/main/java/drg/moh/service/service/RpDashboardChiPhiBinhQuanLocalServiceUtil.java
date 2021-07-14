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

import drg.moh.service.model.RpDashboardChiPhiBinhQuan;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for RpDashboardChiPhiBinhQuan. This utility wraps
 * <code>drg.moh.service.service.impl.RpDashboardChiPhiBinhQuanLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author SON
 * @see RpDashboardChiPhiBinhQuanLocalService
 * @generated
 */
public class RpDashboardChiPhiBinhQuanLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>drg.moh.service.service.impl.RpDashboardChiPhiBinhQuanLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the rp dashboard chi phi binh quan to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardChiPhiBinhQuanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardChiPhiBinhQuan the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan that was added
	 */
	public static RpDashboardChiPhiBinhQuan addRpDashboardChiPhiBinhQuan(
		RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan) {

		return getService().addRpDashboardChiPhiBinhQuan(
			rpDashboardChiPhiBinhQuan);
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
	 * Creates a new rp dashboard chi phi binh quan with the primary key. Does not add the rp dashboard chi phi binh quan to the database.
	 *
	 * @param id the primary key for the new rp dashboard chi phi binh quan
	 * @return the new rp dashboard chi phi binh quan
	 */
	public static RpDashboardChiPhiBinhQuan createRpDashboardChiPhiBinhQuan(
		long id) {

		return getService().createRpDashboardChiPhiBinhQuan(id);
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
	 * Deletes the rp dashboard chi phi binh quan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardChiPhiBinhQuanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan that was removed
	 * @throws PortalException if a rp dashboard chi phi binh quan with the primary key could not be found
	 */
	public static RpDashboardChiPhiBinhQuan deleteRpDashboardChiPhiBinhQuan(
			long id)
		throws PortalException {

		return getService().deleteRpDashboardChiPhiBinhQuan(id);
	}

	/**
	 * Deletes the rp dashboard chi phi binh quan from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardChiPhiBinhQuanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardChiPhiBinhQuan the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan that was removed
	 */
	public static RpDashboardChiPhiBinhQuan deleteRpDashboardChiPhiBinhQuan(
		RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan) {

		return getService().deleteRpDashboardChiPhiBinhQuan(
			rpDashboardChiPhiBinhQuan);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardChiPhiBinhQuanModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardChiPhiBinhQuanModelImpl</code>.
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

	public static RpDashboardChiPhiBinhQuan fetchRpDashboardChiPhiBinhQuan(
		long id) {

		return getService().fetchRpDashboardChiPhiBinhQuan(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<RpDashboardChiPhiBinhQuan> getChiPhiBinhQuan(
		String maDonVi, int type) {

		return getService().getChiPhiBinhQuan(maDonVi, type);
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
	 * Returns the rp dashboard chi phi binh quan with the primary key.
	 *
	 * @param id the primary key of the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan
	 * @throws PortalException if a rp dashboard chi phi binh quan with the primary key could not be found
	 */
	public static RpDashboardChiPhiBinhQuan getRpDashboardChiPhiBinhQuan(
			long id)
		throws PortalException {

		return getService().getRpDashboardChiPhiBinhQuan(id);
	}

	/**
	 * Returns a range of all the rp dashboard chi phi binh quans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardChiPhiBinhQuanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard chi phi binh quans
	 * @param end the upper bound of the range of rp dashboard chi phi binh quans (not inclusive)
	 * @return the range of rp dashboard chi phi binh quans
	 */
	public static List<RpDashboardChiPhiBinhQuan> getRpDashboardChiPhiBinhQuans(
		int start, int end) {

		return getService().getRpDashboardChiPhiBinhQuans(start, end);
	}

	/**
	 * Returns the number of rp dashboard chi phi binh quans.
	 *
	 * @return the number of rp dashboard chi phi binh quans
	 */
	public static int getRpDashboardChiPhiBinhQuansCount() {
		return getService().getRpDashboardChiPhiBinhQuansCount();
	}

	/**
	 * Updates the rp dashboard chi phi binh quan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardChiPhiBinhQuanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardChiPhiBinhQuan the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan that was updated
	 */
	public static RpDashboardChiPhiBinhQuan updateRpDashboardChiPhiBinhQuan(
		RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan) {

		return getService().updateRpDashboardChiPhiBinhQuan(
			rpDashboardChiPhiBinhQuan);
	}

	public static RpDashboardChiPhiBinhQuanLocalService getService() {
		return _service;
	}

	private static volatile RpDashboardChiPhiBinhQuanLocalService _service;

}