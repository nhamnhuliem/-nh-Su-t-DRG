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
 * Provides a wrapper for {@link RpDashboardCmi3LocalService}.
 *
 * @author SON
 * @see RpDashboardCmi3LocalService
 * @generated
 */
public class RpDashboardCmi3LocalServiceWrapper
	implements RpDashboardCmi3LocalService,
			   ServiceWrapper<RpDashboardCmi3LocalService> {

	public RpDashboardCmi3LocalServiceWrapper(
		RpDashboardCmi3LocalService rpDashboardCmi3LocalService) {

		_rpDashboardCmi3LocalService = rpDashboardCmi3LocalService;
	}

	/**
	 * Adds the rp dashboard cmi3 to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCmi3LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCmi3 the rp dashboard cmi3
	 * @return the rp dashboard cmi3 that was added
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi3 addRpDashboardCmi3(
		drg.moh.service.model.RpDashboardCmi3 rpDashboardCmi3) {

		return _rpDashboardCmi3LocalService.addRpDashboardCmi3(rpDashboardCmi3);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmi3LocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new rp dashboard cmi3 with the primary key. Does not add the rp dashboard cmi3 to the database.
	 *
	 * @param id the primary key for the new rp dashboard cmi3
	 * @return the new rp dashboard cmi3
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi3 createRpDashboardCmi3(
		long id) {

		return _rpDashboardCmi3LocalService.createRpDashboardCmi3(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmi3LocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the rp dashboard cmi3 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCmi3LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the rp dashboard cmi3
	 * @return the rp dashboard cmi3 that was removed
	 * @throws PortalException if a rp dashboard cmi3 with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi3 deleteRpDashboardCmi3(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmi3LocalService.deleteRpDashboardCmi3(id);
	}

	/**
	 * Deletes the rp dashboard cmi3 from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCmi3LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCmi3 the rp dashboard cmi3
	 * @return the rp dashboard cmi3 that was removed
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi3 deleteRpDashboardCmi3(
		drg.moh.service.model.RpDashboardCmi3 rpDashboardCmi3) {

		return _rpDashboardCmi3LocalService.deleteRpDashboardCmi3(
			rpDashboardCmi3);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _rpDashboardCmi3LocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rpDashboardCmi3LocalService.dynamicQuery();
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

		return _rpDashboardCmi3LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCmi3ModelImpl</code>.
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

		return _rpDashboardCmi3LocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCmi3ModelImpl</code>.
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

		return _rpDashboardCmi3LocalService.dynamicQuery(
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

		return _rpDashboardCmi3LocalService.dynamicQueryCount(dynamicQuery);
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

		return _rpDashboardCmi3LocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.RpDashboardCmi3 fetchRpDashboardCmi3(long id) {
		return _rpDashboardCmi3LocalService.fetchRpDashboardCmi3(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _rpDashboardCmi3LocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _rpDashboardCmi3LocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _rpDashboardCmi3LocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmi3LocalService.getPersistedModel(primaryKeyObj);
	}

	@Override
	public java.util.List<drg.moh.service.model.RpDashboardCmi3>
		getReportCmiCoSo(String maDonVi, int type) {

		return _rpDashboardCmi3LocalService.getReportCmiCoSo(maDonVi, type);
	}

	/**
	 * Returns the rp dashboard cmi3 with the primary key.
	 *
	 * @param id the primary key of the rp dashboard cmi3
	 * @return the rp dashboard cmi3
	 * @throws PortalException if a rp dashboard cmi3 with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi3 getRpDashboardCmi3(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmi3LocalService.getRpDashboardCmi3(id);
	}

	/**
	 * Returns a range of all the rp dashboard cmi3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCmi3ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmi3s
	 * @param end the upper bound of the range of rp dashboard cmi3s (not inclusive)
	 * @return the range of rp dashboard cmi3s
	 */
	@Override
	public java.util.List<drg.moh.service.model.RpDashboardCmi3>
		getRpDashboardCmi3s(int start, int end) {

		return _rpDashboardCmi3LocalService.getRpDashboardCmi3s(start, end);
	}

	/**
	 * Returns the number of rp dashboard cmi3s.
	 *
	 * @return the number of rp dashboard cmi3s
	 */
	@Override
	public int getRpDashboardCmi3sCount() {
		return _rpDashboardCmi3LocalService.getRpDashboardCmi3sCount();
	}

	/**
	 * Updates the rp dashboard cmi3 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCmi3LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCmi3 the rp dashboard cmi3
	 * @return the rp dashboard cmi3 that was updated
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi3 updateRpDashboardCmi3(
		drg.moh.service.model.RpDashboardCmi3 rpDashboardCmi3) {

		return _rpDashboardCmi3LocalService.updateRpDashboardCmi3(
			rpDashboardCmi3);
	}

	@Override
	public RpDashboardCmi3LocalService getWrappedService() {
		return _rpDashboardCmi3LocalService;
	}

	@Override
	public void setWrappedService(
		RpDashboardCmi3LocalService rpDashboardCmi3LocalService) {

		_rpDashboardCmi3LocalService = rpDashboardCmi3LocalService;
	}

	private RpDashboardCmi3LocalService _rpDashboardCmi3LocalService;

}