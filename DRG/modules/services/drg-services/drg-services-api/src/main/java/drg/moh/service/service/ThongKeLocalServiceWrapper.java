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
 * Provides a wrapper for {@link ThongKeLocalService}.
 *
 * @author SON
 * @see ThongKeLocalService
 * @generated
 */
public class ThongKeLocalServiceWrapper
	implements ServiceWrapper<ThongKeLocalService>, ThongKeLocalService {

	public ThongKeLocalServiceWrapper(ThongKeLocalService thongKeLocalService) {
		_thongKeLocalService = thongKeLocalService;
	}

	/**
	 * Adds the thong ke to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ThongKeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param thongKe the thong ke
	 * @return the thong ke that was added
	 */
	@Override
	public drg.moh.service.model.ThongKe addThongKe(
		drg.moh.service.model.ThongKe thongKe) {

		return _thongKeLocalService.addThongKe(thongKe);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _thongKeLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new thong ke with the primary key. Does not add the thong ke to the database.
	 *
	 * @param id the primary key for the new thong ke
	 * @return the new thong ke
	 */
	@Override
	public drg.moh.service.model.ThongKe createThongKe(long id) {
		return _thongKeLocalService.createThongKe(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _thongKeLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the thong ke with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ThongKeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the thong ke
	 * @return the thong ke that was removed
	 * @throws PortalException if a thong ke with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.ThongKe deleteThongKe(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _thongKeLocalService.deleteThongKe(id);
	}

	/**
	 * Deletes the thong ke from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ThongKeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param thongKe the thong ke
	 * @return the thong ke that was removed
	 */
	@Override
	public drg.moh.service.model.ThongKe deleteThongKe(
		drg.moh.service.model.ThongKe thongKe) {

		return _thongKeLocalService.deleteThongKe(thongKe);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _thongKeLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _thongKeLocalService.dynamicQuery();
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

		return _thongKeLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.ThongKeModelImpl</code>.
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

		return _thongKeLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.ThongKeModelImpl</code>.
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

		return _thongKeLocalService.dynamicQuery(
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

		return _thongKeLocalService.dynamicQueryCount(dynamicQuery);
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

		return _thongKeLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.ThongKe fetchThongKe(long id) {
		return _thongKeLocalService.fetchThongKe(id);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _thongKeLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _thongKeLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _thongKeLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _thongKeLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the thong ke with the primary key.
	 *
	 * @param id the primary key of the thong ke
	 * @return the thong ke
	 * @throws PortalException if a thong ke with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.ThongKe getThongKe(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _thongKeLocalService.getThongKe(id);
	}

	/**
	 * Returns a range of all the thong kes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.ThongKeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong kes
	 * @param end the upper bound of the range of thong kes (not inclusive)
	 * @return the range of thong kes
	 */
	@Override
	public java.util.List<drg.moh.service.model.ThongKe> getThongKes(
		int start, int end) {

		return _thongKeLocalService.getThongKes(start, end);
	}

	/**
	 * Returns the number of thong kes.
	 *
	 * @return the number of thong kes
	 */
	@Override
	public int getThongKesCount() {
		return _thongKeLocalService.getThongKesCount();
	}

	/**
	 * Updates the thong ke in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ThongKeLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param thongKe the thong ke
	 * @return the thong ke that was updated
	 */
	@Override
	public drg.moh.service.model.ThongKe updateThongKe(
		drg.moh.service.model.ThongKe thongKe) {

		return _thongKeLocalService.updateThongKe(thongKe);
	}

	@Override
	public ThongKeLocalService getWrappedService() {
		return _thongKeLocalService;
	}

	@Override
	public void setWrappedService(ThongKeLocalService thongKeLocalService) {
		_thongKeLocalService = thongKeLocalService;
	}

	private ThongKeLocalService _thongKeLocalService;

}