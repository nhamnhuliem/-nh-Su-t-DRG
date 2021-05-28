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

import drg.moh.service.exception.NoSuchThongKeBaoCaoException;
import drg.moh.service.model.ThongKeBaoCao;
import drg.moh.service.model.ThongKeBaoCaoTable;
import drg.moh.service.model.impl.ThongKeBaoCaoImpl;
import drg.moh.service.model.impl.ThongKeBaoCaoModelImpl;
import drg.moh.service.service.persistence.ThongKeBaoCaoPersistence;

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
 * The persistence implementation for the thong ke bao cao service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author SON
 * @generated
 */
public class ThongKeBaoCaoPersistenceImpl
	extends BasePersistenceImpl<ThongKeBaoCao>
	implements ThongKeBaoCaoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ThongKeBaoCaoUtil</code> to access the thong ke bao cao persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ThongKeBaoCaoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByNam;
	private FinderPath _finderPathWithoutPaginationFindByNam;
	private FinderPath _finderPathCountByNam;

	/**
	 * Returns all the thong ke bao caos where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the matching thong ke bao caos
	 */
	@Override
	public List<ThongKeBaoCao> findByNam(int nam) {
		return findByNam(nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ThongKeBaoCao> findByNam(int nam, int start, int end) {
		return findByNam(nam, start, end, null);
	}

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
	@Override
	public List<ThongKeBaoCao> findByNam(
		int nam, int start, int end,
		OrderByComparator<ThongKeBaoCao> orderByComparator) {

		return findByNam(nam, start, end, orderByComparator, true);
	}

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
	@Override
	public List<ThongKeBaoCao> findByNam(
		int nam, int start, int end,
		OrderByComparator<ThongKeBaoCao> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByNam;
				finderArgs = new Object[] {nam};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByNam;
			finderArgs = new Object[] {nam, start, end, orderByComparator};
		}

		List<ThongKeBaoCao> list = null;

		if (useFinderCache) {
			list = (List<ThongKeBaoCao>)finderCache.getResult(
				finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (ThongKeBaoCao thongKeBaoCao : list) {
					if (nam != thongKeBaoCao.getNam()) {
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
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_THONGKEBAOCAO_WHERE);

			sb.append(_FINDER_COLUMN_NAM_NAM_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(ThongKeBaoCaoModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(nam);

				list = (List<ThongKeBaoCao>)QueryUtil.list(
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
	 * Returns the first thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong ke bao cao
	 * @throws NoSuchThongKeBaoCaoException if a matching thong ke bao cao could not be found
	 */
	@Override
	public ThongKeBaoCao findByNam_First(
			int nam, OrderByComparator<ThongKeBaoCao> orderByComparator)
		throws NoSuchThongKeBaoCaoException {

		ThongKeBaoCao thongKeBaoCao = fetchByNam_First(nam, orderByComparator);

		if (thongKeBaoCao != null) {
			return thongKeBaoCao;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("nam=");
		sb.append(nam);

		sb.append("}");

		throw new NoSuchThongKeBaoCaoException(sb.toString());
	}

	/**
	 * Returns the first thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching thong ke bao cao, or <code>null</code> if a matching thong ke bao cao could not be found
	 */
	@Override
	public ThongKeBaoCao fetchByNam_First(
		int nam, OrderByComparator<ThongKeBaoCao> orderByComparator) {

		List<ThongKeBaoCao> list = findByNam(nam, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong ke bao cao
	 * @throws NoSuchThongKeBaoCaoException if a matching thong ke bao cao could not be found
	 */
	@Override
	public ThongKeBaoCao findByNam_Last(
			int nam, OrderByComparator<ThongKeBaoCao> orderByComparator)
		throws NoSuchThongKeBaoCaoException {

		ThongKeBaoCao thongKeBaoCao = fetchByNam_Last(nam, orderByComparator);

		if (thongKeBaoCao != null) {
			return thongKeBaoCao;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("nam=");
		sb.append(nam);

		sb.append("}");

		throw new NoSuchThongKeBaoCaoException(sb.toString());
	}

	/**
	 * Returns the last thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching thong ke bao cao, or <code>null</code> if a matching thong ke bao cao could not be found
	 */
	@Override
	public ThongKeBaoCao fetchByNam_Last(
		int nam, OrderByComparator<ThongKeBaoCao> orderByComparator) {

		int count = countByNam(nam);

		if (count == 0) {
			return null;
		}

		List<ThongKeBaoCao> list = findByNam(
			nam, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the thong ke bao caos before and after the current thong ke bao cao in the ordered set where nam = &#63;.
	 *
	 * @param id the primary key of the current thong ke bao cao
	 * @param nam the nam
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next thong ke bao cao
	 * @throws NoSuchThongKeBaoCaoException if a thong ke bao cao with the primary key could not be found
	 */
	@Override
	public ThongKeBaoCao[] findByNam_PrevAndNext(
			long id, int nam,
			OrderByComparator<ThongKeBaoCao> orderByComparator)
		throws NoSuchThongKeBaoCaoException {

		ThongKeBaoCao thongKeBaoCao = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			ThongKeBaoCao[] array = new ThongKeBaoCaoImpl[3];

			array[0] = getByNam_PrevAndNext(
				session, thongKeBaoCao, nam, orderByComparator, true);

			array[1] = thongKeBaoCao;

			array[2] = getByNam_PrevAndNext(
				session, thongKeBaoCao, nam, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected ThongKeBaoCao getByNam_PrevAndNext(
		Session session, ThongKeBaoCao thongKeBaoCao, int nam,
		OrderByComparator<ThongKeBaoCao> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_THONGKEBAOCAO_WHERE);

		sb.append(_FINDER_COLUMN_NAM_NAM_2);

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
			sb.append(ThongKeBaoCaoModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(nam);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						thongKeBaoCao)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<ThongKeBaoCao> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the thong ke bao caos where nam = &#63; from the database.
	 *
	 * @param nam the nam
	 */
	@Override
	public void removeByNam(int nam) {
		for (ThongKeBaoCao thongKeBaoCao :
				findByNam(nam, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(thongKeBaoCao);
		}
	}

	/**
	 * Returns the number of thong ke bao caos where nam = &#63;.
	 *
	 * @param nam the nam
	 * @return the number of matching thong ke bao caos
	 */
	@Override
	public int countByNam(int nam) {
		FinderPath finderPath = _finderPathCountByNam;

		Object[] finderArgs = new Object[] {nam};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_THONGKEBAOCAO_WHERE);

			sb.append(_FINDER_COLUMN_NAM_NAM_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

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

	private static final String _FINDER_COLUMN_NAM_NAM_2 =
		"thongKeBaoCao.nam = ?";

	public ThongKeBaoCaoPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("tongHoSo", "tong_hoso");

		setDBColumnNames(dbColumnNames);

		setModelClass(ThongKeBaoCao.class);

		setModelImplClass(ThongKeBaoCaoImpl.class);
		setModelPKClass(long.class);

		setTable(ThongKeBaoCaoTable.INSTANCE);
	}

	/**
	 * Caches the thong ke bao cao in the entity cache if it is enabled.
	 *
	 * @param thongKeBaoCao the thong ke bao cao
	 */
	@Override
	public void cacheResult(ThongKeBaoCao thongKeBaoCao) {
		entityCache.putResult(
			ThongKeBaoCaoImpl.class, thongKeBaoCao.getPrimaryKey(),
			thongKeBaoCao);
	}

	/**
	 * Caches the thong ke bao caos in the entity cache if it is enabled.
	 *
	 * @param thongKeBaoCaos the thong ke bao caos
	 */
	@Override
	public void cacheResult(List<ThongKeBaoCao> thongKeBaoCaos) {
		for (ThongKeBaoCao thongKeBaoCao : thongKeBaoCaos) {
			if (entityCache.getResult(
					ThongKeBaoCaoImpl.class, thongKeBaoCao.getPrimaryKey()) ==
						null) {

				cacheResult(thongKeBaoCao);
			}
		}
	}

	/**
	 * Clears the cache for all thong ke bao caos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ThongKeBaoCaoImpl.class);

		finderCache.clearCache(ThongKeBaoCaoImpl.class);
	}

	/**
	 * Clears the cache for the thong ke bao cao.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ThongKeBaoCao thongKeBaoCao) {
		entityCache.removeResult(ThongKeBaoCaoImpl.class, thongKeBaoCao);
	}

	@Override
	public void clearCache(List<ThongKeBaoCao> thongKeBaoCaos) {
		for (ThongKeBaoCao thongKeBaoCao : thongKeBaoCaos) {
			entityCache.removeResult(ThongKeBaoCaoImpl.class, thongKeBaoCao);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(ThongKeBaoCaoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(ThongKeBaoCaoImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new thong ke bao cao with the primary key. Does not add the thong ke bao cao to the database.
	 *
	 * @param id the primary key for the new thong ke bao cao
	 * @return the new thong ke bao cao
	 */
	@Override
	public ThongKeBaoCao create(long id) {
		ThongKeBaoCao thongKeBaoCao = new ThongKeBaoCaoImpl();

		thongKeBaoCao.setNew(true);
		thongKeBaoCao.setPrimaryKey(id);

		return thongKeBaoCao;
	}

	/**
	 * Removes the thong ke bao cao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the thong ke bao cao
	 * @return the thong ke bao cao that was removed
	 * @throws NoSuchThongKeBaoCaoException if a thong ke bao cao with the primary key could not be found
	 */
	@Override
	public ThongKeBaoCao remove(long id) throws NoSuchThongKeBaoCaoException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the thong ke bao cao with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the thong ke bao cao
	 * @return the thong ke bao cao that was removed
	 * @throws NoSuchThongKeBaoCaoException if a thong ke bao cao with the primary key could not be found
	 */
	@Override
	public ThongKeBaoCao remove(Serializable primaryKey)
		throws NoSuchThongKeBaoCaoException {

		Session session = null;

		try {
			session = openSession();

			ThongKeBaoCao thongKeBaoCao = (ThongKeBaoCao)session.get(
				ThongKeBaoCaoImpl.class, primaryKey);

			if (thongKeBaoCao == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchThongKeBaoCaoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(thongKeBaoCao);
		}
		catch (NoSuchThongKeBaoCaoException noSuchEntityException) {
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
	protected ThongKeBaoCao removeImpl(ThongKeBaoCao thongKeBaoCao) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(thongKeBaoCao)) {
				thongKeBaoCao = (ThongKeBaoCao)session.get(
					ThongKeBaoCaoImpl.class, thongKeBaoCao.getPrimaryKeyObj());
			}

			if (thongKeBaoCao != null) {
				session.delete(thongKeBaoCao);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (thongKeBaoCao != null) {
			clearCache(thongKeBaoCao);
		}

		return thongKeBaoCao;
	}

	@Override
	public ThongKeBaoCao updateImpl(ThongKeBaoCao thongKeBaoCao) {
		boolean isNew = thongKeBaoCao.isNew();

		if (!(thongKeBaoCao instanceof ThongKeBaoCaoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(thongKeBaoCao.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					thongKeBaoCao);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in thongKeBaoCao proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ThongKeBaoCao implementation " +
					thongKeBaoCao.getClass());
		}

		ThongKeBaoCaoModelImpl thongKeBaoCaoModelImpl =
			(ThongKeBaoCaoModelImpl)thongKeBaoCao;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(thongKeBaoCao);
			}
			else {
				thongKeBaoCao = (ThongKeBaoCao)session.merge(thongKeBaoCao);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			ThongKeBaoCaoImpl.class, thongKeBaoCaoModelImpl, false, true);

		if (isNew) {
			thongKeBaoCao.setNew(false);
		}

		thongKeBaoCao.resetOriginalValues();

		return thongKeBaoCao;
	}

	/**
	 * Returns the thong ke bao cao with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the thong ke bao cao
	 * @return the thong ke bao cao
	 * @throws NoSuchThongKeBaoCaoException if a thong ke bao cao with the primary key could not be found
	 */
	@Override
	public ThongKeBaoCao findByPrimaryKey(Serializable primaryKey)
		throws NoSuchThongKeBaoCaoException {

		ThongKeBaoCao thongKeBaoCao = fetchByPrimaryKey(primaryKey);

		if (thongKeBaoCao == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchThongKeBaoCaoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return thongKeBaoCao;
	}

	/**
	 * Returns the thong ke bao cao with the primary key or throws a <code>NoSuchThongKeBaoCaoException</code> if it could not be found.
	 *
	 * @param id the primary key of the thong ke bao cao
	 * @return the thong ke bao cao
	 * @throws NoSuchThongKeBaoCaoException if a thong ke bao cao with the primary key could not be found
	 */
	@Override
	public ThongKeBaoCao findByPrimaryKey(long id)
		throws NoSuchThongKeBaoCaoException {

		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the thong ke bao cao with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the thong ke bao cao
	 * @return the thong ke bao cao, or <code>null</code> if a thong ke bao cao with the primary key could not be found
	 */
	@Override
	public ThongKeBaoCao fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns all the thong ke bao caos.
	 *
	 * @return the thong ke bao caos
	 */
	@Override
	public List<ThongKeBaoCao> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<ThongKeBaoCao> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<ThongKeBaoCao> findAll(
		int start, int end,
		OrderByComparator<ThongKeBaoCao> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<ThongKeBaoCao> findAll(
		int start, int end, OrderByComparator<ThongKeBaoCao> orderByComparator,
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

		List<ThongKeBaoCao> list = null;

		if (useFinderCache) {
			list = (List<ThongKeBaoCao>)finderCache.getResult(
				finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_THONGKEBAOCAO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_THONGKEBAOCAO;

				sql = sql.concat(ThongKeBaoCaoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<ThongKeBaoCao>)QueryUtil.list(
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
	 * Removes all the thong ke bao caos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ThongKeBaoCao thongKeBaoCao : findAll()) {
			remove(thongKeBaoCao);
		}
	}

	/**
	 * Returns the number of thong ke bao caos.
	 *
	 * @return the number of thong ke bao caos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_THONGKEBAOCAO);

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
		return _SQL_SELECT_THONGKEBAOCAO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ThongKeBaoCaoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the thong ke bao cao persistence.
	 */
	public void afterPropertiesSet() {
		Bundle bundle = FrameworkUtil.getBundle(
			ThongKeBaoCaoPersistenceImpl.class);

		_bundleContext = bundle.getBundleContext();

		_argumentsResolverServiceRegistration = _bundleContext.registerService(
			ArgumentsResolver.class, new ThongKeBaoCaoModelArgumentsResolver(),
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

		_finderPathWithPaginationFindByNam = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByNam",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"nam"}, true);

		_finderPathWithoutPaginationFindByNam = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByNam",
			new String[] {Integer.class.getName()}, new String[] {"nam"}, true);

		_finderPathCountByNam = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByNam",
			new String[] {Integer.class.getName()}, new String[] {"nam"},
			false);
	}

	public void destroy() {
		entityCache.removeCache(ThongKeBaoCaoImpl.class.getName());

		_argumentsResolverServiceRegistration.unregister();
	}

	private BundleContext _bundleContext;

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_THONGKEBAOCAO =
		"SELECT thongKeBaoCao FROM ThongKeBaoCao thongKeBaoCao";

	private static final String _SQL_SELECT_THONGKEBAOCAO_WHERE =
		"SELECT thongKeBaoCao FROM ThongKeBaoCao thongKeBaoCao WHERE ";

	private static final String _SQL_COUNT_THONGKEBAOCAO =
		"SELECT COUNT(thongKeBaoCao) FROM ThongKeBaoCao thongKeBaoCao";

	private static final String _SQL_COUNT_THONGKEBAOCAO_WHERE =
		"SELECT COUNT(thongKeBaoCao) FROM ThongKeBaoCao thongKeBaoCao WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "thongKeBaoCao.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No ThongKeBaoCao exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No ThongKeBaoCao exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ThongKeBaoCaoPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"tongHoSo"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	private ServiceRegistration<ArgumentsResolver>
		_argumentsResolverServiceRegistration;

	private static class ThongKeBaoCaoModelArgumentsResolver
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

			ThongKeBaoCaoModelImpl thongKeBaoCaoModelImpl =
				(ThongKeBaoCaoModelImpl)baseModel;

			long columnBitmask = thongKeBaoCaoModelImpl.getColumnBitmask();

			if (!checkColumn || (columnBitmask == 0)) {
				return _getValue(thongKeBaoCaoModelImpl, columnNames, original);
			}

			Long finderPathColumnBitmask = _finderPathColumnBitmasksCache.get(
				finderPath);

			if (finderPathColumnBitmask == null) {
				finderPathColumnBitmask = 0L;

				for (String columnName : columnNames) {
					finderPathColumnBitmask |=
						thongKeBaoCaoModelImpl.getColumnBitmask(columnName);
				}

				_finderPathColumnBitmasksCache.put(
					finderPath, finderPathColumnBitmask);
			}

			if ((columnBitmask & finderPathColumnBitmask) != 0) {
				return _getValue(thongKeBaoCaoModelImpl, columnNames, original);
			}

			return null;
		}

		@Override
		public String getClassName() {
			return ThongKeBaoCaoImpl.class.getName();
		}

		@Override
		public String getTableName() {
			return ThongKeBaoCaoTable.INSTANCE.getTableName();
		}

		private Object[] _getValue(
			ThongKeBaoCaoModelImpl thongKeBaoCaoModelImpl, String[] columnNames,
			boolean original) {

			Object[] arguments = new Object[columnNames.length];

			for (int i = 0; i < arguments.length; i++) {
				String columnName = columnNames[i];

				if (original) {
					arguments[i] =
						thongKeBaoCaoModelImpl.getColumnOriginalValue(
							columnName);
				}
				else {
					arguments[i] = thongKeBaoCaoModelImpl.getColumnValue(
						columnName);
				}
			}

			return arguments;
		}

		private static Map<FinderPath, Long> _finderPathColumnBitmasksCache =
			new ConcurrentHashMap<>();

	}

}