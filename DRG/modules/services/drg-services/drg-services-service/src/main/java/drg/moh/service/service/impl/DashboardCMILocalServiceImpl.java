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

package drg.moh.service.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import drg.moh.service.model.DashboardCMI;
import drg.moh.service.service.base.DashboardCMILocalServiceBaseImpl;

/**
 * The implementation of the dashboard cmi local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>drg.moh.service.service.DashboardCMILocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author SON
 * @see DashboardCMILocalServiceBaseImpl
 */
public class DashboardCMILocalServiceImpl
	extends DashboardCMILocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>drg.moh.service.service.DashboardCMILocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>drg.moh.service.service.DashboardCMILocalServiceUtil</code>.
	 */
	public List<DashboardCMI> findByORG_MUC_NAM(long orgId, int mucBc, int nam) throws SystemException{
		return dashboardCMIPersistence.findByORG_MUC_NAM(orgId, mucBc, nam);
	}
}