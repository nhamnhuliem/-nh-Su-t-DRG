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
 * Provides a wrapper for {@link DashboardBaoHiemLocalService}.
 *
 * @author SON
 * @see DashboardBaoHiemLocalService
 * @generated
 */
public class DashboardBaoHiemLocalServiceWrapper
	implements DashboardBaoHiemLocalService,
			   ServiceWrapper<DashboardBaoHiemLocalService> {

	public DashboardBaoHiemLocalServiceWrapper(
		DashboardBaoHiemLocalService dashboardBaoHiemLocalService) {

		_dashboardBaoHiemLocalService = dashboardBaoHiemLocalService;
	}

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
	@Override
	public drg.moh.service.model.DashboardBaoHiem addDashboardBaoHiem(
		drg.moh.service.model.DashboardBaoHiem dashboardBaoHiem) {

		return _dashboardBaoHiemLocalService.addDashboardBaoHiem(
			dashboardBaoHiem);
	}

	/**
	 * Creates a new dashboard bao hiem with the primary key. Does not add the dashboard bao hiem to the database.
	 *
	 * @param id the primary key for the new dashboard bao hiem
	 * @return the new dashboard bao hiem
	 */
	@Override
	public drg.moh.service.model.DashboardBaoHiem createDashboardBaoHiem(
		long id) {

		return _dashboardBaoHiemLocalService.createDashboardBaoHiem(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardBaoHiemLocalService.createPersistedModel(
			primaryKeyObj);
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
	@Override
	public drg.moh.service.model.DashboardBaoHiem deleteDashboardBaoHiem(
		drg.moh.service.model.DashboardBaoHiem dashboardBaoHiem) {

		return _dashboardBaoHiemLocalService.deleteDashboardBaoHiem(
			dashboardBaoHiem);
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
	@Override
	public drg.moh.service.model.DashboardBaoHiem deleteDashboardBaoHiem(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardBaoHiemLocalService.deleteDashboardBaoHiem(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardBaoHiemLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _dashboardBaoHiemLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dashboardBaoHiemLocalService.dynamicQuery();
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

		return _dashboardBaoHiemLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _dashboardBaoHiemLocalService.dynamicQuery(
			dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _dashboardBaoHiemLocalService.dynamicQuery(
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

		return _dashboardBaoHiemLocalService.dynamicQueryCount(dynamicQuery);
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

		return _dashboardBaoHiemLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.DashboardBaoHiem fetchDashboardBaoHiem(
		long id) {

		return _dashboardBaoHiemLocalService.fetchDashboardBaoHiem(id);
	}

	@Override
	public java.util.List<drg.moh.service.model.DashboardBaoHiem>
			findByORG_MUC_NAM(long orgId, int mucBaoCao, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _dashboardBaoHiemLocalService.findByORG_MUC_NAM(
			orgId, mucBaoCao, nam);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _dashboardBaoHiemLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<drg.moh.service.model.DashboardBaoHiem>
		getBaoHiemData(long orgId, int muc, int nam) {

		return _dashboardBaoHiemLocalService.getBaoHiemData(orgId, muc, nam);
	}

	/**
	 * Returns the dashboard bao hiem with the primary key.
	 *
	 * @param id the primary key of the dashboard bao hiem
	 * @return the dashboard bao hiem
	 * @throws PortalException if a dashboard bao hiem with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.DashboardBaoHiem getDashboardBaoHiem(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardBaoHiemLocalService.getDashboardBaoHiem(id);
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
	@Override
	public java.util.List<drg.moh.service.model.DashboardBaoHiem>
		getDashboardBaoHiems(int start, int end) {

		return _dashboardBaoHiemLocalService.getDashboardBaoHiems(start, end);
	}

	/**
	 * Returns the number of dashboard bao hiems.
	 *
	 * @return the number of dashboard bao hiems
	 */
	@Override
	public int getDashboardBaoHiemsCount() {
		return _dashboardBaoHiemLocalService.getDashboardBaoHiemsCount();
	}

	@Override
	public java.util.List<String> getDrgBaoHiem(long orgId, int muc, int nam) {
		return _dashboardBaoHiemLocalService.getDrgBaoHiem(orgId, muc, nam);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _dashboardBaoHiemLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _dashboardBaoHiemLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardBaoHiemLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public drg.moh.service.model.DashboardBaoHiem updateDashboardBaoHiem(
		drg.moh.service.model.DashboardBaoHiem dashboardBaoHiem) {

		return _dashboardBaoHiemLocalService.updateDashboardBaoHiem(
			dashboardBaoHiem);
	}

	@Override
	public DashboardBaoHiemLocalService getWrappedService() {
		return _dashboardBaoHiemLocalService;
	}

	@Override
	public void setWrappedService(
		DashboardBaoHiemLocalService dashboardBaoHiemLocalService) {

		_dashboardBaoHiemLocalService = dashboardBaoHiemLocalService;
	}

	private DashboardBaoHiemLocalService _dashboardBaoHiemLocalService;

}