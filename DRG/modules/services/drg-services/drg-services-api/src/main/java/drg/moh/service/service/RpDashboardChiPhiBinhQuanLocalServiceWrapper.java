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
 * Provides a wrapper for {@link RpDashboardChiPhiBinhQuanLocalService}.
 *
 * @author SON
 * @see RpDashboardChiPhiBinhQuanLocalService
 * @generated
 */
public class RpDashboardChiPhiBinhQuanLocalServiceWrapper
	implements RpDashboardChiPhiBinhQuanLocalService,
			   ServiceWrapper<RpDashboardChiPhiBinhQuanLocalService> {

	public RpDashboardChiPhiBinhQuanLocalServiceWrapper(
		RpDashboardChiPhiBinhQuanLocalService
			rpDashboardChiPhiBinhQuanLocalService) {

		_rpDashboardChiPhiBinhQuanLocalService =
			rpDashboardChiPhiBinhQuanLocalService;
	}

	/**
	 * Adds the rp dashboard chi phi binh quan to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardChiPhiBinhQuanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardChiPhiBinhQuan the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan that was added
	 */
	@Override
	public drg.moh.service.model.RpDashboardChiPhiBinhQuan
		addRpDashboardChiPhiBinhQuan(
			drg.moh.service.model.RpDashboardChiPhiBinhQuan
				rpDashboardChiPhiBinhQuan) {

		return _rpDashboardChiPhiBinhQuanLocalService.
			addRpDashboardChiPhiBinhQuan(rpDashboardChiPhiBinhQuan);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardChiPhiBinhQuanLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new rp dashboard chi phi binh quan with the primary key. Does not add the rp dashboard chi phi binh quan to the database.
	 *
	 * @param id the primary key for the new rp dashboard chi phi binh quan
	 * @return the new rp dashboard chi phi binh quan
	 */
	@Override
	public drg.moh.service.model.RpDashboardChiPhiBinhQuan
		createRpDashboardChiPhiBinhQuan(long id) {

		return _rpDashboardChiPhiBinhQuanLocalService.
			createRpDashboardChiPhiBinhQuan(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardChiPhiBinhQuanLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the rp dashboard chi phi binh quan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardChiPhiBinhQuanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan that was removed
	 * @throws PortalException if a rp dashboard chi phi binh quan with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardChiPhiBinhQuan
			deleteRpDashboardChiPhiBinhQuan(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardChiPhiBinhQuanLocalService.
			deleteRpDashboardChiPhiBinhQuan(id);
	}

	/**
	 * Deletes the rp dashboard chi phi binh quan from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardChiPhiBinhQuanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardChiPhiBinhQuan the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan that was removed
	 */
	@Override
	public drg.moh.service.model.RpDashboardChiPhiBinhQuan
		deleteRpDashboardChiPhiBinhQuan(
			drg.moh.service.model.RpDashboardChiPhiBinhQuan
				rpDashboardChiPhiBinhQuan) {

		return _rpDashboardChiPhiBinhQuanLocalService.
			deleteRpDashboardChiPhiBinhQuan(rpDashboardChiPhiBinhQuan);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _rpDashboardChiPhiBinhQuanLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rpDashboardChiPhiBinhQuanLocalService.dynamicQuery();
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

		return _rpDashboardChiPhiBinhQuanLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardChiPhiBinhQuanModelImpl</code>.
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

		return _rpDashboardChiPhiBinhQuanLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardChiPhiBinhQuanModelImpl</code>.
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

		return _rpDashboardChiPhiBinhQuanLocalService.dynamicQuery(
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

		return _rpDashboardChiPhiBinhQuanLocalService.dynamicQueryCount(
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

		return _rpDashboardChiPhiBinhQuanLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.RpDashboardChiPhiBinhQuan
		fetchRpDashboardChiPhiBinhQuan(long id) {

		return _rpDashboardChiPhiBinhQuanLocalService.
			fetchRpDashboardChiPhiBinhQuan(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _rpDashboardChiPhiBinhQuanLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List<drg.moh.service.model.RpDashboardChiPhiBinhQuan>
		getChiPhiBinhQuan(String maDonVi, int type) {

		return _rpDashboardChiPhiBinhQuanLocalService.getChiPhiBinhQuan(
			maDonVi, type);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _rpDashboardChiPhiBinhQuanLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _rpDashboardChiPhiBinhQuanLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardChiPhiBinhQuanLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the rp dashboard chi phi binh quan with the primary key.
	 *
	 * @param id the primary key of the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan
	 * @throws PortalException if a rp dashboard chi phi binh quan with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardChiPhiBinhQuan
			getRpDashboardChiPhiBinhQuan(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardChiPhiBinhQuanLocalService.
			getRpDashboardChiPhiBinhQuan(id);
	}

	/**
	 * Returns a range of all the rp dashboard chi phi binh quans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardChiPhiBinhQuanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard chi phi binh quans
	 * @param end the upper bound of the range of rp dashboard chi phi binh quans (not inclusive)
	 * @return the range of rp dashboard chi phi binh quans
	 */
	@Override
	public java.util.List<drg.moh.service.model.RpDashboardChiPhiBinhQuan>
		getRpDashboardChiPhiBinhQuans(int start, int end) {

		return _rpDashboardChiPhiBinhQuanLocalService.
			getRpDashboardChiPhiBinhQuans(start, end);
	}

	/**
	 * Returns the number of rp dashboard chi phi binh quans.
	 *
	 * @return the number of rp dashboard chi phi binh quans
	 */
	@Override
	public int getRpDashboardChiPhiBinhQuansCount() {
		return _rpDashboardChiPhiBinhQuanLocalService.
			getRpDashboardChiPhiBinhQuansCount();
	}

	/**
	 * Updates the rp dashboard chi phi binh quan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardChiPhiBinhQuanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardChiPhiBinhQuan the rp dashboard chi phi binh quan
	 * @return the rp dashboard chi phi binh quan that was updated
	 */
	@Override
	public drg.moh.service.model.RpDashboardChiPhiBinhQuan
		updateRpDashboardChiPhiBinhQuan(
			drg.moh.service.model.RpDashboardChiPhiBinhQuan
				rpDashboardChiPhiBinhQuan) {

		return _rpDashboardChiPhiBinhQuanLocalService.
			updateRpDashboardChiPhiBinhQuan(rpDashboardChiPhiBinhQuan);
	}

	@Override
	public RpDashboardChiPhiBinhQuanLocalService getWrappedService() {
		return _rpDashboardChiPhiBinhQuanLocalService;
	}

	@Override
	public void setWrappedService(
		RpDashboardChiPhiBinhQuanLocalService
			rpDashboardChiPhiBinhQuanLocalService) {

		_rpDashboardChiPhiBinhQuanLocalService =
			rpDashboardChiPhiBinhQuanLocalService;
	}

	private RpDashboardChiPhiBinhQuanLocalService
		_rpDashboardChiPhiBinhQuanLocalService;

}