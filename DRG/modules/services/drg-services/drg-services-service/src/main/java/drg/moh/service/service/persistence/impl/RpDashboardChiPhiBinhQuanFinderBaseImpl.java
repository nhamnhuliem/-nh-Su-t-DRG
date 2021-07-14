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

import drg.moh.service.model.RpDashboardChiPhiBinhQuan;
import drg.moh.service.service.persistence.RpDashboardChiPhiBinhQuanPersistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SON
 * @generated
 */
public class RpDashboardChiPhiBinhQuanFinderBaseImpl
	extends BasePersistenceImpl<RpDashboardChiPhiBinhQuan> {

	public RpDashboardChiPhiBinhQuanFinderBaseImpl() {
		setModelClass(RpDashboardChiPhiBinhQuan.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("id", "_id");
		dbColumnNames.put("chiPhi", "_chiphi");
		dbColumnNames.put("binhQuan", "_binhquan");

		setDBColumnNames(dbColumnNames);
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getRpDashboardChiPhiBinhQuanPersistence().getBadColumnNames();
	}

	/**
	 * Returns the rp dashboard chi phi binh quan persistence.
	 *
	 * @return the rp dashboard chi phi binh quan persistence
	 */
	public RpDashboardChiPhiBinhQuanPersistence
		getRpDashboardChiPhiBinhQuanPersistence() {

		return rpDashboardChiPhiBinhQuanPersistence;
	}

	/**
	 * Sets the rp dashboard chi phi binh quan persistence.
	 *
	 * @param rpDashboardChiPhiBinhQuanPersistence the rp dashboard chi phi binh quan persistence
	 */
	public void setRpDashboardChiPhiBinhQuanPersistence(
		RpDashboardChiPhiBinhQuanPersistence
			rpDashboardChiPhiBinhQuanPersistence) {

		this.rpDashboardChiPhiBinhQuanPersistence =
			rpDashboardChiPhiBinhQuanPersistence;
	}

	@BeanReference(type = RpDashboardChiPhiBinhQuanPersistence.class)
	protected RpDashboardChiPhiBinhQuanPersistence
		rpDashboardChiPhiBinhQuanPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		RpDashboardChiPhiBinhQuanFinderBaseImpl.class);

}