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
 * Provides a wrapper for {@link DashboardChiPhiHoatDongLocalService}.
 *
 * @author SON
 * @see DashboardChiPhiHoatDongLocalService
 * @generated
 */
public class DashboardChiPhiHoatDongLocalServiceWrapper
	implements DashboardChiPhiHoatDongLocalService,
			   ServiceWrapper<DashboardChiPhiHoatDongLocalService> {

	public DashboardChiPhiHoatDongLocalServiceWrapper(
		DashboardChiPhiHoatDongLocalService
			dashboardChiPhiHoatDongLocalService) {

		_dashboardChiPhiHoatDongLocalService =
			dashboardChiPhiHoatDongLocalService;
	}

	/**
	 * Adds the dashboard chi phi hoat dong to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiHoatDongLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardChiPhiHoatDong the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong that was added
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiHoatDong
		addDashboardChiPhiHoatDong(
			drg.moh.service.model.DashboardChiPhiHoatDong
				dashboardChiPhiHoatDong) {

		return _dashboardChiPhiHoatDongLocalService.addDashboardChiPhiHoatDong(
			dashboardChiPhiHoatDong);
	}

	@Override
	public int countBaoCaosByOrg_Muc_Nam(long orgId, int muc, int nam) {
		return _dashboardChiPhiHoatDongLocalService.countBaoCaosByOrg_Muc_Nam(
			orgId, muc, nam);
	}

	/**
	 * Creates a new dashboard chi phi hoat dong with the primary key. Does not add the dashboard chi phi hoat dong to the database.
	 *
	 * @param id the primary key for the new dashboard chi phi hoat dong
	 * @return the new dashboard chi phi hoat dong
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiHoatDong
		createDashboardChiPhiHoatDong(long id) {

		return _dashboardChiPhiHoatDongLocalService.
			createDashboardChiPhiHoatDong(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiHoatDongLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the dashboard chi phi hoat dong from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiHoatDongLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardChiPhiHoatDong the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong that was removed
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiHoatDong
		deleteDashboardChiPhiHoatDong(
			drg.moh.service.model.DashboardChiPhiHoatDong
				dashboardChiPhiHoatDong) {

		return _dashboardChiPhiHoatDongLocalService.
			deleteDashboardChiPhiHoatDong(dashboardChiPhiHoatDong);
	}

	/**
	 * Deletes the dashboard chi phi hoat dong with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiHoatDongLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong that was removed
	 * @throws PortalException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiHoatDong
			deleteDashboardChiPhiHoatDong(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiHoatDongLocalService.
			deleteDashboardChiPhiHoatDong(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiHoatDongLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _dashboardChiPhiHoatDongLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dashboardChiPhiHoatDongLocalService.dynamicQuery();
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

		return _dashboardChiPhiHoatDongLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardChiPhiHoatDongModelImpl</code>.
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

		return _dashboardChiPhiHoatDongLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardChiPhiHoatDongModelImpl</code>.
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

		return _dashboardChiPhiHoatDongLocalService.dynamicQuery(
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

		return _dashboardChiPhiHoatDongLocalService.dynamicQueryCount(
			dynamicQuery);
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

		return _dashboardChiPhiHoatDongLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.DashboardChiPhiHoatDong
		fetchDashboardChiPhiHoatDong(long id) {

		return _dashboardChiPhiHoatDongLocalService.
			fetchDashboardChiPhiHoatDong(id);
	}

	@Override
	public java.util.List<drg.moh.service.model.DashboardChiPhiHoatDong>
			findByORG_MUC_NAM(long orgId, int mucBaoCao, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _dashboardChiPhiHoatDongLocalService.findByORG_MUC_NAM(
			orgId, mucBaoCao, nam);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _dashboardChiPhiHoatDongLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<drg.moh.service.model.DashboardChiPhiHoatDong>
		getBaoCaosByOrg_Muc_Nam(
			long orgId, int muc, int nam, int start, int end) {

		return _dashboardChiPhiHoatDongLocalService.getBaoCaosByOrg_Muc_Nam(
			orgId, muc, nam, start, end);
	}

	/**
	 * Returns the dashboard chi phi hoat dong with the primary key.
	 *
	 * @param id the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong
	 * @throws PortalException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiHoatDong
			getDashboardChiPhiHoatDong(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiHoatDongLocalService.getDashboardChiPhiHoatDong(
			id);
	}

	/**
	 * Returns a range of all the dashboard chi phi hoat dongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @return the range of dashboard chi phi hoat dongs
	 */
	@Override
	public java.util.List<drg.moh.service.model.DashboardChiPhiHoatDong>
		getDashboardChiPhiHoatDongs(int start, int end) {

		return _dashboardChiPhiHoatDongLocalService.getDashboardChiPhiHoatDongs(
			start, end);
	}

	/**
	 * Returns the number of dashboard chi phi hoat dongs.
	 *
	 * @return the number of dashboard chi phi hoat dongs
	 */
	@Override
	public int getDashboardChiPhiHoatDongsCount() {
		return _dashboardChiPhiHoatDongLocalService.
			getDashboardChiPhiHoatDongsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _dashboardChiPhiHoatDongLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _dashboardChiPhiHoatDongLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiHoatDongLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the dashboard chi phi hoat dong in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiHoatDongLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardChiPhiHoatDong the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong that was updated
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiHoatDong
		updateDashboardChiPhiHoatDong(
			drg.moh.service.model.DashboardChiPhiHoatDong
				dashboardChiPhiHoatDong) {

		return _dashboardChiPhiHoatDongLocalService.
			updateDashboardChiPhiHoatDong(dashboardChiPhiHoatDong);
	}

	@Override
	public DashboardChiPhiHoatDongLocalService getWrappedService() {
		return _dashboardChiPhiHoatDongLocalService;
	}

	@Override
	public void setWrappedService(
		DashboardChiPhiHoatDongLocalService
			dashboardChiPhiHoatDongLocalService) {

		_dashboardChiPhiHoatDongLocalService =
			dashboardChiPhiHoatDongLocalService;
	}

	private DashboardChiPhiHoatDongLocalService
		_dashboardChiPhiHoatDongLocalService;

}