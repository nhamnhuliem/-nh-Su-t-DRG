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

package drg.moh.service.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import drg.moh.service.model.ThongKe;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the thong ke service. This utility wraps <code>drg.moh.service.service.persistence.impl.ThongKePersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see ThongKePersistence
 * @generated
 */
public class ThongKeUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ThongKe thongKe) {
		getPersistence().clearCache(thongKe);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, ThongKe> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ThongKe> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ThongKe> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ThongKe> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ThongKe> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ThongKe update(ThongKe thongKe) {
		return getPersistence().update(thongKe);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ThongKe update(
		ThongKe thongKe, ServiceContext serviceContext) {

		return getPersistence().update(thongKe, serviceContext);
	}

	/**
	 * Caches the thong ke in the entity cache if it is enabled.
	 *
	 * @param thongKe the thong ke
	 */
	public static void cacheResult(ThongKe thongKe) {
		getPersistence().cacheResult(thongKe);
	}

	/**
	 * Caches the thong kes in the entity cache if it is enabled.
	 *
	 * @param thongKes the thong kes
	 */
	public static void cacheResult(List<ThongKe> thongKes) {
		getPersistence().cacheResult(thongKes);
	}

	/**
	 * Creates a new thong ke with the primary key. Does not add the thong ke to the database.
	 *
	 * @param id the primary key for the new thong ke
	 * @return the new thong ke
	 */
	public static ThongKe create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the thong ke with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the thong ke
	 * @return the thong ke that was removed
	 * @throws NoSuchThongKeException if a thong ke with the primary key could not be found
	 */
	public static ThongKe remove(long id)
		throws drg.moh.service.exception.NoSuchThongKeException {

		return getPersistence().remove(id);
	}

	public static ThongKe updateImpl(ThongKe thongKe) {
		return getPersistence().updateImpl(thongKe);
	}

	/**
	 * Returns the thong ke with the primary key or throws a <code>NoSuchThongKeException</code> if it could not be found.
	 *
	 * @param id the primary key of the thong ke
	 * @return the thong ke
	 * @throws NoSuchThongKeException if a thong ke with the primary key could not be found
	 */
	public static ThongKe findByPrimaryKey(long id)
		throws drg.moh.service.exception.NoSuchThongKeException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the thong ke with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the thong ke
	 * @return the thong ke, or <code>null</code> if a thong ke with the primary key could not be found
	 */
	public static ThongKe fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the thong kes.
	 *
	 * @return the thong kes
	 */
	public static List<ThongKe> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the thong kes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong kes
	 * @param end the upper bound of the range of thong kes (not inclusive)
	 * @return the range of thong kes
	 */
	public static List<ThongKe> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the thong kes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong kes
	 * @param end the upper bound of the range of thong kes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of thong kes
	 */
	public static List<ThongKe> findAll(
		int start, int end, OrderByComparator<ThongKe> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the thong kes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong kes
	 * @param end the upper bound of the range of thong kes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of thong kes
	 */
	public static List<ThongKe> findAll(
		int start, int end, OrderByComparator<ThongKe> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the thong kes from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of thong kes.
	 *
	 * @return the number of thong kes
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ThongKePersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ThongKePersistence, ThongKePersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ThongKePersistence.class);

		ServiceTracker<ThongKePersistence, ThongKePersistence> serviceTracker =
			new ServiceTracker<ThongKePersistence, ThongKePersistence>(
				bundle.getBundleContext(), ThongKePersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}