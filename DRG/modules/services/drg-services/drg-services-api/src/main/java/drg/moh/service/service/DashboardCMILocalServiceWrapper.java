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
 * Provides a wrapper for {@link DashboardCMILocalService}.
 *
 * @author SON
 * @see DashboardCMILocalService
 * @generated
 */
public class DashboardCMILocalServiceWrapper
	implements DashboardCMILocalService,
			   ServiceWrapper<DashboardCMILocalService> {

	public DashboardCMILocalServiceWrapper(
		DashboardCMILocalService dashboardCMILocalService) {

		_dashboardCMILocalService = dashboardCMILocalService;
	}

	/**
	 * Adds the dashboard cmi to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardCMILocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardCMI the dashboard cmi
	 * @return the dashboard cmi that was added
	 */
	@Override
	public drg.moh.service.model.DashboardCMI addDashboardCMI(
		drg.moh.service.model.DashboardCMI dashboardCMI) {

		return _dashboardCMILocalService.addDashboardCMI(dashboardCMI);
	}

	/**
	 * Creates a new dashboard cmi with the primary key. Does not add the dashboard cmi to the database.
	 *
	 * @param id the primary key for the new dashboard cmi
	 * @return the new dashboard cmi
	 */
	@Override
	public drg.moh.service.model.DashboardCMI createDashboardCMI(long id) {
		return _dashboardCMILocalService.createDashboardCMI(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardCMILocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the dashboard cmi from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardCMILocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardCMI the dashboard cmi
	 * @return the dashboard cmi that was removed
	 */
	@Override
	public drg.moh.service.model.DashboardCMI deleteDashboardCMI(
		drg.moh.service.model.DashboardCMI dashboardCMI) {

		return _dashboardCMILocalService.deleteDashboardCMI(dashboardCMI);
	}

	/**
	 * Deletes the dashboard cmi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardCMILocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the dashboard cmi
	 * @return the dashboard cmi that was removed
	 * @throws PortalException if a dashboard cmi with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.DashboardCMI deleteDashboardCMI(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardCMILocalService.deleteDashboardCMI(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardCMILocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _dashboardCMILocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _dashboardCMILocalService.dynamicQuery();
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

		return _dashboardCMILocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardCMIModelImpl</code>.
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

		return _dashboardCMILocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardCMIModelImpl</code>.
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

		return _dashboardCMILocalService.dynamicQuery(
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

		return _dashboardCMILocalService.dynamicQueryCount(dynamicQuery);
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

		return _dashboardCMILocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.DashboardCMI fetchDashboardCMI(long id) {
		return _dashboardCMILocalService.fetchDashboardCMI(id);
	}

	@Override
	public java.util.List<drg.moh.service.model.DashboardCMI> findByORG_MUC_NAM(
			long orgId, int mucBc, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _dashboardCMILocalService.findByORG_MUC_NAM(orgId, mucBc, nam);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _dashboardCMILocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the dashboard cmi with the primary key.
	 *
	 * @param id the primary key of the dashboard cmi
	 * @return the dashboard cmi
	 * @throws PortalException if a dashboard cmi with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.DashboardCMI getDashboardCMI(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardCMILocalService.getDashboardCMI(id);
	}

	/**
	 * Returns a range of all the dashboard cmis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardCMIModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard cmis
	 * @param end the upper bound of the range of dashboard cmis (not inclusive)
	 * @return the range of dashboard cmis
	 */
	@Override
	public java.util.List<drg.moh.service.model.DashboardCMI> getDashboardCMIs(
		int start, int end) {

		return _dashboardCMILocalService.getDashboardCMIs(start, end);
	}

	/**
	 * Returns the number of dashboard cmis.
	 *
	 * @return the number of dashboard cmis
	 */
	@Override
	public int getDashboardCMIsCount() {
		return _dashboardCMILocalService.getDashboardCMIsCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _dashboardCMILocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _dashboardCMILocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _dashboardCMILocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the dashboard cmi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardCMILocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardCMI the dashboard cmi
	 * @return the dashboard cmi that was updated
	 */
	@Override
	public drg.moh.service.model.DashboardCMI updateDashboardCMI(
		drg.moh.service.model.DashboardCMI dashboardCMI) {

		return _dashboardCMILocalService.updateDashboardCMI(dashboardCMI);
	}

	@Override
	public DashboardCMILocalService getWrappedService() {
		return _dashboardCMILocalService;
	}

	@Override
	public void setWrappedService(
		DashboardCMILocalService dashboardCMILocalService) {

		_dashboardCMILocalService = dashboardCMILocalService;
	}

	private DashboardCMILocalService _dashboardCMILocalService;

}