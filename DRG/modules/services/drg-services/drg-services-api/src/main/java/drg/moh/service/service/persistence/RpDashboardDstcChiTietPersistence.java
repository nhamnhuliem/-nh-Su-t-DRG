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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import drg.moh.service.exception.NoSuchRpDashboardDstcChiTietException;
import drg.moh.service.model.RpDashboardDstcChiTiet;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the rp dashboard dstc chi tiet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see RpDashboardDstcChiTietUtil
 * @generated
 */
@ProviderType
public interface RpDashboardDstcChiTietPersistence
	extends BasePersistence<RpDashboardDstcChiTiet> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RpDashboardDstcChiTietUtil} to access the rp dashboard dstc chi tiet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the rp dashboard dstc chi tiet in the entity cache if it is enabled.
	 *
	 * @param rpDashboardDstcChiTiet the rp dashboard dstc chi tiet
	 */
	public void cacheResult(RpDashboardDstcChiTiet rpDashboardDstcChiTiet);

	/**
	 * Caches the rp dashboard dstc chi tiets in the entity cache if it is enabled.
	 *
	 * @param rpDashboardDstcChiTiets the rp dashboard dstc chi tiets
	 */
	public void cacheResult(
		java.util.List<RpDashboardDstcChiTiet> rpDashboardDstcChiTiets);

	/**
	 * Creates a new rp dashboard dstc chi tiet with the primary key. Does not add the rp dashboard dstc chi tiet to the database.
	 *
	 * @param id the primary key for the new rp dashboard dstc chi tiet
	 * @return the new rp dashboard dstc chi tiet
	 */
	public RpDashboardDstcChiTiet create(String id);

	/**
	 * Removes the rp dashboard dstc chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard dstc chi tiet
	 * @return the rp dashboard dstc chi tiet that was removed
	 * @throws NoSuchRpDashboardDstcChiTietException if a rp dashboard dstc chi tiet with the primary key could not be found
	 */
	public RpDashboardDstcChiTiet remove(String id)
		throws NoSuchRpDashboardDstcChiTietException;

	public RpDashboardDstcChiTiet updateImpl(
		RpDashboardDstcChiTiet rpDashboardDstcChiTiet);

	/**
	 * Returns the rp dashboard dstc chi tiet with the primary key or throws a <code>NoSuchRpDashboardDstcChiTietException</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard dstc chi tiet
	 * @return the rp dashboard dstc chi tiet
	 * @throws NoSuchRpDashboardDstcChiTietException if a rp dashboard dstc chi tiet with the primary key could not be found
	 */
	public RpDashboardDstcChiTiet findByPrimaryKey(String id)
		throws NoSuchRpDashboardDstcChiTietException;

	/**
	 * Returns the rp dashboard dstc chi tiet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard dstc chi tiet
	 * @return the rp dashboard dstc chi tiet, or <code>null</code> if a rp dashboard dstc chi tiet with the primary key could not be found
	 */
	public RpDashboardDstcChiTiet fetchByPrimaryKey(String id);

	/**
	 * Returns all the rp dashboard dstc chi tiets.
	 *
	 * @return the rp dashboard dstc chi tiets
	 */
	public java.util.List<RpDashboardDstcChiTiet> findAll();

	/**
	 * Returns a range of all the rp dashboard dstc chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDstcChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dstc chi tiets
	 * @param end the upper bound of the range of rp dashboard dstc chi tiets (not inclusive)
	 * @return the range of rp dashboard dstc chi tiets
	 */
	public java.util.List<RpDashboardDstcChiTiet> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the rp dashboard dstc chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDstcChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dstc chi tiets
	 * @param end the upper bound of the range of rp dashboard dstc chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard dstc chi tiets
	 */
	public java.util.List<RpDashboardDstcChiTiet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpDashboardDstcChiTiet>
			orderByComparator);

	/**
	 * Returns an ordered range of all the rp dashboard dstc chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDstcChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dstc chi tiets
	 * @param end the upper bound of the range of rp dashboard dstc chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard dstc chi tiets
	 */
	public java.util.List<RpDashboardDstcChiTiet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpDashboardDstcChiTiet>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the rp dashboard dstc chi tiets from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of rp dashboard dstc chi tiets.
	 *
	 * @return the number of rp dashboard dstc chi tiets
	 */
	public int countAll();

}