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
 * Provides a wrapper for {@link DashboardDinhSuatLocalService}.
 *
 * @author SON
 * @see DashboardDinhSuatLocalService
 * @generated
 */
public class DashboardDinhSuatLocalServiceWrapper
	implements DashboardDinhSuatLocalService,
			   ServiceWrapper<DashboardDinhSuatLocalService> {

	public DashboardDinhSuatLocalServiceWrapper(
		DashboardDinhSuatLocalService dashboardDinhSuatLocalService) {

		_dashboardDinhSuatLocalService = dashboardDinhSuatLocalService;
	}

	/**
	 * Adds the dashboard dinh suat to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardDinhSuatLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardDinhSuat the dashboard dinh suat
	 * @return the dashboard dinh suat that was added
	 */
	@Override
	public drg.moh.service.model.DashboardDinhSuat addDashboardDinhSuat(
		drg.moh.service.model.DashboardDinhSuat dashboardDinhSuat) {

		return _dashboardDinhSuatLocalService.addDashboardDinhSuat(
			dashboardDinhSuat);
	}

	/**
	 * Creates a new dashboard dinh suat with the primary key. Does not add the dashboard dinh suat to the database.
	 *
	 * @param id the primary key for the new dashboard dinh suat
	 * @return the new dashboard dinh suat
	 */
	@Override
	public drg.moh.service.model.DashboardDinhSuat createDashboardDinhSuat(
		long id) {

		return _dashboardDinhSuatLocalService.createDashboardDinhSuat(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardDinhSuatLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Deletes the dashboard dinh suat from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardDinhSuatLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardDinhSuat the dashboard dinh suat
	 * @return the dashboard dinh suat that was removed
	 */
	@Override
	public drg.moh.service.model.DashboardDinhSuat deleteDashboardDinhSuat(
		drg.moh.service.model.DashboardDinhSuat dashboardDinhSuat) {

		return _dashboardDinhSuatLocalService.deleteDashboardDinhSuat(
			dashboardDinhSuat);
	}

	/**
	 * Deletes the dashboard dinh suat with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardDinhSuatLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the dashboard dinh suat
	 * @return the dashboard dinh suat that was removed
	 * @throws PortalException if a dashboard dinh suat with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.DashboardDinhSuat deleteDashboardDinhSuat(
			long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardDinhSuatLocalService.deleteDashboardDinhSuat(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardDinhSuatLocalService.deletePersistedModel(
			persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _dashboardDinhSuatLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dashboardDinhSuatLocalService.dynamicQuery();
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

		return _dashboardDinhSuatLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardDinhSuatModelImpl</code>.
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

		return _dashboardDinhSuatLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardDinhSuatModelImpl</code>.
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

		return _dashboardDinhSuatLocalService.dynamicQuery(
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

		return _dashboardDinhSuatLocalService.dynamicQueryCount(dynamicQuery);
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

		return _dashboardDinhSuatLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public java.util.List<drg.moh.service.model.DashboardDinhSuat>
			fetchByORG_MUC_NAM(long orgId, int mucBaoCao, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _dashboardDinhSuatLocalService.fetchByORG_MUC_NAM(
			orgId, mucBaoCao, nam);
	}

	@Override
	public drg.moh.service.model.DashboardDinhSuat fetchDashboardDinhSuat(
		long id) {

		return _dashboardDinhSuatLocalService.fetchDashboardDinhSuat(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _dashboardDinhSuatLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the dashboard dinh suat with the primary key.
	 *
	 * @param id the primary key of the dashboard dinh suat
	 * @return the dashboard dinh suat
	 * @throws PortalException if a dashboard dinh suat with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.DashboardDinhSuat getDashboardDinhSuat(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardDinhSuatLocalService.getDashboardDinhSuat(id);
	}

	/**
	 * Returns a range of all the dashboard dinh suats.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardDinhSuatModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard dinh suats
	 * @param end the upper bound of the range of dashboard dinh suats (not inclusive)
	 * @return the range of dashboard dinh suats
	 */
	@Override
	public java.util.List<drg.moh.service.model.DashboardDinhSuat>
		getDashboardDinhSuats(int start, int end) {

		return _dashboardDinhSuatLocalService.getDashboardDinhSuats(start, end);
	}

	/**
	 * Returns the number of dashboard dinh suats.
	 *
	 * @return the number of dashboard dinh suats
	 */
	@Override
	public int getDashboardDinhSuatsCount() {
		return _dashboardDinhSuatLocalService.getDashboardDinhSuatsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _dashboardDinhSuatLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _dashboardDinhSuatLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardDinhSuatLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the dashboard dinh suat in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardDinhSuatLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardDinhSuat the dashboard dinh suat
	 * @return the dashboard dinh suat that was updated
	 */
	@Override
	public drg.moh.service.model.DashboardDinhSuat updateDashboardDinhSuat(
		drg.moh.service.model.DashboardDinhSuat dashboardDinhSuat) {

		return _dashboardDinhSuatLocalService.updateDashboardDinhSuat(
			dashboardDinhSuat);
	}

	@Override
	public DashboardDinhSuatLocalService getWrappedService() {
		return _dashboardDinhSuatLocalService;
	}

	@Override
	public void setWrappedService(
		DashboardDinhSuatLocalService dashboardDinhSuatLocalService) {

		_dashboardDinhSuatLocalService = dashboardDinhSuatLocalService;
	}

	private DashboardDinhSuatLocalService _dashboardDinhSuatLocalService;

}