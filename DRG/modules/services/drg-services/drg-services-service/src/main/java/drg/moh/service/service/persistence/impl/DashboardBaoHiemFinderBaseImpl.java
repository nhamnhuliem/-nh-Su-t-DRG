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

import drg.moh.service.model.DashboardBaoHiem;
import drg.moh.service.service.persistence.DashboardBaoHiemPersistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SON
 * @generated
 */
public class DashboardBaoHiemFinderBaseImpl
	extends BasePersistenceImpl<DashboardBaoHiem> {

	public DashboardBaoHiemFinderBaseImpl() {
		setModelClass(DashboardBaoHiem.class);

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
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getDashboardBaoHiemPersistence().getBadColumnNames();
	}

	/**
	 * Returns the dashboard bao hiem persistence.
	 *
	 * @return the dashboard bao hiem persistence
	 */
	public DashboardBaoHiemPersistence getDashboardBaoHiemPersistence() {
		return dashboardBaoHiemPersistence;
	}

	/**
	 * Sets the dashboard bao hiem persistence.
	 *
	 * @param dashboardBaoHiemPersistence the dashboard bao hiem persistence
	 */
	public void setDashboardBaoHiemPersistence(
		DashboardBaoHiemPersistence dashboardBaoHiemPersistence) {

		this.dashboardBaoHiemPersistence = dashboardBaoHiemPersistence;
	}

	@BeanReference(type = DashboardBaoHiemPersistence.class)
	protected DashboardBaoHiemPersistence dashboardBaoHiemPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		DashboardBaoHiemFinderBaseImpl.class);

}