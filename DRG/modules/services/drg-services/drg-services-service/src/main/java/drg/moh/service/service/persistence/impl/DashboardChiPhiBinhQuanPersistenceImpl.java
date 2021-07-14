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
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import drg.moh.service.exception.NoSuchDashboardChiPhiBinhQuanException;
import drg.moh.service.model.DashboardChiPhiBinhQuan;
import drg.moh.service.model.DashboardChiPhiBinhQuanTable;
import drg.moh.service.model.impl.DashboardChiPhiBinhQuanImpl;
import drg.moh.service.model.impl.DashboardChiPhiBinhQuanModelImpl;
import drg.moh.service.service.persistence.DashboardChiPhiBinhQuanPersistence;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
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
 * The persistence implementation for the dashboard chi phi binh quan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class DashboardChiPhiBinhQuanPersistenceImpl
	extends BasePersistenceImpl<DashboardChiPhiBinhQuan>
	implements DashboardChiPhiBinhQuanPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DashboardChiPhiBinhQuanUtil</code> to access the dashboard chi phi binh quan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DashboardChiPhiBinhQuanImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchByORG_MUC_NAM;
	private FinderPath _finderPathCountByORG_MUC_NAM;

	/**
	 * Returns the dashboard chi phi binh quan where orgId = &#63; and mucBc = &#63; and nam = &#63; or throws a <code>NoSuchDashboardChiPhiBinhQuanException</code> if it could not be found.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard chi phi binh quan
	 * @throws NoSuchDashboardChiPhiBinhQuanException if a matching dashboard chi phi binh quan could not be found
	 */
	@Override
	public DashboardChiPhiBinhQuan findByORG_MUC_NAM(
			long orgId, int mucBc, int nam)
		throws NoSuchDashboardChiPhiBinhQuanException {

		DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan = fetchByORG_MUC_NAM(
			orgId, mucBc, nam);

		if (dashboardChiPhiBinhQuan == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("orgId=");
			sb.append(orgId);

			sb.append(", mucBc=");
			sb.append(mucBc);

			sb.append(", nam=");
			sb.append(nam);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchDashboardChiPhiBinhQuanException(sb.toString());
		}

		return dashboardChiPhiBinhQuan;
	}

	/**
	 * Returns the dashboard chi phi binh quan where orgId = &#63; and mucBc = &#63; and nam = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard chi phi binh quan, or <code>null</code> if a matching dashboard chi phi binh quan could not be found
	 */
	@Override
	public DashboardChiPhiBinhQuan fetchByORG_MUC_NAM(
		long orgId, int mucBc, int nam) {

		return fetchByORG_MUC_NAM(orgId, mucBc, nam, true);
	}

	/**
	 * Returns the dashboard chi phi binh quan where orgId = &#63; and mucBc = &#63; and nam = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dashboard chi phi binh quan, or <code>null</code> if a matching dashboard chi phi binh quan could not be found
	 */
	@Override
	public DashboardChiPhiBinhQuan fetchByORG_MUC_NAM(
		long orgId, int mucBc, int nam, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {orgId, mucBc, nam};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByORG_MUC_NAM, finderArgs);
		}

		if (result instanceof DashboardChiPhiBinhQuan) {
			DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan =
				(DashboardChiPhiBinhQuan)result;

			if ((orgId != dashboardChiPhiBinhQuan.getOrgId()) ||
				(mucBc != dashboardChiPhiBinhQuan.getMucBc()) ||
				(nam != dashboardChiPhiBinhQuan.getNam())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_DASHBOARDCHIPHIBINHQUAN_WHERE);

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

				List<DashboardChiPhiBinhQuan> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByORG_MUC_NAM, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {orgId, mucBc, nam};
							}

							_log.warn(
								"DashboardChiPhiBinhQuanPersistenceImpl.fetchByORG_MUC_NAM(long, int, int, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan = list.get(
						0);

					result = dashboardChiPhiBinhQuan;

					cacheResult(dashboardChiPhiBinhQuan);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (DashboardChiPhiBinhQuan)result;
		}
	}

	/**
	 * Removes the dashboard chi phi binh quan where orgId = &#63; and mucBc = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the dashboard chi phi binh quan that was removed
	 */
	@Override
	public DashboardChiPhiBinhQuan removeByORG_MUC_NAM(
			long orgId, int mucBc, int nam)
		throws NoSuchDashboardChiPhiBinhQuanException {

		DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan = findByORG_MUC_NAM(
			orgId, mucBc, nam);

		return remove(dashboardChiPhiBinhQuan);
	}

	/**
	 * Returns the number of dashboard chi phi binh quans where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the number of matching dashboard chi phi binh quans
	 */
	@Override
	public int countByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		FinderPath finderPath = _finderPathCountByORG_MUC_NAM;

		Object[] finderArgs = new Object[] {orgId, mucBc, nam};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_DASHBOARDCHIPHIBINHQUAN_WHERE);

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
		"dashboardChiPhiBinhQuan.orgId = ? AND ";

	private static final String _FINDER_COLUMN_ORG_MUC_NAM_MUCBC_2 =
		"dashboardChiPhiBinhQuan.mucBc = ? AND ";

	private static final String _FINDER_COLUMN_ORG_MUC_NAM_NAM_2 =
		"dashboardChiPhiBinhQuan.nam = ?";

	public DashboardChiPhiBinhQuanPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("mucBc", "muc_bc");
		dbColumnNames.put("orgId", "organization_id");
		dbColumnNames.put("orgName", "organization_name");
		dbColumnNames.put("phiBqDichVu", "phibq_dichvu");
		dbColumnNames.put("phiBqBenhVien", "phibq_benhvien");

		setDBColumnNames(dbColumnNames);

		setModelClass(DashboardChiPhiBinhQuan.class);

		setModelImplClass(DashboardChiPhiBinhQuanImpl.class);
		setModelPKClass(long.class);

		setTable(DashboardChiPhiBinhQuanTable.INSTANCE);
	}

	/**
	 * Caches the dashboard chi phi binh quan in the entity cache if it is enabled.
	 *
	 * @param dashboardChiPhiBinhQuan the dashboard chi phi binh quan
	 */
	@Override
	public void cacheResult(DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan) {
		entityCache.putResult(
			DashboardChiPhiBinhQuanImpl.class,
			dashboardChiPhiBinhQuan.getPrimaryKey(), dashboardChiPhiBinhQuan);

		finderCache.putResult(
			_finderPathFetchByORG_MUC_NAM,
			new Object[] {
				dashboardChiPhiBinhQuan.getOrgId(),
				dashboardChiPhiBinhQuan.getMucBc(),
				dashboardChiPhiBinhQuan.getNam()
			},
			dashboardChiPhiBinhQuan);
	}

	/**
	 * Caches the dashboard chi phi binh quans in the entity cache if it is enabled.
	 *
	 * @param dashboardChiPhiBinhQuans the dashboard chi phi binh quans
	 */
	@Override
	public void cacheResult(
		List<DashboardChiPhiBinhQuan> dashboardChiPhiBinhQuans) {

		for (DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan :
				dashboardChiPhiBinhQuans) {

			if (entityCache.getResult(
					DashboardChiPhiBinhQuanImpl.class,
					dashboardChiPhiBinhQuan.getPrimaryKey()) == null) {

				cacheResult(dashboardChiPhiBinhQuan);
			}
		}
	}

	/**
	 * Clears the cache for all dashboard chi phi binh quans.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DashboardChiPhiBinhQuanImpl.class);

		finderCache.clearCache(DashboardChiPhiBinhQuanImpl.class);
	}

	/**
	 * Clears the cache for the dashboard chi phi binh quan.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan) {
		entityCache.removeResult(
			DashboardChiPhiBinhQuanImpl.class, dashboardChiPhiBinhQuan);
	}

	@Override
	public void clearCache(
		List<DashboardChiPhiBinhQuan> dashboardChiPhiBinhQuans) {

		for (DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan :
				dashboardChiPhiBinhQuans) {

			entityCache.removeResult(
				DashboardChiPhiBinhQuanImpl.class, dashboardChiPhiBinhQuan);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DashboardChiPhiBinhQuanImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				DashboardChiPhiBinhQuanImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		DashboardChiPhiBinhQuanModelImpl dashboardChiPhiBinhQuanModelImpl) {

		Object[] args = new Object[] {
			dashboardChiPhiBinhQuanModelImpl.getOrgId(),
			dashboardChiPhiBinhQuanModelImpl.getMucBc(),
			dashboardChiPhiBinhQuanModelImpl.getNam()
		};

		finderCache.putResult(
			_finderPathCountByORG_MUC_NAM, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByORG_MUC_NAM, args,
			dashboardChiPhiBinhQuanModelImpl);
	}

	/**
	 * Creates a new dashboard chi phi binh quan with the primary key. Does not add the dashboard chi phi binh quan to the database.
	 *
	 * @param id the primary key for the new dashboard chi phi binh quan
	 * @return the new dashboard chi phi binh quan
	 */
	@Override
	public DashboardChiPhiBinhQuan create(long id) {
		DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan =
			new DashboardChiPhiBinhQuanImpl();

		dashboardChiPhiBinhQuan.setNew(true);
		dashboardChiPhiBinhQuan.setPrimaryKey(id);

		return dashboardChiPhiBinhQuan;
	}

	/**
	 * Removes the dashboard chi phi binh quan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dashboard chi phi binh quan
	 * @return the dashboard chi phi binh quan that was removed
	 * @throws NoSuchDashboardChiPhiBinhQuanException if a dashboard chi phi binh quan with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiBinhQuan remove(long id)
		throws NoSuchDashboardChiPhiBinhQuanException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the dashboard chi phi binh quan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dashboard chi phi binh quan
	 * @return the dashboard chi phi binh quan that was removed
	 * @throws NoSuchDashboardChiPhiBinhQuanException if a dashboard chi phi binh quan with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiBinhQuan remove(Serializable primaryKey)
		throws NoSuchDashboardChiPhiBinhQuanException {

		Session session = null;

		try {
			session = openSession();

			DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan =
				(DashboardChiPhiBinhQuan)session.get(
					DashboardChiPhiBinhQuanImpl.class, primaryKey);

			if (dashboardChiPhiBinhQuan == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDashboardChiPhiBinhQuanException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(dashboardChiPhiBinhQuan);
		}
		catch (NoSuchDashboardChiPhiBinhQuanException noSuchEntityException) {
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
	protected DashboardChiPhiBinhQuan removeImpl(
		DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dashboardChiPhiBinhQuan)) {
				dashboardChiPhiBinhQuan = (DashboardChiPhiBinhQuan)session.get(
					DashboardChiPhiBinhQuanImpl.class,
					dashboardChiPhiBinhQuan.getPrimaryKeyObj());
			}

			if (dashboardChiPhiBinhQuan != null) {
				session.delete(dashboardChiPhiBinhQuan);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (dashboardChiPhiBinhQuan != null) {
			clearCache(dashboardChiPhiBinhQuan);
		}

		return dashboardChiPhiBinhQuan;
	}

	@Override
	public DashboardChiPhiBinhQuan updateImpl(
		DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan) {

		boolean isNew = dashboardChiPhiBinhQuan.isNew();

		if (!(dashboardChiPhiBinhQuan instanceof
				DashboardChiPhiBinhQuanModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(dashboardChiPhiBinhQuan.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					dashboardChiPhiBinhQuan);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in dashboardChiPhiBinhQuan proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DashboardChiPhiBinhQuan implementation " +
					dashboardChiPhiBinhQuan.getClass());
		}

		DashboardChiPhiBinhQuanModelImpl dashboardChiPhiBinhQuanModelImpl =
			(DashboardChiPhiBinhQuanModelImpl)dashboardChiPhiBinhQuan;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(dashboardChiPhiBinhQuan);
			}
			else {
				dashboardChiPhiBinhQuan =
					(DashboardChiPhiBinhQuan)session.merge(
						dashboardChiPhiBinhQuan);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DashboardChiPhiBinhQuanImpl.class, dashboardChiPhiBinhQuanModelImpl,
			false, true);

		cacheUniqueFindersCache(dashboardChiPhiBinhQuanModelImpl);

		if (isNew) {
			dashboardChiPhiBinhQuan.setNew(false);
		}

		dashboardChiPhiBinhQuan.resetOriginalValues();

		return dashboardChiPhiBinhQuan;
	}

	/**
	 * Returns the dashboard chi phi binh quan with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dashboard chi phi binh quan
	 * @return the dashboard chi phi binh quan
	 * @throws NoSuchDashboardChiPhiBinhQuanException if a dashboard chi phi binh quan with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiBinhQuan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDashboardChiPhiBinhQuanException {

		DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan = fetchByPrimaryKey(
			primaryKey);

		if (dashboardChiPhiBinhQuan == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDashboardChiPhiBinhQuanException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return dashboardChiPhiBinhQuan;
	}

	/**
	 * Returns the dashboard chi phi binh quan with the primary key or throws a <code>NoSuchDashboardChiPhiBinhQuanException</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard chi phi binh quan
	 * @return the dashboard chi phi binh quan
	 * @throws NoSuchDashboardChiPhiBinhQuanException if a dashboard chi phi binh quan with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiBinhQuan findByPrimaryKey(long id)
		throws NoSuchDashboardChiPhiBinhQuanException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dashboard chi phi binh quan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard chi phi binh quan
	 * @return the dashboard chi phi binh quan, or <code>null</code> if a dashboard chi phi binh quan with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiBinhQuan fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dashboard chi phi binh quans.
	 *
	 * @return the dashboard chi phi binh quans
	 */
	@Override
	public List<DashboardChiPhiBinhQuan> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dashboard chi phi binh quans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiBinhQuanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi binh quans
	 * @param end the upper bound of the range of dashboard chi phi binh quans (not inclusive)
	 * @return the range of dashboard chi phi binh quans
	 */
	@Override
	public List<DashboardChiPhiBinhQuan> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dashboard chi phi binh quans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiBinhQuanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi binh quans
	 * @param end the upper bound of the range of dashboard chi phi binh quans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard chi phi binh quans
	 */
	@Override
	public List<DashboardChiPhiBinhQuan> findAll(
		int start, int end,
		OrderByComparator<DashboardChiPhiBinhQuan> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dashboard chi phi binh quans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiBinhQuanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi binh quans
	 * @param end the upper bound of the range of dashboard chi phi binh quans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard chi phi binh quans
	 */
	@Override
	public List<DashboardChiPhiBinhQuan> findAll(
		int start, int end,
		OrderByComparator<DashboardChiPhiBinhQuan> orderByComparator,
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

		List<DashboardChiPhiBinhQuan> list = null;

		if (useFinderCache) {
			list = (List<DashboardChiPhiBinhQuan>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DASHBOARDCHIPHIBINHQUAN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DASHBOARDCHIPHIBINHQUAN;

				sql = sql.concat(
					DashboardChiPhiBinhQuanModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DashboardChiPhiBinhQuan>)QueryUtil.list(
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
	 * Removes all the dashboard chi phi binh quans from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan : findAll()) {
			remove(dashboardChiPhiBinhQuan);
		}
	}

	/**
	 * Returns the number of dashboard chi phi binh quans.
	 *
	 * @return the number of dashboard chi phi binh quans
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
					_SQL_COUNT_DASHBOARDCHIPHIBINHQUAN);

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
		return _SQL_SELECT_DASHBOARDCHIPHIBINHQUAN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DashboardChiPhiBinhQuanModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dashboard chi phi binh quan persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			DashboardChiPhiBinhQuanPersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new DashboardChiPhiBinhQuanModelArgumentsResolver(),
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

		_finderPathFetchByORG_MUC_NAM = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByORG_MUC_NAM",
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
		entityCache.removeCache(DashboardChiPhiBinhQuanImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_DASHBOARDCHIPHIBINHQUAN =
		"SELECT dashboardChiPhiBinhQuan FROM DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan";

	private static final String _SQL_SELECT_DASHBOARDCHIPHIBINHQUAN_WHERE =
		"SELECT dashboardChiPhiBinhQuan FROM DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan WHERE ";

	private static final String _SQL_COUNT_DASHBOARDCHIPHIBINHQUAN =
		"SELECT COUNT(dashboardChiPhiBinhQuan) FROM DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan";

	private static final String _SQL_COUNT_DASHBOARDCHIPHIBINHQUAN_WHERE =
		"SELECT COUNT(dashboardChiPhiBinhQuan) FROM DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"dashboardChiPhiBinhQuan.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DashboardChiPhiBinhQuan exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DashboardChiPhiBinhQuan exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DashboardChiPhiBinhQuanPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {
			"mucBc", "orgId", "orgName", "phiBqDichVu", "phiBqBenhVien"
		});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class DashboardChiPhiBinhQuanModelArgumentsResolver
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

			DashboardChiPhiBinhQuanModelImpl dashboardChiPhiBinhQuanModelImpl =
				(DashboardChiPhiBinhQuanModelImpl)baseModel;

			long columnBitmask =
				dashboardChiPhiBinhQuanModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					dashboardChiPhiBinhQuanModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						dashboardChiPhiBinhQuanModelImpl.getColumnBitmask(
							columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					dashboardChiPhiBinhQuanModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return DashboardChiPhiBinhQuanImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return DashboardChiPhiBinhQuanTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			DashboardChiPhiBinhQuanModelImpl dashboardChiPhiBinhQuanModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						dashboardChiPhiBinhQuanModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] =
						dashboardChiPhiBinhQuanModelImpl.getColumnValue(
							columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}