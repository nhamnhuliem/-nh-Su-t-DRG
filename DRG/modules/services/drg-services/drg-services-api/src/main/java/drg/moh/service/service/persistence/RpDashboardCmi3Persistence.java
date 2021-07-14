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

import drg.moh.service.exception.NoSuchRpDashboardCmi3Exception;
import drg.moh.service.model.RpDashboardCmi3;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the rp dashboard cmi3 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see RpDashboardCmi3Util
 * @generated
 */
@ProviderType
public interface RpDashboardCmi3Persistence
	extends BasePersistence<RpDashboardCmi3> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RpDashboardCmi3Util} to access the rp dashboard cmi3 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the rp dashboard cmi3 in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmi3 the rp dashboard cmi3
	 */
	public void cacheResult(RpDashboardCmi3 rpDashboardCmi3);

	/**
	 * Caches the rp dashboard cmi3s in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmi3s the rp dashboard cmi3s
	 */
	public void cacheResult(java.util.List<RpDashboardCmi3> rpDashboardCmi3s);

	/**
	 * Creates a new rp dashboard cmi3 with the primary key. Does not add the rp dashboard cmi3 to the database.
	 *
	 * @param id the primary key for the new rp dashboard cmi3
	 * @return the new rp dashboard cmi3
	 */
	public RpDashboardCmi3 create(long id);

	/**
	 * Removes the rp dashboard cmi3 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard cmi3
	 * @return the rp dashboard cmi3 that was removed
	 * @throws NoSuchRpDashboardCmi3Exception if a rp dashboard cmi3 with the primary key could not be found
	 */
	public RpDashboardCmi3 remove(long id)
		throws NoSuchRpDashboardCmi3Exception;

	public RpDashboardCmi3 updateImpl(RpDashboardCmi3 rpDashboardCmi3);

	/**
	 * Returns the rp dashboard cmi3 with the primary key or throws a <code>NoSuchRpDashboardCmi3Exception</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi3
	 * @return the rp dashboard cmi3
	 * @throws NoSuchRpDashboardCmi3Exception if a rp dashboard cmi3 with the primary key could not be found
	 */
	public RpDashboardCmi3 findByPrimaryKey(long id)
		throws NoSuchRpDashboardCmi3Exception;

	/**
	 * Returns the rp dashboard cmi3 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi3
	 * @return the rp dashboard cmi3, or <code>null</code> if a rp dashboard cmi3 with the primary key could not be found
	 */
	public RpDashboardCmi3 fetchByPrimaryKey(long id);

	/**
	 * Returns all the rp dashboard cmi3s.
	 *
	 * @return the rp dashboard cmi3s
	 */
	public java.util.List<RpDashboardCmi3> findAll();

	/**
	 * Returns a range of all the rp dashboard cmi3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmi3ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmi3s
	 * @param end the upper bound of the range of rp dashboard cmi3s (not inclusive)
	 * @return the range of rp dashboard cmi3s
	 */
	public java.util.List<RpDashboardCmi3> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the rp dashboard cmi3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmi3ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmi3s
	 * @param end the upper bound of the range of rp dashboard cmi3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard cmi3s
	 */
	public java.util.List<RpDashboardCmi3> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpDashboardCmi3>
			orderByComparator);

	/**
	 * Returns an ordered range of all the rp dashboard cmi3s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmi3ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmi3s
	 * @param end the upper bound of the range of rp dashboard cmi3s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard cmi3s
	 */
	public java.util.List<RpDashboardCmi3> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpDashboardCmi3>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the rp dashboard cmi3s from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of rp dashboard cmi3s.
	 *
	 * @return the number of rp dashboard cmi3s
	 */
	public int countAll();

}