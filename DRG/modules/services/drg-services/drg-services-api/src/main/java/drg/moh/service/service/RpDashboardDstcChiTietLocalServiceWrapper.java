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
 * Provides a wrapper for {@link RpDashboardDstcChiTietLocalService}.
 *
 * @author SON
 * @see RpDashboardDstcChiTietLocalService
 * @generated
 */
public class RpDashboardDstcChiTietLocalServiceWrapper
	implements RpDashboardDstcChiTietLocalService,
			   ServiceWrapper<RpDashboardDstcChiTietLocalService> {

	public RpDashboardDstcChiTietLocalServiceWrapper(
		RpDashboardDstcChiTietLocalService rpDashboardDstcChiTietLocalService) {

		_rpDashboardDstcChiTietLocalService =
			rpDashboardDstcChiTietLocalService;
	}

	/**
	 * Adds the rp dashboard dstc chi tiet to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDstcChiTietLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDstcChiTiet the rp dashboard dstc chi tiet
	 * @return the rp dashboard dstc chi tiet that was added
	 */
	@Override
	public drg.moh.service.model.RpDashboardDstcChiTiet
		addRpDashboardDstcChiTiet(
			drg.moh.service.model.RpDashboardDstcChiTiet
				rpDashboardDstcChiTiet) {

		return _rpDashboardDstcChiTietLocalService.addRpDashboardDstcChiTiet(
			rpDashboardDstcChiTiet);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDstcChiTietLocalService.createPersistedModel(
			primaryKeyObj);
	}

	/**
	 * Creates a new rp dashboard dstc chi tiet with the primary key. Does not add the rp dashboard dstc chi tiet to the database.
	 *
	 * @param id the primary key for the new rp dashboard dstc chi tiet
	 * @return the new rp dashboard dstc chi tiet
	 */
	@Override
	public drg.moh.service.model.RpDashboardDstcChiTiet
		createRpDashboardDstcChiTiet(String id) {

		return _rpDashboardDstcChiTietLocalService.createRpDashboardDstcChiTiet(
			id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDstcChiTietLocalService.deletePersistedModel(
			persistedModel);
	}

	/**
	 * Deletes the rp dashboard dstc chi tiet from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDstcChiTietLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDstcChiTiet the rp dashboard dstc chi tiet
	 * @return the rp dashboard dstc chi tiet that was removed
	 */
	@Override
	public drg.moh.service.model.RpDashboardDstcChiTiet
		deleteRpDashboardDstcChiTiet(
			drg.moh.service.model.RpDashboardDstcChiTiet
				rpDashboardDstcChiTiet) {

		return _rpDashboardDstcChiTietLocalService.deleteRpDashboardDstcChiTiet(
			rpDashboardDstcChiTiet);
	}

	/**
	 * Deletes the rp dashboard dstc chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDstcChiTietLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the rp dashboard dstc chi tiet
	 * @return the rp dashboard dstc chi tiet that was removed
	 * @throws PortalException if a rp dashboard dstc chi tiet with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardDstcChiTiet
			deleteRpDashboardDstcChiTiet(String id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDstcChiTietLocalService.deleteRpDashboardDstcChiTiet(
			id);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _rpDashboardDstcChiTietLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _rpDashboardDstcChiTietLocalService.dynamicQuery();
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

		return _rpDashboardDstcChiTietLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDstcChiTietModelImpl</code>.
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

		return _rpDashboardDstcChiTietLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDstcChiTietModelImpl</code>.
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

		return _rpDashboardDstcChiTietLocalService.dynamicQuery(
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

		return _rpDashboardDstcChiTietLocalService.dynamicQueryCount(
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

		return _rpDashboardDstcChiTietLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.RpDashboardDstcChiTiet
		fetchRpDashboardDstcChiTiet(String id) {

		return _rpDashboardDstcChiTietLocalService.fetchRpDashboardDstcChiTiet(
			id);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _rpDashboardDstcChiTietLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDstcChiTietLocalService.getPersistedModel(
			primaryKeyObj);
	}

	@Override
	public java.util.List<drg.moh.service.model.RpDashboardDstcChiTiet>
		getReportDinhSuatChiTiet(long tinhId, int type, int thang) {

		return _rpDashboardDstcChiTietLocalService.getReportDinhSuatChiTiet(
			tinhId, type, thang);
	}

	/**
	 * Returns the rp dashboard dstc chi tiet with the primary key.
	 *
	 * @param id the primary key of the rp dashboard dstc chi tiet
	 * @return the rp dashboard dstc chi tiet
	 * @throws PortalException if a rp dashboard dstc chi tiet with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.RpDashboardDstcChiTiet
			getRpDashboardDstcChiTiet(String id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _rpDashboardDstcChiTietLocalService.getRpDashboardDstcChiTiet(
			id);
	}

	/**
	 * Returns a range of all the rp dashboard dstc chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.RpDashboardDstcChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dstc chi tiets
	 * @param end the upper bound of the range of rp dashboard dstc chi tiets (not inclusive)
	 * @return the range of rp dashboard dstc chi tiets
	 */
	@Override
	public java.util.List<drg.moh.service.model.RpDashboardDstcChiTiet>
		getRpDashboardDstcChiTiets(int start, int end) {

		return _rpDashboardDstcChiTietLocalService.getRpDashboardDstcChiTiets(
			start, end);
	}

	/**
	 * Returns the number of rp dashboard dstc chi tiets.
	 *
	 * @return the number of rp dashboard dstc chi tiets
	 */
	@Override
	public int getRpDashboardDstcChiTietsCount() {
		return _rpDashboardDstcChiTietLocalService.
			getRpDashboardDstcChiTietsCount();
	}

	/**
	 * Updates the rp dashboard dstc chi tiet in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect RpDashboardDstcChiTietLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param rpDashboardDstcChiTiet the rp dashboard dstc chi tiet
	 * @return the rp dashboard dstc chi tiet that was updated
	 */
	@Override
	public drg.moh.service.model.RpDashboardDstcChiTiet
		updateRpDashboardDstcChiTiet(
			drg.moh.service.model.RpDashboardDstcChiTiet
				rpDashboardDstcChiTiet) {

		return _rpDashboardDstcChiTietLocalService.updateRpDashboardDstcChiTiet(
			rpDashboardDstcChiTiet);
	}

	@Override
	public RpDashboardDstcChiTietLocalService getWrappedService() {
		return _rpDashboardDstcChiTietLocalService;
	}

	@Override
	public void setWrappedService(
		RpDashboardDstcChiTietLocalService rpDashboardDstcChiTietLocalService) {

		_rpDashboardDstcChiTietLocalService =
			rpDashboardDstcChiTietLocalService;
	}

	private RpDashboardDstcChiTietLocalService
		_rpDashboardDstcChiTietLocalService;

}