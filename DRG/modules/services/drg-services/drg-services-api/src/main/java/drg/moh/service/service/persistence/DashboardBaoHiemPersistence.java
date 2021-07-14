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

import drg.moh.service.exception.NoSuchDashboardBaoHiemException;
import drg.moh.service.model.DashboardBaoHiem;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the dashboard bao hiem service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see DashboardBaoHiemUtil
 * @generated
 */
@ProviderType
public interface DashboardBaoHiemPersistence
	extends BasePersistence<DashboardBaoHiem> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DashboardBaoHiemUtil} to access the dashboard bao hiem persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard bao hiems
	 */
	public java.util.List<DashboardBaoHiem> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam);

	/**
	 * Returns a range of all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @return the range of matching dashboard bao hiems
	 */
	public java.util.List<DashboardBaoHiem> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end);

	/**
	 * Returns an ordered range of all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dashboard bao hiems
	 */
	public java.util.List<DashboardBaoHiem> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardBaoHiem>
			orderByComparator);

	/**
	 * Returns an ordered range of all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dashboard bao hiems
	 */
	public java.util.List<DashboardBaoHiem> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardBaoHiem>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard bao hiem
	 * @throws NoSuchDashboardBaoHiemException if a matching dashboard bao hiem could not be found
	 */
	public DashboardBaoHiem findByORG_MUC_NAM_First(
			long orgId, int mucBc, int nam,
			com.liferay.portal.kernel.util.OrderByComparator<DashboardBaoHiem>
				orderByComparator)
		throws NoSuchDashboardBaoHiemException;

	/**
	 * Returns the first dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard bao hiem, or <code>null</code> if a matching dashboard bao hiem could not be found
	 */
	public DashboardBaoHiem fetchByORG_MUC_NAM_First(
		long orgId, int mucBc, int nam,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardBaoHiem>
			orderByComparator);

	/**
	 * Returns the last dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard bao hiem
	 * @throws NoSuchDashboardBaoHiemException if a matching dashboard bao hiem could not be found
	 */
	public DashboardBaoHiem findByORG_MUC_NAM_Last(
			long orgId, int mucBc, int nam,
			com.liferay.portal.kernel.util.OrderByComparator<DashboardBaoHiem>
				orderByComparator)
		throws NoSuchDashboardBaoHiemException;

	/**
	 * Returns the last dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard bao hiem, or <code>null</code> if a matching dashboard bao hiem could not be found
	 */
	public DashboardBaoHiem fetchByORG_MUC_NAM_Last(
		long orgId, int mucBc, int nam,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardBaoHiem>
			orderByComparator);

	/**
	 * Returns the dashboard bao hiems before and after the current dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current dashboard bao hiem
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dashboard bao hiem
	 * @throws NoSuchDashboardBaoHiemException if a dashboard bao hiem with the primary key could not be found
	 */
	public DashboardBaoHiem[] findByORG_MUC_NAM_PrevAndNext(
			long id, long orgId, int mucBc, int nam,
			com.liferay.portal.kernel.util.OrderByComparator<DashboardBaoHiem>
				orderByComparator)
		throws NoSuchDashboardBaoHiemException;

	/**
	 * Removes all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 */
	public void removeByORG_MUC_NAM(long orgId, int mucBc, int nam);

	/**
	 * Returns the number of dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the number of matching dashboard bao hiems
	 */
	public int countByORG_MUC_NAM(long orgId, int mucBc, int nam);

	/**
	 * Caches the dashboard bao hiem in the entity cache if it is enabled.
	 *
	 * @param dashboardBaoHiem the dashboard bao hiem
	 */
	public void cacheResult(DashboardBaoHiem dashboardBaoHiem);

	/**
	 * Caches the dashboard bao hiems in the entity cache if it is enabled.
	 *
	 * @param dashboardBaoHiems the dashboard bao hiems
	 */
	public void cacheResult(java.util.List<DashboardBaoHiem> dashboardBaoHiems);

	/**
	 * Creates a new dashboard bao hiem with the primary key. Does not add the dashboard bao hiem to the database.
	 *
	 * @param id the primary key for the new dashboard bao hiem
	 * @return the new dashboard bao hiem
	 */
	public DashboardBaoHiem create(long id);

	/**
	 * Removes the dashboard bao hiem with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dashboard bao hiem
	 * @return the dashboard bao hiem that was removed
	 * @throws NoSuchDashboardBaoHiemException if a dashboard bao hiem with the primary key could not be found
	 */
	public DashboardBaoHiem remove(long id)
		throws NoSuchDashboardBaoHiemException;

	public DashboardBaoHiem updateImpl(DashboardBaoHiem dashboardBaoHiem);

	/**
	 * Returns the dashboard bao hiem with the primary key or throws a <code>NoSuchDashboardBaoHiemException</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard bao hiem
	 * @return the dashboard bao hiem
	 * @throws NoSuchDashboardBaoHiemException if a dashboard bao hiem with the primary key could not be found
	 */
	public DashboardBaoHiem findByPrimaryKey(long id)
		throws NoSuchDashboardBaoHiemException;

	/**
	 * Returns the dashboard bao hiem with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard bao hiem
	 * @return the dashboard bao hiem, or <code>null</code> if a dashboard bao hiem with the primary key could not be found
	 */
	public DashboardBaoHiem fetchByPrimaryKey(long id);

	/**
	 * Returns all the dashboard bao hiems.
	 *
	 * @return the dashboard bao hiems
	 */
	public java.util.List<DashboardBaoHiem> findAll();

	/**
	 * Returns a range of all the dashboard bao hiems.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @return the range of dashboard bao hiems
	 */
	public java.util.List<DashboardBaoHiem> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the dashboard bao hiems.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard bao hiems
	 */
	public java.util.List<DashboardBaoHiem> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardBaoHiem>
			orderByComparator);

	/**
	 * Returns an ordered range of all the dashboard bao hiems.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard bao hiems
	 */
	public java.util.List<DashboardBaoHiem> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardBaoHiem>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the dashboard bao hiems from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of dashboard bao hiems.
	 *
	 * @return the number of dashboard bao hiems
	 */
	public int countAll();

}