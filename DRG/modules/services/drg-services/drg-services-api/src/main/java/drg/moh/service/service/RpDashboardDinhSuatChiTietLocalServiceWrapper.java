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
 * Provides a wrapper for {@link RpDashboardDinhSuatChiTietLocalService}.
 *
 * @author SON
 * @see RpDashboardDinhSuatChiTietLocalService
 * @generated
 */
public class RpDashboardDinhSuatChiTietLocalServiceWrapper
	implements RpDashboardDinhSuatChiTietLocalService,
			   ServiceWrapper<RpDashboardDinhSuatChiTietLocalService> {

	public RpDashboardDinhSuatChiTietLocalServiceWrapper(
		RpDashboardDinhSuatChiTietLocalService
			rpDashboardDinhSuatChiTietLocalService) {

		_rpDashboardDinhSuatChiTietLocalService =
			rpDashboardDinhSuatChiTietLocalService;
	}

	/**
	 * Adds the rp dashboard dinh suat chi tiet to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDinhSuatChiTietLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDinhSuatChiTiet the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet that was added
	 */
	@Override
	public drg.moh.service.model.RpDashboardDinhSuatChiTiet
		addRpDashboardDinhSuatChiTiet(
			drg.moh.service.model.RpDashboardDinhSuatChiTiet
				rpDashboardDinhSuatChiTiet) {

		return _rpDashboardDinhSuatChiTietLocalService.
			addRpDashboardDinhSuatChiTiet(rpDashboardDinhSuatChiTiet);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDinhSuatChiTietLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new rp dashboard dinh suat chi tiet with the primary key. Does not add the rp dashboard dinh suat chi tiet to the database.
	 *
	 * @param id the primary key for the new rp dashboard dinh suat chi tiet
	 * @return the new rp dashboard dinh suat chi tiet
	 */
	@Override
	public drg.moh.service.model.RpDashboardDinhSuatChiTiet
		createRpDashboardDinhSuatChiTiet(long id) {

		return _rpDashboardDinhSuatChiTietLocalService.
			createRpDashboardDinhSuatChiTiet(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDinhSuatChiTietLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the rp dashboard dinh suat chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDinhSuatChiTietLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet that was removed
	 * @throws PortalException if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardDinhSuatChiTiet
			deleteRpDashboardDinhSuatChiTiet(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDinhSuatChiTietLocalService.
			deleteRpDashboardDinhSuatChiTiet(id);
	}

	/**
	 * Deletes the rp dashboard dinh suat chi tiet from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDinhSuatChiTietLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDinhSuatChiTiet the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet that was removed
	 */
	@Override
	public drg.moh.service.model.RpDashboardDinhSuatChiTiet
		deleteRpDashboardDinhSuatChiTiet(
			drg.moh.service.model.RpDashboardDinhSuatChiTiet
				rpDashboardDinhSuatChiTiet) {

		return _rpDashboardDinhSuatChiTietLocalService.
			deleteRpDashboardDinhSuatChiTiet(rpDashboardDinhSuatChiTiet);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _rpDashboardDinhSuatChiTietLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rpDashboardDinhSuatChiTietLocalService.dynamicQuery();
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

		return _rpDashboardDinhSuatChiTietLocalService.dynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDinhSuatChiTietModelImpl</code>.
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

		return _rpDashboardDinhSuatChiTietLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDinhSuatChiTietModelImpl</code>.
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

		return _rpDashboardDinhSuatChiTietLocalService.dynamicQuery(
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

		return _rpDashboardDinhSuatChiTietLocalService.dynamicQueryCount(
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

		return _rpDashboardDinhSuatChiTietLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.RpDashboardDinhSuatChiTiet
		fetchRpDashboardDinhSuatChiTiet(long id) {

		return _rpDashboardDinhSuatChiTietLocalService.
			fetchRpDashboardDinhSuatChiTiet(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _rpDashboardDinhSuatChiTietLocalService.
			getActionableDynamicQuery();
	}

	@Override
	public java.util.List<drg.moh.service.model.RpDashboardDinhSuatChiTiet>
		getDinhSuatChiTiet(String maDonVi, int type, int thang) {

		return _rpDashboardDinhSuatChiTietLocalService.getDinhSuatChiTiet(
			maDonVi, type, thang);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _rpDashboardDinhSuatChiTietLocalService.
			getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _rpDashboardDinhSuatChiTietLocalService.
			getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDinhSuatChiTietLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the rp dashboard dinh suat chi tiet with the primary key.
	 *
	 * @param id the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet
	 * @throws PortalException if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardDinhSuatChiTiet
			getRpDashboardDinhSuatChiTiet(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDinhSuatChiTietLocalService.
			getRpDashboardDinhSuatChiTiet(id);
	}

	/**
	 * Returns a range of all the rp dashboard dinh suat chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDinhSuatChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dinh suat chi tiets
	 * @param end the upper bound of the range of rp dashboard dinh suat chi tiets (not inclusive)
	 * @return the range of rp dashboard dinh suat chi tiets
	 */
	@Override
	public java.util.List<drg.moh.service.model.RpDashboardDinhSuatChiTiet>
		getRpDashboardDinhSuatChiTiets(int start, int end) {

		return _rpDashboardDinhSuatChiTietLocalService.
			getRpDashboardDinhSuatChiTiets(start, end);
	}

	/**
	 * Returns the number of rp dashboard dinh suat chi tiets.
	 *
	 * @return the number of rp dashboard dinh suat chi tiets
	 */
	@Override
	public int getRpDashboardDinhSuatChiTietsCount() {
		return _rpDashboardDinhSuatChiTietLocalService.
			getRpDashboardDinhSuatChiTietsCount();
	}

	/**
	 * Updates the rp dashboard dinh suat chi tiet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDinhSuatChiTietLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDinhSuatChiTiet the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet that was updated
	 */
	@Override
	public drg.moh.service.model.RpDashboardDinhSuatChiTiet
		updateRpDashboardDinhSuatChiTiet(
			drg.moh.service.model.RpDashboardDinhSuatChiTiet
				rpDashboardDinhSuatChiTiet) {

		return _rpDashboardDinhSuatChiTietLocalService.
			updateRpDashboardDinhSuatChiTiet(rpDashboardDinhSuatChiTiet);
	}

	@Override
	public RpDashboardDinhSuatChiTietLocalService getWrappedService() {
		return _rpDashboardDinhSuatChiTietLocalService;
	}

	@Override
	public void setWrappedService(
		RpDashboardDinhSuatChiTietLocalService
			rpDashboardDinhSuatChiTietLocalService) {

		_rpDashboardDinhSuatChiTietLocalService =
			rpDashboardDinhSuatChiTietLocalService;
	}

	private RpDashboardDinhSuatChiTietLocalService
		_rpDashboardDinhSuatChiTietLocalService;

}