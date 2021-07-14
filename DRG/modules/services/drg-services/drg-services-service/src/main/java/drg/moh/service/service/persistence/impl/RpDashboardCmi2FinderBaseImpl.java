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

import drg.moh.service.model.RpDashboardCmi2;
import drg.moh.service.service.persistence.RpDashboardCmi2Persistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SON
 * @generated
 */
public class RpDashboardCmi2FinderBaseImpl
	extends BasePersistenceImpl<RpDashboardCmi2> {

	public RpDashboardCmi2FinderBaseImpl() {
		setModelClass(RpDashboardCmi2.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("cmiTenTuyen", "_cmi_tentuyen");
		dbColumnNames.put("cmiTrungBinh", "_cmi_trungbinh");
		dbColumnNames.put("cmiTrungMax", "_cmi_max");
		dbColumnNames.put("cmiTrungMin", "_cmi_min");

		setDBColumnNames(dbColumnNames);
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getRpDashboardCmi2Persistence().getBadColumnNames();
	}

	/**
	 * Returns the rp dashboard cmi2 persistence.
	 *
	 * @return the rp dashboard cmi2 persistence
	 */
	public RpDashboardCmi2Persistence getRpDashboardCmi2Persistence() {
		return rpDashboardCmi2Persistence;
	}

	/**
	 * Sets the rp dashboard cmi2 persistence.
	 *
	 * @param rpDashboardCmi2Persistence the rp dashboard cmi2 persistence
	 */
	public void setRpDashboardCmi2Persistence(
		RpDashboardCmi2Persistence rpDashboardCmi2Persistence) {

		this.rpDashboardCmi2Persistence = rpDashboardCmi2Persistence;
	}

	@BeanReference(type = RpDashboardCmi2Persistence.class)
	protected RpDashboardCmi2Persistence rpDashboardCmi2Persistence;

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardCmi2FinderBaseImpl.class);

}