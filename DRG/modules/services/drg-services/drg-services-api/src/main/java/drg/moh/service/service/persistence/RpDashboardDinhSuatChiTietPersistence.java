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

import drg.moh.service.exception.NoSuchRpDashboardDinhSuatChiTietException;
import drg.moh.service.model.RpDashboardDinhSuatChiTiet;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the rp dashboard dinh suat chi tiet service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see RpDashboardDinhSuatChiTietUtil
 * @generated
 */
@ProviderType
public interface RpDashboardDinhSuatChiTietPersistence
	extends BasePersistence<RpDashboardDinhSuatChiTiet> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RpDashboardDinhSuatChiTietUtil} to access the rp dashboard dinh suat chi tiet persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the rp dashboard dinh suat chi tiet in the entity cache if it is enabled.
	 *
	 * @param rpDashboardDinhSuatChiTiet the rp dashboard dinh suat chi tiet
	 */
	public void cacheResult(
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet);

	/**
	 * Caches the rp dashboard dinh suat chi tiets in the entity cache if it is enabled.
	 *
	 * @param rpDashboardDinhSuatChiTiets the rp dashboard dinh suat chi tiets
	 */
	public void cacheResult(
		java.util.List<RpDashboardDinhSuatChiTiet> rpDashboardDinhSuatChiTiets);

	/**
	 * Creates a new rp dashboard dinh suat chi tiet with the primary key. Does not add the rp dashboard dinh suat chi tiet to the database.
	 *
	 * @param id the primary key for the new rp dashboard dinh suat chi tiet
	 * @return the new rp dashboard dinh suat chi tiet
	 */
	public RpDashboardDinhSuatChiTiet create(long id);

	/**
	 * Removes the rp dashboard dinh suat chi tiet with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet that was removed
	 * @throws NoSuchRpDashboardDinhSuatChiTietException if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	public RpDashboardDinhSuatChiTiet remove(long id)
		throws NoSuchRpDashboardDinhSuatChiTietException;

	public RpDashboardDinhSuatChiTiet updateImpl(
		RpDashboardDinhSuatChiTiet rpDashboardDinhSuatChiTiet);

	/**
	 * Returns the rp dashboard dinh suat chi tiet with the primary key or throws a <code>NoSuchRpDashboardDinhSuatChiTietException</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet
	 * @throws NoSuchRpDashboardDinhSuatChiTietException if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	public RpDashboardDinhSuatChiTiet findByPrimaryKey(long id)
		throws NoSuchRpDashboardDinhSuatChiTietException;

	/**
	 * Returns the rp dashboard dinh suat chi tiet with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard dinh suat chi tiet
	 * @return the rp dashboard dinh suat chi tiet, or <code>null</code> if a rp dashboard dinh suat chi tiet with the primary key could not be found
	 */
	public RpDashboardDinhSuatChiTiet fetchByPrimaryKey(long id);

	/**
	 * Returns all the rp dashboard dinh suat chi tiets.
	 *
	 * @return the rp dashboard dinh suat chi tiets
	 */
	public java.util.List<RpDashboardDinhSuatChiTiet> findAll();

	/**
	 * Returns a range of all the rp dashboard dinh suat chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDinhSuatChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dinh suat chi tiets
	 * @param end the upper bound of the range of rp dashboard dinh suat chi tiets (not inclusive)
	 * @return the range of rp dashboard dinh suat chi tiets
	 */
	public java.util.List<RpDashboardDinhSuatChiTiet> findAll(
		int start, int end);

	/**
	 * Returns an ordered range of all the rp dashboard dinh suat chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDinhSuatChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dinh suat chi tiets
	 * @param end the upper bound of the range of rp dashboard dinh suat chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard dinh suat chi tiets
	 */
	public java.util.List<RpDashboardDinhSuatChiTiet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<RpDashboardDinhSuatChiTiet> orderByComparator);

	/**
	 * Returns an ordered range of all the rp dashboard dinh suat chi tiets.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDinhSuatChiTietModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard dinh suat chi tiets
	 * @param end the upper bound of the range of rp dashboard dinh suat chi tiets (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard dinh suat chi tiets
	 */
	public java.util.List<RpDashboardDinhSuatChiTiet> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<RpDashboardDinhSuatChiTiet> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the rp dashboard dinh suat chi tiets from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of rp dashboard dinh suat chi tiets.
	 *
	 * @return the number of rp dashboard dinh suat chi tiets
	 */
	public int countAll();

}