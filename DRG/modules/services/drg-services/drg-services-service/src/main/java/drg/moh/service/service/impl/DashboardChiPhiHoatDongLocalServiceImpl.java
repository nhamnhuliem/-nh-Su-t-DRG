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

import drg.moh.service.model.DashboardChiPhiHoatDong;
import drg.moh.service.service.base.DashboardChiPhiHoatDongLocalServiceBaseImpl;

/**
 * The implementation of the dashboard chi phi hoat dong local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>drg.moh.service.service.DashboardChiPhiHoatDongLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author SON
 * @see DashboardChiPhiHoatDongLocalServiceBaseImpl
 */
public class DashboardChiPhiHoatDongLocalServiceImpl
	extends DashboardChiPhiHoatDongLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>drg.moh.service.service.DashboardChiPhiHoatDongLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>drg.moh.service.service.DashboardChiPhiHoatDongLocalServiceUtil</code>.
	 */
	public List<DashboardChiPhiHoatDong> findByORG_MUC_NAM(long orgId, int mucBaoCao, int nam) throws SystemException{
		return dashboardChiPhiHoatDongPersistence.findByORG_MUC_NAM(orgId, mucBaoCao, nam);
	}
	
	public List<DashboardChiPhiHoatDong> getBaoCaosByOrg_Muc_Nam(long orgId,int muc, int nam, int start, int end){
		return dashboardChiPhiHoatDongFinder.getBaoCaosByOrg_Muc_Nam(orgId,muc, nam, start, end);
	}
	
	public int countBaoCaosByOrg_Muc_Nam(long orgId,int muc, int nam){
		return dashboardChiPhiHoatDongFinder.countBaoCaosByOrg_Muc_Nam(orgId,muc, nam);
	}
}