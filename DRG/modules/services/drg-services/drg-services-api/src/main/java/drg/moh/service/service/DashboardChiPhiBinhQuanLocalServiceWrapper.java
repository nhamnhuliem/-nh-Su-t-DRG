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
 * Provides a wrapper for {@link DashboardChiPhiBinhQuanLocalService}.
 *
 * @author SON
 * @see DashboardChiPhiBinhQuanLocalService
 * @generated
 */
public class DashboardChiPhiBinhQuanLocalServiceWrapper
	implements DashboardChiPhiBinhQuanLocalService,
			   ServiceWrapper<DashboardChiPhiBinhQuanLocalService> {

	public DashboardChiPhiBinhQuanLocalServiceWrapper(
		DashboardChiPhiBinhQuanLocalService
			dashboardChiPhiBinhQuanLocalService) {

		_dashboardChiPhiBinhQuanLocalService =
			dashboardChiPhiBinhQuanLocalService;
	}

	/**
	 * Adds the dashboard chi phi binh quan to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiBinhQuanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardChiPhiBinhQuan the dashboard chi phi binh quan
	 * @return the dashboard chi phi binh quan that was added
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiBinhQuan
		addDashboardChiPhiBinhQuan(
			drg.moh.service.model.DashboardChiPhiBinhQuan
				dashboardChiPhiBinhQuan) {

		return _dashboardChiPhiBinhQuanLocalService.addDashboardChiPhiBinhQuan(
			dashboardChiPhiBinhQuan);
	}

	/**
	 * Creates a new dashboard chi phi binh quan with the primary key. Does not add the dashboard chi phi binh quan to the database.
	 *
	 * @param id the primary key for the new dashboard chi phi binh quan
	 * @return the new dashboard chi phi binh quan
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiBinhQuan
		createDashboardChiPhiBinhQuan(long id) {

		return _dashboardChiPhiBinhQuanLocalService.
			createDashboardChiPhiBinhQuan(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiBinhQuanLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the dashboard chi phi binh quan from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiBinhQuanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardChiPhiBinhQuan the dashboard chi phi binh quan
	 * @return the dashboard chi phi binh quan that was removed
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiBinhQuan
		deleteDashboardChiPhiBinhQuan(
			drg.moh.service.model.DashboardChiPhiBinhQuan
				dashboardChiPhiBinhQuan) {

		return _dashboardChiPhiBinhQuanLocalService.
			deleteDashboardChiPhiBinhQuan(dashboardChiPhiBinhQuan);
	}

	/**
	 * Deletes the dashboard chi phi binh quan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiBinhQuanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the dashboard chi phi binh quan
	 * @return the dashboard chi phi binh quan that was removed
	 * @throws PortalException if a dashboard chi phi binh quan with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiBinhQuan
			deleteDashboardChiPhiBinhQuan(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiBinhQuanLocalService.
			deleteDashboardChiPhiBinhQuan(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiBinhQuanLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _dashboardChiPhiBinhQuanLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dashboardChiPhiBinhQuanLocalService.dynamicQuery();
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

		return _dashboardChiPhiBinhQuanLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardChiPhiBinhQuanModelImpl</code>.
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

		return _dashboardChiPhiBinhQuanLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardChiPhiBinhQuanModelImpl</code>.
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

		return _dashboardChiPhiBinhQuanLocalService.dynamicQuery(
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

		return _dashboardChiPhiBinhQuanLocalService.dynamicQueryCount(
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

		return _dashboardChiPhiBinhQuanLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.DashboardChiPhiBinhQuan fetchByORG_MUC_NAM(
			long orgId, int mucBaoCao, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _dashboardChiPhiBinhQuanLocalService.fetchByORG_MUC_NAM(
			orgId, mucBaoCao, nam);
	}

	@Override
	public drg.moh.service.model.DashboardChiPhiBinhQuan
		fetchDashboardChiPhiBinhQuan(long id) {

		return _dashboardChiPhiBinhQuanLocalService.
			fetchDashboardChiPhiBinhQuan(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _dashboardChiPhiBinhQuanLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the dashboard chi phi binh quan with the primary key.
	 *
	 * @param id the primary key of the dashboard chi phi binh quan
	 * @return the dashboard chi phi binh quan
	 * @throws PortalException if a dashboard chi phi binh quan with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiBinhQuan
			getDashboardChiPhiBinhQuan(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiBinhQuanLocalService.getDashboardChiPhiBinhQuan(
			id);
	}

	/**
	 * Returns a range of all the dashboard chi phi binh quans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardChiPhiBinhQuanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi binh quans
	 * @param end the upper bound of the range of dashboard chi phi binh quans (not inclusive)
	 * @return the range of dashboard chi phi binh quans
	 */
	@Override
	public java.util.List<drg.moh.service.model.DashboardChiPhiBinhQuan>
		getDashboardChiPhiBinhQuans(int start, int end) {

		return _dashboardChiPhiBinhQuanLocalService.getDashboardChiPhiBinhQuans(
			start, end);
	}

	/**
	 * Returns the number of dashboard chi phi binh quans.
	 *
	 * @return the number of dashboard chi phi binh quans
	 */
	@Override
	public int getDashboardChiPhiBinhQuansCount() {
		return _dashboardChiPhiBinhQuanLocalService.
			getDashboardChiPhiBinhQuansCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _dashboardChiPhiBinhQuanLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _dashboardChiPhiBinhQuanLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardChiPhiBinhQuanLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Updates the dashboard chi phi binh quan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiBinhQuanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardChiPhiBinhQuan the dashboard chi phi binh quan
	 * @return the dashboard chi phi binh quan that was updated
	 */
	@Override
	public drg.moh.service.model.DashboardChiPhiBinhQuan
		updateDashboardChiPhiBinhQuan(
			drg.moh.service.model.DashboardChiPhiBinhQuan
				dashboardChiPhiBinhQuan) {

		return _dashboardChiPhiBinhQuanLocalService.
			updateDashboardChiPhiBinhQuan(dashboardChiPhiBinhQuan);
	}

	@Override
	public DashboardChiPhiBinhQuanLocalService getWrappedService() {
		return _dashboardChiPhiBinhQuanLocalService;
	}

	@Override
	public void setWrappedService(
		DashboardChiPhiBinhQuanLocalService
			dashboardChiPhiBinhQuanLocalService) {

		_dashboardChiPhiBinhQuanLocalService =
			dashboardChiPhiBinhQuanLocalService;
	}

	private DashboardChiPhiBinhQuanLocalService
		_dashboardChiPhiBinhQuanLocalService;

}