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

import drg.moh.service.model.RpDashboardDRG;
import drg.moh.service.service.persistence.RpDashboardDRGPersistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SON
 * @generated
 */
public class RpDashboardDRGFinderBaseImpl
	extends BasePersistenceImpl<RpDashboardDRG> {

	public RpDashboardDRGFinderBaseImpl() {
		setModelClass(RpDashboardDRG.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("drg", "_drg");
		dbColumnNames.put("thang", "_thang");
		dbColumnNames.put("value", "_value");

		setDBColumnNames(dbColumnNames);
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getRpDashboardDRGPersistence().getBadColumnNames();
	}

	/**
	 * Returns the rp dashboard drg persistence.
	 *
	 * @return the rp dashboard drg persistence
	 */
	public RpDashboardDRGPersistence getRpDashboardDRGPersistence() {
		return rpDashboardDRGPersistence;
	}

	/**
	 * Sets the rp dashboard drg persistence.
	 *
	 * @param rpDashboardDRGPersistence the rp dashboard drg persistence
	 */
	public void setRpDashboardDRGPersistence(
		RpDashboardDRGPersistence rpDashboardDRGPersistence) {

		this.rpDashboardDRGPersistence = rpDashboardDRGPersistence;
	}

	@BeanReference(type = RpDashboardDRGPersistence.class)
	protected RpDashboardDRGPersistence rpDashboardDRGPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardDRGFinderBaseImpl.class);

}