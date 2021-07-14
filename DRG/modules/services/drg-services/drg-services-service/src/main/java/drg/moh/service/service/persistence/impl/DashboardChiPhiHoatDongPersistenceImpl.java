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

import drg.moh.service.exception.NoSuchDashboardChiPhiHoatDongException;
import drg.moh.service.model.DashboardChiPhiHoatDong;
import drg.moh.service.model.DashboardChiPhiHoatDongTable;
import drg.moh.service.model.impl.DashboardChiPhiHoatDongImpl;
import drg.moh.service.model.impl.DashboardChiPhiHoatDongModelImpl;
import drg.moh.service.service.persistence.DashboardChiPhiHoatDongPersistence;

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
 * The persistence implementation for the dashboard chi phi hoat dong service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class DashboardChiPhiHoatDongPersistenceImpl
	extends BasePersistenceImpl<DashboardChiPhiHoatDong>
	implements DashboardChiPhiHoatDongPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DashboardChiPhiHoatDongUtil</code> to access the dashboard chi phi hoat dong persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DashboardChiPhiHoatDongImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByORG_MUC_NAM;
	private FinderPath _finderPathWithoutPaginationFindByORG_MUC_NAM;
	private FinderPath _finderPathCountByORG_MUC_NAM;

	/**
	 * Returns all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard chi phi hoat dongs
	 */
	@Override
	public List<DashboardChiPhiHoatDong> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam) {

		return findByORG_MUC_NAM(
			orgId, mucBc, nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @return the range of matching dashboard chi phi hoat dongs
	 */
	@Override
	public List<DashboardChiPhiHoatDong> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end) {

		return findByORG_MUC_NAM(orgId, mucBc, nam, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dashboard chi phi hoat dongs
	 */
	@Override
	public List<DashboardChiPhiHoatDong> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		OrderByComparator<DashboardChiPhiHoatDong> orderByComparator) {

		return findByORG_MUC_NAM(
			orgId, mucBc, nam, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dashboard chi phi hoat dongs
	 */
	@Override
	public List<DashboardChiPhiHoatDong> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		OrderByComparator<DashboardChiPhiHoatDong> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByORG_MUC_NAM;
				finderArgs = new Object[] {orgId, mucBc, nam};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByORG_MUC_NAM;
			finderArgs = new Object[] {
				orgId, mucBc, nam, start, end, orderByComparator
			};
		}

		List<DashboardChiPhiHoatDong> list = null;

		if (useFinderCache) {
			list = (List<DashboardChiPhiHoatDong>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (DashboardChiPhiHoatDong dashboardChiPhiHoatDong : list) {
					if ((orgId != dashboardChiPhiHoatDong.getOrgId()) ||
						(mucBc != dashboardChiPhiHoatDong.getMucBc()) ||
						(nam != dashboardChiPhiHoatDong.getNam())) {

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
					5 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(5);
			}

			sb.append(_SQL_SELECT_DASHBOARDCHIPHIHOATDONG_WHERE);

			sb.append(_FINDER_COLUMN_ORG_MUC_NAM_ORGID_2);

			sb.append(_FINDER_COLUMN_ORG_MUC_NAM_MUCBC_2);

			sb.append(_FINDER_COLUMN_ORG_MUC_NAM_NAM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DashboardChiPhiHoatDongModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(orgId);

				queryPos.add(mucBc);

				queryPos.add(nam);

				list = (List<DashboardChiPhiHoatDong>)QueryUtil.list(
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
	 * Returns the first dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard chi phi hoat dong
	 * @throws NoSuchDashboardChiPhiHoatDongException if a matching dashboard chi phi hoat dong could not be found
	 */
	@Override
	public DashboardChiPhiHoatDong findByORG_MUC_NAM_First(
			long orgId, int mucBc, int nam,
			OrderByComparator<DashboardChiPhiHoatDong> orderByComparator)
		throws NoSuchDashboardChiPhiHoatDongException {

		DashboardChiPhiHoatDong dashboardChiPhiHoatDong =
			fetchByORG_MUC_NAM_First(orgId, mucBc, nam, orderByComparator);

		if (dashboardChiPhiHoatDong != null) {
			return dashboardChiPhiHoatDong;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("orgId=");
		sb.append(orgId);

		sb.append(", mucBc=");
		sb.append(mucBc);

		sb.append(", nam=");
		sb.append(nam);

		sb.append("}");

		throw new NoSuchDashboardChiPhiHoatDongException(sb.toString());
	}

	/**
	 * Returns the first dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard chi phi hoat dong, or <code>null</code> if a matching dashboard chi phi hoat dong could not be found
	 */
	@Override
	public DashboardChiPhiHoatDong fetchByORG_MUC_NAM_First(
		long orgId, int mucBc, int nam,
		OrderByComparator<DashboardChiPhiHoatDong> orderByComparator) {

		List<DashboardChiPhiHoatDong> list = findByORG_MUC_NAM(
			orgId, mucBc, nam, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard chi phi hoat dong
	 * @throws NoSuchDashboardChiPhiHoatDongException if a matching dashboard chi phi hoat dong could not be found
	 */
	@Override
	public DashboardChiPhiHoatDong findByORG_MUC_NAM_Last(
			long orgId, int mucBc, int nam,
			OrderByComparator<DashboardChiPhiHoatDong> orderByComparator)
		throws NoSuchDashboardChiPhiHoatDongException {

		DashboardChiPhiHoatDong dashboardChiPhiHoatDong =
			fetchByORG_MUC_NAM_Last(orgId, mucBc, nam, orderByComparator);

		if (dashboardChiPhiHoatDong != null) {
			return dashboardChiPhiHoatDong;
		}

		StringBundler sb = new StringBundler(8);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("orgId=");
		sb.append(orgId);

		sb.append(", mucBc=");
		sb.append(mucBc);

		sb.append(", nam=");
		sb.append(nam);

		sb.append("}");

		throw new NoSuchDashboardChiPhiHoatDongException(sb.toString());
	}

	/**
	 * Returns the last dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard chi phi hoat dong, or <code>null</code> if a matching dashboard chi phi hoat dong could not be found
	 */
	@Override
	public DashboardChiPhiHoatDong fetchByORG_MUC_NAM_Last(
		long orgId, int mucBc, int nam,
		OrderByComparator<DashboardChiPhiHoatDong> orderByComparator) {

		int count = countByORG_MUC_NAM(orgId, mucBc, nam);

		if (count == 0) {
			return null;
		}

		List<DashboardChiPhiHoatDong> list = findByORG_MUC_NAM(
			orgId, mucBc, nam, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dashboard chi phi hoat dongs before and after the current dashboard chi phi hoat dong in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current dashboard chi phi hoat dong
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dashboard chi phi hoat dong
	 * @throws NoSuchDashboardChiPhiHoatDongException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiHoatDong[] findByORG_MUC_NAM_PrevAndNext(
			long id, long orgId, int mucBc, int nam,
			OrderByComparator<DashboardChiPhiHoatDong> orderByComparator)
		throws NoSuchDashboardChiPhiHoatDongException {

		DashboardChiPhiHoatDong dashboardChiPhiHoatDong = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DashboardChiPhiHoatDong[] array =
				new DashboardChiPhiHoatDongImpl[3];

			array[0] = getByORG_MUC_NAM_PrevAndNext(
				session, dashboardChiPhiHoatDong, orgId, mucBc, nam,
				orderByComparator, true);

			array[1] = dashboardChiPhiHoatDong;

			array[2] = getByORG_MUC_NAM_PrevAndNext(
				session, dashboardChiPhiHoatDong, orgId, mucBc, nam,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected DashboardChiPhiHoatDong getByORG_MUC_NAM_PrevAndNext(
		Session session, DashboardChiPhiHoatDong dashboardChiPhiHoatDong,
		long orgId, int mucBc, int nam,
		OrderByComparator<DashboardChiPhiHoatDong> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				6 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(5);
		}

		sb.append(_SQL_SELECT_DASHBOARDCHIPHIHOATDONG_WHERE);

		sb.append(_FINDER_COLUMN_ORG_MUC_NAM_ORGID_2);

		sb.append(_FINDER_COLUMN_ORG_MUC_NAM_MUCBC_2);

		sb.append(_FINDER_COLUMN_ORG_MUC_NAM_NAM_2);

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
			sb.append(DashboardChiPhiHoatDongModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(orgId);

		queryPos.add(mucBc);

		queryPos.add(nam);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						dashboardChiPhiHoatDong)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DashboardChiPhiHoatDong> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 */
	@Override
	public void removeByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		for (DashboardChiPhiHoatDong dashboardChiPhiHoatDong :
				findByORG_MUC_NAM(
					orgId, mucBc, nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(dashboardChiPhiHoatDong);
		}
	}

	/**
	 * Returns the number of dashboard chi phi hoat dongs where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the number of matching dashboard chi phi hoat dongs
	 */
	@Override
	public int countByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		FinderPath finderPath = _finderPathCountByORG_MUC_NAM;

		Object[] finderArgs = new Object[] {orgId, mucBc, nam};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_DASHBOARDCHIPHIHOATDONG_WHERE);

			sb.append(_FINDER_COLUMN_ORG_MUC_NAM_ORGID_2);

			sb.append(_FINDER_COLUMN_ORG_MUC_NAM_MUCBC_2);

			sb.append(_FINDER_COLUMN_ORG_MUC_NAM_NAM_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(orgId);

				queryPos.add(mucBc);

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

	private static final String _FINDER_COLUMN_ORG_MUC_NAM_ORGID_2 =
		"dashboardChiPhiHoatDong.orgId = ? AND ";

	private static final String _FINDER_COLUMN_ORG_MUC_NAM_MUCBC_2 =
		"dashboardChiPhiHoatDong.mucBc = ? AND ";

	private static final String _FINDER_COLUMN_ORG_MUC_NAM_NAM_2 =
		"dashboardChiPhiHoatDong.nam = ?";

	public DashboardChiPhiHoatDongPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("mucBc", "muc_bc");
		dbColumnNames.put("orgId", "organization_id");
		dbColumnNames.put("orgName", "organization_name");
		dbColumnNames.put("thanhPhanId", "thanhphan_id");
		dbColumnNames.put("thanhPhanMa", "thanhphan_ma");
		dbColumnNames.put("thanhPhanTen", "thanhphan_ten");
		dbColumnNames.put("drgPhiDv", "drg_phidv");
		dbColumnNames.put("drgDinhSuat", "drg_dinhsuat");
		dbColumnNames.put("drgValues", "drg_values");

		setDBColumnNames(dbColumnNames);

		setModelClass(DashboardChiPhiHoatDong.class);

		setModelImplClass(DashboardChiPhiHoatDongImpl.class);
		setModelPKClass(long.class);

		setTable(DashboardChiPhiHoatDongTable.INSTANCE);
	}

	/**
	 * Caches the dashboard chi phi hoat dong in the entity cache if it is enabled.
	 *
	 * @param dashboardChiPhiHoatDong the dashboard chi phi hoat dong
	 */
	@Override
	public void cacheResult(DashboardChiPhiHoatDong dashboardChiPhiHoatDong) {
		entityCache.putResult(
			DashboardChiPhiHoatDongImpl.class,
			dashboardChiPhiHoatDong.getPrimaryKey(), dashboardChiPhiHoatDong);
	}

	/**
	 * Caches the dashboard chi phi hoat dongs in the entity cache if it is enabled.
	 *
	 * @param dashboardChiPhiHoatDongs the dashboard chi phi hoat dongs
	 */
	@Override
	public void cacheResult(
		List<DashboardChiPhiHoatDong> dashboardChiPhiHoatDongs) {

		for (DashboardChiPhiHoatDong dashboardChiPhiHoatDong :
				dashboardChiPhiHoatDongs) {

			if (entityCache.getResult(
					DashboardChiPhiHoatDongImpl.class,
					dashboardChiPhiHoatDong.getPrimaryKey()) == null) {

				cacheResult(dashboardChiPhiHoatDong);
			}
		}
	}

	/**
	 * Clears the cache for all dashboard chi phi hoat dongs.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DashboardChiPhiHoatDongImpl.class);

		finderCache.clearCache(DashboardChiPhiHoatDongImpl.class);
	}

	/**
	 * Clears the cache for the dashboard chi phi hoat dong.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DashboardChiPhiHoatDong dashboardChiPhiHoatDong) {
		entityCache.removeResult(
			DashboardChiPhiHoatDongImpl.class, dashboardChiPhiHoatDong);
	}

	@Override
	public void clearCache(
		List<DashboardChiPhiHoatDong> dashboardChiPhiHoatDongs) {

		for (DashboardChiPhiHoatDong dashboardChiPhiHoatDong :
				dashboardChiPhiHoatDongs) {

			entityCache.removeResult(
				DashboardChiPhiHoatDongImpl.class, dashboardChiPhiHoatDong);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DashboardChiPhiHoatDongImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				DashboardChiPhiHoatDongImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new dashboard chi phi hoat dong with the primary key. Does not add the dashboard chi phi hoat dong to the database.
	 *
	 * @param id the primary key for the new dashboard chi phi hoat dong
	 * @return the new dashboard chi phi hoat dong
	 */
	@Override
	public DashboardChiPhiHoatDong create(long id) {
		DashboardChiPhiHoatDong dashboardChiPhiHoatDong =
			new DashboardChiPhiHoatDongImpl();

		dashboardChiPhiHoatDong.setNew(true);
		dashboardChiPhiHoatDong.setPrimaryKey(id);

		return dashboardChiPhiHoatDong;
	}

	/**
	 * Removes the dashboard chi phi hoat dong with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong that was removed
	 * @throws NoSuchDashboardChiPhiHoatDongException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiHoatDong remove(long id)
		throws NoSuchDashboardChiPhiHoatDongException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the dashboard chi phi hoat dong with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong that was removed
	 * @throws NoSuchDashboardChiPhiHoatDongException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiHoatDong remove(Serializable primaryKey)
		throws NoSuchDashboardChiPhiHoatDongException {

		Session session = null;

		try {
			session = openSession();

			DashboardChiPhiHoatDong dashboardChiPhiHoatDong =
				(DashboardChiPhiHoatDong)session.get(
					DashboardChiPhiHoatDongImpl.class, primaryKey);

			if (dashboardChiPhiHoatDong == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDashboardChiPhiHoatDongException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(dashboardChiPhiHoatDong);
		}
		catch (NoSuchDashboardChiPhiHoatDongException noSuchEntityException) {
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
	protected DashboardChiPhiHoatDong removeImpl(
		DashboardChiPhiHoatDong dashboardChiPhiHoatDong) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dashboardChiPhiHoatDong)) {
				dashboardChiPhiHoatDong = (DashboardChiPhiHoatDong)session.get(
					DashboardChiPhiHoatDongImpl.class,
					dashboardChiPhiHoatDong.getPrimaryKeyObj());
			}

			if (dashboardChiPhiHoatDong != null) {
				session.delete(dashboardChiPhiHoatDong);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (dashboardChiPhiHoatDong != null) {
			clearCache(dashboardChiPhiHoatDong);
		}

		return dashboardChiPhiHoatDong;
	}

	@Override
	public DashboardChiPhiHoatDong updateImpl(
		DashboardChiPhiHoatDong dashboardChiPhiHoatDong) {

		boolean isNew = dashboardChiPhiHoatDong.isNew();

		if (!(dashboardChiPhiHoatDong instanceof
				DashboardChiPhiHoatDongModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(dashboardChiPhiHoatDong.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					dashboardChiPhiHoatDong);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in dashboardChiPhiHoatDong proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DashboardChiPhiHoatDong implementation " +
					dashboardChiPhiHoatDong.getClass());
		}

		DashboardChiPhiHoatDongModelImpl dashboardChiPhiHoatDongModelImpl =
			(DashboardChiPhiHoatDongModelImpl)dashboardChiPhiHoatDong;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(dashboardChiPhiHoatDong);
			}
			else {
				dashboardChiPhiHoatDong =
					(DashboardChiPhiHoatDong)session.merge(
						dashboardChiPhiHoatDong);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DashboardChiPhiHoatDongImpl.class, dashboardChiPhiHoatDongModelImpl,
			false, true);

		if (isNew) {
			dashboardChiPhiHoatDong.setNew(false);
		}

		dashboardChiPhiHoatDong.resetOriginalValues();

		return dashboardChiPhiHoatDong;
	}

	/**
	 * Returns the dashboard chi phi hoat dong with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong
	 * @throws NoSuchDashboardChiPhiHoatDongException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiHoatDong findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDashboardChiPhiHoatDongException {

		DashboardChiPhiHoatDong dashboardChiPhiHoatDong = fetchByPrimaryKey(
			primaryKey);

		if (dashboardChiPhiHoatDong == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDashboardChiPhiHoatDongException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return dashboardChiPhiHoatDong;
	}

	/**
	 * Returns the dashboard chi phi hoat dong with the primary key or throws a <code>NoSuchDashboardChiPhiHoatDongException</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong
	 * @throws NoSuchDashboardChiPhiHoatDongException if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiHoatDong findByPrimaryKey(long id)
		throws NoSuchDashboardChiPhiHoatDongException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dashboard chi phi hoat dong with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard chi phi hoat dong
	 * @return the dashboard chi phi hoat dong, or <code>null</code> if a dashboard chi phi hoat dong with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiHoatDong fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dashboard chi phi hoat dongs.
	 *
	 * @return the dashboard chi phi hoat dongs
	 */
	@Override
	public List<DashboardChiPhiHoatDong> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dashboard chi phi hoat dongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @return the range of dashboard chi phi hoat dongs
	 */
	@Override
	public List<DashboardChiPhiHoatDong> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dashboard chi phi hoat dongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard chi phi hoat dongs
	 */
	@Override
	public List<DashboardChiPhiHoatDong> findAll(
		int start, int end,
		OrderByComparator<DashboardChiPhiHoatDong> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dashboard chi phi hoat dongs.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiHoatDongModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi hoat dongs
	 * @param end the upper bound of the range of dashboard chi phi hoat dongs (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard chi phi hoat dongs
	 */
	@Override
	public List<DashboardChiPhiHoatDong> findAll(
		int start, int end,
		OrderByComparator<DashboardChiPhiHoatDong> orderByComparator,
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

		List<DashboardChiPhiHoatDong> list = null;

		if (useFinderCache) {
			list = (List<DashboardChiPhiHoatDong>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DASHBOARDCHIPHIHOATDONG);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DASHBOARDCHIPHIHOATDONG;

				sql = sql.concat(
					DashboardChiPhiHoatDongModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DashboardChiPhiHoatDong>)QueryUtil.list(
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
	 * Removes all the dashboard chi phi hoat dongs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DashboardChiPhiHoatDong dashboardChiPhiHoatDong : findAll()) {
			remove(dashboardChiPhiHoatDong);
		}
	}

	/**
	 * Returns the number of dashboard chi phi hoat dongs.
	 *
	 * @return the number of dashboard chi phi hoat dongs
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
					_SQL_COUNT_DASHBOARDCHIPHIHOATDONG);

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
		return _SQL_SELECT_DASHBOARDCHIPHIHOATDONG;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DashboardChiPhiHoatDongModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dashboard chi phi hoat dong persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			DashboardChiPhiHoatDongPersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new DashboardChiPhiHoatDongModelArgumentsResolver(),
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

		_finderPathWithPaginationFindByORG_MUC_NAM = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByORG_MUC_NAM",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"organization_id", "muc_bc", "nam"}, true);

		_finderPathWithoutPaginationFindByORG_MUC_NAM = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByORG_MUC_NAM",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			new String[] {"organization_id", "muc_bc", "nam"}, true);

		_finderPathCountByORG_MUC_NAM = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByORG_MUC_NAM",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName()
			},
			new String[] {"organization_id", "muc_bc", "nam"}, false);
	}

	public void destroy() {
		entityCache.removeCache(DashboardChiPhiHoatDongImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_DASHBOARDCHIPHIHOATDONG =
		"SELECT dashboardChiPhiHoatDong FROM DashboardChiPhiHoatDong dashboardChiPhiHoatDong";

	private static final String _SQL_SELECT_DASHBOARDCHIPHIHOATDONG_WHERE =
		"SELECT dashboardChiPhiHoatDong FROM DashboardChiPhiHoatDong dashboardChiPhiHoatDong WHERE ";

	private static final String _SQL_COUNT_DASHBOARDCHIPHIHOATDONG =
		"SELECT COUNT(dashboardChiPhiHoatDong) FROM DashboardChiPhiHoatDong dashboardChiPhiHoatDong";

	private static final String _SQL_COUNT_DASHBOARDCHIPHIHOATDONG_WHERE =
		"SELECT COUNT(dashboardChiPhiHoatDong) FROM DashboardChiPhiHoatDong dashboardChiPhiHoatDong WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"dashboardChiPhiHoatDong.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DashboardChiPhiHoatDong exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DashboardChiPhiHoatDong exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DashboardChiPhiHoatDongPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {
			"mucBc", "orgId", "orgName", "thanhPhanId", "thanhPhanMa",
			"thanhPhanTen", "drgPhiDv", "drgDinhSuat", "drgValues"
		});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class DashboardChiPhiHoatDongModelArgumentsResolver
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

			DashboardChiPhiHoatDongModelImpl dashboardChiPhiHoatDongModelImpl =
				(DashboardChiPhiHoatDongModelImpl)baseModel;

			long columnBitmask =
				dashboardChiPhiHoatDongModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					dashboardChiPhiHoatDongModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						dashboardChiPhiHoatDongModelImpl.getColumnBitmask(
							columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					dashboardChiPhiHoatDongModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return DashboardChiPhiHoatDongImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return DashboardChiPhiHoatDongTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			DashboardChiPhiHoatDongModelImpl dashboardChiPhiHoatDongModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						dashboardChiPhiHoatDongModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] =
						dashboardChiPhiHoatDongModelImpl.getColumnValue(
							columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}