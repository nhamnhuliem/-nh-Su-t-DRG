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
 * Provides a wrapper for {@link RpDashboardCphdLocalService}.
 *
 * @author SON
 * @see RpDashboardCphdLocalService
 * @generated
 */
public class RpDashboardCphdLocalServiceWrapper
	implements RpDashboardCphdLocalService,
			   ServiceWrapper<RpDashboardCphdLocalService> {

	public RpDashboardCphdLocalServiceWrapper(
		RpDashboardCphdLocalService rpDashboardCphdLocalService) {

		_rpDashboardCphdLocalService = rpDashboardCphdLocalService;
	}

	/**
	 * Adds the rp dashboard cphd to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCphdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCphd the rp dashboard cphd
	 * @return the rp dashboard cphd that was added
	 */
	@Override
	public drg.moh.service.model.RpDashboardCphd addRpDashboardCphd(
		drg.moh.service.model.RpDashboardCphd rpDashboardCphd) {

		return _rpDashboardCphdLocalService.addRpDashboardCphd(rpDashboardCphd);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCphdLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new rp dashboard cphd with the primary key. Does not add the rp dashboard cphd to the database.
	 *
	 * @param id the primary key for the new rp dashboard cphd
	 * @return the new rp dashboard cphd
	 */
	@Override
	public drg.moh.service.model.RpDashboardCphd createRpDashboardCphd(
		long id) {

		return _rpDashboardCphdLocalService.createRpDashboardCphd(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCphdLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the rp dashboard cphd with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCphdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the rp dashboard cphd
	 * @return the rp dashboard cphd that was removed
	 * @throws PortalException if a rp dashboard cphd with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardCphd deleteRpDashboardCphd(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCphdLocalService.deleteRpDashboardCphd(id);
	}

	/**
	 * Deletes the rp dashboard cphd from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCphdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCphd the rp dashboard cphd
	 * @return the rp dashboard cphd that was removed
	 */
	@Override
	public drg.moh.service.model.RpDashboardCphd deleteRpDashboardCphd(
		drg.moh.service.model.RpDashboardCphd rpDashboardCphd) {

		return _rpDashboardCphdLocalService.deleteRpDashboardCphd(
			rpDashboardCphd);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _rpDashboardCphdLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rpDashboardCphdLocalService.dynamicQuery();
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

		return _rpDashboardCphdLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCphdModelImpl</code>.
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

		return _rpDashboardCphdLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCphdModelImpl</code>.
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

		return _rpDashboardCphdLocalService.dynamicQuery(
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

		return _rpDashboardCphdLocalService.dynamicQueryCount(dynamicQuery);
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

		return _rpDashboardCphdLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.RpDashboardCphd fetchRpDashboardCphd(long id) {
		return _rpDashboardCphdLocalService.fetchRpDashboardCphd(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _rpDashboardCphdLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<drg.moh.service.model.RpDashboardCphd>
		getChiPhiThanhPhan(String maDonVi, int type) {

		return _rpDashboardCphdLocalService.getChiPhiThanhPhan(maDonVi, type);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _rpDashboardCphdLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _rpDashboardCphdLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCphdLocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List<drg.moh.service.model.RpDashboardCphd>
		getReportChiPhiHoatDong(String orgId, int type, String order) {

		return _rpDashboardCphdLocalService.getReportChiPhiHoatDong(
			orgId, type, order);
	}

	/**
	 * Returns the rp dashboard cphd with the primary key.
	 *
	 * @param id the primary key of the rp dashboard cphd
	 * @return the rp dashboard cphd
	 * @throws PortalException if a rp dashboard cphd with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardCphd getRpDashboardCphd(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCphdLocalService.getRpDashboardCphd(id);
	}

	/**
	 * Returns a range of all the rp dashboard cphds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCphdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cphds
	 * @param end the upper bound of the range of rp dashboard cphds (not inclusive)
	 * @return the range of rp dashboard cphds
	 */
	@Override
	public java.util.List<drg.moh.service.model.RpDashboardCphd>
		getRpDashboardCphds(int start, int end) {

		return _rpDashboardCphdLocalService.getRpDashboardCphds(start, end);
	}

	/**
	 * Returns the number of rp dashboard cphds.
	 *
	 * @return the number of rp dashboard cphds
	 */
	@Override
	public int getRpDashboardCphdsCount() {
		return _rpDashboardCphdLocalService.getRpDashboardCphdsCount();
	}

	/**
	 * Updates the rp dashboard cphd in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCphdLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCphd the rp dashboard cphd
	 * @return the rp dashboard cphd that was updated
	 */
	@Override
	public drg.moh.service.model.RpDashboardCphd updateRpDashboardCphd(
		drg.moh.service.model.RpDashboardCphd rpDashboardCphd) {

		return _rpDashboardCphdLocalService.updateRpDashboardCphd(
			rpDashboardCphd);
	}

	@Override
	public RpDashboardCphdLocalService getWrappedService() {
		return _rpDashboardCphdLocalService;
	}

	@Override
	public void setWrappedService(
		RpDashboardCphdLocalService rpDashboardCphdLocalService) {

		_rpDashboardCphdLocalService = rpDashboardCphdLocalService;
	}

	private RpDashboardCphdLocalService _rpDashboardCphdLocalService;

}