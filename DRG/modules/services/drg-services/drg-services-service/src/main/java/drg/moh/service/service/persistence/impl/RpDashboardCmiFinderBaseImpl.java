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

import drg.moh.service.model.RpDashboardCmi;
import drg.moh.service.service.persistence.RpDashboardCmiPersistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SON
 * @generated
 */
public class RpDashboardCmiFinderBaseImpl
	extends BasePersistenceImpl<RpDashboardCmi> {

	public RpDashboardCmiFinderBaseImpl() {
		setModelClass(RpDashboardCmi.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("cmiToanQuoc", "_cmi_toanquoc");
		dbColumnNames.put("cmiTinh", "_cmi_tinh");
		dbColumnNames.put("cmiTuyen", "_cmi_tuyen");
		dbColumnNames.put("cmiTrungBinh", "_cmi_trungbinh");
		dbColumnNames.put("cmiTrungMax", "_cmi_trungmax");
		dbColumnNames.put("cmiTrungMin", "_cmi_trungmin");
		dbColumnNames.put("cmiCoSo", "_cmi_coso");

		setDBColumnNames(dbColumnNames);
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getRpDashboardCmiPersistence().getBadColumnNames();
	}

	/**
	 * Returns the rp dashboard cmi persistence.
	 *
	 * @return the rp dashboard cmi persistence
	 */
	public RpDashboardCmiPersistence getRpDashboardCmiPersistence() {
		return rpDashboardCmiPersistence;
	}

	/**
	 * Sets the rp dashboard cmi persistence.
	 *
	 * @param rpDashboardCmiPersistence the rp dashboard cmi persistence
	 */
	public void setRpDashboardCmiPersistence(
		RpDashboardCmiPersistence rpDashboardCmiPersistence) {

		this.rpDashboardCmiPersistence = rpDashboardCmiPersistence;
	}

	@BeanReference(type = RpDashboardCmiPersistence.class)
	protected RpDashboardCmiPersistence rpDashboardCmiPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardCmiFinderBaseImpl.class);

}