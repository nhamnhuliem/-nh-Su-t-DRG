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

package drg.moh.service.service.base;

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.dao.db.DB;
import com.liferay.portal.kernel.dao.db.DBManagerUtil;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DefaultActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.module.framework.service.IdentifiableOSGiService;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalServiceImpl;
import com.liferay.portal.kernel.service.PersistedModelLocalServiceRegistry;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.ClassNamePersistence;
import com.liferay.portal.kernel.service.persistence.UserPersistence;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import drg.moh.service.model.DashboardChiPhiHoatDong;
import drg.moh.service.service.DashboardChiPhiHoatDongLocalService;
import drg.moh.service.service.DashboardChiPhiHoatDongLocalServiceUtil;
import drg.moh.service.service.persistence.DashboardBaoHiemFinder;
import drg.moh.service.service.persistence.DashboardBaoHiemPersistence;
import drg.moh.service.service.persistence.DashboardCMIPersistence;
import drg.moh.service.service.persistence.DashboardChiPhiBinhQuanPersistence;
import drg.moh.service.service.persistence.DashboardChiPhiHoatDongFinder;
import drg.moh.service.service.persistence.DashboardChiPhiHoatDongPersistence;
import drg.moh.service.service.persistence.DashboardChiPhiThanhPhanPersistence;
import drg.moh.service.service.persistence.DashboardDinhSuatPersistence;
import drg.moh.service.service.persistence.RpDashboardChiPhiBinhQuanFinder;
import drg.moh.service.service.persistence.RpDashboardChiPhiBinhQuanPersistence;
import drg.moh.service.service.persistence.RpDashboardCmi2Finder;
import drg.moh.service.service.persistence.RpDashboardCmi2Persistence;
import drg.moh.service.service.persistence.RpDashboardCmi3Finder;
import drg.moh.service.service.persistence.RpDashboardCmi3Persistence;
import drg.moh.service.service.persistence.RpDashboardCmiFinder;
import drg.moh.service.service.persistence.RpDashboardCmiPersistence;
import drg.moh.service.service.persistence.RpDashboardCphdFinder;
import drg.moh.service.service.persistence.RpDashboardCphdPersistence;
import drg.moh.service.service.persistence.RpDashboardDRGFinder;
import drg.moh.service.service.persistence.RpDashboardDRGPersistence;
import drg.moh.service.service.persistence.RpDashboardDinhSuatChiTietFinder;
import drg.moh.service.service.persistence.RpDashboardDinhSuatChiTietPersistence;
import drg.moh.service.service.persistence.RpDashboardDstcChiTietFinder;
import drg.moh.service.service.persistence.RpDashboardDstcChiTietPersistence;
import drg.moh.service.service.persistence.RpDashboardDstcFinder;
import drg.moh.service.service.persistence.RpDashboardDstcPersistence;
import drg.moh.service.service.persistence.RpDashboardTrungBinhFinder;
import drg.moh.service.service.persistence.RpDashboardTrungBinhPersistence;
import drg.moh.service.service.persistence.ThongKeBaoCaoPersistence;
import drg.moh.service.service.persistence.ThongKePersistence;
import drg.moh.service.service.persistence.ViewDanhSachBenhAnFinder;
import drg.moh.service.service.persistence.ViewDanhSachBenhAnPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;

import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the dashboard chi phi hoat dong local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link drg.moh.service.service.impl.DashboardChiPhiHoatDongLocalServiceImpl}.
 * </p>
 *
 * @author SON
 * @see drg.moh.service.service.impl.DashboardChiPhiHoatDongLocalServiceImpl
 * @generated
 */
