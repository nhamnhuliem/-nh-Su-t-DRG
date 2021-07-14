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

import drg.moh.service.exception.NoSuchDashboardDinhSuatException;
import drg.moh.service.model.DashboardDinhSuat;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the dashboard dinh suat service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see DashboardDinhSuatUtil
 * @generated
 */
@ProviderType
public interface DashboardDinhSuatPersistence
	extends BasePersistence<DashboardDinhSuat> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DashboardDinhSuatUtil} to access the dashboard dinh suat persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the dashboard dinh suats where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard dinh suats
	 */
	public java.util.List<DashboardDinhSuat> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam);

	/**
	 * Returns a range of all the dashboard dinh suats where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardDinhSuatModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard dinh suats
	 * @param end the upper bound of the range of dashboard dinh suats (not inclusive)
	 * @return the range of matching dashboard dinh suats
	 */
	public java.util.List<DashboardDinhSuat> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end);

	/**
	 * Returns an ordered range of all the dashboard dinh suats where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardDinhSuatModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard dinh suats
	 * @param end the upper bound of the range of dashboard dinh suats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dashboard dinh suats
	 */
	public java.util.List<DashboardDinhSuat> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardDinhSuat>
			orderByComparator);

	/**
	 * Returns an ordered range of all the dashboard dinh suats where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardDinhSuatModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard dinh suats
	 * @param end the upper bound of the range of dashboard dinh suats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dashboard dinh suats
	 */
	public java.util.List<DashboardDinhSuat> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardDinhSuat>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dashboard dinh suat in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard dinh suat
	 * @throws NoSuchDashboardDinhSuatException if a matching dashboard dinh suat could not be found
	 */
	public DashboardDinhSuat findByORG_MUC_NAM_First(
			long orgId, int mucBc, int nam,
			com.liferay.portal.kernel.util.OrderByComparator<DashboardDinhSuat>
				orderByComparator)
		throws NoSuchDashboardDinhSuatException;

	/**
	 * Returns the first dashboard dinh suat in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard dinh suat, or <code>null</code> if a matching dashboard dinh suat could not be found
	 */
	public DashboardDinhSuat fetchByORG_MUC_NAM_First(
		long orgId, int mucBc, int nam,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardDinhSuat>
			orderByComparator);

	/**
	 * Returns the last dashboard dinh suat in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard dinh suat
	 * @throws NoSuchDashboardDinhSuatException if a matching dashboard dinh suat could not be found
	 */
	public DashboardDinhSuat findByORG_MUC_NAM_Last(
			long orgId, int mucBc, int nam,
			com.liferay.portal.kernel.util.OrderByComparator<DashboardDinhSuat>
				orderByComparator)
		throws NoSuchDashboardDinhSuatException;

	/**
	 * Returns the last dashboard dinh suat in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard dinh suat, or <code>null</code> if a matching dashboard dinh suat could not be found
	 */
	public DashboardDinhSuat fetchByORG_MUC_NAM_Last(
		long orgId, int mucBc, int nam,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardDinhSuat>
			orderByComparator);

	/**
	 * Returns the dashboard dinh suats before and after the current dashboard dinh suat in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current dashboard dinh suat
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dashboard dinh suat
	 * @throws NoSuchDashboardDinhSuatException if a dashboard dinh suat with the primary key could not be found
	 */
	public DashboardDinhSuat[] findByORG_MUC_NAM_PrevAndNext(
			long id, long orgId, int mucBc, int nam,
			com.liferay.portal.kernel.util.OrderByComparator<DashboardDinhSuat>
				orderByComparator)
		throws NoSuchDashboardDinhSuatException;

	/**
	 * Removes all the dashboard dinh suats where orgId = &#63; and mucBc = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 */
	public void removeByORG_MUC_NAM(long orgId, int mucBc, int nam);

	/**
	 * Returns the number of dashboard dinh suats where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the number of matching dashboard dinh suats
	 */
	public int countByORG_MUC_NAM(long orgId, int mucBc, int nam);

	/**
	 * Caches the dashboard dinh suat in the entity cache if it is enabled.
	 *
	 * @param dashboardDinhSuat the dashboard dinh suat
	 */
	public void cacheResult(DashboardDinhSuat dashboardDinhSuat);

	/**
	 * Caches the dashboard dinh suats in the entity cache if it is enabled.
	 *
	 * @param dashboardDinhSuats the dashboard dinh suats
	 */
	public void cacheResult(
		java.util.List<DashboardDinhSuat> dashboardDinhSuats);

	/**
	 * Creates a new dashboard dinh suat with the primary key. Does not add the dashboard dinh suat to the database.
	 *
	 * @param id the primary key for the new dashboard dinh suat
	 * @return the new dashboard dinh suat
	 */
	public DashboardDinhSuat create(long id);

	/**
	 * Removes the dashboard dinh suat with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dashboard dinh suat
	 * @return the dashboard dinh suat that was removed
	 * @throws NoSuchDashboardDinhSuatException if a dashboard dinh suat with the primary key could not be found
	 */
	public DashboardDinhSuat remove(long id)
		throws NoSuchDashboardDinhSuatException;

	public DashboardDinhSuat updateImpl(DashboardDinhSuat dashboardDinhSuat);

	/**
	 * Returns the dashboard dinh suat with the primary key or throws a <code>NoSuchDashboardDinhSuatException</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard dinh suat
	 * @return the dashboard dinh suat
	 * @throws NoSuchDashboardDinhSuatException if a dashboard dinh suat with the primary key could not be found
	 */
	public DashboardDinhSuat findByPrimaryKey(long id)
		throws NoSuchDashboardDinhSuatException;

	/**
	 * Returns the dashboard dinh suat with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard dinh suat
	 * @return the dashboard dinh suat, or <code>null</code> if a dashboard dinh suat with the primary key could not be found
	 */
	public DashboardDinhSuat fetchByPrimaryKey(long id);

	/**
	 * Returns all the dashboard dinh suats.
	 *
	 * @return the dashboard dinh suats
	 */
	public java.util.List<DashboardDinhSuat> findAll();

	/**
	 * Returns a range of all the dashboard dinh suats.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardDinhSuatModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard dinh suats
	 * @param end the upper bound of the range of dashboard dinh suats (not inclusive)
	 * @return the range of dashboard dinh suats
	 */
	public java.util.List<DashboardDinhSuat> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the dashboard dinh suats.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardDinhSuatModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard dinh suats
	 * @param end the upper bound of the range of dashboard dinh suats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard dinh suats
	 */
	public java.util.List<DashboardDinhSuat> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardDinhSuat>
			orderByComparator);

	/**
	 * Returns an ordered range of all the dashboard dinh suats.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardDinhSuatModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard dinh suats
	 * @param end the upper bound of the range of dashboard dinh suats (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard dinh suats
	 */
	public java.util.List<DashboardDinhSuat> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardDinhSuat>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the dashboard dinh suats from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of dashboard dinh suats.
	 *
	 * @return the number of dashboard dinh suats
	 */
	public int countAll();

}