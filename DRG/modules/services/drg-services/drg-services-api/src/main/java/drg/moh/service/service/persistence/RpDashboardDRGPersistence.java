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

import drg.moh.service.exception.NoSuchRpDashboardDRGException;
import drg.moh.service.model.RpDashboardDRG;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the rp dashboard drg service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see RpDashboardDRGUtil
 * @generated
 */
@ProviderType
public interface RpDashboardDRGPersistence
	extends BasePersistence<RpDashboardDRG> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RpDashboardDRGUtil} to access the rp dashboard drg persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the rp dashboard drg in the entity cache if it is enabled.
	 *
	 * @param rpDashboardDRG the rp dashboard drg
	 */
	public void cacheResult(RpDashboardDRG rpDashboardDRG);

	/**
	 * Caches the rp dashboard drgs in the entity cache if it is enabled.
	 *
	 * @param rpDashboardDRGs the rp dashboard drgs
	 */
	public void cacheResult(java.util.List<RpDashboardDRG> rpDashboardDRGs);

	/**
	 * Creates a new rp dashboard drg with the primary key. Does not add the rp dashboard drg to the database.
	 *
	 * @param id the primary key for the new rp dashboard drg
	 * @return the new rp dashboard drg
	 */
	public RpDashboardDRG create(long id);

	/**
	 * Removes the rp dashboard drg with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard drg
	 * @return the rp dashboard drg that was removed
	 * @throws NoSuchRpDashboardDRGException if a rp dashboard drg with the primary key could not be found
	 */
	public RpDashboardDRG remove(long id) throws NoSuchRpDashboardDRGException;

	public RpDashboardDRG updateImpl(RpDashboardDRG rpDashboardDRG);

	/**
	 * Returns the rp dashboard drg with the primary key or throws a <code>NoSuchRpDashboardDRGException</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard drg
	 * @return the rp dashboard drg
	 * @throws NoSuchRpDashboardDRGException if a rp dashboard drg with the primary key could not be found
	 */
	public RpDashboardDRG findByPrimaryKey(long id)
		throws NoSuchRpDashboardDRGException;

	/**
	 * Returns the rp dashboard drg with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard drg
	 * @return the rp dashboard drg, or <code>null</code> if a rp dashboard drg with the primary key could not be found
	 */
	public RpDashboardDRG fetchByPrimaryKey(long id);

	/**
	 * Returns all the rp dashboard drgs.
	 *
	 * @return the rp dashboard drgs
	 */
	public java.util.List<RpDashboardDRG> findAll();

	/**
	 * Returns a range of all the rp dashboard drgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDRGModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard drgs
	 * @param end the upper bound of the range of rp dashboard drgs (not inclusive)
	 * @return the range of rp dashboard drgs
	 */
	public java.util.List<RpDashboardDRG> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the rp dashboard drgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDRGModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard drgs
	 * @param end the upper bound of the range of rp dashboard drgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard drgs
	 */
	public java.util.List<RpDashboardDRG> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpDashboardDRG>
			orderByComparator);

	/**
	 * Returns an ordered range of all the rp dashboard drgs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardDRGModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard drgs
	 * @param end the upper bound of the range of rp dashboard drgs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard drgs
	 */
	public java.util.List<RpDashboardDRG> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpDashboardDRG>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the rp dashboard drgs from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of rp dashboard drgs.
	 *
	 * @return the number of rp dashboard drgs
	 */
	public int countAll();

}