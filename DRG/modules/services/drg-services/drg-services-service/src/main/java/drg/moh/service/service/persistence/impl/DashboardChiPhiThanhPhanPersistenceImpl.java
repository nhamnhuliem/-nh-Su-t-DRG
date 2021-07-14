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

import drg.moh.service.exception.NoSuchDashboardChiPhiThanhPhanException;
import drg.moh.service.model.DashboardChiPhiThanhPhan;
import drg.moh.service.model.DashboardChiPhiThanhPhanTable;
import drg.moh.service.model.impl.DashboardChiPhiThanhPhanImpl;
import drg.moh.service.model.impl.DashboardChiPhiThanhPhanModelImpl;
import drg.moh.service.service.persistence.DashboardChiPhiThanhPhanPersistence;

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
 * The persistence implementation for the dashboard chi phi thanh phan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class DashboardChiPhiThanhPhanPersistenceImpl
	extends BasePersistenceImpl<DashboardChiPhiThanhPhan>
	implements DashboardChiPhiThanhPhanPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DashboardChiPhiThanhPhanUtil</code> to access the dashboard chi phi thanh phan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DashboardChiPhiThanhPhanImpl.class.getName();

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
	 * Returns the dashboard chi phi thanh phan where orgId = &#63; and mucBc = &#63; and nam = &#63; or throws a <code>NoSuchDashboardChiPhiThanhPhanException</code> if it could not be found.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard chi phi thanh phan
	 * @throws NoSuchDashboardChiPhiThanhPhanException if a matching dashboard chi phi thanh phan could not be found
	 */
	@Override
	public DashboardChiPhiThanhPhan findByORG_MUC_NAM(
			long orgId, int mucBc, int nam)
		throws NoSuchDashboardChiPhiThanhPhanException {

		DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan = fetchByORG_MUC_NAM(
			orgId, mucBc, nam);

		if (dashboardChiPhiThanhPhan == null) {
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

			throw new NoSuchDashboardChiPhiThanhPhanException(sb.toString());
		}

		return dashboardChiPhiThanhPhan;
	}

	/**
	 * Returns the dashboard chi phi thanh phan where orgId = &#63; and mucBc = &#63; and nam = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the matching dashboard chi phi thanh phan, or <code>null</code> if a matching dashboard chi phi thanh phan could not be found
	 */
	@Override
	public DashboardChiPhiThanhPhan fetchByORG_MUC_NAM(
		long orgId, int mucBc, int nam) {

		return fetchByORG_MUC_NAM(orgId, mucBc, nam, true);
	}

	/**
	 * Returns the dashboard chi phi thanh phan where orgId = &#63; and mucBc = &#63; and nam = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dashboard chi phi thanh phan, or <code>null</code> if a matching dashboard chi phi thanh phan could not be found
	 */
	@Override
	public DashboardChiPhiThanhPhan fetchByORG_MUC_NAM(
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

		if (result instanceof DashboardChiPhiThanhPhan) {
			DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan =
				(DashboardChiPhiThanhPhan)result;

			if ((orgId != dashboardChiPhiThanhPhan.getOrgId()) ||
				(mucBc != dashboardChiPhiThanhPhan.getMucBc()) ||
				(nam != dashboardChiPhiThanhPhan.getNam())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_DASHBOARDCHIPHITHANHPHAN_WHERE);

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

				List<DashboardChiPhiThanhPhan> list = query.list();

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
								"DashboardChiPhiThanhPhanPersistenceImpl.fetchByORG_MUC_NAM(long, int, int, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan =
						list.get(0);

					result = dashboardChiPhiThanhPhan;

					cacheResult(dashboardChiPhiThanhPhan);
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
			return (DashboardChiPhiThanhPhan)result;
		}
	}

	/**
	 * Removes the dashboard chi phi thanh phan where orgId = &#63; and mucBc = &#63; and nam = &#63; from the database.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the dashboard chi phi thanh phan that was removed
	 */
	@Override
	public DashboardChiPhiThanhPhan removeByORG_MUC_NAM(
			long orgId, int mucBc, int nam)
		throws NoSuchDashboardChiPhiThanhPhanException {

		DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan = findByORG_MUC_NAM(
			orgId, mucBc, nam);

		return remove(dashboardChiPhiThanhPhan);
	}

	/**
	 * Returns the number of dashboard chi phi thanh phans where orgId = &#63; and mucBc = &#63; and nam = &#63;.
	 *
	 * @param orgId the org ID
	 * @param mucBc the muc bc
	 * @param nam the nam
	 * @return the number of matching dashboard chi phi thanh phans
	 */
	@Override
	public int countByORG_MUC_NAM(long orgId, int mucBc, int nam) {
		FinderPath finderPath = _finderPathCountByORG_MUC_NAM;

		Object[] finderArgs = new Object[] {orgId, mucBc, nam};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_DASHBOARDCHIPHITHANHPHAN_WHERE);

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
		"dashboardChiPhiThanhPhan.orgId = ? AND ";

	private static final String _FINDER_COLUMN_ORG_MUC_NAM_MUCBC_2 =
		"dashboardChiPhiThanhPhan.mucBc = ? AND ";

	private static final String _FINDER_COLUMN_ORG_MUC_NAM_NAM_2 =
		"dashboardChiPhiThanhPhan.nam = ?";

	public DashboardChiPhiThanhPhanPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("mucBc", "muc_bc");
		dbColumnNames.put("orgId", "organization_id");
		dbColumnNames.put("orgName", "organization_name");
		dbColumnNames.put("dinhSuat", "dinhsuat");

		setDBColumnNames(dbColumnNames);

		setModelClass(DashboardChiPhiThanhPhan.class);

		setModelImplClass(DashboardChiPhiThanhPhanImpl.class);
		setModelPKClass(long.class);

		setTable(DashboardChiPhiThanhPhanTable.INSTANCE);
	}

	/**
	 * Caches the dashboard chi phi thanh phan in the entity cache if it is enabled.
	 *
	 * @param dashboardChiPhiThanhPhan the dashboard chi phi thanh phan
	 */
	@Override
	public void cacheResult(DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan) {
		entityCache.putResult(
			DashboardChiPhiThanhPhanImpl.class,
			dashboardChiPhiThanhPhan.getPrimaryKey(), dashboardChiPhiThanhPhan);

		finderCache.putResult(
			_finderPathFetchByORG_MUC_NAM,
			new Object[] {
				dashboardChiPhiThanhPhan.getOrgId(),
				dashboardChiPhiThanhPhan.getMucBc(),
				dashboardChiPhiThanhPhan.getNam()
			},
			dashboardChiPhiThanhPhan);
	}

	/**
	 * Caches the dashboard chi phi thanh phans in the entity cache if it is enabled.
	 *
	 * @param dashboardChiPhiThanhPhans the dashboard chi phi thanh phans
	 */
	@Override
	public void cacheResult(
		List<DashboardChiPhiThanhPhan> dashboardChiPhiThanhPhans) {

		for (DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan :
				dashboardChiPhiThanhPhans) {

			if (entityCache.getResult(
					DashboardChiPhiThanhPhanImpl.class,
					dashboardChiPhiThanhPhan.getPrimaryKey()) == null) {

				cacheResult(dashboardChiPhiThanhPhan);
			}
		}
	}

	/**
	 * Clears the cache for all dashboard chi phi thanh phans.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DashboardChiPhiThanhPhanImpl.class);

		finderCache.clearCache(DashboardChiPhiThanhPhanImpl.class);
	}

	/**
	 * Clears the cache for the dashboard chi phi thanh phan.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan) {
		entityCache.removeResult(
			DashboardChiPhiThanhPhanImpl.class, dashboardChiPhiThanhPhan);
	}

	@Override
	public void clearCache(
		List<DashboardChiPhiThanhPhan> dashboardChiPhiThanhPhans) {

		for (DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan :
				dashboardChiPhiThanhPhans) {

			entityCache.removeResult(
				DashboardChiPhiThanhPhanImpl.class, dashboardChiPhiThanhPhan);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DashboardChiPhiThanhPhanImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				DashboardChiPhiThanhPhanImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		DashboardChiPhiThanhPhanModelImpl dashboardChiPhiThanhPhanModelImpl) {

		Object[] args = new Object[] {
			dashboardChiPhiThanhPhanModelImpl.getOrgId(),
			dashboardChiPhiThanhPhanModelImpl.getMucBc(),
			dashboardChiPhiThanhPhanModelImpl.getNam()
		};

		finderCache.putResult(
			_finderPathCountByORG_MUC_NAM, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByORG_MUC_NAM, args,
			dashboardChiPhiThanhPhanModelImpl);
	}

	/**
	 * Creates a new dashboard chi phi thanh phan with the primary key. Does not add the dashboard chi phi thanh phan to the database.
	 *
	 * @param id the primary key for the new dashboard chi phi thanh phan
	 * @return the new dashboard chi phi thanh phan
	 */
	@Override
	public DashboardChiPhiThanhPhan create(long id) {
		DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan =
			new DashboardChiPhiThanhPhanImpl();

		dashboardChiPhiThanhPhan.setNew(true);
		dashboardChiPhiThanhPhan.setPrimaryKey(id);

		return dashboardChiPhiThanhPhan;
	}

	/**
	 * Removes the dashboard chi phi thanh phan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan that was removed
	 * @throws NoSuchDashboardChiPhiThanhPhanException if a dashboard chi phi thanh phan with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiThanhPhan remove(long id)
		throws NoSuchDashboardChiPhiThanhPhanException {

		return remove((Serializable)id);
	}

	/**
	 * Removes the dashboard chi phi thanh phan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan that was removed
	 * @throws NoSuchDashboardChiPhiThanhPhanException if a dashboard chi phi thanh phan with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiThanhPhan remove(Serializable primaryKey)
		throws NoSuchDashboardChiPhiThanhPhanException {

		Session session = null;

		try {
			session = openSession();

			DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan =
				(DashboardChiPhiThanhPhan)session.get(
					DashboardChiPhiThanhPhanImpl.class, primaryKey);

			if (dashboardChiPhiThanhPhan == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDashboardChiPhiThanhPhanException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(dashboardChiPhiThanhPhan);
		}
		catch (NoSuchDashboardChiPhiThanhPhanException noSuchEntityException) {
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
	protected DashboardChiPhiThanhPhan removeImpl(
		DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dashboardChiPhiThanhPhan)) {
				dashboardChiPhiThanhPhan =
					(DashboardChiPhiThanhPhan)session.get(
						DashboardChiPhiThanhPhanImpl.class,
						dashboardChiPhiThanhPhan.getPrimaryKeyObj());
			}

			if (dashboardChiPhiThanhPhan != null) {
				session.delete(dashboardChiPhiThanhPhan);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (dashboardChiPhiThanhPhan != null) {
			clearCache(dashboardChiPhiThanhPhan);
		}

		return dashboardChiPhiThanhPhan;
	}

	@Override
	public DashboardChiPhiThanhPhan updateImpl(
		DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan) {

		boolean isNew = dashboardChiPhiThanhPhan.isNew();

		if (!(dashboardChiPhiThanhPhan instanceof
				DashboardChiPhiThanhPhanModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(dashboardChiPhiThanhPhan.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					dashboardChiPhiThanhPhan);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in dashboardChiPhiThanhPhan proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DashboardChiPhiThanhPhan implementation " +
					dashboardChiPhiThanhPhan.getClass());
		}

		DashboardChiPhiThanhPhanModelImpl dashboardChiPhiThanhPhanModelImpl =
			(DashboardChiPhiThanhPhanModelImpl)dashboardChiPhiThanhPhan;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(dashboardChiPhiThanhPhan);
			}
			else {
				dashboardChiPhiThanhPhan =
					(DashboardChiPhiThanhPhan)session.merge(
						dashboardChiPhiThanhPhan);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DashboardChiPhiThanhPhanImpl.class,
			dashboardChiPhiThanhPhanModelImpl, false, true);

		cacheUniqueFindersCache(dashboardChiPhiThanhPhanModelImpl);

		if (isNew) {
			dashboardChiPhiThanhPhan.setNew(false);
		}

		dashboardChiPhiThanhPhan.resetOriginalValues();

		return dashboardChiPhiThanhPhan;
	}

	/**
	 * Returns the dashboard chi phi thanh phan with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan
	 * @throws NoSuchDashboardChiPhiThanhPhanException if a dashboard chi phi thanh phan with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiThanhPhan findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDashboardChiPhiThanhPhanException {

		DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan = fetchByPrimaryKey(
			primaryKey);

		if (dashboardChiPhiThanhPhan == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDashboardChiPhiThanhPhanException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return dashboardChiPhiThanhPhan;
	}

	/**
	 * Returns the dashboard chi phi thanh phan with the primary key or throws a <code>NoSuchDashboardChiPhiThanhPhanException</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan
	 * @throws NoSuchDashboardChiPhiThanhPhanException if a dashboard chi phi thanh phan with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiThanhPhan findByPrimaryKey(long id)
		throws NoSuchDashboardChiPhiThanhPhanException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dashboard chi phi thanh phan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dashboard chi phi thanh phan
	 * @return the dashboard chi phi thanh phan, or <code>null</code> if a dashboard chi phi thanh phan with the primary key could not be found
	 */
	@Override
	public DashboardChiPhiThanhPhan fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the dashboard chi phi thanh phans.
	 *
	 * @return the dashboard chi phi thanh phans
	 */
	@Override
	public List<DashboardChiPhiThanhPhan> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the dashboard chi phi thanh phans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiThanhPhanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi thanh phans
	 * @param end the upper bound of the range of dashboard chi phi thanh phans (not inclusive)
	 * @return the range of dashboard chi phi thanh phans
	 */
	@Override
	public List<DashboardChiPhiThanhPhan> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the dashboard chi phi thanh phans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiThanhPhanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi thanh phans
	 * @param end the upper bound of the range of dashboard chi phi thanh phans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dashboard chi phi thanh phans
	 */
	@Override
	public List<DashboardChiPhiThanhPhan> findAll(
		int start, int end,
		OrderByComparator<DashboardChiPhiThanhPhan> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the dashboard chi phi thanh phans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DashboardChiPhiThanhPhanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dashboard chi phi thanh phans
	 * @param end the upper bound of the range of dashboard chi phi thanh phans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dashboard chi phi thanh phans
	 */
	@Override
	public List<DashboardChiPhiThanhPhan> findAll(
		int start, int end,
		OrderByComparator<DashboardChiPhiThanhPhan> orderByComparator,
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

		List<DashboardChiPhiThanhPhan> list = null;

		if (useFinderCache) {
			list = (List<DashboardChiPhiThanhPhan>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DASHBOARDCHIPHITHANHPHAN);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DASHBOARDCHIPHITHANHPHAN;

				sql = sql.concat(
					DashboardChiPhiThanhPhanModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DashboardChiPhiThanhPhan>)QueryUtil.list(
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
	 * Removes all the dashboard chi phi thanh phans from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan : findAll()) {
			remove(dashboardChiPhiThanhPhan);
		}
	}

	/**
	 * Returns the number of dashboard chi phi thanh phans.
	 *
	 * @return the number of dashboard chi phi thanh phans
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
					_SQL_COUNT_DASHBOARDCHIPHITHANHPHAN);

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
		return _SQL_SELECT_DASHBOARDCHIPHITHANHPHAN;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DashboardChiPhiThanhPhanModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dashboard chi phi thanh phan persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			DashboardChiPhiThanhPhanPersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class,
			new DashboardChiPhiThanhPhanModelArgumentsResolver(),
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
		entityCache.removeCache(DashboardChiPhiThanhPhanImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_DASHBOARDCHIPHITHANHPHAN =
		"SELECT dashboardChiPhiThanhPhan FROM DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan";

	private static final String _SQL_SELECT_DASHBOARDCHIPHITHANHPHAN_WHERE =
		"SELECT dashboardChiPhiThanhPhan FROM DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan WHERE ";

	private static final String _SQL_COUNT_DASHBOARDCHIPHITHANHPHAN =
		"SELECT COUNT(dashboardChiPhiThanhPhan) FROM DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan";

	private static final String _SQL_COUNT_DASHBOARDCHIPHITHANHPHAN_WHERE =
		"SELECT COUNT(dashboardChiPhiThanhPhan) FROM DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"dashboardChiPhiThanhPhan.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DashboardChiPhiThanhPhan exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DashboardChiPhiThanhPhan exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DashboardChiPhiThanhPhanPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"mucBc", "orgId", "orgName", "dinhSuat"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class DashboardChiPhiThanhPhanModelArgumentsResolver
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

			DashboardChiPhiThanhPhanModelImpl
				dashboardChiPhiThanhPhanModelImpl =
					(DashboardChiPhiThanhPhanModelImpl)baseModel;

			long columnBitmask =
				dashboardChiPhiThanhPhanModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(
					dashboardChiPhiThanhPhanModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						dashboardChiPhiThanhPhanModelImpl.getColumnBitmask(
							columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(
					dashboardChiPhiThanhPhanModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return DashboardChiPhiThanhPhanImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return DashboardChiPhiThanhPhanTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			DashboardChiPhiThanhPhanModelImpl dashboardChiPhiThanhPhanModelImpl,
			String[] columnNames, boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						dashboardChiPhiThanhPhanModelImpl.
							getColumnOriginalValue(columnName);
				}
				else {
					arguments[i] =
						dashboardChiPhiThanhPhanModelImpl.getColumnValue(
							columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}