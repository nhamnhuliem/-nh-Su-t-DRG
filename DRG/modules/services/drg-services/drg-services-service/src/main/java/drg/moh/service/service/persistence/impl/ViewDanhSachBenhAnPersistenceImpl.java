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

package drg.moh.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.dao.orm.ArgumentsResolver;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.HashMapDictionary;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import drg.moh.service.exception.NoSuchViewDanhSachBenhAnException;
import drg.moh.service.model.ViewDanhSachBenhAn;
import drg.moh.service.model.ViewDanhSachBenhAnTable;
import drg.moh.service.model.impl.ViewDanhSachBenhAnImpl;
import drg.moh.service.model.impl.ViewDanhSachBenhAnModelImpl;
import drg.moh.service.service.persistence.ViewDanhSachBenhAnPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceRegistration;

/**
 * The persistence implementation for the view danh sach benh an service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class ViewDanhSachBenhAnPersistenceImpl
	extends BasePersistenceImpl<ViewDanhSachBenhAn>
	implements ViewDanhSachBenhAnPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ViewDanhSachBenhAnUtil</code> to access the view danh sach benh an persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ViewDanhSachBenhAnImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByORG_NAM;
	private FinderPath _finderPathWithoutPaginationFindByORG_NAM;
	private FinderPath _finderPathCountByORG_NAM;

	/**
	 * Returns all the view danh sach benh ans where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @return the matching view danh sach benh ans
	 */
	@Override
	public List<ViewDanhSachBenhAn> findByORG_NAM(long orgId, int nam) {
		return findByORG_NAM(
			orgId, nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ViewDanhSachBenhAn> findByORG_NAM(
		long orgId, int nam, int start, int end) {

		return findByORG_NAM(orgId, nam, start, end, null);
	}

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
	@Override
	public List<ViewDanhSachBenhAn> findByORG_NAM(
		long orgId, int nam, int start, int end,
		OrderByComparator<ViewDanhSachBenhAn> orderByComparator) {

		return findByORG_NAM(orgId, nam, start, end, orderByComparator, true);
	}

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
	@Override
	public List<ViewDanhSachBenhAn> findByORG_NAM(
		long orgId, int nam, int start, int end,
		OrderByComparator<ViewDanhSachBenhAn> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByORG_NAM;
				finderArgs = new Object[] {orgId, nam};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByORG_NAM;
			finderArgs = new Object[] {
				orgId, nam, start, end, orderByComparator
			};
		}

		List<ViewDanhSachBenhAn> list = null;

		if (useFinderCache) {
			list = (List<ViewDanhSachBenhAn>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (ViewDanhSachBenhAn viewDanhSachBenhAn : list) {
					if ((orgId != viewDanhSachBenhAn.getOrgId()) ||
						(nam != viewDanhSachBenhAn.getNam())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_VIEWDANHSACHBENHAN_WHERE);

			sb.append(_FINDER_COLUMN_ORG_NAM_ORGID_2);

			sb.append(_FINDER_COLUMN_ORG_NAM_NAM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ViewDanhSachBenhAnModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(orgId);

				queryPos.add(nam);

				list = (List<ViewDanhSachBenhAn>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first view danh sach benh an in the ordered set where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching view danh sach benh an
	 * @throws NoSuchViewDanhSachBenhAnException if a matching view danh sach benh an could not be found
	 */
	@Override
	public ViewDanhSachBenhAn findByORG_NAM_First(
			long orgId, int nam,
			OrderByComparator<ViewDanhSachBenhAn> orderByComparator)
		throws NoSuchViewDanhSachBenhAnException {

		ViewDanhSachBenhAn viewDanhSachBenhAn = fetchByORG_NAM_First(
			orgId, nam, orderByComparator);

		if (viewDanhSachBenhAn != null) {
			return viewDanhSachBenhAn;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("orgId=");
		sb.append(orgId);

		sb.append(", nam=");
		sb.append(nam);

		sb.append("}");

		throw new NoSuchViewDanhSachBenhAnException(sb.toString());
	}

	/**
	 * Returns the first view danh sach benh an in the ordered set where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching view danh sach benh an, or <code>null</code> if a matching view danh sach benh an could not be found
	 */
	@Override
	public ViewDanhSachBenhAn fetchByORG_NAM_First(
		long orgId, int nam,
		OrderByComparator<ViewDanhSachBenhAn> orderByComparator) {

		List<ViewDanhSachBenhAn> list = findByORG_NAM(
			orgId, nam, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last view danh sach benh an in the ordered set where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching view danh sach benh an
	 * @throws NoSuchViewDanhSachBenhAnException if a matching view danh sach benh an could not be found
	 */
	@Override
	public ViewDanhSachBenhAn findByORG_NAM_Last(
			long orgId, int nam,
			OrderByComparator<ViewDanhSachBenhAn> orderByComparator)
		throws NoSuchViewDanhSachBenhAnException {

		ViewDanhSachBenhAn viewDanhSachBenhAn = fetchByORG_NAM_Last(
			orgId, nam, orderByComparator);

		if (viewDanhSachBenhAn != null) {
			return viewDanhSachBenhAn;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("orgId=");
		sb.append(orgId);

		sb.append(", nam=");
		sb.append(nam);

		sb.append("}");

		throw new NoSuchViewDanhSachBenhAnException(sb.toString());
	}

	/**
	 * Returns the last view danh sach benh an in the ordered set where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching view danh sach benh an, or <code>null</code> if a matching view danh sach benh an could not be found
	 */
	@Override
	public ViewDanhSachBenhAn fetchByORG_NAM_Last(
		long orgId, int nam,
		OrderByComparator<ViewDanhSachBenhAn> orderByComparator) {

		int count = countByORG_NAM(orgId, nam);

		if (count == 0) {
			return null;
		}

		List<ViewDanhSachBenhAn> list = findByORG_NAM(
			orgId, nam, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public ViewDanhSachBenhAn[] findByORG_NAM_PrevAndNext(
			long id, long orgId, int nam,
			OrderByComparator<ViewDanhSachBenhAn> orderByComparator)
		throws NoSuchViewDanhSachBenhAnException {

		ViewDanhSachBenhAn viewDanhSachBenhAn = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ViewDanhSachBenhAn[] array = new ViewDanhSachBenhAnImpl[3];

			array[0] = getByORG_NAM_PrevAndNext(
				session, viewDanhSachBenhAn, orgId, nam, orderByComparator,
				true);

			array[1] = viewDanhSachBenhAn;

			array[2] = getByORG_NAM_PrevAndNext(
				session, viewDanhSachBenhAn, orgId, nam, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ViewDanhSachBenhAn getByORG_NAM_PrevAndNext(
		Session session, ViewDanhSachBenhAn viewDanhSachBenhAn, long orgId,
		int nam, OrderByComparator<ViewDanhSachBenhAn> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_VIEWDANHSACHBENHAN_WHERE);

		sb.append(_FINDER_COLUMN_ORG_NAM_ORGID_2);

		sb.append(_FINDER_COLUMN_ORG_NAM_NAM_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(ViewDanhSachBenhAnModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(orgId);

		queryPos.add(nam);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						viewDanhSachBenhAn)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ViewDanhSachBenhAn> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the view danh sach benh ans where orgId = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 */
	@Override
	public void removeByORG_NAM(long orgId, int nam) {
		for (ViewDanhSachBenhAn viewDanhSachBenhAn :
				findByORG_NAM(
					orgId, nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(viewDanhSachBenhAn);
		}
	}

	/**
	 * Returns the number of view danh sach benh ans where orgId = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param nam the nam
	 * @return the number of matching view danh sach benh ans
	 */
	@Override
	public int countByORG_NAM(long orgId, int nam) {
		FinderPath finderPath = _finderPathCountByORG_NAM;

		Object[] finderArgs = new Object[] {orgId, nam};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_VIEWDANHSACHBENHAN_WHERE);

			sb.append(_FINDER_COLUMN_ORG_NAM_ORGID_2);

			sb.append(_FINDER_COLUMN_ORG_NAM_NAM_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(orgId);

				queryPos.add(nam);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_ORG_NAM_ORGID_2 =
		"viewDanhSachBenhAn.orgId = ? AND ";

	private static final String _FINDER_COLUMN_ORG_NAM_NAM_2 =
		"viewDanhSachBenhAn.nam = ?";

	public ViewDanhSachBenhAnPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("orgId", "organization_id");
		dbColumnNames.put("maCoSo", "ma_cskcb");
		dbColumnNames.put("tenCoSo", "ten_cskcb");
		dbColumnNames.put("maHoSo", "ma_lk");
		dbColumnNames.put("maBenhNhan", "ma_bn");
		dbColumnNames.put("hoTen", "ho_ten");
		dbColumnNames.put("maThe", "ma_the");
		dbColumnNames.put("chiPhi", "drg_chiphi");
		dbColumnNames.put("dinhSuat", "drg_dinhsuat");
		dbColumnNames.put("giaTri", "drg_giatri");

		setDBColumnNames(dbColumnNames);

		setModelClass(ViewDanhSachBenhAn.class);

		setModelImplClass(ViewDanhSachBenhAnImpl.class);
		setModelPKClass(long.class);

		setTable(ViewDanhSachBenhAnTable.INSTANCE);
	}

	/**
	 * Caches the view danh sach benh an in the entity cache if it is enabled.
	 *
	 * @param viewDanhSachBenhAn the view danh sach benh an
	 */
	@Override
	public void cacheResult(ViewDanhSachBenhAn viewDanhSachBenhAn) {
		entityCache.putResult(
			ViewDanhSachBenhAnImpl.class, viewDanhSachBenhAn.getPrimaryKey(),
			viewDanhSachBenhAn);
	}

	/**
	 * Caches the view danh sach benh ans in the entity cache if it is enabled.
	 *
	 * @param viewDanhSachBenhAns the view danh sach benh ans
	 */
	@Override
	public void cacheResult(List<ViewDanhSachBenhAn> viewDanhSachBenhAns) {
		for (ViewDanhSachBenhAn viewDanhSachBenhAn : viewDanhSachBenhAns) {
			if (entityCache.getResult(
					ViewDanhSachBenhAnImpl.class,
					viewDanhSachBenhAn.getPrimaryKey()) == null) {

				cacheResult(viewDanhSachBenhAn);
			}
		}
	}

	/**
	 * Clears the cache for all view danh sach benh ans.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ViewDanhSachBenhAnImpl.class);

		finderCache.clearCache(ViewDanhSachBenhAnImpl.class);
	}

	/**
	 * Clears the cache for the view danh sach benh an.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ViewDanhSachBenhAn viewDanhSachBenhAn) {
		entityCache.removeResult(
			ViewDanhSachBenhAnImpl.class, viewDanhSachBenhAn);
	}

	@Override
	public void clearCache(List<ViewDanhSachBenhAn> viewDanhSachBenhAns) {
		for (ViewDanhSachBenhAn viewDanhSachBenhAn : viewDanhSachBenhAns) {
			entityCache.removeResult(
				ViewDanhSachBenhAnImpl.class, viewDanhSachBenhAn);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ViewDanhSachBenhAnImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ViewDanhSachBenhAnImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new view danh sach benh an with the primary key. Does not add the view danh sach benh an to the database.
	 *
	 * @param id the primary key for the new view danh sach benh an
	 * @return the new view danh sach benh an
	 */
	@Override
	public ViewDanhSachBenhAn create(long id) {
		ViewDanhSachBenhAn viewDanhSachBenhAn = new ViewDanhSachBenhAnImpl();

		viewDanhSachBenhAn.setNew(true);
		viewDanhSachBenhAn.setPrimaryKey(id);

		return viewDanhSachBenhAn;
	}

	/**
	 * Removes the view danh sach benh an with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the view danh sach benh an
	 * @return the view danh sach benh an that was removed
	 * @throws NoSuchViewDanhSachBenhAnException if a view danh sach benh an with the primary key could not be found
	 */
	@Override
	public ViewDanhSachBenhAn remove(long id)
		throws NoSuchViewDanhSachBenhAnException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the view danh sach benh an with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the view danh sach benh an
	 * @return the view danh sach benh an that was removed
	 * @throws NoSuchViewDanhSachBenhAnException if a view danh sach benh an with the primary key could not be found
	 */
	@Override
	public ViewDanhSachBenhAn remove(Serializable primaryKey)
		throws NoSuchViewDanhSachBenhAnException {

		Session session = null;

		try {
			session = openSession();

			ViewDanhSachBenhAn viewDanhSachBenhAn =
				(ViewDanhSachBenhAn)session.get(
					ViewDanhSachBenhAnImpl.class, primaryKey);

			if (viewDanhSachBenhAn == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchViewDanhSachBenhAnException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(viewDanhSachBenhAn);
		}
		catch (NoSuchViewDanhSachBenhAnException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ViewDanhSachBenhAn removeImpl(
		ViewDanhSachBenhAn viewDanhSachBenhAn) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(viewDanhSachBenhAn)) {
				viewDanhSachBenhAn = (ViewDanhSachBenhAn)session.get(
					ViewDanhSachBenhAnImpl.class,
					viewDanhSachBenhAn.getPrimaryKeyObj());
			}

			if (viewDanhSachBenhAn != null) {
				session.delete(viewDanhSachBenhAn);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (viewDanhSachBenhAn != null) {
			clearCache(viewDanhSachBenhAn);
		}

		return viewDanhSachBenhAn;
	}

	@Override
	public ViewDanhSachBenhAn updateImpl(
		ViewDanhSachBenhAn viewDanhSachBenhAn) {

		boolean isNew = viewDanhSachBenhAn.isNew();

		if (!(viewDanhSachBenhAn instanceof ViewDanhSachBenhAnModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(viewDanhSachBenhAn.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					viewDanhSachBenhAn);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in viewDanhSachBenhAn proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ViewDanhSachBenhAn implementation " +
					viewDanhSachBenhAn.getClass());
		}

		ViewDanhSachBenhAnModelImpl viewDanhSachBenhAnModelImpl =
			(ViewDanhSachBenhAnModelImpl)viewDanhSachBenhAn;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(viewDanhSachBenhAn);
			}
			else {
				viewDanhSachBenhAn = (ViewDanhSachBenhAn)session.merge(
					viewDanhSachBenhAn);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ViewDanhSachBenhAnImpl.class, viewDanhSachBenhAnModelImpl, false,
			true);

		if (isNew) {
			viewDanhSachBenhAn.setNew(false);
		}

		viewDanhSachBenhAn.resetOriginalValues();

		return viewDanhSachBenhAn;
	}

	/**
	 * Returns the view danh sach benh an with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the view danh sach benh an
	 * @return the view danh sach benh an
	 * @throws NoSuchViewDanhSachBenhAnException if a view danh sach benh an with the primary key could not be found
	 */
	@Override
	public ViewDanhSachBenhAn findByPrimaryKey(Serializable primaryKey)
		throws NoSuchViewDanhSachBenhAnException {

		ViewDanhSachBenhAn viewDanhSachBenhAn = fetchByPrimaryKey(primaryKey);

		if (viewDanhSachBenhAn == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchViewDanhSachBenhAnException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return viewDanhSachBenhAn;
	}

	/**
	 * Returns the view danh sach benh an with the primary key or throws a <code>NoSuchViewDanhSachBenhAnException</code> if it could not be found.
	 *
	 * @param id the primary key of the view danh sach benh an
	 * @return the view danh sach benh an
	 * @throws NoSuchViewDanhSachBenhAnException if a view danh sach benh an with the primary key could not be found
	 */
	@Override
	public ViewDanhSachBenhAn findByPrimaryKey(long id)
		throws NoSuchViewDanhSachBenhAnException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the view danh sach benh an with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the view danh sach benh an
	 * @return the view danh sach benh an, or <code>null</code> if a view danh sach benh an with the primary key could not be found
	 */
	@Override
	public ViewDanhSachBenhAn fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the view danh sach benh ans.
	 *
	 * @return the view danh sach benh ans
	 */
	@Override
	public List<ViewDanhSachBenhAn> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ViewDanhSachBenhAn> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<ViewDanhSachBenhAn> findAll(
		int start, int end,
		OrderByComparator<ViewDanhSachBenhAn> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<ViewDanhSachBenhAn> findAll(
		int start, int end,
		OrderByComparator<ViewDanhSachBenhAn> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<ViewDanhSachBenhAn> list = null;

		if (useFinderCache) {
			list = (List<ViewDanhSachBenhAn>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_VIEWDANHSACHBENHAN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_VIEWDANHSACHBENHAN;

				sql = sql.concat(ViewDanhSachBenhAnModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ViewDanhSachBenhAn>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the view danh sach benh ans from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ViewDanhSachBenhAn viewDanhSachBenhAn : findAll()) {
			remove(viewDanhSachBenhAn);
		}
	}

	/**
	 * Returns the number of view danh sach benh ans.
	 *
	 * @return the number of view danh sach benh ans
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_VIEWDANHSACHBENHAN);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "id";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_VIEWDANHSACHBENHAN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ViewDanhSachBenhAnModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the view danh sach benh an persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			ViewDanhSachBenhAnPersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new ViewDanhSachBenhAnModelArgumentsResolver(),
			new HashMapDictionary<>());

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByORG_NAM = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByORG_NAM",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"organization_id", "nam"}, true);

		_finderPathWithoutPaginationFindByORG_NAM = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByORG_NAM",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"organization_id", "nam"}, true);

		_finderPathCountByORG_NAM = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByORG_NAM",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"organization_id", "nam"}, false);
	}

	public void destroy() {
		entityCache.removeCache(ViewDanhSachBenhAnImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_VIEWDANHSACHBENHAN =
		"SELECT viewDanhSachBenhAn FROM ViewDanhSachBenhAn viewDanhSachBenhAn";

	private static final String _SQL_SELECT_VIEWDANHSACHBENHAN_WHERE =
		"SELECT viewDanhSachBenhAn FROM ViewDanhSachBenhAn viewDanhSachBenhAn WHERE ";

	private static final String _SQL_COUNT_VIEWDANHSACHBENHAN =
		"SELECT COUNT(viewDanhSachBenhAn) FROM ViewDanhSachBenhAn viewDanhSachBenhAn";

	private static final String _SQL_COUNT_VIEWDANHSACHBENHAN_WHERE =
		"SELECT COUNT(viewDanhSachBenhAn) FROM ViewDanhSachBenhAn viewDanhSachBenhAn WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "viewDanhSachBenhAn.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ViewDanhSachBenhAn exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ViewDanhSachBenhAn exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ViewDanhSachBenhAnPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {
			"orgId", "maCoSo", "tenCoSo", "maHoSo", "maBenhNhan", "hoTen",
			"maThe", "chiPhi", "dinhSuat", "giaTri"
		});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class ViewDanhSachBenhAnModelArgumentsResolver
		implements ArgumentsResolver {

		@Override
		public Object[] getArguments(
			FinderPath finderPath, BaseModel<?> baseModel, boolean checkColumn,
			boolean original) {

			String[] columnNames = finderPath.getColumnNames();

			if ((columnNames == null) || (columnNames.length == 0)) {
				if (baseModel.isNew()) {
					return FINDER_ARGS_EMPTY;
				}

				return null;
			}

			ViewDanhSachBenhAnModelImpl viewDanhSachBenhAnModelImpl =
				(ViewDanhSachBenhAnModelImpl)baseModel;

			long columnBitmask = viewDanhSachBenhAnModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					viewDanhSachBenhAnModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						viewDanhSachBenhAnModelImpl.getColumnBitmask(
							columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					viewDanhSachBenhAnModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return ViewDanhSachBenhAnImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return ViewDanhSachBenhAnTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			ViewDanhSachBenhAnModelImpl viewDanhSachBenhAnModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						viewDanhSachBenhAnModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = viewDanhSachBenhAnModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}