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

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import drg.moh.service.model.RpDashboardTrungBinh;
import drg.moh.service.service.persistence.RpDashboardTrungBinhPersistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SON
 * @generated
 */
public class RpDashboardTrungBinhFinderBaseImpl
	extends BasePersistenceImpl<RpDashboardTrungBinh> {

	public RpDashboardTrungBinhFinderBaseImpl() {
		setModelClass(RpDashboardTrungBinh.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("data", "data_");

		setDBColumnNames(dbColumnNames);
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getRpDashboardTrungBinhPersistence().getBadColumnNames();
	}

	/**
	 * Returns the rp dashboard trung binh persistence.
	 *
	 * @return the rp dashboard trung binh persistence
	 */
	public RpDashboardTrungBinhPersistence
		getRpDashboardTrungBinhPersistence() {

		return rpDashboardTrungBinhPersistence;
	}

	/**
	 * Sets the rp dashboard trung binh persistence.
	 *
	 * @param rpDashboardTrungBinhPersistence the rp dashboard trung binh persistence
	 */
	public void setRpDashboardTrungBinhPersistence(
		RpDashboardTrungBinhPersistence rpDashboardTrungBinhPersistence) {

		this.rpDashboardTrungBinhPersistence = rpDashboardTrungBinhPersistence;
	}

	@BeanReference(type = RpDashboardTrungBinhPersistence.class)
	protected RpDashboardTrungBinhPersistence rpDashboardTrungBinhPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardTrungBinhFinderBaseImpl.class);

}