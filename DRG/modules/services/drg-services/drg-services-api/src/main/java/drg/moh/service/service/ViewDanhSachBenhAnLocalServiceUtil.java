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

import drg.moh.service.model.ViewDanhSachBenhAn;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for ViewDanhSachBenhAn. This utility wraps
 * <code>drg.moh.service.service.impl.ViewDanhSachBenhAnLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author SON
 * @see ViewDanhSachBenhAnLocalService
 * @generated
 */
public class ViewDanhSachBenhAnLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>drg.moh.service.service.impl.ViewDanhSachBenhAnLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the view danh sach benh an to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ViewDanhSachBenhAnLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param viewDanhSachBenhAn the view danh sach benh an
	 * @return the view danh sach benh an that was added
	 */
	public static ViewDanhSachBenhAn addViewDanhSachBenhAn(
		ViewDanhSachBenhAn viewDanhSachBenhAn) {

		return getService().addViewDanhSachBenhAn(viewDanhSachBenhAn);
	}

	public static int countBaoCaosByOrg_Nam(long orgId, int nam) {
		return getService().countBaoCaosByOrg_Nam(orgId, nam);
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
	 * Creates a new view danh sach benh an with the primary key. Does not add the view danh sach benh an to the database.
	 *
	 * @param id the primary key for the new view danh sach benh an
	 * @return the new view danh sach benh an
	 */
	public static ViewDanhSachBenhAn createViewDanhSachBenhAn(long id) {
		return getService().createViewDanhSachBenhAn(id);
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
	 * Deletes the view danh sach benh an with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ViewDanhSachBenhAnLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the view danh sach benh an
	 * @return the view danh sach benh an that was removed
	 * @throws PortalException if a view danh sach benh an with the primary key could not be found
	 */
	public static ViewDanhSachBenhAn deleteViewDanhSachBenhAn(long id)
		throws PortalException {

		return getService().deleteViewDanhSachBenhAn(id);
	}

	/**
	 * Deletes the view danh sach benh an from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ViewDanhSachBenhAnLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param viewDanhSachBenhAn the view danh sach benh an
	 * @return the view danh sach benh an that was removed
	 */
	public static ViewDanhSachBenhAn deleteViewDanhSachBenhAn(
		ViewDanhSachBenhAn viewDanhSachBenhAn) {

		return getService().deleteViewDanhSachBenhAn(viewDanhSachBenhAn);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.ViewDanhSachBenhAnModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.ViewDanhSachBenhAnModelImpl</code>.
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

	public static ViewDanhSachBenhAn fetchViewDanhSachBenhAn(long id) {
		return getService().fetchViewDanhSachBenhAn(id);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static List<ViewDanhSachBenhAn> getBaoCaosByOrg_Nam(
		long orgId, int nam, int start, int end) {

		return getService().getBaoCaosByOrg_Nam(orgId, nam, start, end);
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
	 * Returns the view danh sach benh an with the primary key.
	 *
	 * @param id the primary key of the view danh sach benh an
	 * @return the view danh sach benh an
	 * @throws PortalException if a view danh sach benh an with the primary key could not be found
	 */
	public static ViewDanhSachBenhAn getViewDanhSachBenhAn(long id)
		throws PortalException {

		return getService().getViewDanhSachBenhAn(id);
	}

	/**
	 * Returns a range of all the view danh sach benh ans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.ViewDanhSachBenhAnModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of view danh sach benh ans
	 * @param end the upper bound of the range of view danh sach benh ans (not inclusive)
	 * @return the range of view danh sach benh ans
	 */
	public static List<ViewDanhSachBenhAn> getViewDanhSachBenhAns(
		int start, int end) {

		return getService().getViewDanhSachBenhAns(start, end);
	}

	/**
	 * Returns the number of view danh sach benh ans.
	 *
	 * @return the number of view danh sach benh ans
	 */
	public static int getViewDanhSachBenhAnsCount() {
		return getService().getViewDanhSachBenhAnsCount();
	}

	/**
	 * Updates the view danh sach benh an in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ViewDanhSachBenhAnLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param viewDanhSachBenhAn the view danh sach benh an
	 * @return the view danh sach benh an that was updated
	 */
	public static ViewDanhSachBenhAn updateViewDanhSachBenhAn(
		ViewDanhSachBenhAn viewDanhSachBenhAn) {

		return getService().updateViewDanhSachBenhAn(viewDanhSachBenhAn);
	}

	public static ViewDanhSachBenhAnLocalService getService() {
		return _service;
	}

	private static volatile ViewDanhSachBenhAnLocalService _service;

}