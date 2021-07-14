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

import drg.moh.service.model.DashboardChiPhiHoatDong;
import drg.moh.service.service.persistence.DashboardChiPhiHoatDongPersistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SON
 * @generated
 */
public class DashboardChiPhiHoatDongFinderBaseImpl
	extends BasePersistenceImpl<DashboardChiPhiHoatDong> {

	public DashboardChiPhiHoatDongFinderBaseImpl() {
		setModelClass(DashboardChiPhiHoatDong.class);

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
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getDashboardChiPhiHoatDongPersistence().getBadColumnNames();
	}

	/**
	 * Returns the dashboard chi phi hoat dong persistence.
	 *
	 * @return the dashboard chi phi hoat dong persistence
	 */
	public DashboardChiPhiHoatDongPersistence
		getDashboardChiPhiHoatDongPersistence() {

		return dashboardChiPhiHoatDongPersistence;
	}

	/**
	 * Sets the dashboard chi phi hoat dong persistence.
	 *
	 * @param dashboardChiPhiHoatDongPersistence the dashboard chi phi hoat dong persistence
	 */
	public void setDashboardChiPhiHoatDongPersistence(
		DashboardChiPhiHoatDongPersistence dashboardChiPhiHoatDongPersistence) {

		this.dashboardChiPhiHoatDongPersistence =
			dashboardChiPhiHoatDongPersistence;
	}

	@BeanReference(type = DashboardChiPhiHoatDongPersistence.class)
	protected DashboardChiPhiHoatDongPersistence
		dashboardChiPhiHoatDongPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		DashboardChiPhiHoatDongFinderBaseImpl.class);

}