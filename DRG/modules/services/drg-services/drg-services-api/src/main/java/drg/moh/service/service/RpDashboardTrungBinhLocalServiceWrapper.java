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
 * Provides a wrapper for {@link RpDashboardTrungBinhLocalService}.
 *
 * @author SON
 * @see RpDashboardTrungBinhLocalService
 * @generated
 */
public class RpDashboardTrungBinhLocalServiceWrapper
	implements RpDashboardTrungBinhLocalService,
			   ServiceWrapper<RpDashboardTrungBinhLocalService> {

	public RpDashboardTrungBinhLocalServiceWrapper(
		RpDashboardTrungBinhLocalService rpDashboardTrungBinhLocalService) {

		_rpDashboardTrungBinhLocalService = rpDashboardTrungBinhLocalService;
	}

	/**
	 * Adds the rp dashboard trung binh to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardTrungBinhLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardTrungBinh the rp dashboard trung binh
	 * @return the rp dashboard trung binh that was added
	 */
	@Override
	public drg.moh.service.model.RpDashboardTrungBinh addRpDashboardTrungBinh(
		drg.moh.service.model.RpDashboardTrungBinh rpDashboardTrungBinh) {

		return _rpDashboardTrungBinhLocalService.addRpDashboardTrungBinh(
			rpDashboardTrungBinh);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardTrungBinhLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new rp dashboard trung binh with the primary key. Does not add the rp dashboard trung binh to the database.
	 *
	 * @param data the primary key for the new rp dashboard trung binh
	 * @return the new rp dashboard trung binh
	 */
	@Override
	public drg.moh.service.model.RpDashboardTrungBinh
		createRpDashboardTrungBinh(String data) {

		return _rpDashboardTrungBinhLocalService.createRpDashboardTrungBinh(
			data);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardTrungBinhLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the rp dashboard trung binh from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardTrungBinhLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardTrungBinh the rp dashboard trung binh
	 * @return the rp dashboard trung binh that was removed
	 */
	@Override
	public drg.moh.service.model.RpDashboardTrungBinh
		deleteRpDashboardTrungBinh(
			drg.moh.service.model.RpDashboardTrungBinh rpDashboardTrungBinh) {

		return _rpDashboardTrungBinhLocalService.deleteRpDashboardTrungBinh(
			rpDashboardTrungBinh);
	}

	/**
	 * Deletes the rp dashboard trung binh with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardTrungBinhLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param data the primary key of the rp dashboard trung binh
	 * @return the rp dashboard trung binh that was removed
	 * @throws PortalException if a rp dashboard trung binh with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardTrungBinh
			deleteRpDashboardTrungBinh(String data)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardTrungBinhLocalService.deleteRpDashboardTrungBinh(
			data);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _rpDashboardTrungBinhLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rpDashboardTrungBinhLocalService.dynamicQuery();
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

		return _rpDashboardTrungBinhLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardTrungBinhModelImpl</code>.
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

		return _rpDashboardTrungBinhLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardTrungBinhModelImpl</code>.
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

		return _rpDashboardTrungBinhLocalService.dynamicQuery(
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

		return _rpDashboardTrungBinhLocalService.dynamicQueryCount(
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

		return _rpDashboardTrungBinhLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.RpDashboardTrungBinh fetchRpDashboardTrungBinh(
		String data) {

		return _rpDashboardTrungBinhLocalService.fetchRpDashboardTrungBinh(
			data);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _rpDashboardTrungBinhLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardTrungBinhLocalService.getPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Returns the rp dashboard trung binh with the primary key.
	 *
	 * @param data the primary key of the rp dashboard trung binh
	 * @return the rp dashboard trung binh
	 * @throws PortalException if a rp dashboard trung binh with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardTrungBinh getRpDashboardTrungBinh(
			String data)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardTrungBinhLocalService.getRpDashboardTrungBinh(data);
	}

	/**
	 * Returns a range of all the rp dashboard trung binhs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardTrungBinhModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard trung binhs
	 * @param end the upper bound of the range of rp dashboard trung binhs (not inclusive)
	 * @return the range of rp dashboard trung binhs
	 */
	@Override
	public java.util.List<drg.moh.service.model.RpDashboardTrungBinh>
		getRpDashboardTrungBinhs(int start, int end) {

		return _rpDashboardTrungBinhLocalService.getRpDashboardTrungBinhs(
			start, end);
	}

	/**
	 * Returns the number of rp dashboard trung binhs.
	 *
	 * @return the number of rp dashboard trung binhs
	 */
	@Override
	public int getRpDashboardTrungBinhsCount() {
		return _rpDashboardTrungBinhLocalService.
			getRpDashboardTrungBinhsCount();
	}

	@Override
	public String getTrungBinh4ChiPhi(String maDonVi, int type, int getBy) {
		return _rpDashboardTrungBinhLocalService.getTrungBinh4ChiPhi(
			maDonVi, type, getBy);
	}

	@Override
	public String getTrungBinh4CMI(String maDonVi, int type, int getBy) {
		return _rpDashboardTrungBinhLocalService.getTrungBinh4CMI(
			maDonVi, type, getBy);
	}

	@Override
	public String getTrungBinh4DinhSuat(String maDonVi, int type, int getBy) {
		return _rpDashboardTrungBinhLocalService.getTrungBinh4DinhSuat(
			maDonVi, type, getBy);
	}

	@Override
	public String getTrungBinh4Drg(String maDonVi, int type, int getBy) {
		return _rpDashboardTrungBinhLocalService.getTrungBinh4Drg(
			maDonVi, type, getBy);
	}

	/**
	 * Updates the rp dashboard trung binh in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardTrungBinhLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardTrungBinh the rp dashboard trung binh
	 * @return the rp dashboard trung binh that was updated
	 */
	@Override
	public drg.moh.service.model.RpDashboardTrungBinh
		updateRpDashboardTrungBinh(
			drg.moh.service.model.RpDashboardTrungBinh rpDashboardTrungBinh) {

		return _rpDashboardTrungBinhLocalService.updateRpDashboardTrungBinh(
			rpDashboardTrungBinh);
	}

	@Override
	public RpDashboardTrungBinhLocalService getWrappedService() {
		return _rpDashboardTrungBinhLocalService;
	}

	@Override
	public void setWrappedService(
		RpDashboardTrungBinhLocalService rpDashboardTrungBinhLocalService) {

		_rpDashboardTrungBinhLocalService = rpDashboardTrungBinhLocalService;
	}

	private RpDashboardTrungBinhLocalService _rpDashboardTrungBinhLocalService;

}