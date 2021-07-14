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

import drg.moh.service.model.RpDashboardDstcChiTiet;
import drg.moh.service.service.persistence.RpDashboardDstcChiTietPersistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SON
 * @generated
 */
public class RpDashboardDstcChiTietFinderBaseImpl
	extends BasePersistenceImpl<RpDashboardDstcChiTiet> {

	public RpDashboardDstcChiTietFinderBaseImpl() {
		setModelClass(RpDashboardDstcChiTiet.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("tenTinh", "_ten_tinh");
		dbColumnNames.put("dinhSuat", "_dinhsuat");

		setDBColumnNames(dbColumnNames);
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getRpDashboardDstcChiTietPersistence().getBadColumnNames();
	}

	/**
	 * Returns the rp dashboard dstc chi tiet persistence.
	 *
	 * @return the rp dashboard dstc chi tiet persistence
	 */
	public RpDashboardDstcChiTietPersistence
		getRpDashboardDstcChiTietPersistence() {

		return rpDashboardDstcChiTietPersistence;
	}

	/**
	 * Sets the rp dashboard dstc chi tiet persistence.
	 *
	 * @param rpDashboardDstcChiTietPersistence the rp dashboard dstc chi tiet persistence
	 */
	public void setRpDashboardDstcChiTietPersistence(
		RpDashboardDstcChiTietPersistence rpDashboardDstcChiTietPersistence) {

		this.rpDashboardDstcChiTietPersistence =
			rpDashboardDstcChiTietPersistence;
	}

	@BeanReference(type = RpDashboardDstcChiTietPersistence.class)
	protected RpDashboardDstcChiTietPersistence
		rpDashboardDstcChiTietPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardDstcChiTietFinderBaseImpl.class);

}