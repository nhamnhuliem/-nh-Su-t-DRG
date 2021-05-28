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

import drg.moh.service.exception.NoSuchThongKeException;
import drg.moh.service.model.ThongKe;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the thong ke service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see ThongKeUtil
 * @generated
 */
@ProviderType
public interface ThongKePersistence extends BasePersistence<ThongKe> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ThongKeUtil} to access the thong ke persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Caches the thong ke in the entity cache if it is enabled.
	 *
	 * @param thongKe the thong ke
	 */
	public void cacheResult(ThongKe thongKe);

	/**
	 * Caches the thong kes in the entity cache if it is enabled.
	 *
	 * @param thongKes the thong kes
	 */
	public void cacheResult(java.util.List<ThongKe> thongKes);

	/**
	 * Creates a new thong ke with the primary key. Does not add the thong ke to the database.
	 *
	 * @param id the primary key for the new thong ke
	 * @return the new thong ke
	 */
	public ThongKe create(long id);

	/**
	 * Removes the thong ke with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the thong ke
	 * @return the thong ke that was removed
	 * @throws NoSuchThongKeException if a thong ke with the primary key could not be found
	 */
	public ThongKe remove(long id) throws NoSuchThongKeException;

	public ThongKe updateImpl(ThongKe thongKe);

	/**
	 * Returns the thong ke with the primary key or throws a <code>NoSuchThongKeException</code> if it could not be found.
	 *
	 * @param id the primary key of the thong ke
	 * @return the thong ke
	 * @throws NoSuchThongKeException if a thong ke with the primary key could not be found
	 */
	public ThongKe findByPrimaryKey(long id) throws NoSuchThongKeException;

	/**
	 * Returns the thong ke with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the thong ke
	 * @return the thong ke, or <code>null</code> if a thong ke with the primary key could not be found
	 */
	public ThongKe fetchByPrimaryKey(long id);

	/**
	 * Returns all the thong kes.
	 *
	 * @return the thong kes
	 */
	public java.util.List<ThongKe> findAll();

	/**
	 * Returns a range of all the thong kes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong kes
	 * @param end the upper bound of the range of thong kes (not inclusive)
	 * @return the range of thong kes
	 */
	public java.util.List<ThongKe> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the thong kes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong kes
	 * @param end the upper bound of the range of thong kes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of thong kes
	 */
	public java.util.List<ThongKe> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ThongKe>
			orderByComparator);

	/**
	 * Returns an ordered range of all the thong kes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong kes
	 * @param end the upper bound of the range of thong kes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of thong kes
	 */
	public java.util.List<ThongKe> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ThongKe>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the thong kes from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of thong kes.
	 *
	 * @return the number of thong kes
	 */
	public int countAll();

}