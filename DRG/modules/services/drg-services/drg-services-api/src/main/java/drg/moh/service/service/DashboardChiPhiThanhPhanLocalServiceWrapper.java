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
 * Provides a wrapper for {@link DashboardChiPhiThanhPhanLocalService}.
 *
 * @author SON
 * @see DashboardChiPhiThanhPhanLocalService
 * @generated
 */
public class DashboardChiPhiThanhPhanLocalServiceWrapper
	implements DashboardChiPhiThanhPhanLocalService,
			   ServiceWrapper<DashboardChiPhiThanhPhanLocalService> {

	public DashboardChiPhiThanhPhanLocalServiceWrapper(
		DashboardChiPhiThanhPhanLocalService
			dashboardChiPhiThanhPhanLocalService) {

		_dashboardChiPhiThanhPhanLocalService =
			dashboardChiPhiThanhPhanLocalService;
	}

	/**
	 * Adds the dashboard chi phi thanh phan to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiThanhPhanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardChiPhiThanhPhan the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan that was added
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiThanhPhan
		addDashboardChiPhiThanhPhan(
			drg.moh.service.model.DashboardChiPhiThanhPhan
				dashboardChiPhiThanhPhan) {

		return _dashboardChiPhiThanhPhanLocalService.
			addDashboardChiPhiThanhPhan(dashboardChiPhiThanhPhan);
	}

	/**
	 * Creates a new dashboard chi phi thanh phan with the primary key. Does not add the dashboard chi phi thanh phan to the database.
	 *
	 * @param id the primary key for the new dashboard chi phi thanh phan
	 * @return the new dashboard chi phi thanh phan
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiThanhPhan
		createDashboardChiPhiThanhPhan(long id) {

		return _dashboardChiPhiThanhPhanLocalService.
			createDashboardChiPhiThanhPhan(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiThanhPhanLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the dashboard chi phi thanh phan from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiThanhPhanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardChiPhiThanhPhan the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan that was removed
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiThanhPhan
		deleteDashboardChiPhiThanhPhan(
			drg.moh.service.model.DashboardChiPhiThanhPhan
				dashboardChiPhiThanhPhan) {

		return _dashboardChiPhiThanhPhanLocalService.
			deleteDashboardChiPhiThanhPhan(dashboardChiPhiThanhPhan);
	}

	/**
	 * Deletes the dashboard chi phi thanh phan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiThanhPhanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan that was removed
	 * @throws PortalException if a dashboard chi phi thanh phan with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiThanhPhan
			deleteDashboardChiPhiThanhPhan(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiThanhPhanLocalService.
			deleteDashboardChiPhiThanhPhan(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiThanhPhanLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _dashboardChiPhiThanhPhanLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dashboardChiPhiThanhPhanLocalService.dynamicQuery();
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

		return _dashboardChiPhiThanhPhanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardChiPhiThanhPhanModelImpl</code>.
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

		return _dashboardChiPhiThanhPhanLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardChiPhiThanhPhanModelImpl</code>.
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

		return _dashboardChiPhiThanhPhanLocalService.dynamicQuery(
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

		return _dashboardChiPhiThanhPhanLocalService.dynamicQueryCount(
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

		return _dashboardChiPhiThanhPhanLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.DashboardChiPhiThanhPhan fetchByORG_MUC_NAM(
			long orgId, int mucBaoCao, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _dashboardChiPhiThanhPhanLocalService.fetchByORG_MUC_NAM(
			orgId, mucBaoCao, nam);
	}

	@Override
	public drg.moh.service.model.DashboardChiPhiThanhPhan
		fetchDashboardChiPhiThanhPhan(long id) {

		return _dashboardChiPhiThanhPhanLocalService.
			fetchDashboardChiPhiThanhPhan(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _dashboardChiPhiThanhPhanLocalService.
			getActionableDynamicQuery();
	}

	/**
	 * Returns the dashboard chi phi thanh phan with the primary key.
	 *
	 * @param id the primary key of the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan
	 * @throws PortalException if a dashboard chi phi thanh phan with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiThanhPhan
			getDashboardChiPhiThanhPhan(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiThanhPhanLocalService.
			getDashboardChiPhiThanhPhan(id);
	}

	/**
	 * Returns a range of all the dashboard chi phi thanh phans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardChiPhiThanhPhanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi thanh phans
	 * @param end the upper bound of the range of dashboard chi phi thanh phans (not inclusive)
	 * @return the range of dashboard chi phi thanh phans
	 */
	@Override
	public java.util.List<drg.moh.service.model.DashboardChiPhiThanhPhan>
		getDashboardChiPhiThanhPhans(int start, int end) {

		return _dashboardChiPhiThanhPhanLocalService.
			getDashboardChiPhiThanhPhans(start, end);
	}

	/**
	 * Returns the number of dashboard chi phi thanh phans.
	 *
	 * @return the number of dashboard chi phi thanh phans
	 */
	@Override
	public int getDashboardChiPhiThanhPhansCount() {
		return _dashboardChiPhiThanhPhanLocalService.
			getDashboardChiPhiThanhPhansCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _dashboardChiPhiThanhPhanLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _dashboardChiPhiThanhPhanLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiThanhPhanLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the dashboard chi phi thanh phan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiThanhPhanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardChiPhiThanhPhan the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan that was updated
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiThanhPhan
		updateDashboardChiPhiThanhPhan(
			drg.moh.service.model.DashboardChiPhiThanhPhan
				dashboardChiPhiThanhPhan) {

		return _dashboardChiPhiThanhPhanLocalService.
			updateDashboardChiPhiThanhPhan(dashboardChiPhiThanhPhan);
	}

	@Override
	public DashboardChiPhiThanhPhanLocalService getWrappedService() {
		return _dashboardChiPhiThanhPhanLocalService;
	}

	@Override
	public void setWrappedService(
		DashboardChiPhiThanhPhanLocalService
			dashboardChiPhiThanhPhanLocalService) {

		_dashboardChiPhiThanhPhanLocalService =
			dashboardChiPhiThanhPhanLocalService;
	}

	private DashboardChiPhiThanhPhanLocalService
		_dashboardChiPhiThanhPhanLocalService;

}