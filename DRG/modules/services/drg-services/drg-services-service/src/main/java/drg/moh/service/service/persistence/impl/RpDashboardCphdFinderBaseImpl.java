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

import drg.moh.service.model.RpDashboardCphd;
import drg.moh.service.service.persistence.RpDashboardCphdPersistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SON
 * @generated
 */
public class RpDashboardCphdFinderBaseImpl
	extends BasePersistenceImpl<RpDashboardCphd> {

	public RpDashboardCphdFinderBaseImpl() {
		setModelClass(RpDashboardCphd.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("tenTinh", "_ten_tinh");
		dbColumnNames.put("chiPhi", "_chiphi");
		dbColumnNames.put("dinhSuat", "_dinhsuat");
		dbColumnNames.put("drg", "_drg");

		setDBColumnNames(dbColumnNames);
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getRpDashboardCphdPersistence().getBadColumnNames();
	}

	/**
	 * Returns the rp dashboard cphd persistence.
	 *
	 * @return the rp dashboard cphd persistence
	 */
	public RpDashboardCphdPersistence getRpDashboardCphdPersistence() {
		return rpDashboardCphdPersistence;
	}

	/**
	 * Sets the rp dashboard cphd persistence.
	 *
	 * @param rpDashboardCphdPersistence the rp dashboard cphd persistence
	 */
	public void setRpDashboardCphdPersistence(
		RpDashboardCphdPersistence rpDashboardCphdPersistence) {

		this.rpDashboardCphdPersistence = rpDashboardCphdPersistence;
	}

	@BeanReference(type = RpDashboardCphdPersistence.class)
	protected RpDashboardCphdPersistence rpDashboardCphdPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardCphdFinderBaseImpl.class);

}