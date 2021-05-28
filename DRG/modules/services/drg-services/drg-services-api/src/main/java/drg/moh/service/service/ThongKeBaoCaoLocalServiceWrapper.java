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
 * Provides a wrapper for {@link ThongKeBaoCaoLocalService}.
 *
 * @author SON
 * @see ThongKeBaoCaoLocalService
 * @generated
 */
public class ThongKeBaoCaoLocalServiceWrapper
	implements ServiceWrapper<ThongKeBaoCaoLocalService>,
			   ThongKeBaoCaoLocalService {

	public ThongKeBaoCaoLocalServiceWrapper(
		ThongKeBaoCaoLocalService thongKeBaoCaoLocalService) {

		_thongKeBaoCaoLocalService = thongKeBaoCaoLocalService;
	}

	/**
	 * Adds the thong ke bao cao to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ThongKeBaoCaoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param thongKeBaoCao the thong ke bao cao
	 * @return the thong ke bao cao that was added
	 */
	@Override
	public drg.moh.service.model.ThongKeBaoCao addThongKeBaoCao(
		drg.moh.service.model.ThongKeBaoCao thongKeBaoCao) {

		return _thongKeBaoCaoLocalService.addThongKeBaoCao(thongKeBaoCao);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _thongKeBaoCaoLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new thong ke bao cao with the primary key. Does not add the thong ke bao cao to the database.
	 *
	 * @param id the primary key for the new thong ke bao cao
	 * @return the new thong ke bao cao
	 */
	@Override
	public drg.moh.service.model.ThongKeBaoCao createThongKeBaoCao(long id) {
		return _thongKeBaoCaoLocalService.createThongKeBaoCao(id);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _thongKeBaoCaoLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the thong ke bao cao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ThongKeBaoCaoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the thong ke bao cao
	 * @return the thong ke bao cao that was removed
	 * @throws PortalException if a thong ke bao cao with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.ThongKeBaoCao deleteThongKeBaoCao(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _thongKeBaoCaoLocalService.deleteThongKeBaoCao(id);
	}

	/**
	 * Deletes the thong ke bao cao from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ThongKeBaoCaoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param thongKeBaoCao the thong ke bao cao
	 * @return the thong ke bao cao that was removed
	 */
	@Override
	public drg.moh.service.model.ThongKeBaoCao deleteThongKeBaoCao(
		drg.moh.service.model.ThongKeBaoCao thongKeBaoCao) {

		return _thongKeBaoCaoLocalService.deleteThongKeBaoCao(thongKeBaoCao);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _thongKeBaoCaoLocalService.dslQuery(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _thongKeBaoCaoLocalService.dynamicQuery();
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

		return _thongKeBaoCaoLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.ThongKeBaoCaoModelImpl</code>.
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

		return _thongKeBaoCaoLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.ThongKeBaoCaoModelImpl</code>.
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

		return _thongKeBaoCaoLocalService.dynamicQuery(
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

		return _thongKeBaoCaoLocalService.dynamicQueryCount(dynamicQuery);
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

		return _thongKeBaoCaoLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public drg.moh.service.model.ThongKeBaoCao fetchThongKeBaoCao(long id) {
		return _thongKeBaoCaoLocalService.fetchThongKeBaoCao(id);
	}

	@Override
	public java.util.List<drg.moh.service.model.ThongKeBaoCao> findByNam(
		int nam) {

		return _thongKeBaoCaoLocalService.findByNam(nam);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _thongKeBaoCaoLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _thongKeBaoCaoLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _thongKeBaoCaoLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _thongKeBaoCaoLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the thong ke bao cao with the primary key.
	 *
	 * @param id the primary key of the thong ke bao cao
	 * @return the thong ke bao cao
	 * @throws PortalException if a thong ke bao cao with the primary key could not be found
	 */
	@Override
	public drg.moh.service.model.ThongKeBaoCao getThongKeBaoCao(long id)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _thongKeBaoCaoLocalService.getThongKeBaoCao(id);
	}

	/**
	 * Returns a range of all the thong ke bao caos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.ThongKeBaoCaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong ke bao caos
	 * @param end the upper bound of the range of thong ke bao caos (not inclusive)
	 * @return the range of thong ke bao caos
	 */
	@Override
	public java.util.List<drg.moh.service.model.ThongKeBaoCao>
		getThongKeBaoCaos(int start, int end) {

		return _thongKeBaoCaoLocalService.getThongKeBaoCaos(start, end);
	}

	/**
	 * Returns the number of thong ke bao caos.
	 *
	 * @return the number of thong ke bao caos
	 */
	@Override
	public int getThongKeBaoCaosCount() {
		return _thongKeBaoCaoLocalService.getThongKeBaoCaosCount();
	}

	/**
	 * Updates the thong ke bao cao in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect ThongKeBaoCaoLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param thongKeBaoCao the thong ke bao cao
	 * @return the thong ke bao cao that was updated
	 */
	@Override
	public drg.moh.service.model.ThongKeBaoCao updateThongKeBaoCao(
		drg.moh.service.model.ThongKeBaoCao thongKeBaoCao) {

		return _thongKeBaoCaoLocalService.updateThongKeBaoCao(thongKeBaoCao);
	}

	@Override
	public ThongKeBaoCaoLocalService getWrappedService() {
		return _thongKeBaoCaoLocalService;
	}

	@Override
	public void setWrappedService(
		ThongKeBaoCaoLocalService thongKeBaoCaoLocalService) {

		_thongKeBaoCaoLocalService = thongKeBaoCaoLocalService;
	}

	private ThongKeBaoCaoLocalService _thongKeBaoCaoLocalService;

}