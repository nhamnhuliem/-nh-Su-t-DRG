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

import drg.moh.service.exception.NoSuchDashboardChiPhiHoatDongException;
import drg.moh.service.model.DashboardChiPhiHoatDong;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the dashboard chi phi hoat dong service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see DashboardChiPhiHoatDongUtil
 * @generated
 */
@ProviderType
public interface DashboardChiPhiHoatDongPersistence
	extends BasePersistence<DashboardChiPhiHoatDong> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DashboardChiPhiHoatDongUtil} to access the dashboard chi phi hoat dong persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard chi phi hoat dongs
	 */
	public java.util.List<DashboardChiPhiHoatDong> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam);

	/**
	 * Returns a range of all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @return the range of matching dashboard chi phi hoat dongs
	 */
	public java.util.List<DashboardChiPhiHoatDong> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end);

	/**
	 * Returns an ordered range of all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dashboard chi phi hoat dongs
	 */
	public java.util.List<DashboardChiPhiHoatDong> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<DashboardChiPhiHoatDong> orderByComparator);

	/**
	 * Returns an ordered range of all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dashboard chi phi hoat dongs
	 */
	public java.util.List<DashboardChiPhiHoatDong> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<DashboardChiPhiHoatDong> orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard chi phi hoat dong
	 * @throws NoSuchDashboardChiPhiHoatDongException if a matching dashboard chi phi hoat dong could not be found
	 */
	public DashboardChiPhiHoatDong findByORG_MUC_NAM_First(
			long orgId, int mucBc, int nam,
			com.liferay.portal.kernel.util.OrderByComparator
				<DashboardChiPhiHoatDong> orderByComparator)
		throws NoSuchDashboardChiPhiHoatDongException;

	/**
	 * Returns the first dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard chi phi hoat dong, or <code>null</code> if a matching dashboard chi phi hoat dong could not be found
	 */
	public DashboardChiPhiHoatDong fetchByORG_MUC_NAM_First(
		long orgId, int mucBc, int nam,
		com.liferay.portal.kernel.util.OrderByComparator
			<DashboardChiPhiHoatDong> orderByComparator);

	/**
	 * Returns the last dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard chi phi hoat dong
	 * @throws NoSuchDashboardChiPhiHoatDongException if a matching dashboard chi phi hoat dong could not be found
	 */
	public DashboardChiPhiHoatDong findByORG_MUC_NAM_Last(
			long orgId, int mucBc, int nam,
			com.liferay.portal.kernel.util.OrderByComparator
				<DashboardChiPhiHoatDong> orderByComparator)
		throws NoSuchDashboardChiPhiHoatDongException;

	/**
	 * Returns the last dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard chi phi hoat dong, or <code>null</code> if a matching dashboard chi phi hoat dong could not be found
	 */
	public DashboardChiPhiHoatDong fetchByORG_MUC_NAM_Last(
		long orgId, int mucBc, int nam,
		com.liferay.portal.kernel.util.OrderByComparator
			<DashboardChiPhiHoatDong> orderByComparator);

	/**
	 * Returns the dashboard chi phi hoat dongs before and after the current dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current dashboard chi phi hoat dong
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dashboard chi phi hoat dong
	 * @throws NoSuchDashboardChiPhiHoatDongException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	public DashboardChiPhiHoatDong[] findByORG_MUC_NAM_PrevAndNext(
			long id, long orgId, int mucBc, int nam,
			com.liferay.portal.kernel.util.OrderByComparator
				<DashboardChiPhiHoatDong> orderByComparator)
		throws NoSuchDashboardChiPhiHoatDongException;

	/**
	 * Removes all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 */
	public void removeByORG_MUC_NAM(long orgId, int mucBc, int nam);

	/**
	 * Returns the number of dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the number of matching dashboard chi phi hoat dongs
	 */
	public int countByORG_MUC_NAM(long orgId, int mucBc, int nam);

	/**
	 * Caches the dashboard chi phi hoat dong in the entity cache if it is enabled.
	 *
	 * @param dashboardChiPhiHoatDong the dashboard chi phi hoat dong
	 */
	public void cacheResult(DashboardChiPhiHoatDong dashboardChiPhiHoatDong);

	/**
	 * Caches the dashboard chi phi hoat dongs in the entity cache if it is enabled.
	 *
	 * @param dashboardChiPhiHoatDongs the dashboard chi phi hoat dongs
	 */
	public void cacheResult(
		java.util.List<DashboardChiPhiHoatDong> dashboardChiPhiHoatDongs);

	/**
	 * Creates a new dashboard chi phi hoat dong with the primary key. Does not add the dashboard chi phi hoat dong to the database.
	 *
	 * @param id the primary key for the new dashboard chi phi hoat dong
	 * @return the new dashboard chi phi hoat dong
	 */
	public DashboardChiPhiHoatDong create(long id);

	/**
	 * Removes the dashboard chi phi hoat dong with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong that was removed
	 * @throws NoSuchDashboardChiPhiHoatDongException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	public DashboardChiPhiHoatDong remove(long id)
		throws NoSuchDashboardChiPhiHoatDongException;

	public DashboardChiPhiHoatDong updateImpl(
		DashboardChiPhiHoatDong dashboardChiPhiHoatDong);

	/**
	 * Returns the dashboard chi phi hoat dong with the primary key or throws a <code>NoSuchDashboardChiPhiHoatDongException</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong
	 * @throws NoSuchDashboardChiPhiHoatDongException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	public DashboardChiPhiHoatDong findByPrimaryKey(long id)
		throws NoSuchDashboardChiPhiHoatDongException;

	/**
	 * Returns the dashboard chi phi hoat dong with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong, or <code>null</code> if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	public DashboardChiPhiHoatDong fetchByPrimaryKey(long id);

	/**
	 * Returns all the dashboard chi phi hoat dongs.
	 *
	 * @return the dashboard chi phi hoat dongs
	 */
	public java.util.List<DashboardChiPhiHoatDong> findAll();

	/**
	 * Returns a range of all the dashboard chi phi hoat dongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @return the range of dashboard chi phi hoat dongs
	 */
	public java.util.List<DashboardChiPhiHoatDong> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the dashboard chi phi hoat dongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard chi phi hoat dongs
	 */
	public java.util.List<DashboardChiPhiHoatDong> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<DashboardChiPhiHoatDong> orderByComparator);

	/**
	 * Returns an ordered range of all the dashboard chi phi hoat dongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard chi phi hoat dongs
	 */
	public java.util.List<DashboardChiPhiHoatDong> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<DashboardChiPhiHoatDong> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the dashboard chi phi hoat dongs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of dashboard chi phi hoat dongs.
	 *
	 * @return the number of dashboard chi phi hoat dongs
	 */
	public int countAll();

}