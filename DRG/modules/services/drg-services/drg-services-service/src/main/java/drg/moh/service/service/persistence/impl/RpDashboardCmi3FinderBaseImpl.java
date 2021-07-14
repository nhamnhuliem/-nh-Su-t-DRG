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

import drg.moh.service.model.RpDashboardCmi3;
import drg.moh.service.service.persistence.RpDashboardCmi3Persistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SON
 * @generated
 */
public class RpDashboardCmi3FinderBaseImpl
	extends BasePersistenceImpl<RpDashboardCmi3> {

	public RpDashboardCmi3FinderBaseImpl() {
		setModelClass(RpDashboardCmi3.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("cmiTinh", "_cmi_tinh");
		dbColumnNames.put("cmiTuyen", "_cmi_tuyen");
		dbColumnNames.put("cmiCoSo", "_cmi_coso");

		setDBColumnNames(dbColumnNames);
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getRpDashboardCmi3Persistence().getBadColumnNames();
	}

	/**
	 * Returns the rp dashboard cmi3 persistence.
	 *
	 * @return the rp dashboard cmi3 persistence
	 */
	public RpDashboardCmi3Persistence getRpDashboardCmi3Persistence() {
		return rpDashboardCmi3Persistence;
	}

	/**
	 * Sets the rp dashboard cmi3 persistence.
	 *
	 * @param rpDashboardCmi3Persistence the rp dashboard cmi3 persistence
	 */
	public void setRpDashboardCmi3Persistence(
		RpDashboardCmi3Persistence rpDashboardCmi3Persistence) {

		this.rpDashboardCmi3Persistence = rpDashboardCmi3Persistence;
	}

	@BeanReference(type = RpDashboardCmi3Persistence.class)
	protected RpDashboardCmi3Persistence rpDashboardCmi3Persistence;

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardCmi3FinderBaseImpl.class);

}