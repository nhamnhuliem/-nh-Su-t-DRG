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

import drg.moh.service.exception.NoSuchRpDashboardCmi2Exception;
import drg.moh.service.model.RpDashboardCmi2;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the rp dashboard cmi2 service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see RpDashboardCmi2Util
 * @generated
 */
@ProviderType
public interface RpDashboardCmi2Persistence
	extends BasePersistence<RpDashboardCmi2> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RpDashboardCmi2Util} to access the rp dashboard cmi2 persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the rp dashboard cmi2 in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmi2 the rp dashboard cmi2
	 */
	public void cacheResult(RpDashboardCmi2 rpDashboardCmi2);

	/**
	 * Caches the rp dashboard cmi2s in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmi2s the rp dashboard cmi2s
	 */
	public void cacheResult(java.util.List<RpDashboardCmi2> rpDashboardCmi2s);

	/**
	 * Creates a new rp dashboard cmi2 with the primary key. Does not add the rp dashboard cmi2 to the database.
	 *
	 * @param id the primary key for the new rp dashboard cmi2
	 * @return the new rp dashboard cmi2
	 */
	public RpDashboardCmi2 create(long id);

	/**
	 * Removes the rp dashboard cmi2 with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard cmi2
	 * @return the rp dashboard cmi2 that was removed
	 * @throws NoSuchRpDashboardCmi2Exception if a rp dashboard cmi2 with the primary key could not be found
	 */
	public RpDashboardCmi2 remove(long id)
		throws NoSuchRpDashboardCmi2Exception;

	public RpDashboardCmi2 updateImpl(RpDashboardCmi2 rpDashboardCmi2);

	/**
	 * Returns the rp dashboard cmi2 with the primary key or throws a <code>NoSuchRpDashboardCmi2Exception</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi2
	 * @return the rp dashboard cmi2
	 * @throws NoSuchRpDashboardCmi2Exception if a rp dashboard cmi2 with the primary key could not be found
	 */
	public RpDashboardCmi2 findByPrimaryKey(long id)
		throws NoSuchRpDashboardCmi2Exception;

	/**
	 * Returns the rp dashboard cmi2 with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi2
	 * @return the rp dashboard cmi2, or <code>null</code> if a rp dashboard cmi2 with the primary key could not be found
	 */
	public RpDashboardCmi2 fetchByPrimaryKey(long id);

	/**
	 * Returns all the rp dashboard cmi2s.
	 *
	 * @return the rp dashboard cmi2s
	 */
	public java.util.List<RpDashboardCmi2> findAll();

	/**
	 * Returns a range of all the rp dashboard cmi2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmi2ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmi2s
	 * @param end the upper bound of the range of rp dashboard cmi2s (not inclusive)
	 * @return the range of rp dashboard cmi2s
	 */
	public java.util.List<RpDashboardCmi2> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the rp dashboard cmi2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmi2ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmi2s
	 * @param end the upper bound of the range of rp dashboard cmi2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard cmi2s
	 */
	public java.util.List<RpDashboardCmi2> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpDashboardCmi2>
			orderByComparator);

	/**
	 * Returns an ordered range of all the rp dashboard cmi2s.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmi2ModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmi2s
	 * @param end the upper bound of the range of rp dashboard cmi2s (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard cmi2s
	 */
	public java.util.List<RpDashboardCmi2> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpDashboardCmi2>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the rp dashboard cmi2s from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of rp dashboard cmi2s.
	 *
	 * @return the number of rp dashboard cmi2s
	 */
	public int countAll();

}