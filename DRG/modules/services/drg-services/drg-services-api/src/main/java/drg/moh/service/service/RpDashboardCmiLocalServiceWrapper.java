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
 * Provides a wrapper for {@link RpDashboardCmiLocalService}.
 *
 * @author SON
 * @see RpDashboardCmiLocalService
 * @generated
 */
public class RpDashboardCmiLocalServiceWrapper
	implements RpDashboardCmiLocalService,
			   ServiceWrapper<RpDashboardCmiLocalService> {

	public RpDashboardCmiLocalServiceWrapper(
		RpDashboardCmiLocalService rpDashboardCmiLocalService) {

		_rpDashboardCmiLocalService = rpDashboardCmiLocalService;
	}

	/**
	 * Adds the rp dashboard cmi to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCmiLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCmi the rp dashboard cmi
	 * @return the rp dashboard cmi that was added
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi addRpDashboardCmi(
		drg.moh.service.model.RpDashboardCmi rpDashboardCmi) {

		return _rpDashboardCmiLocalService.addRpDashboardCmi(rpDashboardCmi);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmiLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new rp dashboard cmi with the primary key. Does not add the rp dashboard cmi to the database.
	 *
	 * @param id the primary key for the new rp dashboard cmi
	 * @return the new rp dashboard cmi
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi createRpDashboardCmi(long id) {
		return _rpDashboardCmiLocalService.createRpDashboardCmi(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmiLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the rp dashboard cmi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCmiLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the rp dashboard cmi
	 * @return the rp dashboard cmi that was removed
	 * @throws PortalException if a rp dashboard cmi with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi deleteRpDashboardCmi(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmiLocalService.deleteRpDashboardCmi(id);
	}

	/**
	 * Deletes the rp dashboard cmi from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCmiLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCmi the rp dashboard cmi
	 * @return the rp dashboard cmi that was removed
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi deleteRpDashboardCmi(
		drg.moh.service.model.RpDashboardCmi rpDashboardCmi) {

		return _rpDashboardCmiLocalService.deleteRpDashboardCmi(rpDashboardCmi);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _rpDashboardCmiLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rpDashboardCmiLocalService.dynamicQuery();
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

		return _rpDashboardCmiLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCmiModelImpl</code>.
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

		return _rpDashboardCmiLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCmiModelImpl</code>.
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

		return _rpDashboardCmiLocalService.dynamicQuery(
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

		return _rpDashboardCmiLocalService.dynamicQueryCount(dynamicQuery);
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

		return _rpDashboardCmiLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.RpDashboardCmi fetchRpDashboardCmi(long id) {
		return _rpDashboardCmiLocalService.fetchRpDashboardCmi(id);
	}

	@Override
	public java.util.List<drg.moh.service.model.DashboardCMI> findByORG_MUC_NAM(
			long orgId, int mucBc, int nam)
		throws com.liferay.portal.kernel.exception.SystemException {

		return _rpDashboardCmiLocalService.findByORG_MUC_NAM(orgId, mucBc, nam);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _rpDashboardCmiLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _rpDashboardCmiLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _rpDashboardCmiLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmiLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the rp dashboard cmi with the primary key.
	 *
	 * @param id the primary key of the rp dashboard cmi
	 * @return the rp dashboard cmi
	 * @throws PortalException if a rp dashboard cmi with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi getRpDashboardCmi(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardCmiLocalService.getRpDashboardCmi(id);
	}

	/**
	 * Returns a range of all the rp dashboard cmis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardCmiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmis
	 * @param end the upper bound of the range of rp dashboard cmis (not inclusive)
	 * @return the range of rp dashboard cmis
	 */
	@Override
	public java.util.List<drg.moh.service.model.RpDashboardCmi>
		getRpDashboardCmis(int start, int end) {

		return _rpDashboardCmiLocalService.getRpDashboardCmis(start, end);
	}

	/**
	 * Returns the number of rp dashboard cmis.
	 *
	 * @return the number of rp dashboard cmis
	 */
	@Override
	public int getRpDashboardCmisCount() {
		return _rpDashboardCmiLocalService.getRpDashboardCmisCount();
	}

	/**
	 * Updates the rp dashboard cmi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardCmiLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardCmi the rp dashboard cmi
	 * @return the rp dashboard cmi that was updated
	 */
	@Override
	public drg.moh.service.model.RpDashboardCmi updateRpDashboardCmi(
		drg.moh.service.model.RpDashboardCmi rpDashboardCmi) {

		return _rpDashboardCmiLocalService.updateRpDashboardCmi(rpDashboardCmi);
	}

	@Override
	public RpDashboardCmiLocalService getWrappedService() {
		return _rpDashboardCmiLocalService;
	}

	@Override
	public void setWrappedService(
		RpDashboardCmiLocalService rpDashboardCmiLocalService) {

		_rpDashboardCmiLocalService = rpDashboardCmiLocalService;
	}

	private RpDashboardCmiLocalService _rpDashboardCmiLocalService;

}