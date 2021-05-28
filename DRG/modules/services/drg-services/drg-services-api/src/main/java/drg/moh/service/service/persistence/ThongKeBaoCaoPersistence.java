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

import drg.moh.service.exception.NoSuchThongKeBaoCaoException;
import drg.moh.service.model.ThongKeBaoCao;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the thong ke bao cao service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see ThongKeBaoCaoUtil
 * @generated
 */
@ProviderType
public interface ThongKeBaoCaoPersistence
	extends BasePersistence<ThongKeBaoCao> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ThongKeBaoCaoUtil} to access the thong ke bao cao persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the thong ke bao caos where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the matching thong ke bao caos
	 */
	public java.util.List<ThongKeBaoCao> findByNam(int nam);

	/**
	 * Returns a range of all the thong ke bao caos where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeBaoCaoModelImpl</code>.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of thong ke bao caos
	 * @param end the upper bound of the range of thong ke bao caos (not inclusive)
	 * @return the range of matching thong ke bao caos
	 */
	public java.util.List<ThongKeBaoCao> findByNam(int nam, int start, int end);

	/**
	 * Returns an ordered range of all the thong ke bao caos where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeBaoCaoModelImpl</code>.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of thong ke bao caos
	 * @param end the upper bound of the range of thong ke bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching thong ke bao caos
	 */
	public java.util.List<ThongKeBaoCao> findByNam(
		int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ThongKeBaoCao>
			orderByComparator);

	/**
	 * Returns an ordered range of all the thong ke bao caos where nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeBaoCaoModelImpl</code>.
	 * </p>
	 *
	 * @param nam the nam
	 * @param start the lower bound of the range of thong ke bao caos
	 * @param end the upper bound of the range of thong ke bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching thong ke bao caos
	 */
	public java.util.List<ThongKeBaoCao> findByNam(
		int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ThongKeBaoCao>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong ke bao cao
	 * @throws NoSuchThongKeBaoCaoException if a matching thong ke bao cao could not be found
	 */
	public ThongKeBaoCao findByNam_First(
			int nam,
			com.liferay.portal.kernel.util.OrderByComparator<ThongKeBaoCao>
				orderByComparator)
		throws NoSuchThongKeBaoCaoException;

	/**
	 * Returns the first thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong ke bao cao, or <code>null</code> if a matching thong ke bao cao could not be found
	 */
	public ThongKeBaoCao fetchByNam_First(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator<ThongKeBaoCao>
			orderByComparator);

	/**
	 * Returns the last thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong ke bao cao
	 * @throws NoSuchThongKeBaoCaoException if a matching thong ke bao cao could not be found
	 */
	public ThongKeBaoCao findByNam_Last(
			int nam,
			com.liferay.portal.kernel.util.OrderByComparator<ThongKeBaoCao>
				orderByComparator)
		throws NoSuchThongKeBaoCaoException;

	/**
	 * Returns the last thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong ke bao cao, or <code>null</code> if a matching thong ke bao cao could not be found
	 */
	public ThongKeBaoCao fetchByNam_Last(
		int nam,
		com.liferay.portal.kernel.util.OrderByComparator<ThongKeBaoCao>
			orderByComparator);

	/**
	 * Returns the thong ke bao caos before and after the current thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param id the primary key of the current thong ke bao cao
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong ke bao cao
	 * @throws NoSuchThongKeBaoCaoException if a thong ke bao cao with the primary key could not be found
	 */
	public ThongKeBaoCao[] findByNam_PrevAndNext(
			long id, int nam,
			com.liferay.portal.kernel.util.OrderByComparator<ThongKeBaoCao>
				orderByComparator)
		throws NoSuchThongKeBaoCaoException;

	/**
	 * Removes all the thong ke bao caos where nam = &#63; from the database.
	 *
	 * @param nam the nam
	 */
	public void removeByNam(int nam);

	/**
	 * Returns the number of thong ke bao caos where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the number of matching thong ke bao caos
	 */
	public int countByNam(int nam);

	/**
	 * Caches the thong ke bao cao in the entity cache if it is enabled.
	 *
	 * @param thongKeBaoCao the thong ke bao cao
	 */
	public void cacheResult(ThongKeBaoCao thongKeBaoCao);

	/**
	 * Caches the thong ke bao caos in the entity cache if it is enabled.
	 *
	 * @param thongKeBaoCaos the thong ke bao caos
	 */
	public void cacheResult(java.util.List<ThongKeBaoCao> thongKeBaoCaos);

	/**
	 * Creates a new thong ke bao cao with the primary key. Does not add the thong ke bao cao to the database.
	 *
	 * @param id the primary key for the new thong ke bao cao
	 * @return the new thong ke bao cao
	 */
	public ThongKeBaoCao create(long id);

	/**
	 * Removes the thong ke bao cao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the thong ke bao cao
	 * @return the thong ke bao cao that was removed
	 * @throws NoSuchThongKeBaoCaoException if a thong ke bao cao with the primary key could not be found
	 */
	public ThongKeBaoCao remove(long id) throws NoSuchThongKeBaoCaoException;

	public ThongKeBaoCao updateImpl(ThongKeBaoCao thongKeBaoCao);

	/**
	 * Returns the thong ke bao cao with the primary key or throws a <code>NoSuchThongKeBaoCaoException</code> if it could not be found.
	 *
	 * @param id the primary key of the thong ke bao cao
	 * @return the thong ke bao cao
	 * @throws NoSuchThongKeBaoCaoException if a thong ke bao cao with the primary key could not be found
	 */
	public ThongKeBaoCao findByPrimaryKey(long id)
		throws NoSuchThongKeBaoCaoException;

	/**
	 * Returns the thong ke bao cao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the thong ke bao cao
	 * @return the thong ke bao cao, or <code>null</code> if a thong ke bao cao with the primary key could not be found
	 */
	public ThongKeBaoCao fetchByPrimaryKey(long id);

	/**
	 * Returns all the thong ke bao caos.
	 *
	 * @return the thong ke bao caos
	 */
	public java.util.List<ThongKeBaoCao> findAll();

	/**
	 * Returns a range of all the thong ke bao caos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeBaoCaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong ke bao caos
	 * @param end the upper bound of the range of thong ke bao caos (not inclusive)
	 * @return the range of thong ke bao caos
	 */
	public java.util.List<ThongKeBaoCao> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the thong ke bao caos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeBaoCaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong ke bao caos
	 * @param end the upper bound of the range of thong ke bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of thong ke bao caos
	 */
	public java.util.List<ThongKeBaoCao> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ThongKeBaoCao>
			orderByComparator);

	/**
	 * Returns an ordered range of all the thong ke bao caos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ThongKeBaoCaoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of thong ke bao caos
	 * @param end the upper bound of the range of thong ke bao caos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of thong ke bao caos
	 */
	public java.util.List<ThongKeBaoCao> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ThongKeBaoCao>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the thong ke bao caos from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of thong ke bao caos.
	 *
	 * @return the number of thong ke bao caos
	 */
	public int countAll();

}