public abstract class DashboardChiPhiHoatDongLocalServiceBaseImpl
	extends BaseLocalServiceImpl
	implements DashboardChiPhiHoatDongLocalService, IdentifiableOSGiService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Use <code>DashboardChiPhiHoatDongLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>DashboardChiPhiHoatDongLocalServiceUtil</code>.
	 */

	/**
	 * Adds the dashboard chi phi hoat dong to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiHoatDongLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardChiPhiHoatDong the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DashboardChiPhiHoatDong addDashboardChiPhiHoatDong(
		DashboardChiPhiHoatDong dashboardChiPhiHoatDong) {

		dashboardChiPhiHoatDong.setNew(true);

		return dashboardChiPhiHoatDongPersistence.update(
			dashboardChiPhiHoatDong);
	}

	/**
	 * Creates a new dashboard chi phi hoat dong with the primary key. Does not add the dashboard chi phi hoat dong to the database.
	 *
	 * @param id the primary key for the new dashboard chi phi hoat dong
	 * @return the new dashboard chi phi hoat dong
	 */
	@Override
	@Transactional(enabled = false)
	public DashboardChiPhiHoatDong createDashboardChiPhiHoatDong(long id) {
		return dashboardChiPhiHoatDongPersistence.create(id);
	}

	/**
	 * Deletes the dashboard chi phi hoat dong with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiHoatDongLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param id the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong that was removed
	 * @throws PortalException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DashboardChiPhiHoatDong deleteDashboardChiPhiHoatDong(long id)
		throws PortalException {

		return dashboardChiPhiHoatDongPersistence.remove(id);
	}

	/**
	 * Deletes the dashboard chi phi hoat dong from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiHoatDongLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardChiPhiHoatDong the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	@Override
	public DashboardChiPhiHoatDong deleteDashboardChiPhiHoatDong(
		DashboardChiPhiHoatDong dashboardChiPhiHoatDong) {

		return dashboardChiPhiHoatDongPersistence.remove(
			dashboardChiPhiHoatDong);
	}

	@Override
	public <T> T dslQuery(DSLQuery dslQuery) {
		return dashboardChiPhiHoatDongPersistence.dslQuery(dslQuery);
	}

	@Override
	public DynamicQuery dynamicQuery() {
		Class<?> clazz = getClass();

		return DynamicQueryFactoryUtil.forClass(
			DashboardChiPhiHoatDong.class, clazz.getClassLoader());
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return dashboardChiPhiHoatDongPersistence.findWithDynamicQuery(
			dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return dashboardChiPhiHoatDongPersistence.findWithDynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return dashboardChiPhiHoatDongPersistence.findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return dashboardChiPhiHoatDongPersistence.countWithDynamicQuery(
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
		DynamicQuery dynamicQuery, Projection projection) {

		return dashboardChiPhiHoatDongPersistence.countWithDynamicQuery(
			dynamicQuery, projection);
	}

	@Override
	public DashboardChiPhiHoatDong fetchDashboardChiPhiHoatDong(long id) {
		return dashboardChiPhiHoatDongPersistence.fetchByPrimaryKey(id);
	}

	/**
	 * Returns the dashboard chi phi hoat dong with the primary key.
	 *
	 * @param id the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong
	 * @throws PortalException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiHoatDong getDashboardChiPhiHoatDong(long id)
		throws PortalException {

		return dashboardChiPhiHoatDongPersistence.findByPrimaryKey(id);
	}

	@Override
	public ActionableDynamicQuery getActionableDynamicQuery() {
		ActionableDynamicQuery actionableDynamicQuery =
			new DefaultActionableDynamicQuery();

		actionableDynamicQuery.setBaseLocalService(
			dashboardChiPhiHoatDongLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(DashboardChiPhiHoatDong.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return actionableDynamicQuery;
	}

	@Override
	public IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		IndexableActionableDynamicQuery indexableActionableDynamicQuery =
			new IndexableActionableDynamicQuery();

		indexableActionableDynamicQuery.setBaseLocalService(
			dashboardChiPhiHoatDongLocalService);
		indexableActionableDynamicQuery.setClassLoader(getClassLoader());
		indexableActionableDynamicQuery.setModelClass(
			DashboardChiPhiHoatDong.class);

		indexableActionableDynamicQuery.setPrimaryKeyPropertyName("id");

		return indexableActionableDynamicQuery;
	}

	protected void initActionableDynamicQuery(
		ActionableDynamicQuery actionableDynamicQuery) {

		actionableDynamicQuery.setBaseLocalService(
			dashboardChiPhiHoatDongLocalService);
		actionableDynamicQuery.setClassLoader(getClassLoader());
		actionableDynamicQuery.setModelClass(DashboardChiPhiHoatDong.class);

		actionableDynamicQuery.setPrimaryKeyPropertyName("id");
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return dashboardChiPhiHoatDongPersistence.create(
			((Long)primaryKeyObj).longValue());
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException {

		return dashboardChiPhiHoatDongLocalService.
			deleteDashboardChiPhiHoatDong(
				(DashboardChiPhiHoatDong)persistedModel);
	}

	@Override
	public BasePersistence<DashboardChiPhiHoatDong> getBasePersistence() {
		return dashboardChiPhiHoatDongPersistence;
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return dashboardChiPhiHoatDongPersistence.findByPrimaryKey(
			primaryKeyObj);
	}

	/**
	 * Returns a range of all the dashboard chi phi hoat dongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>drg.moh.service.model.impl.DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @return the range of dashboard chi phi hoat dongs
	 */
	@Override
	public List<DashboardChiPhiHoatDong> getDashboardChiPhiHoatDongs(
		int start, int end) {

		return dashboardChiPhiHoatDongPersistence.findAll(start, end);
	}

	/**
	 * Returns the number of dashboard chi phi hoat dongs.
	 *
	 * @return the number of dashboard chi phi hoat dongs
	 */
	@Override
	public int getDashboardChiPhiHoatDongsCount() {
		return dashboardChiPhiHoatDongPersistence.countAll();
	}

	/**
	 * Updates the dashboard chi phi hoat dong in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect DashboardChiPhiHoatDongLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param dashboardChiPhiHoatDong the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	@Override
	public DashboardChiPhiHoatDong updateDashboardChiPhiHoatDong(
		DashboardChiPhiHoatDong dashboardChiPhiHoatDong) {

		return dashboardChiPhiHoatDongPersistence.update(
			dashboardChiPhiHoatDong);
	}

	/**
	 * Returns the dashboard bao hiem local service.
	 *
	 * @return the dashboard bao hiem local service
	 */
	public drg.moh.service.service.DashboardBaoHiemLocalService
		getDashboardBaoHiemLocalService() {

		return dashboardBaoHiemLocalService;
	}

	/**
	 * Sets the dashboard bao hiem local service.
	 *
	 * @param dashboardBaoHiemLocalService the dashboard bao hiem local service
	 */
	public void setDashboardBaoHiemLocalService(
		drg.moh.service.service.DashboardBaoHiemLocalService
			dashboardBaoHiemLocalService) {

		this.dashboardBaoHiemLocalService = dashboardBaoHiemLocalService;
	}

	/**
	 * Returns the dashboard bao hiem persistence.
	 *
	 * @return the dashboard bao hiem persistence
	 */
	public DashboardBaoHiemPersistence getDashboardBaoHiemPersistence() {
		return dashboardBaoHiemPersistence;
	}

	/**
	 * Sets the dashboard bao hiem persistence.
	 *
	 * @param dashboardBaoHiemPersistence the dashboard bao hiem persistence
	 */
	public void setDashboardBaoHiemPersistence(
		DashboardBaoHiemPersistence dashboardBaoHiemPersistence) {

		this.dashboardBaoHiemPersistence = dashboardBaoHiemPersistence;
	}

	/**
	 * Returns the dashboard bao hiem finder.
	 *
	 * @return the dashboard bao hiem finder
	 */
	public DashboardBaoHiemFinder getDashboardBaoHiemFinder() {
		return dashboardBaoHiemFinder;
	}

	/**
	 * Sets the dashboard bao hiem finder.
	 *
	 * @param dashboardBaoHiemFinder the dashboard bao hiem finder
	 */
	public void setDashboardBaoHiemFinder(
		DashboardBaoHiemFinder dashboardBaoHiemFinder) {

		this.dashboardBaoHiemFinder = dashboardBaoHiemFinder;
	}

	/**
	 * Returns the dashboard chi phi binh quan local service.
	 *
	 * @return the dashboard chi phi binh quan local service
	 */
	public drg.moh.service.service.DashboardChiPhiBinhQuanLocalService
		getDashboardChiPhiBinhQuanLocalService() {

		return dashboardChiPhiBinhQuanLocalService;
	}

	/**
	 * Sets the dashboard chi phi binh quan local service.
	 *
	 * @param dashboardChiPhiBinhQuanLocalService the dashboard chi phi binh quan local service
	 */
	public void setDashboardChiPhiBinhQuanLocalService(
		drg.moh.service.service.DashboardChiPhiBinhQuanLocalService
			dashboardChiPhiBinhQuanLocalService) {

		this.dashboardChiPhiBinhQuanLocalService =
			dashboardChiPhiBinhQuanLocalService;
	}

	/**
	 * Returns the dashboard chi phi binh quan persistence.
	 *
	 * @return the dashboard chi phi binh quan persistence
	 */
	public DashboardChiPhiBinhQuanPersistence
		getDashboardChiPhiBinhQuanPersistence() {

		return dashboardChiPhiBinhQuanPersistence;
	}

	/**
	 * Sets the dashboard chi phi binh quan persistence.
	 *
	 * @param dashboardChiPhiBinhQuanPersistence the dashboard chi phi binh quan persistence
	 */
	public void setDashboardChiPhiBinhQuanPersistence(
		DashboardChiPhiBinhQuanPersistence dashboardChiPhiBinhQuanPersistence) {

		this.dashboardChiPhiBinhQuanPersistence =
			dashboardChiPhiBinhQuanPersistence;
	}

	/**
	 * Returns the dashboard chi phi hoat dong local service.
	 *
	 * @return the dashboard chi phi hoat dong local service
	 */
	public DashboardChiPhiHoatDongLocalService
		getDashboardChiPhiHoatDongLocalService() {

		return dashboardChiPhiHoatDongLocalService;
	}

	/**
	 * Sets the dashboard chi phi hoat dong local service.
	 *
	 * @param dashboardChiPhiHoatDongLocalService the dashboard chi phi hoat dong local service
	 */
	public void setDashboardChiPhiHoatDongLocalService(
		DashboardChiPhiHoatDongLocalService
			dashboardChiPhiHoatDongLocalService) {

		this.dashboardChiPhiHoatDongLocalService =
			dashboardChiPhiHoatDongLocalService;
	}

	/**
	 * Returns the dashboard chi phi hoat dong persistence.
	 *
	 * @return the dashboard chi phi hoat dong persistence
	 */
	public DashboardChiPhiHoatDongPersistence
		getDashboardChiPhiHoatDongPersistence() {

		return dashboardChiPhiHoatDongPersistence;
	}

	/**
	 * Sets the dashboard chi phi hoat dong persistence.
	 *
	 * @param dashboardChiPhiHoatDongPersistence the dashboard chi phi hoat dong persistence
	 */
	public void setDashboardChiPhiHoatDongPersistence(
		DashboardChiPhiHoatDongPersistence dashboardChiPhiHoatDongPersistence) {

		this.dashboardChiPhiHoatDongPersistence =
			dashboardChiPhiHoatDongPersistence;
	}

	/**
	 * Returns the dashboard chi phi hoat dong finder.
	 *
	 * @return the dashboard chi phi hoat dong finder
	 */
	public DashboardChiPhiHoatDongFinder getDashboardChiPhiHoatDongFinder() {
		return dashboardChiPhiHoatDongFinder;
	}

	/**
	 * Sets the dashboard chi phi hoat dong finder.
	 *
	 * @param dashboardChiPhiHoatDongFinder the dashboard chi phi hoat dong finder
	 */
	public void setDashboardChiPhiHoatDongFinder(
		DashboardChiPhiHoatDongFinder dashboardChiPhiHoatDongFinder) {

		this.dashboardChiPhiHoatDongFinder = dashboardChiPhiHoatDongFinder;
	}

	/**
	 * Returns the dashboard chi phi thanh phan local service.
	 *
	 * @return the dashboard chi phi thanh phan local service
	 */
	public drg.moh.service.service.DashboardChiPhiThanhPhanLocalService
		getDashboardChiPhiThanhPhanLocalService() {

		return dashboardChiPhiThanhPhanLocalService;
	}

	/**
	 * Sets the dashboard chi phi thanh phan local service.
	 *
	 * @param dashboardChiPhiThanhPhanLocalService the dashboard chi phi thanh phan local service
	 */
	public void setDashboardChiPhiThanhPhanLocalService(
		drg.moh.service.service.DashboardChiPhiThanhPhanLocalService
			dashboardChiPhiThanhPhanLocalService) {

		this.dashboardChiPhiThanhPhanLocalService =
			dashboardChiPhiThanhPhanLocalService;
	}

	/**
	 * Returns the dashboard chi phi thanh phan persistence.
	 *
	 * @return the dashboard chi phi thanh phan persistence
	 */
	public DashboardChiPhiThanhPhanPersistence
		getDashboardChiPhiThanhPhanPersistence() {

		return dashboardChiPhiThanhPhanPersistence;
	}

	/**
	 * Sets the dashboard chi phi thanh phan persistence.
	 *
	 * @param dashboardChiPhiThanhPhanPersistence the dashboard chi phi thanh phan persistence
	 */
	public void setDashboardChiPhiThanhPhanPersistence(
		DashboardChiPhiThanhPhanPersistence
			dashboardChiPhiThanhPhanPersistence) {

		this.dashboardChiPhiThanhPhanPersistence =
			dashboardChiPhiThanhPhanPersistence;
	}

	/**
	 * Returns the dashboard cmi local service.
	 *
	 * @return the dashboard cmi local service
	 */
	public drg.moh.service.service.DashboardCMILocalService
		getDashboardCMILocalService() {

		return dashboardCMILocalService;
	}

	/**
	 * Sets the dashboard cmi local service.
	 *
	 * @param dashboardCMILocalService the dashboard cmi local service
	 */
	public void setDashboardCMILocalService(
		drg.moh.service.service.DashboardCMILocalService
			dashboardCMILocalService) {

		this.dashboardCMILocalService = dashboardCMILocalService;
	}

	/**
	 * Returns the dashboard cmi persistence.
	 *
	 * @return the dashboard cmi persistence
	 */
	public DashboardCMIPersistence getDashboardCMIPersistence() {
		return dashboardCMIPersistence;
	}

	/**
	 * Sets the dashboard cmi persistence.
	 *
	 * @param dashboardCMIPersistence the dashboard cmi persistence
	 */
	public void setDashboardCMIPersistence(
		DashboardCMIPersistence dashboardCMIPersistence) {

		this.dashboardCMIPersistence = dashboardCMIPersistence;
	}

	/**
	 * Returns the dashboard dinh suat local service.
	 *
	 * @return the dashboard dinh suat local service
	 */
	public drg.moh.service.service.DashboardDinhSuatLocalService
		getDashboardDinhSuatLocalService() {

		return dashboardDinhSuatLocalService;
	}

	/**
	 * Sets the dashboard dinh suat local service.
	 *
	 * @param dashboardDinhSuatLocalService the dashboard dinh suat local service
	 */
	public void setDashboardDinhSuatLocalService(
		drg.moh.service.service.DashboardDinhSuatLocalService
			dashboardDinhSuatLocalService) {

		this.dashboardDinhSuatLocalService = dashboardDinhSuatLocalService;
	}

	/**
	 * Returns the dashboard dinh suat persistence.
	 *
	 * @return the dashboard dinh suat persistence
	 */
	public DashboardDinhSuatPersistence getDashboardDinhSuatPersistence() {
		return dashboardDinhSuatPersistence;
	}

	/**
	 * Sets the dashboard dinh suat persistence.
	 *
	 * @param dashboardDinhSuatPersistence the dashboard dinh suat persistence
	 */
	public void setDashboardDinhSuatPersistence(
		DashboardDinhSuatPersistence dashboardDinhSuatPersistence) {

		this.dashboardDinhSuatPersistence = dashboardDinhSuatPersistence;
	}

	/**
	 * Returns the rp dashboard chi phi binh quan local service.
	 *
	 * @return the rp dashboard chi phi binh quan local service
	 */
	public drg.moh.service.service.RpDashboardChiPhiBinhQuanLocalService
		getRpDashboardChiPhiBinhQuanLocalService() {

		return rpDashboardChiPhiBinhQuanLocalService;
	}

	/**
	 * Sets the rp dashboard chi phi binh quan local service.
	 *
	 * @param rpDashboardChiPhiBinhQuanLocalService the rp dashboard chi phi binh quan local service
	 */
	public void setRpDashboardChiPhiBinhQuanLocalService(
		drg.moh.service.service.RpDashboardChiPhiBinhQuanLocalService
			rpDashboardChiPhiBinhQuanLocalService) {

		this.rpDashboardChiPhiBinhQuanLocalService =
			rpDashboardChiPhiBinhQuanLocalService;
	}

	/**
	 * Returns the rp dashboard chi phi binh quan persistence.
	 *
	 * @return the rp dashboard chi phi binh quan persistence
	 */
	public RpDashboardChiPhiBinhQuanPersistence
		getRpDashboardChiPhiBinhQuanPersistence() {

		return rpDashboardChiPhiBinhQuanPersistence;
	}

	/**
	 * Sets the rp dashboard chi phi binh quan persistence.
	 *
	 * @param rpDashboardChiPhiBinhQuanPersistence the rp dashboard chi phi binh quan persistence
	 */
	public void setRpDashboardChiPhiBinhQuanPersistence(
		RpDashboardChiPhiBinhQuanPersistence
			rpDashboardChiPhiBinhQuanPersistence) {

		this.rpDashboardChiPhiBinhQuanPersistence =
			rpDashboardChiPhiBinhQuanPersistence;
	}

	/**
	 * Returns the rp dashboard chi phi binh quan finder.
	 *
	 * @return the rp dashboard chi phi binh quan finder
	 */
	public RpDashboardChiPhiBinhQuanFinder
		getRpDashboardChiPhiBinhQuanFinder() {

		return rpDashboardChiPhiBinhQuanFinder;
	}

	/**
	 * Sets the rp dashboard chi phi binh quan finder.
	 *
	 * @param rpDashboardChiPhiBinhQuanFinder the rp dashboard chi phi binh quan finder
	 */
	public void setRpDashboardChiPhiBinhQuanFinder(
		RpDashboardChiPhiBinhQuanFinder rpDashboardChiPhiBinhQuanFinder) {

		this.rpDashboardChiPhiBinhQuanFinder = rpDashboardChiPhiBinhQuanFinder;
	}

	/**
	 * Returns the rp dashboard cmi local service.
	 *
	 * @return the rp dashboard cmi local service
	 */
	public drg.moh.service.service.RpDashboardCmiLocalService
		getRpDashboardCmiLocalService() {

		return rpDashboardCmiLocalService;
	}

	/**
	 * Sets the rp dashboard cmi local service.
	 *
	 * @param rpDashboardCmiLocalService the rp dashboard cmi local service
	 */
	public void setRpDashboardCmiLocalService(
		drg.moh.service.service.RpDashboardCmiLocalService
			rpDashboardCmiLocalService) {

		this.rpDashboardCmiLocalService = rpDashboardCmiLocalService;
	}

	/**
	 * Returns the rp dashboard cmi persistence.
	 *
	 * @return the rp dashboard cmi persistence
	 */
	public RpDashboardCmiPersistence getRpDashboardCmiPersistence() {
		return rpDashboardCmiPersistence;
	}

	/**
	 * Sets the rp dashboard cmi persistence.
	 *
	 * @param rpDashboardCmiPersistence the rp dashboard cmi persistence
	 */
	public void setRpDashboardCmiPersistence(
		RpDashboardCmiPersistence rpDashboardCmiPersistence) {

		this.rpDashboardCmiPersistence = rpDashboardCmiPersistence;
	}

	/**
	 * Returns the rp dashboard cmi finder.
	 *
	 * @return the rp dashboard cmi finder
	 */
	public RpDashboardCmiFinder getRpDashboardCmiFinder() {
		return rpDashboardCmiFinder;
	}

	/**
	 * Sets the rp dashboard cmi finder.
	 *
	 * @param rpDashboardCmiFinder the rp dashboard cmi finder
	 */
	public void setRpDashboardCmiFinder(
		RpDashboardCmiFinder rpDashboardCmiFinder) {

		this.rpDashboardCmiFinder = rpDashboardCmiFinder;
	}

	/**
	 * Returns the rp dashboard cmi2 local service.
	 *
	 * @return the rp dashboard cmi2 local service
	 */
	public drg.moh.service.service.RpDashboardCmi2LocalService
		getRpDashboardCmi2LocalService() {

		return rpDashboardCmi2LocalService;
	}

	/**
	 * Sets the rp dashboard cmi2 local service.
	 *
	 * @param rpDashboardCmi2LocalService the rp dashboard cmi2 local service
	 */
	public void setRpDashboardCmi2LocalService(
		drg.moh.service.service.RpDashboardCmi2LocalService
			rpDashboardCmi2LocalService) {

		this.rpDashboardCmi2LocalService = rpDashboardCmi2LocalService;
	}

	/**
	 * Returns the rp dashboard cmi2 persistence.
	 *
	 * @return the rp dashboard cmi2 persistence
	 */
	public RpDashboardCmi2Persistence getRpDashboardCmi2Persistence() {
		return rpDashboardCmi2Persistence;
	}

	/**
	 * Sets the rp dashboard cmi2 persistence.
	 *
	 * @param rpDashboardCmi2Persistence the rp dashboard cmi2 persistence
	 */
	public void setRpDashboardCmi2Persistence(
		RpDashboardCmi2Persistence rpDashboardCmi2Persistence) {

		this.rpDashboardCmi2Persistence = rpDashboardCmi2Persistence;
	}

	/**
	 * Returns the rp dashboard cmi2 finder.
	 *
	 * @return the rp dashboard cmi2 finder
	 */
	public RpDashboardCmi2Finder getRpDashboardCmi2Finder() {
		return rpDashboardCmi2Finder;
	}

	/**
	 * Sets the rp dashboard cmi2 finder.
	 *
	 * @param rpDashboardCmi2Finder the rp dashboard cmi2 finder
	 */
	public void setRpDashboardCmi2Finder(
		RpDashboardCmi2Finder rpDashboardCmi2Finder) {

		this.rpDashboardCmi2Finder = rpDashboardCmi2Finder;
	}

	/**
	 * Returns the rp dashboard cmi3 local service.
	 *
	 * @return the rp dashboard cmi3 local service
	 */
	public drg.moh.service.service.RpDashboardCmi3LocalService
		getRpDashboardCmi3LocalService() {

		return rpDashboardCmi3LocalService;
	}

	/**
	 * Sets the rp dashboard cmi3 local service.
	 *
	 * @param rpDashboardCmi3LocalService the rp dashboard cmi3 local service
	 */
	public void setRpDashboardCmi3LocalService(
		drg.moh.service.service.RpDashboardCmi3LocalService
			rpDashboardCmi3LocalService) {

		this.rpDashboardCmi3LocalService = rpDashboardCmi3LocalService;
	}

	/**
	 * Returns the rp dashboard cmi3 persistence.
	 *
	 * @return the rp dashboard cmi3 persistence
	 */
	public RpDashboardCmi3Persistence getRpDashboardCmi3Persistence() {
		return rpDashboardCmi3Persistence;
	}

	/**
	 * Sets the rp dashboard cmi3 persistence.
	 *
	 * @param rpDashboardCmi3Persistence the rp dashboard cmi3 persistence
	 */
	public void setRpDashboardCmi3Persistence(
		RpDashboardCmi3Persistence rpDashboardCmi3Persistence) {

		this.rpDashboardCmi3Persistence = rpDashboardCmi3Persistence;
	}

	/**
	 * Returns the rp dashboard cmi3 finder.
	 *
	 * @return the rp dashboard cmi3 finder
	 */
	public RpDashboardCmi3Finder getRpDashboardCmi3Finder() {
		return rpDashboardCmi3Finder;
	}

	/**
	 * Sets the rp dashboard cmi3 finder.
	 *
	 * @param rpDashboardCmi3Finder the rp dashboard cmi3 finder
	 */
	public void setRpDashboardCmi3Finder(
		RpDashboardCmi3Finder rpDashboardCmi3Finder) {

		this.rpDashboardCmi3Finder = rpDashboardCmi3Finder;
	}

	/**
	 * Returns the rp dashboard cphd local service.
	 *
	 * @return the rp dashboard cphd local service
	 */
	public drg.moh.service.service.RpDashboardCphdLocalService
		getRpDashboardCphdLocalService() {

		return rpDashboardCphdLocalService;
	}

	/**
	 * Sets the rp dashboard cphd local service.
	 *
	 * @param rpDashboardCphdLocalService the rp dashboard cphd local service
	 */
	public void setRpDashboardCphdLocalService(
		drg.moh.service.service.RpDashboardCphdLocalService
			rpDashboardCphdLocalService) {

		this.rpDashboardCphdLocalService = rpDashboardCphdLocalService;
	}

	/**
	 * Returns the rp dashboard cphd persistence.
	 *
	 * @return the rp dashboard cphd persistence
	 */
	public RpDashboardCphdPersistence getRpDashboardCphdPersistence() {
		return rpDashboardCphdPersistence;
	}

	/**
	 * Sets the rp dashboard cphd persistence.
	 *
	 * @param rpDashboardCphdPersistence the rp dashboard cphd persistence
	 */
	public void setRpDashboardCphdPersistence(
		RpDashboardCphdPersistence rpDashboardCphdPersistence) {

		this.rpDashboardCphdPersistence = rpDashboardCphdPersistence;
	}

	/**
	 * Returns the rp dashboard cphd finder.
	 *
	 * @return the rp dashboard cphd finder
	 */
	public RpDashboardCphdFinder getRpDashboardCphdFinder() {
		return rpDashboardCphdFinder;
	}

	/**
	 * Sets the rp dashboard cphd finder.
	 *
	 * @param rpDashboardCphdFinder the rp dashboard cphd finder
	 */
	public void setRpDashboardCphdFinder(
		RpDashboardCphdFinder rpDashboardCphdFinder) {

		this.rpDashboardCphdFinder = rpDashboardCphdFinder;
	}

	/**
	 * Returns the rp dashboard dinh suat chi tiet local service.
	 *
	 * @return the rp dashboard dinh suat chi tiet local service
	 */
	public drg.moh.service.service.RpDashboardDinhSuatChiTietLocalService
		getRpDashboardDinhSuatChiTietLocalService() {

		return rpDashboardDinhSuatChiTietLocalService;
	}

	/**
	 * Sets the rp dashboard dinh suat chi tiet local service.
	 *
	 * @param rpDashboardDinhSuatChiTietLocalService the rp dashboard dinh suat chi tiet local service
	 */
	public void setRpDashboardDinhSuatChiTietLocalService(
		drg.moh.service.service.RpDashboardDinhSuatChiTietLocalService
			rpDashboardDinhSuatChiTietLocalService) {

		this.rpDashboardDinhSuatChiTietLocalService =
			rpDashboardDinhSuatChiTietLocalService;
	}

	/**
	 * Returns the rp dashboard dinh suat chi tiet persistence.
	 *
	 * @return the rp dashboard dinh suat chi tiet persistence
	 */
	public RpDashboardDinhSuatChiTietPersistence
		getRpDashboardDinhSuatChiTietPersistence() {

		return rpDashboardDinhSuatChiTietPersistence;
	}

	/**
	 * Sets the rp dashboard dinh suat chi tiet persistence.
	 *
	 * @param rpDashboardDinhSuatChiTietPersistence the rp dashboard dinh suat chi tiet persistence
	 */
	public void setRpDashboardDinhSuatChiTietPersistence(
		RpDashboardDinhSuatChiTietPersistence
			rpDashboardDinhSuatChiTietPersistence) {

		this.rpDashboardDinhSuatChiTietPersistence =
			rpDashboardDinhSuatChiTietPersistence;
	}

	/**
	 * Returns the rp dashboard dinh suat chi tiet finder.
	 *
	 * @return the rp dashboard dinh suat chi tiet finder
	 */
	public RpDashboardDinhSuatChiTietFinder
		getRpDashboardDinhSuatChiTietFinder() {

		return rpDashboardDinhSuatChiTietFinder;
	}

	/**
	 * Sets the rp dashboard dinh suat chi tiet finder.
	 *
	 * @param rpDashboardDinhSuatChiTietFinder the rp dashboard dinh suat chi tiet finder
	 */
	public void setRpDashboardDinhSuatChiTietFinder(
		RpDashboardDinhSuatChiTietFinder rpDashboardDinhSuatChiTietFinder) {

		this.rpDashboardDinhSuatChiTietFinder =
			rpDashboardDinhSuatChiTietFinder;
	}

	/**
	 * Returns the rp dashboard drg local service.
	 *
	 * @return the rp dashboard drg local service
	 */
	public drg.moh.service.service.RpDashboardDRGLocalService
		getRpDashboardDRGLocalService() {

		return rpDashboardDRGLocalService;
	}

	/**
	 * Sets the rp dashboard drg local service.
	 *
	 * @param rpDashboardDRGLocalService the rp dashboard drg local service
	 */
	public void setRpDashboardDRGLocalService(
		drg.moh.service.service.RpDashboardDRGLocalService
			rpDashboardDRGLocalService) {

		this.rpDashboardDRGLocalService = rpDashboardDRGLocalService;
	}

	/**
	 * Returns the rp dashboard drg persistence.
	 *
	 * @return the rp dashboard drg persistence
	 */
	public RpDashboardDRGPersistence getRpDashboardDRGPersistence() {
		return rpDashboardDRGPersistence;
	}

	/**
	 * Sets the rp dashboard drg persistence.
	 *
	 * @param rpDashboardDRGPersistence the rp dashboard drg persistence
	 */
	public void setRpDashboardDRGPersistence(
		RpDashboardDRGPersistence rpDashboardDRGPersistence) {

		this.rpDashboardDRGPersistence = rpDashboardDRGPersistence;
	}

	/**
	 * Returns the rp dashboard drg finder.
	 *
	 * @return the rp dashboard drg finder
	 */
	public RpDashboardDRGFinder getRpDashboardDRGFinder() {
		return rpDashboardDRGFinder;
	}

	/**
	 * Sets the rp dashboard drg finder.
	 *
	 * @param rpDashboardDRGFinder the rp dashboard drg finder
	 */
	public void setRpDashboardDRGFinder(
		RpDashboardDRGFinder rpDashboardDRGFinder) {

		this.rpDashboardDRGFinder = rpDashboardDRGFinder;
	}

	/**
	 * Returns the rp dashboard dstc local service.
	 *
	 * @return the rp dashboard dstc local service
	 */
	public drg.moh.service.service.RpDashboardDstcLocalService
		getRpDashboardDstcLocalService() {

		return rpDashboardDstcLocalService;
	}

	/**
	 * Sets the rp dashboard dstc local service.
	 *
	 * @param rpDashboardDstcLocalService the rp dashboard dstc local service
	 */
	public void setRpDashboardDstcLocalService(
		drg.moh.service.service.RpDashboardDstcLocalService
			rpDashboardDstcLocalService) {

		this.rpDashboardDstcLocalService = rpDashboardDstcLocalService;
	}

	/**
	 * Returns the rp dashboard dstc persistence.
	 *
	 * @return the rp dashboard dstc persistence
	 */
	public RpDashboardDstcPersistence getRpDashboardDstcPersistence() {
		return rpDashboardDstcPersistence;
	}

	/**
	 * Sets the rp dashboard dstc persistence.
	 *
	 * @param rpDashboardDstcPersistence the rp dashboard dstc persistence
	 */
	public void setRpDashboardDstcPersistence(
		RpDashboardDstcPersistence rpDashboardDstcPersistence) {

		this.rpDashboardDstcPersistence = rpDashboardDstcPersistence;
	}

	/**
	 * Returns the rp dashboard dstc finder.
	 *
	 * @return the rp dashboard dstc finder
	 */
	public RpDashboardDstcFinder getRpDashboardDstcFinder() {
		return rpDashboardDstcFinder;
	}

	/**
	 * Sets the rp dashboard dstc finder.
	 *
	 * @param rpDashboardDstcFinder the rp dashboard dstc finder
	 */
	public void setRpDashboardDstcFinder(
		RpDashboardDstcFinder rpDashboardDstcFinder) {

		this.rpDashboardDstcFinder = rpDashboardDstcFinder;
	}

	/**
	 * Returns the rp dashboard dstc chi tiet local service.
	 *
	 * @return the rp dashboard dstc chi tiet local service
	 */
	public drg.moh.service.service.RpDashboardDstcChiTietLocalService
		getRpDashboardDstcChiTietLocalService() {

		return rpDashboardDstcChiTietLocalService;
	}

	/**
	 * Sets the rp dashboard dstc chi tiet local service.
	 *
	 * @param rpDashboardDstcChiTietLocalService the rp dashboard dstc chi tiet local service
	 */
	public void setRpDashboardDstcChiTietLocalService(
		drg.moh.service.service.RpDashboardDstcChiTietLocalService
			rpDashboardDstcChiTietLocalService) {

		this.rpDashboardDstcChiTietLocalService =
			rpDashboardDstcChiTietLocalService;
	}

	/**
	 * Returns the rp dashboard dstc chi tiet persistence.
	 *
	 * @return the rp dashboard dstc chi tiet persistence
	 */
	public RpDashboardDstcChiTietPersistence
		getRpDashboardDstcChiTietPersistence() {

		return rpDashboardDstcChiTietPersistence;
	}

	/**
	 * Sets the rp dashboard dstc chi tiet persistence.
	 *
	 * @param rpDashboardDstcChiTietPersistence the rp dashboard dstc chi tiet persistence
	 */
	public void setRpDashboardDstcChiTietPersistence(
		RpDashboardDstcChiTietPersistence rpDashboardDstcChiTietPersistence) {

		this.rpDashboardDstcChiTietPersistence =
			rpDashboardDstcChiTietPersistence;
	}

	/**
	 * Returns the rp dashboard dstc chi tiet finder.
	 *
	 * @return the rp dashboard dstc chi tiet finder
	 */
	public RpDashboardDstcChiTietFinder getRpDashboardDstcChiTietFinder() {
		return rpDashboardDstcChiTietFinder;
	}

	/**
	 * Sets the rp dashboard dstc chi tiet finder.
	 *
	 * @param rpDashboardDstcChiTietFinder the rp dashboard dstc chi tiet finder
	 */
	public void setRpDashboardDstcChiTietFinder(
		RpDashboardDstcChiTietFinder rpDashboardDstcChiTietFinder) {

		this.rpDashboardDstcChiTietFinder = rpDashboardDstcChiTietFinder;
	}

	/**
	 * Returns the rp dashboard trung binh local service.
	 *
	 * @return the rp dashboard trung binh local service
	 */
	public drg.moh.service.service.RpDashboardTrungBinhLocalService
		getRpDashboardTrungBinhLocalService() {

		return rpDashboardTrungBinhLocalService;
	}

	/**
	 * Sets the rp dashboard trung binh local service.
	 *
	 * @param rpDashboardTrungBinhLocalService the rp dashboard trung binh local service
	 */
	public void setRpDashboardTrungBinhLocalService(
		drg.moh.service.service.RpDashboardTrungBinhLocalService
			rpDashboardTrungBinhLocalService) {

		this.rpDashboardTrungBinhLocalService =
			rpDashboardTrungBinhLocalService;
	}

	/**
	 * Returns the rp dashboard trung binh persistence.
	 *
	 * @return the rp dashboard trung binh persistence
	 */
	public RpDashboardTrungBinhPersistence
		getRpDashboardTrungBinhPersistence() {

		return rpDashboardTrungBinhPersistence;
	}

	/**
	 * Sets the rp dashboard trung binh persistence.
	 *
	 * @param rpDashboardTrungBinhPersistence the rp dashboard trung binh persistence
	 */
	public void setRpDashboardTrungBinhPersistence(
		RpDashboardTrungBinhPersistence rpDashboardTrungBinhPersistence) {

		this.rpDashboardTrungBinhPersistence = rpDashboardTrungBinhPersistence;
	}

	/**
	 * Returns the rp dashboard trung binh finder.
	 *
	 * @return the rp dashboard trung binh finder
	 */
	public RpDashboardTrungBinhFinder getRpDashboardTrungBinhFinder() {
		return rpDashboardTrungBinhFinder;
	}

	/**
	 * Sets the rp dashboard trung binh finder.
	 *
	 * @param rpDashboardTrungBinhFinder the rp dashboard trung binh finder
	 */
	public void setRpDashboardTrungBinhFinder(
		RpDashboardTrungBinhFinder rpDashboardTrungBinhFinder) {

		this.rpDashboardTrungBinhFinder = rpDashboardTrungBinhFinder;
	}

	/**
	 * Returns the thong ke local service.
	 *
	 * @return the thong ke local service
	 */
	public drg.moh.service.service.ThongKeLocalService
		getThongKeLocalService() {

		return thongKeLocalService;
	}

	/**
	 * Sets the thong ke local service.
	 *
	 * @param thongKeLocalService the thong ke local service
	 */
	public void setThongKeLocalService(
		drg.moh.service.service.ThongKeLocalService thongKeLocalService) {

		this.thongKeLocalService = thongKeLocalService;
	}

	/**
	 * Returns the thong ke persistence.
	 *
	 * @return the thong ke persistence
	 */
	public ThongKePersistence getThongKePersistence() {
		return thongKePersistence;
	}

	/**
	 * Sets the thong ke persistence.
	 *
	 * @param thongKePersistence the thong ke persistence
	 */
	public void setThongKePersistence(ThongKePersistence thongKePersistence) {
		this.thongKePersistence = thongKePersistence;
	}

	/**
	 * Returns the thong ke bao cao local service.
	 *
	 * @return the thong ke bao cao local service
	 */
	public drg.moh.service.service.ThongKeBaoCaoLocalService
		getThongKeBaoCaoLocalService() {

		return thongKeBaoCaoLocalService;
	}

	/**
	 * Sets the thong ke bao cao local service.
	 *
	 * @param thongKeBaoCaoLocalService the thong ke bao cao local service
	 */
	public void setThongKeBaoCaoLocalService(
		drg.moh.service.service.ThongKeBaoCaoLocalService
			thongKeBaoCaoLocalService) {

		this.thongKeBaoCaoLocalService = thongKeBaoCaoLocalService;
	}

	/**
	 * Returns the thong ke bao cao persistence.
	 *
	 * @return the thong ke bao cao persistence
	 */
	public ThongKeBaoCaoPersistence getThongKeBaoCaoPersistence() {
		return thongKeBaoCaoPersistence;
	}

	/**
	 * Sets the thong ke bao cao persistence.
	 *
	 * @param thongKeBaoCaoPersistence the thong ke bao cao persistence
	 */
	public void setThongKeBaoCaoPersistence(
		ThongKeBaoCaoPersistence thongKeBaoCaoPersistence) {

		this.thongKeBaoCaoPersistence = thongKeBaoCaoPersistence;
	}

	/**
	 * Returns the view danh sach benh an local service.
	 *
	 * @return the view danh sach benh an local service
	 */
	public drg.moh.service.service.ViewDanhSachBenhAnLocalService
		getViewDanhSachBenhAnLocalService() {

		return viewDanhSachBenhAnLocalService;
	}

	/**
	 * Sets the view danh sach benh an local service.
	 *
	 * @param viewDanhSachBenhAnLocalService the view danh sach benh an local service
	 */
	public void setViewDanhSachBenhAnLocalService(
		drg.moh.service.service.ViewDanhSachBenhAnLocalService
			viewDanhSachBenhAnLocalService) {

		this.viewDanhSachBenhAnLocalService = viewDanhSachBenhAnLocalService;
	}

	/**
	 * Returns the view danh sach benh an persistence.
	 *
	 * @return the view danh sach benh an persistence
	 */
	public ViewDanhSachBenhAnPersistence getViewDanhSachBenhAnPersistence() {
		return viewDanhSachBenhAnPersistence;
	}

	/**
	 * Sets the view danh sach benh an persistence.
	 *
	 * @param viewDanhSachBenhAnPersistence the view danh sach benh an persistence
	 */
	public void setViewDanhSachBenhAnPersistence(
		ViewDanhSachBenhAnPersistence viewDanhSachBenhAnPersistence) {

		this.viewDanhSachBenhAnPersistence = viewDanhSachBenhAnPersistence;
	}

	/**
	 * Returns the view danh sach benh an finder.
	 *
	 * @return the view danh sach benh an finder
	 */
	public ViewDanhSachBenhAnFinder getViewDanhSachBenhAnFinder() {
		return viewDanhSachBenhAnFinder;
	}

	/**
	 * Sets the view danh sach benh an finder.
	 *
	 * @param viewDanhSachBenhAnFinder the view danh sach benh an finder
	 */
	public void setViewDanhSachBenhAnFinder(
		ViewDanhSachBenhAnFinder viewDanhSachBenhAnFinder) {

		this.viewDanhSachBenhAnFinder = viewDanhSachBenhAnFinder;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.kernel.service.CounterLocalService
		getCounterLocalService() {

		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.kernel.service.CounterLocalService
			counterLocalService) {

		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the class name local service.
	 *
	 * @return the class name local service
	 */
	public com.liferay.portal.kernel.service.ClassNameLocalService
		getClassNameLocalService() {

		return classNameLocalService;
	}

	/**
	 * Sets the class name local service.
	 *
	 * @param classNameLocalService the class name local service
	 */
	public void setClassNameLocalService(
		com.liferay.portal.kernel.service.ClassNameLocalService
			classNameLocalService) {

		this.classNameLocalService = classNameLocalService;
	}

	/**
	 * Returns the class name persistence.
	 *
	 * @return the class name persistence
	 */
	public ClassNamePersistence getClassNamePersistence() {
		return classNamePersistence;
	}

	/**
	 * Sets the class name persistence.
	 *
	 * @param classNamePersistence the class name persistence
	 */
	public void setClassNamePersistence(
		ClassNamePersistence classNamePersistence) {

		this.classNamePersistence = classNamePersistence;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.kernel.service.ResourceLocalService
		getResourceLocalService() {

		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.kernel.service.ResourceLocalService
			resourceLocalService) {

		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.kernel.service.UserLocalService
		getUserLocalService() {

		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.kernel.service.UserLocalService userLocalService) {

		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		persistedModelLocalServiceRegistry.register(
			"drg.moh.service.model.DashboardChiPhiHoatDong",
			dashboardChiPhiHoatDongLocalService);

		_setLocalServiceUtilService(dashboardChiPhiHoatDongLocalService);
	}

	public void destroy() {
		persistedModelLocalServiceRegistry.unregister(
			"drg.moh.service.model.DashboardChiPhiHoatDong");

		_setLocalServiceUtilService(null);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return DashboardChiPhiHoatDongLocalService.class.getName();
	}

	protected Class<?> getModelClass() {
		return DashboardChiPhiHoatDong.class;
	}

	protected String getModelClassName() {
		return DashboardChiPhiHoatDong.class.getName();
	}

	/**
	 * Performs a SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) {
		try {
			DataSource dataSource =
				dashboardChiPhiHoatDongPersistence.getDataSource();

			DB db = DBManagerUtil.getDB();

			sql = db.buildSQL(sql);
			sql = PortalUtil.transformSQL(sql);

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(
				dataSource, sql);

			sqlUpdate.update();
		}
		catch (Exception exception) {
			throw new SystemException(exception);
		}
	}

	private void _setLocalServiceUtilService(
		DashboardChiPhiHoatDongLocalService
			dashboardChiPhiHoatDongLocalService) {

		try {
			Field field =
				DashboardChiPhiHoatDongLocalServiceUtil.class.getDeclaredField(
					"_service");

			field.setAccessible(true);

			field.set(null, dashboardChiPhiHoatDongLocalService);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@BeanReference(
		type = drg.moh.service.service.DashboardBaoHiemLocalService.class
	)
	protected drg.moh.service.service.DashboardBaoHiemLocalService
		dashboardBaoHiemLocalService;

	@BeanReference(type = DashboardBaoHiemPersistence.class)
	protected DashboardBaoHiemPersistence dashboardBaoHiemPersistence;

	@BeanReference(type = DashboardBaoHiemFinder.class)
	protected DashboardBaoHiemFinder dashboardBaoHiemFinder;

	@BeanReference(
		type = drg.moh.service.service.DashboardChiPhiBinhQuanLocalService.class
	)
	protected drg.moh.service.service.DashboardChiPhiBinhQuanLocalService
		dashboardChiPhiBinhQuanLocalService;

	@BeanReference(type = DashboardChiPhiBinhQuanPersistence.class)
	protected DashboardChiPhiBinhQuanPersistence
		dashboardChiPhiBinhQuanPersistence;

	@BeanReference(type = DashboardChiPhiHoatDongLocalService.class)
	protected DashboardChiPhiHoatDongLocalService
		dashboardChiPhiHoatDongLocalService;

	@BeanReference(type = DashboardChiPhiHoatDongPersistence.class)
	protected DashboardChiPhiHoatDongPersistence
		dashboardChiPhiHoatDongPersistence;

	@BeanReference(type = DashboardChiPhiHoatDongFinder.class)
	protected DashboardChiPhiHoatDongFinder dashboardChiPhiHoatDongFinder;

	@BeanReference(
		type = drg.moh.service.service.DashboardChiPhiThanhPhanLocalService.class
	)
	protected drg.moh.service.service.DashboardChiPhiThanhPhanLocalService
		dashboardChiPhiThanhPhanLocalService;

	@BeanReference(type = DashboardChiPhiThanhPhanPersistence.class)
	protected DashboardChiPhiThanhPhanPersistence
		dashboardChiPhiThanhPhanPersistence;

	@BeanReference(
		type = drg.moh.service.service.DashboardCMILocalService.class
	)
	protected drg.moh.service.service.DashboardCMILocalService
		dashboardCMILocalService;

	@BeanReference(type = DashboardCMIPersistence.class)
	protected DashboardCMIPersistence dashboardCMIPersistence;

	@BeanReference(
		type = drg.moh.service.service.DashboardDinhSuatLocalService.class
	)
	protected drg.moh.service.service.DashboardDinhSuatLocalService
		dashboardDinhSuatLocalService;

	@BeanReference(type = DashboardDinhSuatPersistence.class)
	protected DashboardDinhSuatPersistence dashboardDinhSuatPersistence;

	@BeanReference(
		type = drg.moh.service.service.RpDashboardChiPhiBinhQuanLocalService.class
	)
	protected drg.moh.service.service.RpDashboardChiPhiBinhQuanLocalService
		rpDashboardChiPhiBinhQuanLocalService;

	@BeanReference(type = RpDashboardChiPhiBinhQuanPersistence.class)
	protected RpDashboardChiPhiBinhQuanPersistence
		rpDashboardChiPhiBinhQuanPersistence;

	@BeanReference(type = RpDashboardChiPhiBinhQuanFinder.class)
	protected RpDashboardChiPhiBinhQuanFinder rpDashboardChiPhiBinhQuanFinder;

	@BeanReference(
		type = drg.moh.service.service.RpDashboardCmiLocalService.class
	)
	protected drg.moh.service.service.RpDashboardCmiLocalService
		rpDashboardCmiLocalService;

	@BeanReference(type = RpDashboardCmiPersistence.class)
	protected RpDashboardCmiPersistence rpDashboardCmiPersistence;

	@BeanReference(type = RpDashboardCmiFinder.class)
	protected RpDashboardCmiFinder rpDashboardCmiFinder;

	@BeanReference(
		type = drg.moh.service.service.RpDashboardCmi2LocalService.class
	)
	protected drg.moh.service.service.RpDashboardCmi2LocalService
		rpDashboardCmi2LocalService;

	@BeanReference(type = RpDashboardCmi2Persistence.class)
	protected RpDashboardCmi2Persistence rpDashboardCmi2Persistence;

	@BeanReference(type = RpDashboardCmi2Finder.class)
	protected RpDashboardCmi2Finder rpDashboardCmi2Finder;

	@BeanReference(
		type = drg.moh.service.service.RpDashboardCmi3LocalService.class
	)
	protected drg.moh.service.service.RpDashboardCmi3LocalService
		rpDashboardCmi3LocalService;

	@BeanReference(type = RpDashboardCmi3Persistence.class)
	protected RpDashboardCmi3Persistence rpDashboardCmi3Persistence;

	@BeanReference(type = RpDashboardCmi3Finder.class)
	protected RpDashboardCmi3Finder rpDashboardCmi3Finder;

	@BeanReference(
		type = drg.moh.service.service.RpDashboardCphdLocalService.class
	)
	protected drg.moh.service.service.RpDashboardCphdLocalService
		rpDashboardCphdLocalService;

	@BeanReference(type = RpDashboardCphdPersistence.class)
	protected RpDashboardCphdPersistence rpDashboardCphdPersistence;

	@BeanReference(type = RpDashboardCphdFinder.class)
	protected RpDashboardCphdFinder rpDashboardCphdFinder;

	@BeanReference(
		type = drg.moh.service.service.RpDashboardDinhSuatChiTietLocalService.class
	)
	protected drg.moh.service.service.RpDashboardDinhSuatChiTietLocalService
		rpDashboardDinhSuatChiTietLocalService;

	@BeanReference(type = RpDashboardDinhSuatChiTietPersistence.class)
	protected RpDashboardDinhSuatChiTietPersistence
		rpDashboardDinhSuatChiTietPersistence;

	@BeanReference(type = RpDashboardDinhSuatChiTietFinder.class)
	protected RpDashboardDinhSuatChiTietFinder rpDashboardDinhSuatChiTietFinder;

	@BeanReference(
		type = drg.moh.service.service.RpDashboardDRGLocalService.class
	)
	protected drg.moh.service.service.RpDashboardDRGLocalService
		rpDashboardDRGLocalService;

	@BeanReference(type = RpDashboardDRGPersistence.class)
	protected RpDashboardDRGPersistence rpDashboardDRGPersistence;

	@BeanReference(type = RpDashboardDRGFinder.class)
	protected RpDashboardDRGFinder rpDashboardDRGFinder;

	@BeanReference(
		type = drg.moh.service.service.RpDashboardDstcLocalService.class
	)
	protected drg.moh.service.service.RpDashboardDstcLocalService
		rpDashboardDstcLocalService;

	@BeanReference(type = RpDashboardDstcPersistence.class)
	protected RpDashboardDstcPersistence rpDashboardDstcPersistence;

	@BeanReference(type = RpDashboardDstcFinder.class)
	protected RpDashboardDstcFinder rpDashboardDstcFinder;

	@BeanReference(
		type = drg.moh.service.service.RpDashboardDstcChiTietLocalService.class
	)
	protected drg.moh.service.service.RpDashboardDstcChiTietLocalService
		rpDashboardDstcChiTietLocalService;

	@BeanReference(type = RpDashboardDstcChiTietPersistence.class)
	protected RpDashboardDstcChiTietPersistence
		rpDashboardDstcChiTietPersistence;

	@BeanReference(type = RpDashboardDstcChiTietFinder.class)
	protected RpDashboardDstcChiTietFinder rpDashboardDstcChiTietFinder;

	@BeanReference(
		type = drg.moh.service.service.RpDashboardTrungBinhLocalService.class
	)
	protected drg.moh.service.service.RpDashboardTrungBinhLocalService
		rpDashboardTrungBinhLocalService;

	@BeanReference(type = RpDashboardTrungBinhPersistence.class)
	protected RpDashboardTrungBinhPersistence rpDashboardTrungBinhPersistence;

	@BeanReference(type = RpDashboardTrungBinhFinder.class)
	protected RpDashboardTrungBinhFinder rpDashboardTrungBinhFinder;

	@BeanReference(type = drg.moh.service.service.ThongKeLocalService.class)
	protected drg.moh.service.service.ThongKeLocalService thongKeLocalService;

	@BeanReference(type = ThongKePersistence.class)
	protected ThongKePersistence thongKePersistence;

	@BeanReference(
		type = drg.moh.service.service.ThongKeBaoCaoLocalService.class
	)
	protected drg.moh.service.service.ThongKeBaoCaoLocalService
		thongKeBaoCaoLocalService;

	@BeanReference(type = ThongKeBaoCaoPersistence.class)
	protected ThongKeBaoCaoPersistence thongKeBaoCaoPersistence;

	@BeanReference(
		type = drg.moh.service.service.ViewDanhSachBenhAnLocalService.class
	)
	protected drg.moh.service.service.ViewDanhSachBenhAnLocalService
		viewDanhSachBenhAnLocalService;

	@BeanReference(type = ViewDanhSachBenhAnPersistence.class)
	protected ViewDanhSachBenhAnPersistence viewDanhSachBenhAnPersistence;

	@BeanReference(type = ViewDanhSachBenhAnFinder.class)
	protected ViewDanhSachBenhAnFinder viewDanhSachBenhAnFinder;

	@ServiceReference(
		type = com.liferay.counter.kernel.service.CounterLocalService.class
	)
	protected com.liferay.counter.kernel.service.CounterLocalService
		counterLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ClassNameLocalService.class
	)
	protected com.liferay.portal.kernel.service.ClassNameLocalService
		classNameLocalService;

	@ServiceReference(type = ClassNamePersistence.class)
	protected ClassNamePersistence classNamePersistence;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.ResourceLocalService.class
	)
	protected com.liferay.portal.kernel.service.ResourceLocalService
		resourceLocalService;

	@ServiceReference(
		type = com.liferay.portal.kernel.service.UserLocalService.class
	)
	protected com.liferay.portal.kernel.service.UserLocalService
		userLocalService;

	@ServiceReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;

	@ServiceReference(type = PersistedModelLocalServiceRegistry.class)
	protected PersistedModelLocalServiceRegistry
		persistedModelLocalServiceRegistry;

}