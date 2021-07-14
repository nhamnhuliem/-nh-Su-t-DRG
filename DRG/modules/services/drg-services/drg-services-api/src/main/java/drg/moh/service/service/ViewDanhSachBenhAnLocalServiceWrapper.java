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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ViewDanhSachBenhAnLocalService}.
 *
 * @author SON
 * @see ViewDanhSachBenhAnLocalService
 * @generated
 */
public class ViewDanhSachBenhAnLocalServiceWrapper
	implements ServiceWrapper<ViewDanhSachBenhAnLocalService>,
			   ViewDanhSachBenhAnLocalService {

	public ViewDanhSachBenhAnLocalServiceWrapper(
		ViewDanhSachBenhAnLocalService viewDanhSachBenhAnLocalService) {

		_viewDanhSachBenhAnLocalService = viewDanhSachBenhAnLocalService;
	}

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
	@Override
	public drg.moh.service.model.ViewDanhSachBenhAn addViewDanhSachBenhAn(
		drg.moh.service.model.ViewDanhSachBenhAn viewDanhSachBenhAn) {

		return _viewDanhSachBenhAnLocalService.addViewDanhSachBenhAn(
			viewDanhSachBenhAn);
	}

	@Override
	public int countBaoCaosByOrg_Nam(long orgId, int nam) {
		return _viewDanhSachBenhAnLocalService.countBaoCaosByOrg_Nam(
			orgId, nam);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _viewDanhSachBenhAnLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new view danh sach benh an with the primary key. Does not add the view danh sach benh an to the database.
	 *
	 * @param id the primary key for the new view danh sach benh an
	 * @return the new view danh sach benh an
	 */
	@Override
	public drg.moh.service.model.ViewDanhSachBenhAn createViewDanhSachBenhAn(
		long id) {

		return _viewDanhSachBenhAnLocalService.createViewDanhSachBenhAn(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _viewDanhSachBenhAnLocalService.deletePersistedModel(
			persistedModel);
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
	@Override
	public drg.moh.service.model.ViewDanhSachBenhAn deleteViewDanhSachBenhAn(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _viewDanhSachBenhAnLocalService.deleteViewDanhSachBenhAn(id);
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
	@Override
	public drg.moh.service.model.ViewDanhSachBenhAn deleteViewDanhSachBenhAn(
		drg.moh.service.model.ViewDanhSachBenhAn viewDanhSachBenhAn) {

		return _viewDanhSachBenhAnLocalService.deleteViewDanhSachBenhAn(
			viewDanhSachBenhAn);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _viewDanhSachBenhAnLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _viewDanhSachBenhAnLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _viewDanhSachBenhAnLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _viewDanhSachBenhAnLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _viewDanhSachBenhAnLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _viewDanhSachBenhAnLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _viewDanhSachBenhAnLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.ViewDanhSachBenhAn fetchViewDanhSachBenhAn(
		long id) {

		return _viewDanhSachBenhAnLocalService.fetchViewDanhSachBenhAn(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _viewDanhSachBenhAnLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<drg.moh.service.model.ViewDanhSachBenhAn>
		getBaoCaosByOrg_Nam(long orgId, int nam, int start, int end) {

		return _viewDanhSachBenhAnLocalService.getBaoCaosByOrg_Nam(
			orgId, nam, start, end);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _viewDanhSachBenhAnLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _viewDanhSachBenhAnLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _viewDanhSachBenhAnLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the view danh sach benh an with the primary key.
	 *
	 * @param id the primary key of the view danh sach benh an
	 * @return the view danh sach benh an
	 * @throws PortalException if a view danh sach benh an with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.ViewDanhSachBenhAn getViewDanhSachBenhAn(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _viewDanhSachBenhAnLocalService.getViewDanhSachBenhAn(id);
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
	@Override
	public java.util.List<drg.moh.service.model.ViewDanhSachBenhAn>
		getViewDanhSachBenhAns(int start, int end) {

		return _viewDanhSachBenhAnLocalService.getViewDanhSachBenhAns(
			start, end);
	}

	/**
	 * Returns the number of view danh sach benh ans.
	 *
	 * @return the number of view danh sach benh ans
	 */
	@Override
	public int getViewDanhSachBenhAnsCount() {
		return _viewDanhSachBenhAnLocalService.getViewDanhSachBenhAnsCount();
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
	@Override
	public drg.moh.service.model.ViewDanhSachBenhAn updateViewDanhSachBenhAn(
		drg.moh.service.model.ViewDanhSachBenhAn viewDanhSachBenhAn) {

		return _viewDanhSachBenhAnLocalService.updateViewDanhSachBenhAn(
			viewDanhSachBenhAn);
	}

	@Override
	public ViewDanhSachBenhAnLocalService getWrappedService() {
		return _viewDanhSachBenhAnLocalService;
	}

	@Override
	public void setWrappedService(
		ViewDanhSachBenhAnLocalService viewDanhSachBenhAnLocalService) {

		_viewDanhSachBenhAnLocalService = viewDanhSachBenhAnLocalService;
	}

	private ViewDanhSachBenhAnLocalService _viewDanhSachBenhAnLocalService;

}