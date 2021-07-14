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
 * Provides a wrapper for {@link RpDashboardCmi2LocalService}.
 *
 * @author SON
 * @see RpDashboardCmi2LocalService
 * @generated
 */
public class RpDashboardCmi2LocalServiceWrapper
	implements RpDashboardCmi2LocalService,
			   ServiceWrapper<RpDashboardCmi2LocalService> {

	public RpDashboardCmi2LocalServiceWrapper(
		RpDashboardCmi2LocalService rpDashboardCmi2LocalService) {

		_rpDashboardCmi2LocalService = rpDashboardCmi2LocalService;
	}

	/**
	 * Adds the rp dashboard cmi2 to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCmi2LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCmi2 the rp dashboard cmi2
	 * @return the rp dashboard cmi2 that was added
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi2 addRpDashboardCmi2(
		drg.moh.service.model.RpDashboardCmi2 rpDashboardCmi2) {

		return _rpDashboardCmi2LocalService.addRpDashboardCmi2(rpDashboardCmi2);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmi2LocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new rp dashboard cmi2 with the primary key. Does not add the rp dashboard cmi2 to the database.
	 *
	 * @param id the primary key for the new rp dashboard cmi2
	 * @return the new rp dashboard cmi2
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi2 createRpDashboardCmi2(
		long id) {

		return _rpDashboardCmi2LocalService.createRpDashboardCmi2(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmi2LocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the rp dashboard cmi2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCmi2LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the rp dashboard cmi2
	 * @return the rp dashboard cmi2 that was removed
	 * @throws PortalException if a rp dashboard cmi2 with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi2 deleteRpDashboardCmi2(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmi2LocalService.deleteRpDashboardCmi2(id);
	}

	/**
	 * Deletes the rp dashboard cmi2 from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCmi2LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCmi2 the rp dashboard cmi2
	 * @return the rp dashboard cmi2 that was removed
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi2 deleteRpDashboardCmi2(
		drg.moh.service.model.RpDashboardCmi2 rpDashboardCmi2) {

		return _rpDashboardCmi2LocalService.deleteRpDashboardCmi2(
			rpDashboardCmi2);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _rpDashboardCmi2LocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rpDashboardCmi2LocalService.dynamicQuery();
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

		return _rpDashboardCmi2LocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCmi2ModelImpl</code>.
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

		return _rpDashboardCmi2LocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCmi2ModelImpl</code>.
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

		return _rpDashboardCmi2LocalService.dynamicQuery(
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

		return _rpDashboardCmi2LocalService.dynamicQueryCount(dynamicQuery);
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

		return _rpDashboardCmi2LocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.RpDashboardCmi2 fetchRpDashboardCmi2(long id) {
		return _rpDashboardCmi2LocalService.fetchRpDashboardCmi2(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _rpDashboardCmi2LocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<drg.moh.service.model.RpDashboardCmi2>
		getBaoCaoCmiBo_Tinh(String maDonVi, int type) {

		return _rpDashboardCmi2LocalService.getBaoCaoCmiBo_Tinh(maDonVi, type);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _rpDashboardCmi2LocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _rpDashboardCmi2LocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmi2LocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the rp dashboard cmi2 with the primary key.
	 *
	 * @param id the primary key of the rp dashboard cmi2
	 * @return the rp dashboard cmi2
	 * @throws PortalException if a rp dashboard cmi2 with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi2 getRpDashboardCmi2(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmi2LocalService.getRpDashboardCmi2(id);
	}

	/**
	 * Returns a range of all the rp dashboard cmi2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCmi2ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmi2s
	 * @param end the upper bound of the range of rp dashboard cmi2s (not inclusive)
	 * @return the range of rp dashboard cmi2s
	 */
	@Override
	public java.util.List<drg.moh.service.model.RpDashboardCmi2>
		getRpDashboardCmi2s(int start, int end) {

		return _rpDashboardCmi2LocalService.getRpDashboardCmi2s(start, end);
	}

	/**
	 * Returns the number of rp dashboard cmi2s.
	 *
	 * @return the number of rp dashboard cmi2s
	 */
	@Override
	public int getRpDashboardCmi2sCount() {
		return _rpDashboardCmi2LocalService.getRpDashboardCmi2sCount();
	}

	/**
	 * Updates the rp dashboard cmi2 in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCmi2LocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCmi2 the rp dashboard cmi2
	 * @return the rp dashboard cmi2 that was updated
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi2 updateRpDashboardCmi2(
		drg.moh.service.model.RpDashboardCmi2 rpDashboardCmi2) {

		return _rpDashboardCmi2LocalService.updateRpDashboardCmi2(
			rpDashboardCmi2);
	}

	@Override
	public RpDashboardCmi2LocalService getWrappedService() {
		return _rpDashboardCmi2LocalService;
	}

	@Override
	public void setWrappedService(
		RpDashboardCmi2LocalService rpDashboardCmi2LocalService) {

		_rpDashboardCmi2LocalService = rpDashboardCmi2LocalService;
	}

	private RpDashboardCmi2LocalService _rpDashboardCmi2LocalService;

}