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

import com.liferay.portal.kernel.exception.SystemException;

import drg.moh.service.model.DashboardChiPhiThanhPhan;
import drg.moh.service.service.base.DashboardChiPhiThanhPhanLocalServiceBaseImpl;

/**
 * The implementation of the dashboard chi phi thanh phan local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>drg.moh.service.service.DashboardChiPhiThanhPhanLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author SON
 * @see DashboardChiPhiThanhPhanLocalServiceBaseImpl
 */
public class DashboardChiPhiThanhPhanLocalServiceImpl
	extends DashboardChiPhiThanhPhanLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>drg.moh.service.service.DashboardChiPhiThanhPhanLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>drg.moh.service.service.DashboardChiPhiThanhPhanLocalServiceUtil</code>.
	 */
	public DashboardChiPhiThanhPhan fetchByORG_MUC_NAM(long orgId, int mucBaoCao, int nam) throws SystemException{
		return dashboardChiPhiThanhPhanPersistence.fetchByORG_MUC_NAM(orgId, mucBaoCao, nam, false);
	}
}