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

import drg.moh.service.exception.NoSuchDashboardChiPhiThanhPhanException;
import drg.moh.service.model.DashboardChiPhiThanhPhan;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the dashboard chi phi thanh phan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see DashboardChiPhiThanhPhanUtil
 * @generated
 */
@ProviderType
public interface DashboardChiPhiThanhPhanPersistence
	extends BasePersistence<DashboardChiPhiThanhPhan> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DashboardChiPhiThanhPhanUtil} to access the dashboard chi phi thanh phan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns the dashboard chi phi thanh phan where orgId = &#63; and mucBc = &#63; and nam = &#63; or throws a <code>NoSuchDashboardChiPhiThanhPhanException</code> if it could not be found.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard chi phi thanh phan
	 * @throws NoSuchDashboardChiPhiThanhPhanException if a matching dashboard chi phi thanh phan could not be found
	 */
	public DashboardChiPhiThanhPhan findByORG_MUC_NAM(
			long orgId, int mucBc, int nam)
		throws NoSuchDashboardChiPhiThanhPhanException;

	/**
	 * Returns the dashboard chi phi thanh phan where orgId = &#63; and mucBc = &#63; and nam = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard chi phi thanh phan, or <code>null</code> if a matching dashboard chi phi thanh phan could not be found
	 */
	public DashboardChiPhiThanhPhan fetchByORG_MUC_NAM(
		long orgId, int mucBc, int nam);

	/**
	 * Returns the dashboard chi phi thanh phan where orgId = &#63; and mucBc = &#63; and nam = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dashboard chi phi thanh phan, or <code>null</code> if a matching dashboard chi phi thanh phan could not be found
	 */
	public DashboardChiPhiThanhPhan fetchByORG_MUC_NAM(
		long orgId, int mucBc, int nam, boolean useFinderCache);

	/**
	 * Removes the dashboard chi phi thanh phan where orgId = &#63; and mucBc = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the dashboard chi phi thanh phan that was removed
	 */
	public DashboardChiPhiThanhPhan removeByORG_MUC_NAM(
			long orgId, int mucBc, int nam)
		throws NoSuchDashboardChiPhiThanhPhanException;

	/**
	 * Returns the number of dashboard chi phi thanh phans where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the number of matching dashboard chi phi thanh phans
	 */
	public int countByORG_MUC_NAM(long orgId, int mucBc, int nam);

	/**
	 * Caches the dashboard chi phi thanh phan in the entity cache if it is enabled.
	 *
	 * @param dashboardChiPhiThanhPhan the dashboard chi phi thanh phan
	 */
	public void cacheResult(DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan);

	/**
	 * Caches the dashboard chi phi thanh phans in the entity cache if it is enabled.
	 *
	 * @param dashboardChiPhiThanhPhans the dashboard chi phi thanh phans
	 */
	public void cacheResult(
		java.util.List<DashboardChiPhiThanhPhan> dashboardChiPhiThanhPhans);

	/**
	 * Creates a new dashboard chi phi thanh phan with the primary key. Does not add the dashboard chi phi thanh phan to the database.
	 *
	 * @param id the primary key for the new dashboard chi phi thanh phan
	 * @return the new dashboard chi phi thanh phan
	 */
	public DashboardChiPhiThanhPhan create(long id);

	/**
	 * Removes the dashboard chi phi thanh phan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan that was removed
	 * @throws NoSuchDashboardChiPhiThanhPhanException if a dashboard chi phi thanh phan with the primary key could not be found
	 */
	public DashboardChiPhiThanhPhan remove(long id)
		throws NoSuchDashboardChiPhiThanhPhanException;

	public DashboardChiPhiThanhPhan updateImpl(
		DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan);

	/**
	 * Returns the dashboard chi phi thanh phan with the primary key or throws a <code>NoSuchDashboardChiPhiThanhPhanException</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan
	 * @throws NoSuchDashboardChiPhiThanhPhanException if a dashboard chi phi thanh phan with the primary key could not be found
	 */
	public DashboardChiPhiThanhPhan findByPrimaryKey(long id)
		throws NoSuchDashboardChiPhiThanhPhanException;

	/**
	 * Returns the dashboard chi phi thanh phan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan, or <code>null</code> if a dashboard chi phi thanh phan with the primary key could not be found
	 */
	public DashboardChiPhiThanhPhan fetchByPrimaryKey(long id);

	/**
	 * Returns all the dashboard chi phi thanh phans.
	 *
	 * @return the dashboard chi phi thanh phans
	 */
	public java.util.List<DashboardChiPhiThanhPhan> findAll();

	/**
	 * Returns a range of all the dashboard chi phi thanh phans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiThanhPhanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi thanh phans
	 * @param end the upper bound of the range of dashboard chi phi thanh phans (not inclusive)
	 * @return the range of dashboard chi phi thanh phans
	 */
	public java.util.List<DashboardChiPhiThanhPhan> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the dashboard chi phi thanh phans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiThanhPhanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi thanh phans
	 * @param end the upper bound of the range of dashboard chi phi thanh phans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard chi phi thanh phans
	 */
	public java.util.List<DashboardChiPhiThanhPhan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<DashboardChiPhiThanhPhan> orderByComparator);

	/**
	 * Returns an ordered range of all the dashboard chi phi thanh phans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiThanhPhanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi thanh phans
	 * @param end the upper bound of the range of dashboard chi phi thanh phans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard chi phi thanh phans
	 */
	public java.util.List<DashboardChiPhiThanhPhan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator
			<DashboardChiPhiThanhPhan> orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the dashboard chi phi thanh phans from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of dashboard chi phi thanh phans.
	 *
	 * @return the number of dashboard chi phi thanh phans
	 */
	public int countAll();

}