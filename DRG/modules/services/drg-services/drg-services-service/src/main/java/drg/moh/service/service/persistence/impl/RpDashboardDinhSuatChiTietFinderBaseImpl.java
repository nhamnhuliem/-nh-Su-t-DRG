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

import drg.moh.service.model.RpDashboardDinhSuatChiTiet;
import drg.moh.service.service.persistence.RpDashboardDinhSuatChiTietPersistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SON
 * @generated
 */
public class RpDashboardDinhSuatChiTietFinderBaseImpl
	extends BasePersistenceImpl<RpDashboardDinhSuatChiTiet> {

	public RpDashboardDinhSuatChiTietFinderBaseImpl() {
		setModelClass(RpDashboardDinhSuatChiTiet.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("tenTinh", "_tentinh");
		dbColumnNames.put("dinhSuat", "_dinhsuat");

		setDBColumnNames(dbColumnNames);
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getRpDashboardDinhSuatChiTietPersistence().getBadColumnNames();
	}

	/**
	 * Returns the rp dashboard dinh suat chi tiet persistence.
	 *
	 * @return the rp dashboard dinh suat chi tiet persistence
	 */
	public RpDashboardDinhSuatChiTietPersistence
		getRpDashboardDinhSuatChiTietPersistence() {

		return rpDashboardDinhSuatChiTietPersistence;
	}

	/**
	 * Sets the rp dashboard dinh suat chi tiet persistence.
	 *
	 * @param rpDashboardDinhSuatChiTietPersistence the rp dashboard dinh suat chi tiet persistence
	 */
	public void setRpDashboardDinhSuatChiTietPersistence(
		RpDashboardDinhSuatChiTietPersistence
			rpDashboardDinhSuatChiTietPersistence) {

		this.rpDashboardDinhSuatChiTietPersistence =
			rpDashboardDinhSuatChiTietPersistence;
	}

	@BeanReference(type = RpDashboardDinhSuatChiTietPersistence.class)
	protected RpDashboardDinhSuatChiTietPersistence
		rpDashboardDinhSuatChiTietPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardDinhSuatChiTietFinderBaseImpl.class);

}