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

import drg.moh.service.exception.NoSuchViewDanhSachBenhAnException;
import drg.moh.service.model.ViewDanhSachBenhAn;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the view danh sach benh an service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @see ViewDanhSachBenhAnUtil
 * @generated
 */
@ProviderType
public interface ViewDanhSachBenhAnPersistence
	extends BasePersistence<ViewDanhSachBenhAn> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ViewDanhSachBenhAnUtil} to access the view danh sach benh an persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the view danh sach benh ans where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @return the matching view danh sach benh ans
	 */
	public java.util.List<ViewDanhSachBenhAn> findByORG_NAM(
		long orgId, int nam);

	/**
	 * Returns a range of all the view danh sach benh ans where orgId = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ViewDanhSachBenhAnModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param start the lower bound of the range of view danh sach benh ans
	 * @param end the upper bound of the range of view danh sach benh ans (not inclusive)
	 * @return the range of matching view danh sach benh ans
	 */
	public java.util.List<ViewDanhSachBenhAn> findByORG_NAM(
		long orgId, int nam, int start, int end);

	/**
	 * Returns an ordered range of all the view danh sach benh ans where orgId = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ViewDanhSachBenhAnModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param start the lower bound of the range of view danh sach benh ans
	 * @param end the upper bound of the range of view danh sach benh ans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching view danh sach benh ans
	 */
	public java.util.List<ViewDanhSachBenhAn> findByORG_NAM(
		long orgId, int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ViewDanhSachBenhAn>
			orderByComparator);

	/**
	 * Returns an ordered range of all the view danh sach benh ans where orgId = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ViewDanhSachBenhAnModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param start the lower bound of the range of view danh sach benh ans
	 * @param end the upper bound of the range of view danh sach benh ans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching view danh sach benh ans
	 */
	public java.util.List<ViewDanhSachBenhAn> findByORG_NAM(
		long orgId, int nam, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ViewDanhSachBenhAn>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first view danh sach benh an in the ordered set where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching view danh sach benh an
	 * @throws NoSuchViewDanhSachBenhAnException if a matching view danh sach benh an could not be found
	 */
	public ViewDanhSachBenhAn findByORG_NAM_First(
			long orgId, int nam,
			com.liferay.portal.kernel.util.OrderByComparator<ViewDanhSachBenhAn>
				orderByComparator)
		throws NoSuchViewDanhSachBenhAnException;

	/**
	 * Returns the first view danh sach benh an in the ordered set where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching view danh sach benh an, or <code>null</code> if a matching view danh sach benh an could not be found
	 */
	public ViewDanhSachBenhAn fetchByORG_NAM_First(
		long orgId, int nam,
		com.liferay.portal.kernel.util.OrderByComparator<ViewDanhSachBenhAn>
			orderByComparator);

	/**
	 * Returns the last view danh sach benh an in the ordered set where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching view danh sach benh an
	 * @throws NoSuchViewDanhSachBenhAnException if a matching view danh sach benh an could not be found
	 */
	public ViewDanhSachBenhAn findByORG_NAM_Last(
			long orgId, int nam,
			com.liferay.portal.kernel.util.OrderByComparator<ViewDanhSachBenhAn>
				orderByComparator)
		throws NoSuchViewDanhSachBenhAnException;

	/**
	 * Returns the last view danh sach benh an in the ordered set where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching view danh sach benh an, or <code>null</code> if a matching view danh sach benh an could not be found
	 */
	public ViewDanhSachBenhAn fetchByORG_NAM_Last(
		long orgId, int nam,
		com.liferay.portal.kernel.util.OrderByComparator<ViewDanhSachBenhAn>
			orderByComparator);

	/**
	 * Returns the view danh sach benh ans before and after the current view danh sach benh an in the ordered set where orgId = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current view danh sach benh an
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next view danh sach benh an
	 * @throws NoSuchViewDanhSachBenhAnException if a view danh sach benh an with the primary key could not be found
	 */
	public ViewDanhSachBenhAn[] findByORG_NAM_PrevAndNext(
			long id, long orgId, int nam,
			com.liferay.portal.kernel.util.OrderByComparator<ViewDanhSachBenhAn>
				orderByComparator)
		throws NoSuchViewDanhSachBenhAnException;

	/**
	 * Removes all the view danh sach benh ans where orgId = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 */
	public void removeByORG_NAM(long orgId, int nam);

	/**
	 * Returns the number of view danh sach benh ans where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @return the number of matching view danh sach benh ans
	 */
	public int countByORG_NAM(long orgId, int nam);

	/**
	 * Caches the view danh sach benh an in the entity cache if it is enabled.
	 *
	 * @param viewDanhSachBenhAn the view danh sach benh an
	 */
	public void cacheResult(ViewDanhSachBenhAn viewDanhSachBenhAn);

	/**
	 * Caches the view danh sach benh ans in the entity cache if it is enabled.
	 *
	 * @param viewDanhSachBenhAns the view danh sach benh ans
	 */
	public void cacheResult(
		java.util.List<ViewDanhSachBenhAn> viewDanhSachBenhAns);

	/**
	 * Creates a new view danh sach benh an with the primary key. Does not add the view danh sach benh an to the database.
	 *
	 * @param id the primary key for the new view danh sach benh an
	 * @return the new view danh sach benh an
	 */
	public ViewDanhSachBenhAn create(long id);

	/**
	 * Removes the view danh sach benh an with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the view danh sach benh an
	 * @return the view danh sach benh an that was removed
	 * @throws NoSuchViewDanhSachBenhAnException if a view danh sach benh an with the primary key could not be found
	 */
	public ViewDanhSachBenhAn remove(long id)
		throws NoSuchViewDanhSachBenhAnException;

	public ViewDanhSachBenhAn updateImpl(ViewDanhSachBenhAn viewDanhSachBenhAn);

	/**
	 * Returns the view danh sach benh an with the primary key or throws a <code>NoSuchViewDanhSachBenhAnException</code> if it could not be found.
	 *
	 * @param id the primary key of the view danh sach benh an
	 * @return the view danh sach benh an
	 * @throws NoSuchViewDanhSachBenhAnException if a view danh sach benh an with the primary key could not be found
	 */
	public ViewDanhSachBenhAn findByPrimaryKey(long id)
		throws NoSuchViewDanhSachBenhAnException;

	/**
	 * Returns the view danh sach benh an with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the view danh sach benh an
	 * @return the view danh sach benh an, or <code>null</code> if a view danh sach benh an with the primary key could not be found
	 */
	public ViewDanhSachBenhAn fetchByPrimaryKey(long id);

	/**
	 * Returns all the view danh sach benh ans.
	 *
	 * @return the view danh sach benh ans
	 */
	public java.util.List<ViewDanhSachBenhAn> findAll();

	/**
	 * Returns a range of all the view danh sach benh ans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ViewDanhSachBenhAnModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of view danh sach benh ans
	 * @param end the upper bound of the range of view danh sach benh ans (not inclusive)
	 * @return the range of view danh sach benh ans
	 */
	public java.util.List<ViewDanhSachBenhAn> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the view danh sach benh ans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ViewDanhSachBenhAnModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of view danh sach benh ans
	 * @param end the upper bound of the range of view danh sach benh ans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of view danh sach benh ans
	 */
	public java.util.List<ViewDanhSachBenhAn> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ViewDanhSachBenhAn>
			orderByComparator);

	/**
	 * Returns an ordered range of all the view danh sach benh ans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ViewDanhSachBenhAnModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of view danh sach benh ans
	 * @param end the upper bound of the range of view danh sach benh ans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of view danh sach benh ans
	 */
	public java.util.List<ViewDanhSachBenhAn> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ViewDanhSachBenhAn>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the view danh sach benh ans from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of view danh sach benh ans.
	 *
	 * @return the number of view danh sach benh ans
	 */
	public int countAll();

}