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

import drg.moh.service.exception.NoSuchRpDashboardCmiException;
import drg.moh.service.model.RpDashboardCmi;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the rp dashboard cmi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see RpDashboardCmiUtil
 * @generated
 */
@ProviderType
public interface RpDashboardCmiPersistence
	extends BasePersistence<RpDashboardCmi> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RpDashboardCmiUtil} to access the rp dashboard cmi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the rp dashboard cmi in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmi the rp dashboard cmi
	 */
	public void cacheResult(RpDashboardCmi rpDashboardCmi);

	/**
	 * Caches the rp dashboard cmis in the entity cache if it is enabled.
	 *
	 * @param rpDashboardCmis the rp dashboard cmis
	 */
	public void cacheResult(java.util.List<RpDashboardCmi> rpDashboardCmis);

	/**
	 * Creates a new rp dashboard cmi with the primary key. Does not add the rp dashboard cmi to the database.
	 *
	 * @param id the primary key for the new rp dashboard cmi
	 * @return the new rp dashboard cmi
	 */
	public RpDashboardCmi create(long id);

	/**
	 * Removes the rp dashboard cmi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the rp dashboard cmi
	 * @return the rp dashboard cmi that was removed
	 * @throws NoSuchRpDashboardCmiException if a rp dashboard cmi with the primary key could not be found
	 */
	public RpDashboardCmi remove(long id) throws NoSuchRpDashboardCmiException;

	public RpDashboardCmi updateImpl(RpDashboardCmi rpDashboardCmi);

	/**
	 * Returns the rp dashboard cmi with the primary key or throws a <code>NoSuchRpDashboardCmiException</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi
	 * @return the rp dashboard cmi
	 * @throws NoSuchRpDashboardCmiException if a rp dashboard cmi with the primary key could not be found
	 */
	public RpDashboardCmi findByPrimaryKey(long id)
		throws NoSuchRpDashboardCmiException;

	/**
	 * Returns the rp dashboard cmi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the rp dashboard cmi
	 * @return the rp dashboard cmi, or <code>null</code> if a rp dashboard cmi with the primary key could not be found
	 */
	public RpDashboardCmi fetchByPrimaryKey(long id);

	/**
	 * Returns all the rp dashboard cmis.
	 *
	 * @return the rp dashboard cmis
	 */
	public java.util.List<RpDashboardCmi> findAll();

	/**
	 * Returns a range of all the rp dashboard cmis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmis
	 * @param end the upper bound of the range of rp dashboard cmis (not inclusive)
	 * @return the range of rp dashboard cmis
	 */
	public java.util.List<RpDashboardCmi> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the rp dashboard cmis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmis
	 * @param end the upper bound of the range of rp dashboard cmis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rp dashboard cmis
	 */
	public java.util.List<RpDashboardCmi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpDashboardCmi>
			orderByComparator);

	/**
	 * Returns an ordered range of all the rp dashboard cmis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>RpDashboardCmiModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of rp dashboard cmis
	 * @param end the upper bound of the range of rp dashboard cmis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of rp dashboard cmis
	 */
	public java.util.List<RpDashboardCmi> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<RpDashboardCmi>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the rp dashboard cmis from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of rp dashboard cmis.
	 *
	 * @return the number of rp dashboard cmis
	 */
	public int countAll();

}