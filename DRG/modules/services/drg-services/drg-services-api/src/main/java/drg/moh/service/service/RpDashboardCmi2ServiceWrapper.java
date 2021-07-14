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

package drg.moh.service.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RpDashboardCmi2Service}.
 *
 * @author SON
 * @see RpDashboardCmi2Service
 * @generated
 */
public class RpDashboardCmi2ServiceWrapper
	implements RpDashboardCmi2Service, ServiceWrapper<RpDashboardCmi2Service> {

	public RpDashboardCmi2ServiceWrapper(
		RpDashboardCmi2Service rpDashboardCmi2Service) {

		_rpDashboardCmi2Service = rpDashboardCmi2Service;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _rpDashboardCmi2Service.getOSGiServiceIdentifier();
	}

	@Override
	public RpDashboardCmi2Service getWrappedService() {
		return _rpDashboardCmi2Service;
	}

	@Override
	public void setWrappedService(
		RpDashboardCmi2Service rpDashboardCmi2Service) {

		_rpDashboardCmi2Service = rpDashboardCmi2Service;
	}

	private RpDashboardCmi2Service _rpDashboardCmi2Service;

}