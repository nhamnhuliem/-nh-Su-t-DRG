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

import drg.moh.service.exception.NoSuchDashboardCMIException;
import drg.moh.service.model.DashboardCMI;
import drg.moh.service.model.DashboardCMITable;
import drg.moh.service.model.impl.DashboardCMIImpl;
import drg.moh.service.model.impl.DashboardCMIModelImpl;
import drg.moh.service.service.persistence.DashboardCMIPersistence;

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
 * The persistence implementation for the dashboard cmi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class DashboardCMIPersistenceImpl
	extends BasePersistenceImpl<DashboardCMI>
	implements DashboardCMIPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DashboardCMIUtil</code> to access the dashboard cmi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DashboardCMIImpl.class.getName();

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
	 * Returns all the dashboard cmis where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard cmis
	 */
	@Override
	public List<DashboardCMI> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam) {

		return findByORG_MUC_NAM(
			orgId, mucBc, nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dashboard cmis where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardCMIModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard cmis
	 * @param end the upper bound of the range of dashboard cmis (not inclusive)
	 * @return the range of matching dashboard cmis
	 */
	@Override
	public List<DashboardCMI> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end) {

		return findByORG_MUC_NAM(orgId, mucBc, nam, start, end, null);
	}

	/**
	 * Returns an ordered range of all the dashboard cmis where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardCMIModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard cmis
	 * @param end the upper bound of the range of dashboard cmis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dashboard cmis
	 */
	@Override
	public List<DashboardCMI> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		OrderByComparator<DashboardCMI> orderByComparator) {

		return findByORG_MUC_NAM(
			orgId, mucBc, nam, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dashboard cmis where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardCMIModelImpl</code>.
	 * </p>
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param start the lower bound of the range of dashboard cmis
	 * @param end the upper bound of the range of dashboard cmis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dashboard cmis
	 */
	@Override
	public List<DashboardCMI> findByORG_MUC_NAM(
		long orgId, int mucBc, int nam, int start, int end,
		OrderByComparator<DashboardCMI> orderByComparator,
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

		List<DashboardCMI> list = null;

		if (useFinderCache) {
			list = (List<DashboardCMI>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (DashboardCMI dashboardCMI : list) {
					if ((orgId != dashboardCMI.getOrgId()) ||
						(mucBc != dashboardCMI.getMucBc()) ||
						(nam != dashboardCMI.getNam())) {

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

			sb.append(_SQL_SELECT_DASHBOARDCMI_WHERE);

			sb.append(_FINDER_COLUMN_ORG_MUC_NAM_ORGID_2);

			sb.append(_FINDER_COLUMN_ORG_MUC_NAM_MUCBC_2);

			sb.append(_FINDER_COLUMN_ORG_MUC_NAM_NAM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(DashboardCMIModelImpl.ORDER_BY_JPQL);
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

				list = (List<DashboardCMI>)QueryUtil.list(
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
	 * Returns the first dashboard cmi in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard cmi
	 * @throws NoSuchDashboardCMIException if a matching dashboard cmi could not be found
	 */
	@Override
	public DashboardCMI findByORG_MUC_NAM_First(
			long orgId, int mucBc, int nam,
			OrderByComparator<DashboardCMI> orderByComparator)
		throws NoSuchDashboardCMIException {

		DashboardCMI dashboardCMI = fetchByORG_MUC_NAM_First(
			orgId, mucBc, nam, orderByComparator);

		if (dashboardCMI != null) {
			return dashboardCMI;
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

		throw new NoSuchDashboardCMIException(sb.toString());
	}

	/**
	 * Returns the first dashboard cmi in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dashboard cmi, or <code>null</code> if a matching dashboard cmi could not be found
	 */
	@Override
	public DashboardCMI fetchByORG_MUC_NAM_First(
		long orgId, int mucBc, int nam,
		OrderByComparator<DashboardCMI> orderByComparator) {

		List<DashboardCMI> list = findByORG_MUC_NAM(
			orgId, mucBc, nam, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dashboard cmi in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard cmi
	 * @throws NoSuchDashboardCMIException if a matching dashboard cmi could not be found
	 */
	@Override
	public DashboardCMI findByORG_MUC_NAM_Last(
			long orgId, int mucBc, int nam,
			OrderByComparator<DashboardCMI> orderByComparator)
		throws NoSuchDashboardCMIException {

		DashboardCMI dashboardCMI = fetchByORG_MUC_NAM_Last(
			orgId, mucBc, nam, orderByComparator);

		if (dashboardCMI != null) {
			return dashboardCMI;
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

		throw new NoSuchDashboardCMIException(sb.toString());
	}

	/**
	 * Returns the last dashboard cmi in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dashboard cmi, or <code>null</code> if a matching dashboard cmi could not be found
	 */
	@Override
	public DashboardCMI fetchByORG_MUC_NAM_Last(
		long orgId, int mucBc, int nam,
		OrderByComparator<DashboardCMI> orderByComparator) {

		int count = countByORG_MUC_NAM(orgId, mucBc, nam);

		if (count == 0) {
			return null;
		}

		List<DashboardCMI> list = findByORG_MUC_NAM(
			orgId, mucBc, nam, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the dashboard cmis before and after the current dashboard cmi in the ordered set where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param id the primary key of the current dashboard cmi
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dashboard cmi
	 * @throws NoSuchDashboardCMIException if a dashboard cmi with the primary key could not be found
	 */
	@Override
	public DashboardCMI[] findByORG_MUC_NAM_PrevAndNext(
			long id, long orgId, int mucBc, int nam,
			OrderByComparator<DashboardCMI> orderByComparator)
		throws NoSuchDashboardCMIException {

		DashboardCMI dashboardCMI = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DashboardCMI[] array = new DashboardCMIImpl[3];

			array[0] = getByORG_MUC_NAM_PrevAndNext(
				session, dashboardCMI, orgId, mucBc, nam, orderByComparator,
				true);

			array[1] = dashboardCMI;

			array[2] = getByORG_MUC_NAM_PrevAndNext(
				session, dashboardCMI, orgId, mucBc, nam, orderByComparator,
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

	protected DashboardCMI getByORG_MUC_NAM_PrevAndNext(
		Session session, DashboardCMI dashboardCMI, long orgId, int mucBc,
		int nam, OrderByComparator<DashboardCMI> orderByComparator,
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

		sb.append(_SQL_SELECT_DASHBOARDCMI_WHERE);

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
			sb.append(DashboardCMIModelImpl.ORDER_BY_JPQL);
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
					orderByComparator.getOrderByConditionValues(dashboardCMI)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<DashboardCMI> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dashboard cmis where orgId = &#63; and mucBc = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 */
	@Override
	public void removeByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		for (DashboardCMI dashboardCMI :
				findByORG_MUC_NAM(
					orgId, mucBc, nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(dashboardCMI);
		}
	}

	/**
	 * Returns the number of dashboard cmis where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the number of matching dashboard cmis
	 */
	@Override
	public int countByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		FinderPath finderPath = _finderPathCountByORG_MUC_NAM;

		Object[] finderArgs = new Object[] {orgId, mucBc, nam};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_DASHBOARDCMI_WHERE);

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
		"dashboardCMI.orgId = ? AND ";

	private static final String _FINDER_COLUMN_ORG_MUC_NAM_MUCBC_2 =
		"dashboardCMI.mucBc = ? AND ";

	private static final String _FINDER_COLUMN_ORG_MUC_NAM_NAM_2 =
		"dashboardCMI.nam = ?";

	public DashboardCMIPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("mucBc", "muc_bc");
		dbColumnNames.put("orgId", "organization_id");
		dbColumnNames.put("orgName", "organization_name");
		dbColumnNames.put("cmiThap", "cmi_thap");
		dbColumnNames.put("cmiCao", "cmi_cao");
		dbColumnNames.put("cmiTrungBinh", "cmi_trungbinh");

		setDBColumnNames(dbColumnNames);

		setModelClass(DashboardCMI.class);

		setModelImplClass(DashboardCMIImpl.class);
		setModelPKClass(long.class);

		setTable(DashboardCMITable.INSTANCE);
	}

	/**
	 * Caches the dashboard cmi in the entity cache if it is enabled.
	 *
	 * @param dashboardCMI the dashboard cmi
	 */
	@Override
	public void cacheResult(DashboardCMI dashboardCMI) {
		entityCache.putResult(
			DashboardCMIImpl.class, dashboardCMI.getPrimaryKey(), dashboardCMI);
	}

	/**
	 * Caches the dashboard cmis in the entity cache if it is enabled.
	 *
	 * @param dashboardCMIs the dashboard cmis
	 */
	@Override
	public void cacheResult(List<DashboardCMI> dashboardCMIs) {
		for (DashboardCMI dashboardCMI : dashboardCMIs) {
			if (entityCache.getResult(
					DashboardCMIImpl.class, dashboardCMI.getPrimaryKey()) ==
						null) {

				cacheResult(dashboardCMI);
			}
		}
	}

	/**
	 * Clears the cache for all dashboard cmis.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DashboardCMIImpl.class);

		finderCache.clearCache(DashboardCMIImpl.class);
	}

	/**
	 * Clears the cache for the dashboard cmi.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DashboardCMI dashboardCMI) {
		entityCache.removeResult(DashboardCMIImpl.class, dashboardCMI);
	}

	@Override
	public void clearCache(List<DashboardCMI> dashboardCMIs) {
		for (DashboardCMI dashboardCMI : dashboardCMIs) {
			entityCache.removeResult(DashboardCMIImpl.class, dashboardCMI);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DashboardCMIImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(DashboardCMIImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new dashboard cmi with the primary key. Does not add the dashboard cmi to the database.
	 *
	 * @param id the primary key for the new dashboard cmi
	 * @return the new dashboard cmi
	 */
	@Override
	public DashboardCMI create(long id) {
		DashboardCMI dashboardCMI = new DashboardCMIImpl();

		dashboardCMI.setNew(true);
		dashboardCMI.setPrimaryKey(id);

		return dashboardCMI;
	}

	/**
	 * Removes the dashboard cmi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dashboard cmi
	 * @return the dashboard cmi that was removed
	 * @throws NoSuchDashboardCMIException if a dashboard cmi with the primary key could not be found
	 */
	@Override
	public DashboardCMI remove(long id) throws NoSuchDashboardCMIException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dashboard cmi with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dashboard cmi
	 * @return the dashboard cmi that was removed
	 * @throws NoSuchDashboardCMIException if a dashboard cmi with the primary key could not be found
	 */
	@Override
	public DashboardCMI remove(Serializable primaryKey)
		throws NoSuchDashboardCMIException {

		Session session = null;

		try {
			session = openSession();

			DashboardCMI dashboardCMI = (DashboardCMI)session.get(
				DashboardCMIImpl.class, primaryKey);

			if (dashboardCMI == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDashboardCMIException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(dashboardCMI);
		}
		catch (NoSuchDashboardCMIException noSuchEntityException) {
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
	protected DashboardCMI removeImpl(DashboardCMI dashboardCMI) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dashboardCMI)) {
				dashboardCMI = (DashboardCMI)session.get(
					DashboardCMIImpl.class, dashboardCMI.getPrimaryKeyObj());
			}

			if (dashboardCMI != null) {
				session.delete(dashboardCMI);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (dashboardCMI != null) {
			clearCache(dashboardCMI);
		}

		return dashboardCMI;
	}

	@Override
	public DashboardCMI updateImpl(DashboardCMI dashboardCMI) {
		boolean isNew = dashboardCMI.isNew();

		if (!(dashboardCMI instanceof DashboardCMIModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(dashboardCMI.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					dashboardCMI);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in dashboardCMI proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DashboardCMI implementation " +
					dashboardCMI.getClass());
		}

		DashboardCMIModelImpl dashboardCMIModelImpl =
			(DashboardCMIModelImpl)dashboardCMI;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(dashboardCMI);
			}
			else {
				dashboardCMI = (DashboardCMI)session.merge(dashboardCMI);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DashboardCMIImpl.class, dashboardCMIModelImpl, false, true);

		if (isNew) {
			dashboardCMI.setNew(false);
		}

		dashboardCMI.resetOriginalValues();

		return dashboardCMI;
	}

	/**
	 * Returns the dashboard cmi with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dashboard cmi
	 * @return the dashboard cmi
	 * @throws NoSuchDashboardCMIException if a dashboard cmi with the primary key could not be found
	 */
	@Override
	public DashboardCMI findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDashboardCMIException {

		DashboardCMI dashboardCMI = fetchByPrimaryKey(primaryKey);

		if (dashboardCMI == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDashboardCMIException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return dashboardCMI;
	}

	/**
	 * Returns the dashboard cmi with the primary key or throws a <code>NoSuchDashboardCMIException</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard cmi
	 * @return the dashboard cmi
	 * @throws NoSuchDashboardCMIException if a dashboard cmi with the primary key could not be found
	 */
	@Override
	public DashboardCMI findByPrimaryKey(long id)
		throws NoSuchDashboardCMIException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dashboard cmi with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard cmi
	 * @return the dashboard cmi, or <code>null</code> if a dashboard cmi with the primary key could not be found
	 */
	@Override
	public DashboardCMI fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dashboard cmis.
	 *
	 * @return the dashboard cmis
	 */
	@Override
	public List<DashboardCMI> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dashboard cmis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardCMIModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard cmis
	 * @param end the upper bound of the range of dashboard cmis (not inclusive)
	 * @return the range of dashboard cmis
	 */
	@Override
	public List<DashboardCMI> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dashboard cmis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardCMIModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard cmis
	 * @param end the upper bound of the range of dashboard cmis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard cmis
	 */
	@Override
	public List<DashboardCMI> findAll(
		int start, int end, OrderByComparator<DashboardCMI> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dashboard cmis.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardCMIModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard cmis
	 * @param end the upper bound of the range of dashboard cmis (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard cmis
	 */
	@Override
	public List<DashboardCMI> findAll(
		int start, int end, OrderByComparator<DashboardCMI> orderByComparator,
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

		List<DashboardCMI> list = null;

		if (useFinderCache) {
			list = (List<DashboardCMI>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DASHBOARDCMI);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DASHBOARDCMI;

				sql = sql.concat(DashboardCMIModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DashboardCMI>)QueryUtil.list(
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
	 * Removes all the dashboard cmis from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DashboardCMI dashboardCMI : findAll()) {
			remove(dashboardCMI);
		}
	}

	/**
	 * Returns the number of dashboard cmis.
	 *
	 * @return the number of dashboard cmis
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_DASHBOARDCMI);

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
		return _SQL_SELECT_DASHBOARDCMI;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DashboardCMIModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dashboard cmi persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			DashboardCMIPersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new DashboardCMIModelArgumentsResolver(),
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
		entityCache.removeCache(DashboardCMIImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_DASHBOARDCMI =
		"SELECT dashboardCMI FROM DashboardCMI dashboardCMI";

	private static final String _SQL_SELECT_DASHBOARDCMI_WHERE =
		"SELECT dashboardCMI FROM DashboardCMI dashboardCMI WHERE ";

	private static final String _SQL_COUNT_DASHBOARDCMI =
		"SELECT COUNT(dashboardCMI) FROM DashboardCMI dashboardCMI";

	private static final String _SQL_COUNT_DASHBOARDCMI_WHERE =
		"SELECT COUNT(dashboardCMI) FROM DashboardCMI dashboardCMI WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "dashboardCMI.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DashboardCMI exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DashboardCMI exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DashboardCMIPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {
			"mucBc", "orgId", "orgName", "cmiThap", "cmiCao", "cmiTrungBinh"
		});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class DashboardCMIModelArgumentsResolver
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

			DashboardCMIModelImpl dashboardCMIModelImpl =
				(DashboardCMIModelImpl)baseModel;

			long columnBitmask = dashboardCMIModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(dashboardCMIModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						dashboardCMIModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(dashboardCMIModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return DashboardCMIImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return DashboardCMITable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			DashboardCMIModelImpl dashboardCMIModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] = dashboardCMIModelImpl.getColumnOriginalValue(
						columnName);
				}
				else {
					arguments[i] = dashboardCMIModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}