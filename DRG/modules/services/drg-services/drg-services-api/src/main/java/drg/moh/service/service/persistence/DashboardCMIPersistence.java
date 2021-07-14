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

import drg.moh.service.exception.NoSuchDashboardCMIException;
import drg.moh.service.model.DashboardCMI;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the dashboard cmi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see DashboardCMIUtil
 * @generated
 */
@ProviderType
public interface DashboardCMIPersistence extends BasePersistence<DashboardCMI> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DashboardCMIUtil} to access the dashboard cmi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the dashboard cmis where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard cmis
	 */
	public java.util.List<DashboardCMI> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam);

	/**
	 * Returns a range of all the dashboard cmis where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardCMIModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard cmis
	 * @param end the upper bound of the range of dashboard cmis (not inclusive)
	 * @return the range of matching dashboard cmis
	 */
	public java.util.List<DashboardCMI> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end);

	/**
	 * Returns an ordered range of all the dashboard cmis where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardCMIModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard cmis
	 * @param end the upper bound of the range of dashboard cmis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dashboard cmis
	 */
	public java.util.List<DashboardCMI> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardCMI>
			orderByComparator);

	/**
	 * Returns an ordered range of all the dashboard cmis where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardCMIModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard cmis
	 * @param end the upper bound of the range of dashboard cmis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dashboard cmis
	 */
	public java.util.List<DashboardCMI> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardCMI>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first dashboard cmi in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard cmi
	 * @throws NoSuchDashboardCMIException if a matching dashboard cmi could not be found
	 */
	public DashboardCMI findByORG_MUC_NAM_First(
			long orgId, int mucBc, int nam,
			com.liferay.portal.kernel.util.OrderByComparator<DashboardCMI>
				orderByComparator)
		throws NoSuchDashboardCMIException;

	/**
	 * Returns the first dashboard cmi in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard cmi, or <code>null</code> if a matching dashboard cmi could not be found
	 */
	public DashboardCMI fetchByORG_MUC_NAM_First(
		long orgId, int mucBc, int nam,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardCMI>
			orderByComparator);

	/**
	 * Returns the last dashboard cmi in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard cmi
	 * @throws NoSuchDashboardCMIException if a matching dashboard cmi could not be found
	 */
	public DashboardCMI findByORG_MUC_NAM_Last(
			long orgId, int mucBc, int nam,
			com.liferay.portal.kernel.util.OrderByComparator<DashboardCMI>
				orderByComparator)
		throws NoSuchDashboardCMIException;

	/**
	 * Returns the last dashboard cmi in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard cmi, or <code>null</code> if a matching dashboard cmi could not be found
	 */
	public DashboardCMI fetchByORG_MUC_NAM_Last(
		long orgId, int mucBc, int nam,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardCMI>
			orderByComparator);

	/**
	 * Returns the dashboard cmis before and after the current dashboard cmi in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current dashboard cmi
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dashboard cmi
	 * @throws NoSuchDashboardCMIException if a dashboard cmi with the primary key could not be found
	 */
	public DashboardCMI[] findByORG_MUC_NAM_PrevAndNext(
			long id, long orgId, int mucBc, int nam,
			com.liferay.portal.kernel.util.OrderByComparator<DashboardCMI>
				orderByComparator)
		throws NoSuchDashboardCMIException;

	/**
	 * Removes all the dashboard cmis where orgId = &#63; and mucBc = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 */
	public void removeByORG_MUC_NAM(long orgId, int mucBc, int nam);

	/**
	 * Returns the number of dashboard cmis where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the number of matching dashboard cmis
	 */
	public int countByORG_MUC_NAM(long orgId, int mucBc, int nam);

	/**
	 * Caches the dashboard cmi in the entity cache if it is enabled.
	 *
	 * @param dashboardCMI the dashboard cmi
	 */
	public void cacheResult(DashboardCMI dashboardCMI);

	/**
	 * Caches the dashboard cmis in the entity cache if it is enabled.
	 *
	 * @param dashboardCMIs the dashboard cmis
	 */
	public void cacheResult(java.util.List<DashboardCMI> dashboardCMIs);

	/**
	 * Creates a new dashboard cmi with the primary key. Does not add the dashboard cmi to the database.
	 *
	 * @param id the primary key for the new dashboard cmi
	 * @return the new dashboard cmi
	 */
	public DashboardCMI create(long id);

	/**
	 * Removes the dashboard cmi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dashboard cmi
	 * @return the dashboard cmi that was removed
	 * @throws NoSuchDashboardCMIException if a dashboard cmi with the primary key could not be found
	 */
	public DashboardCMI remove(long id) throws NoSuchDashboardCMIException;

	public DashboardCMI updateImpl(DashboardCMI dashboardCMI);

	/**
	 * Returns the dashboard cmi with the primary key or throws a <code>NoSuchDashboardCMIException</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard cmi
	 * @return the dashboard cmi
	 * @throws NoSuchDashboardCMIException if a dashboard cmi with the primary key could not be found
	 */
	public DashboardCMI findByPrimaryKey(long id)
		throws NoSuchDashboardCMIException;

	/**
	 * Returns the dashboard cmi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard cmi
	 * @return the dashboard cmi, or <code>null</code> if a dashboard cmi with the primary key could not be found
	 */
	public DashboardCMI fetchByPrimaryKey(long id);

	/**
	 * Returns all the dashboard cmis.
	 *
	 * @return the dashboard cmis
	 */
	public java.util.List<DashboardCMI> findAll();

	/**
	 * Returns a range of all the dashboard cmis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardCMIModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard cmis
	 * @param end the upper bound of the range of dashboard cmis (not inclusive)
	 * @return the range of dashboard cmis
	 */
	public java.util.List<DashboardCMI> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the dashboard cmis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardCMIModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard cmis
	 * @param end the upper bound of the range of dashboard cmis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard cmis
	 */
	public java.util.List<DashboardCMI> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardCMI>
			orderByComparator);

	/**
	 * Returns an ordered range of all the dashboard cmis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardCMIModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard cmis
	 * @param end the upper bound of the range of dashboard cmis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard cmis
	 */
	public java.util.List<DashboardCMI> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DashboardCMI>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the dashboard cmis from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of dashboard cmis.
	 *
	 * @return the number of dashboard cmis
	 */
	public int countAll();

}