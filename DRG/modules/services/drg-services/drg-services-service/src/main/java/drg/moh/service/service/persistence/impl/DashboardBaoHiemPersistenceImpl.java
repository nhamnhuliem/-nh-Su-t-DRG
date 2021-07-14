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

import drg.moh.service.exception.NoSuchDashboardBaoHiemException;
import drg.moh.service.model.DashboardBaoHiem;
import drg.moh.service.model.DashboardBaoHiemTable;
import drg.moh.service.model.impl.DashboardBaoHiemImpl;
import drg.moh.service.model.impl.DashboardBaoHiemModelImpl;
import drg.moh.service.service.persistence.DashboardBaoHiemPersistence;

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
 * The persistence implementation for the dashboard bao hiem service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class DashboardBaoHiemPersistenceImpl
	extends BasePersistenceImpl<DashboardBaoHiem>
	implements DashboardBaoHiemPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DashboardBaoHiemUtil</code> to access the dashboard bao hiem persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DashboardBaoHiemImpl.class.getName();

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
	 * Returns all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard bao hiems
	 */
	@Override
	public List<DashboardBaoHiem> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam) {

		return findByORG_MUC_NAM(
			orgId, mucBc, nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @return the range of matching dashboard bao hiems
	 */
	@Override
	public List<DashboardBaoHiem> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end) {

		return findByORG_MUC_NAM(orgId, mucBc, nam, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dashboard bao hiems
	 */
	@Override
	public List<DashboardBaoHiem> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		OrderByComparator<DashboardBaoHiem> orderByComparator) {

		return findByORG_MUC_NAM(
			orgId, mucBc, nam, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dashboard bao hiems
	 */
	@Override
	public List<DashboardBaoHiem> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		OrderByComparator<DashboardBaoHiem> orderByComparator,
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

		List<DashboardBaoHiem> list = null;

		if (useFinderCache) {
			list = (List<DashboardBaoHiem>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (DashboardBaoHiem dashboardBaoHiem : list) {
					if ((orgId != dashboardBaoHiem.getOrgId()) ||
						(mucBc != dashboardBaoHiem.getMucBc()) ||
						(nam != dashboardBaoHiem.getNam())) {

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

			sb.append(_SQL_SELECT_DASHBOARDBAOHIEM_WHERE);

			sb.append(_FINDER_COLUMN_ORG_MUC_NAM_ORGID_2);

			sb.append(_FINDER_COLUMN_ORG_MUC_NAM_MUCBC_2);

			sb.append(_FINDER_COLUMN_ORG_MUC_NAM_NAM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DashboardBaoHiemModelImpl.ORDER_BY_JPQL);
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

				list = (List<DashboardBaoHiem>)QueryUtil.list(
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
	 * Returns the first dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard bao hiem
	 * @throws NoSuchDashboardBaoHiemException if a matching dashboard bao hiem could not be found
	 */
	@Override
	public DashboardBaoHiem findByORG_MUC_NAM_First(
			long orgId, int mucBc, int nam,
			OrderByComparator<DashboardBaoHiem> orderByComparator)
		throws NoSuchDashboardBaoHiemException {

		DashboardBaoHiem dashboardBaoHiem = fetchByORG_MUC_NAM_First(
			orgId, mucBc, nam, orderByComparator);

		if (dashboardBaoHiem != null) {
			return dashboardBaoHiem;
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

		throw new NoSuchDashboardBaoHiemException(sb.toString());
	}

	/**
	 * Returns the first dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard bao hiem, or <code>null</code> if a matching dashboard bao hiem could not be found
	 */
	@Override
	public DashboardBaoHiem fetchByORG_MUC_NAM_First(
		long orgId, int mucBc, int nam,
		OrderByComparator<DashboardBaoHiem> orderByComparator) {

		List<DashboardBaoHiem> list = findByORG_MUC_NAM(
			orgId, mucBc, nam, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard bao hiem
	 * @throws NoSuchDashboardBaoHiemException if a matching dashboard bao hiem could not be found
	 */
	@Override
	public DashboardBaoHiem findByORG_MUC_NAM_Last(
			long orgId, int mucBc, int nam,
			OrderByComparator<DashboardBaoHiem> orderByComparator)
		throws NoSuchDashboardBaoHiemException {

		DashboardBaoHiem dashboardBaoHiem = fetchByORG_MUC_NAM_Last(
			orgId, mucBc, nam, orderByComparator);

		if (dashboardBaoHiem != null) {
			return dashboardBaoHiem;
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

		throw new NoSuchDashboardBaoHiemException(sb.toString());
	}

	/**
	 * Returns the last dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard bao hiem, or <code>null</code> if a matching dashboard bao hiem could not be found
	 */
	@Override
	public DashboardBaoHiem fetchByORG_MUC_NAM_Last(
		long orgId, int mucBc, int nam,
		OrderByComparator<DashboardBaoHiem> orderByComparator) {

		int count = countByORG_MUC_NAM(orgId, mucBc, nam);

		if (count == 0) {
			return null;
		}

		List<DashboardBaoHiem> list = findByORG_MUC_NAM(
			orgId, mucBc, nam, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dashboard bao hiems before and after the current dashboard bao hiem in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current dashboard bao hiem
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dashboard bao hiem
	 * @throws NoSuchDashboardBaoHiemException if a dashboard bao hiem with the primary key could not be found
	 */
	@Override
	public DashboardBaoHiem[] findByORG_MUC_NAM_PrevAndNext(
			long id, long orgId, int mucBc, int nam,
			OrderByComparator<DashboardBaoHiem> orderByComparator)
		throws NoSuchDashboardBaoHiemException {

		DashboardBaoHiem dashboardBaoHiem = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DashboardBaoHiem[] array = new DashboardBaoHiemImpl[3];

			array[0] = getByORG_MUC_NAM_PrevAndNext(
				session, dashboardBaoHiem, orgId, mucBc, nam, orderByComparator,
				true);

			array[1] = dashboardBaoHiem;

			array[2] = getByORG_MUC_NAM_PrevAndNext(
				session, dashboardBaoHiem, orgId, mucBc, nam, orderByComparator,
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

	protected DashboardBaoHiem getByORG_MUC_NAM_PrevAndNext(
		Session session, DashboardBaoHiem dashboardBaoHiem, long orgId,
		int mucBc, int nam,
		OrderByComparator<DashboardBaoHiem> orderByComparator,
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

		sb.append(_SQL_SELECT_DASHBOARDBAOHIEM_WHERE);

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
			sb.append(DashboardBaoHiemModelImpl.ORDER_BY_JPQL);
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
						dashboardBaoHiem)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DashboardBaoHiem> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 */
	@Override
	public void removeByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		for (DashboardBaoHiem dashboardBaoHiem :
				findByORG_MUC_NAM(
					orgId, mucBc, nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(dashboardBaoHiem);
		}
	}

	/**
	 * Returns the number of dashboard bao hiems where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the number of matching dashboard bao hiems
	 */
	@Override
	public int countByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		FinderPath finderPath = _finderPathCountByORG_MUC_NAM;

		Object[] finderArgs = new Object[] {orgId, mucBc, nam};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_DASHBOARDBAOHIEM_WHERE);

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
		"dashboardBaoHiem.orgId = ? AND ";

	private static final String _FINDER_COLUMN_ORG_MUC_NAM_MUCBC_2 =
		"dashboardBaoHiem.mucBc = ? AND ";

	private static final String _FINDER_COLUMN_ORG_MUC_NAM_NAM_2 =
		"dashboardBaoHiem.nam = ?";

	public DashboardBaoHiemPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("mucBc", "muc_bc");
		dbColumnNames.put("orgId", "organization_id");
		dbColumnNames.put("orgName", "organization_name");
		dbColumnNames.put("drgMa", "drg_ma");
		dbColumnNames.put("drgTen", "drg_ten");
		dbColumnNames.put("drgValue", "drg_value");
		dbColumnNames.put("drgUp", "drg_up");
		dbColumnNames.put("drgDown", "drg_down");

		setDBColumnNames(dbColumnNames);

		setModelClass(DashboardBaoHiem.class);

		setModelImplClass(DashboardBaoHiemImpl.class);
		setModelPKClass(long.class);

		setTable(DashboardBaoHiemTable.INSTANCE);
	}

	/**
	 * Caches the dashboard bao hiem in the entity cache if it is enabled.
	 *
	 * @param dashboardBaoHiem the dashboard bao hiem
	 */
	@Override
	public void cacheResult(DashboardBaoHiem dashboardBaoHiem) {
		entityCache.putResult(
			DashboardBaoHiemImpl.class, dashboardBaoHiem.getPrimaryKey(),
			dashboardBaoHiem);
	}

	/**
	 * Caches the dashboard bao hiems in the entity cache if it is enabled.
	 *
	 * @param dashboardBaoHiems the dashboard bao hiems
	 */
	@Override
	public void cacheResult(List<DashboardBaoHiem> dashboardBaoHiems) {
		for (DashboardBaoHiem dashboardBaoHiem : dashboardBaoHiems) {
			if (entityCache.getResult(
					DashboardBaoHiemImpl.class,
					dashboardBaoHiem.getPrimaryKey()) == null) {

				cacheResult(dashboardBaoHiem);
			}
		}
	}

	/**
	 * Clears the cache for all dashboard bao hiems.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DashboardBaoHiemImpl.class);

		finderCache.clearCache(DashboardBaoHiemImpl.class);
	}

	/**
	 * Clears the cache for the dashboard bao hiem.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DashboardBaoHiem dashboardBaoHiem) {
		entityCache.removeResult(DashboardBaoHiemImpl.class, dashboardBaoHiem);
	}

	@Override
	public void clearCache(List<DashboardBaoHiem> dashboardBaoHiems) {
		for (DashboardBaoHiem dashboardBaoHiem : dashboardBaoHiems) {
			entityCache.removeResult(
				DashboardBaoHiemImpl.class, dashboardBaoHiem);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DashboardBaoHiemImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DashboardBaoHiemImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new dashboard bao hiem with the primary key. Does not add the dashboard bao hiem to the database.
	 *
	 * @param id the primary key for the new dashboard bao hiem
	 * @return the new dashboard bao hiem
	 */
	@Override
	public DashboardBaoHiem create(long id) {
		DashboardBaoHiem dashboardBaoHiem = new DashboardBaoHiemImpl();

		dashboardBaoHiem.setNew(true);
		dashboardBaoHiem.setPrimaryKey(id);

		return dashboardBaoHiem;
	}

	/**
	 * Removes the dashboard bao hiem with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dashboard bao hiem
	 * @return the dashboard bao hiem that was removed
	 * @throws NoSuchDashboardBaoHiemException if a dashboard bao hiem with the primary key could not be found
	 */
	@Override
	public DashboardBaoHiem remove(long id)
		throws NoSuchDashboardBaoHiemException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the dashboard bao hiem with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dashboard bao hiem
	 * @return the dashboard bao hiem that was removed
	 * @throws NoSuchDashboardBaoHiemException if a dashboard bao hiem with the primary key could not be found
	 */
	@Override
	public DashboardBaoHiem remove(Serializable primaryKey)
		throws NoSuchDashboardBaoHiemException {

		Session session = null;

		try {
			session = openSession();

			DashboardBaoHiem dashboardBaoHiem = (DashboardBaoHiem)session.get(
				DashboardBaoHiemImpl.class, primaryKey);

			if (dashboardBaoHiem == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDashboardBaoHiemException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(dashboardBaoHiem);
		}
		catch (NoSuchDashboardBaoHiemException noSuchEntityException) {
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
	protected DashboardBaoHiem removeImpl(DashboardBaoHiem dashboardBaoHiem) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dashboardBaoHiem)) {
				dashboardBaoHiem = (DashboardBaoHiem)session.get(
					DashboardBaoHiemImpl.class,
					dashboardBaoHiem.getPrimaryKeyObj());
			}

			if (dashboardBaoHiem != null) {
				session.delete(dashboardBaoHiem);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (dashboardBaoHiem != null) {
			clearCache(dashboardBaoHiem);
		}

		return dashboardBaoHiem;
	}

	@Override
	public DashboardBaoHiem updateImpl(DashboardBaoHiem dashboardBaoHiem) {
		boolean isNew = dashboardBaoHiem.isNew();

		if (!(dashboardBaoHiem instanceof DashboardBaoHiemModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(dashboardBaoHiem.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					dashboardBaoHiem);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in dashboardBaoHiem proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DashboardBaoHiem implementation " +
					dashboardBaoHiem.getClass());
		}

		DashboardBaoHiemModelImpl dashboardBaoHiemModelImpl =
			(DashboardBaoHiemModelImpl)dashboardBaoHiem;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(dashboardBaoHiem);
			}
			else {
				dashboardBaoHiem = (DashboardBaoHiem)session.merge(
					dashboardBaoHiem);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DashboardBaoHiemImpl.class, dashboardBaoHiemModelImpl, false, true);

		if (isNew) {
			dashboardBaoHiem.setNew(false);
		}

		dashboardBaoHiem.resetOriginalValues();

		return dashboardBaoHiem;
	}

	/**
	 * Returns the dashboard bao hiem with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dashboard bao hiem
	 * @return the dashboard bao hiem
	 * @throws NoSuchDashboardBaoHiemException if a dashboard bao hiem with the primary key could not be found
	 */
	@Override
	public DashboardBaoHiem findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDashboardBaoHiemException {

		DashboardBaoHiem dashboardBaoHiem = fetchByPrimaryKey(primaryKey);

		if (dashboardBaoHiem == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDashboardBaoHiemException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return dashboardBaoHiem;
	}

	/**
	 * Returns the dashboard bao hiem with the primary key or throws a <code>NoSuchDashboardBaoHiemException</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard bao hiem
	 * @return the dashboard bao hiem
	 * @throws NoSuchDashboardBaoHiemException if a dashboard bao hiem with the primary key could not be found
	 */
	@Override
	public DashboardBaoHiem findByPrimaryKey(long id)
		throws NoSuchDashboardBaoHiemException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dashboard bao hiem with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard bao hiem
	 * @return the dashboard bao hiem, or <code>null</code> if a dashboard bao hiem with the primary key could not be found
	 */
	@Override
	public DashboardBaoHiem fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dashboard bao hiems.
	 *
	 * @return the dashboard bao hiems
	 */
	@Override
	public List<DashboardBaoHiem> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dashboard bao hiems.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @return the range of dashboard bao hiems
	 */
	@Override
	public List<DashboardBaoHiem> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dashboard bao hiems.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard bao hiems
	 */
	@Override
	public List<DashboardBaoHiem> findAll(
		int start, int end,
		OrderByComparator<DashboardBaoHiem> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dashboard bao hiems.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardBaoHiemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard bao hiems
	 * @param end the upper bound of the range of dashboard bao hiems (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard bao hiems
	 */
	@Override
	public List<DashboardBaoHiem> findAll(
		int start, int end,
		OrderByComparator<DashboardBaoHiem> orderByComparator,
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

		List<DashboardBaoHiem> list = null;

		if (useFinderCache) {
			list = (List<DashboardBaoHiem>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DASHBOARDBAOHIEM);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DASHBOARDBAOHIEM;

				sql = sql.concat(DashboardBaoHiemModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DashboardBaoHiem>)QueryUtil.list(
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
	 * Removes all the dashboard bao hiems from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DashboardBaoHiem dashboardBaoHiem : findAll()) {
			remove(dashboardBaoHiem);
		}
	}

	/**
	 * Returns the number of dashboard bao hiems.
	 *
	 * @return the number of dashboard bao hiems
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DASHBOARDBAOHIEM);

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
		return _SQL_SELECT_DASHBOARDBAOHIEM;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DashboardBaoHiemModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dashboard bao hiem persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			DashboardBaoHiemPersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new DashboardBaoHiemModelArgumentsResolver(),
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
		entityCache.removeCache(DashboardBaoHiemImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_DASHBOARDBAOHIEM =
		"SELECT dashboardBaoHiem FROM DashboardBaoHiem dashboardBaoHiem";

	private static final String _SQL_SELECT_DASHBOARDBAOHIEM_WHERE =
		"SELECT dashboardBaoHiem FROM DashboardBaoHiem dashboardBaoHiem WHERE ";

	private static final String _SQL_COUNT_DASHBOARDBAOHIEM =
		"SELECT COUNT(dashboardBaoHiem) FROM DashboardBaoHiem dashboardBaoHiem";

	private static final String _SQL_COUNT_DASHBOARDBAOHIEM_WHERE =
		"SELECT COUNT(dashboardBaoHiem) FROM DashboardBaoHiem dashboardBaoHiem WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "dashboardBaoHiem.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DashboardBaoHiem exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DashboardBaoHiem exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DashboardBaoHiemPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {
			"mucBc", "orgId", "orgName", "drgMa", "drgTen", "drgValue", "drgUp",
			"drgDown"
		});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class DashboardBaoHiemModelArgumentsResolver
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

			DashboardBaoHiemModelImpl dashboardBaoHiemModelImpl =
				(DashboardBaoHiemModelImpl)baseModel;

			long columnBitmask = dashboardBaoHiemModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					dashboardBaoHiemModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						dashboardBaoHiemModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					dashboardBaoHiemModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return DashboardBaoHiemImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return DashboardBaoHiemTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			DashboardBaoHiemModelImpl dashboardBaoHiemModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						dashboardBaoHiemModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = dashboardBaoHiemModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}