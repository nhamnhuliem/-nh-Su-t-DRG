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

import drg.moh.service.service.base.RpDashboardTrungBinhLocalServiceBaseImpl;

/**
 * The implementation of the rp dashboard trung binh local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>drg.moh.service.service.RpDashboardTrungBinhLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author SON
 * @see RpDashboardTrungBinhLocalServiceBaseImpl
 */
public class RpDashboardTrungBinhLocalServiceImpl
	extends RpDashboardTrungBinhLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>drg.moh.service.service.RpDashboardTrungBinhLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>drg.moh.service.service.RpDashboardTrungBinhLocalServiceUtil</code>.
	 */
	public String getTrungBinh4DinhSuat(String maDonVi, int type, int getBy){
		return rpDashboardTrungBinhFinder.getTrungBinh4DinhSuat(maDonVi, type, getBy);
	}
	public String getTrungBinh4Drg(String maDonVi, int type, int getBy){
		return rpDashboardTrungBinhFinder.getTrungBinh4Drg(maDonVi, type, getBy);
	}
	public String getTrungBinh4CMI(String maDonVi, int type, int getBy){
		return rpDashboardTrungBinhFinder.getTrungBinh4CMI(maDonVi, type, getBy);
	}
	public String getTrungBinh4ChiPhi(String maDonVi, int type, int getBy){
		return rpDashboardTrungBinhFinder.getTrungBinh4ChiPhi(maDonVi, type, getBy);
	}
}