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

import drg.moh.service.exception.NoSuchRpDashboardCphdException;
import drg.moh.service.model.RpDashboardCphd;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the rp dashboard cphd service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see RpDashboardCphdUtil
 * @generated
 */
@ProviderType
public interface RpDashboardCphdPersistence
	extends BasePersistence<RpDashboardCphd> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RpDashboardCphdUtil} to access the rp dashboard cphd persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the rp dashboard cphd in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCphd the rp dashboard cphd
	 */
	public void cacheResult(RpDashboardCphd rpDashboardCphd);

	/**
	 * Caches the rp dashboard cphds in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCphds the rp dashboard cphds
	 */
	public void cacheResult(java.util.List<RpDashboardCphd> rpDashboardCphds);

	/**
	 * Creates a new rp dashboard cphd with the primary key. Does not add the rp dashboard cphd to the database.
	 *
	 * @param id the primary key for the new rp dashboard cphd
	 * @return the new rp dashboard cphd
	 */
	public RpDashboardCphd create(long id);

	/**
	 * Removes the rp dashboard cphd with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard cphd
	 * @return the rp dashboard cphd that was removed
	 * @throws NoSuchRpDashboardCphdException if a rp dashboard cphd with the primary key could not be found
	 */
	public RpDashboardCphd remove(long id)
		throws NoSuchRpDashboardCphdException;

	public RpDashboardCphd updateImpl(RpDashboardCphd rpDashboardCphd);

	/**
	 * Returns the rp dashboard cphd with the primary key or throws a <code>NoSuchRpDashboardCphdException</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cphd
	 * @return the rp dashboard cphd
	 * @throws NoSuchRpDashboardCphdException if a rp dashboard cphd with the primary key could not be found
	 */
	public RpDashboardCphd findByPrimaryKey(long id)
		throws NoSuchRpDashboardCphdException;

	/**
	 * Returns the rp dashboard cphd with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cphd
	 * @return the rp dashboard cphd, or <code>null</code> if a rp dashboard cphd with the primary key could not be found
	 */
	public RpDashboardCphd fetchByPrimaryKey(long id);

	/**
	 * Returns all the rp dashboard cphds.
	 *
	 * @return the rp dashboard cphds
	 */
	public java.util.List<RpDashboardCphd> findAll();

	/**
	 * Returns a range of all the rp dashboard cphds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCphdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cphds
	 * @param end the upper bound of the range of rp dashboard cphds (not inclusive)
	 * @return the range of rp dashboard cphds
	 */
	public java.util.List<RpDashboardCphd> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the rp dashboard cphds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCphdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cphds
	 * @param end the upper bound of the range of rp dashboard cphds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard cphds
	 */
	public java.util.List<RpDashboardCphd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpDashboardCphd>
			orderByComparator);

	/**
	 * Returns an ordered range of all the rp dashboard cphds.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCphdModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cphds
	 * @param end the upper bound of the range of rp dashboard cphds (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard cphds
	 */
	public java.util.List<RpDashboardCphd> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpDashboardCphd>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the rp dashboard cphds from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of rp dashboard cphds.
	 *
	 * @return the number of rp dashboard cphds
	 */
	public int countAll();

}