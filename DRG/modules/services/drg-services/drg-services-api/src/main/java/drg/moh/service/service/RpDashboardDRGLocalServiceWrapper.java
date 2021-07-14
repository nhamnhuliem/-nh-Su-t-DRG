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
 * Provides a wrapper for {@link RpDashboardDRGLocalService}.
 *
 * @author SON
 * @see RpDashboardDRGLocalService
 * @generated
 */
public class RpDashboardDRGLocalServiceWrapper
	implements RpDashboardDRGLocalService,
			   ServiceWrapper<RpDashboardDRGLocalService> {

	public RpDashboardDRGLocalServiceWrapper(
		RpDashboardDRGLocalService rpDashboardDRGLocalService) {

		_rpDashboardDRGLocalService = rpDashboardDRGLocalService;
	}

	/**
	 * Adds the rp dashboard drg to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDRGLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDRG the rp dashboard drg
	 * @return the rp dashboard drg that was added
	 */
	@Override
	public drg.moh.service.model.RpDashboardDRG addRpDashboardDRG(
		drg.moh.service.model.RpDashboardDRG rpDashboardDRG) {

		return _rpDashboardDRGLocalService.addRpDashboardDRG(rpDashboardDRG);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDRGLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new rp dashboard drg with the primary key. Does not add the rp dashboard drg to the database.
	 *
	 * @param id the primary key for the new rp dashboard drg
	 * @return the new rp dashboard drg
	 */
	@Override
	public drg.moh.service.model.RpDashboardDRG createRpDashboardDRG(long id) {
		return _rpDashboardDRGLocalService.createRpDashboardDRG(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDRGLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the rp dashboard drg with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDRGLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the rp dashboard drg
	 * @return the rp dashboard drg that was removed
	 * @throws PortalException if a rp dashboard drg with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardDRG deleteRpDashboardDRG(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDRGLocalService.deleteRpDashboardDRG(id);
	}

	/**
	 * Deletes the rp dashboard drg from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDRGLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDRG the rp dashboard drg
	 * @return the rp dashboard drg that was removed
	 */
	@Override
	public drg.moh.service.model.RpDashboardDRG deleteRpDashboardDRG(
		drg.moh.service.model.RpDashboardDRG rpDashboardDRG) {

		return _rpDashboardDRGLocalService.deleteRpDashboardDRG(rpDashboardDRG);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _rpDashboardDRGLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rpDashboardDRGLocalService.dynamicQuery();
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

		return _rpDashboardDRGLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDRGModelImpl</code>.
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

		return _rpDashboardDRGLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDRGModelImpl</code>.
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

		return _rpDashboardDRGLocalService.dynamicQuery(
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

		return _rpDashboardDRGLocalService.dynamicQueryCount(dynamicQuery);
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

		return _rpDashboardDRGLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.RpDashboardDRG fetchRpDashboardDRG(long id) {
		return _rpDashboardDRGLocalService.fetchRpDashboardDRG(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _rpDashboardDRGLocalService.getActionableDynamicQuery();
	}

	@Override
	public java.util.List<drg.moh.service.model.RpDashboardDRG> getDRGData(
		String maDonVi, double min, double max, int type) {

		return _rpDashboardDRGLocalService.getDRGData(maDonVi, min, max, type);
	}

	@Override
	public java.util.List<String> getDRGItems(
		String maDonVi, double min, double max, int type) {

		return _rpDashboardDRGLocalService.getDRGItems(maDonVi, min, max, type);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _rpDashboardDRGLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _rpDashboardDRGLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDRGLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the rp dashboard drg with the primary key.
	 *
	 * @param id the primary key of the rp dashboard drg
	 * @return the rp dashboard drg
	 * @throws PortalException if a rp dashboard drg with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardDRG getRpDashboardDRG(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDRGLocalService.getRpDashboardDRG(id);
	}

	/**
	 * Returns a range of all the rp dashboard drgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDRGModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard drgs
	 * @param end the upper bound of the range of rp dashboard drgs (not inclusive)
	 * @return the range of rp dashboard drgs
	 */
	@Override
	public java.util.List<drg.moh.service.model.RpDashboardDRG>
		getRpDashboardDRGs(int start, int end) {

		return _rpDashboardDRGLocalService.getRpDashboardDRGs(start, end);
	}

	/**
	 * Returns the number of rp dashboard drgs.
	 *
	 * @return the number of rp dashboard drgs
	 */
	@Override
	public int getRpDashboardDRGsCount() {
		return _rpDashboardDRGLocalService.getRpDashboardDRGsCount();
	}

	/**
	 * Updates the rp dashboard drg in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDRGLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDRG the rp dashboard drg
	 * @return the rp dashboard drg that was updated
	 */
	@Override
	public drg.moh.service.model.RpDashboardDRG updateRpDashboardDRG(
		drg.moh.service.model.RpDashboardDRG rpDashboardDRG) {

		return _rpDashboardDRGLocalService.updateRpDashboardDRG(rpDashboardDRG);
	}

	@Override
	public RpDashboardDRGLocalService getWrappedService() {
		return _rpDashboardDRGLocalService;
	}

	@Override
	public void setWrappedService(
		RpDashboardDRGLocalService rpDashboardDRGLocalService) {

		_rpDashboardDRGLocalService = rpDashboardDRGLocalService;
	}

	private RpDashboardDRGLocalService _rpDashboardDRGLocalService;

}