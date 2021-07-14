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
 * Provides a wrapper for {@link ViewDanhSachBenhAnService}.
 *
 * @author SON
 * @see ViewDanhSachBenhAnService
 * @generated
 */
public class ViewDanhSachBenhAnServiceWrapper
	implements ServiceWrapper<ViewDanhSachBenhAnService>,
			   ViewDanhSachBenhAnService {

	public ViewDanhSachBenhAnServiceWrapper(
		ViewDanhSachBenhAnService viewDanhSachBenhAnService) {

		_viewDanhSachBenhAnService = viewDanhSachBenhAnService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _viewDanhSachBenhAnService.getOSGiServiceIdentifier();
	}

	@Override
	public ViewDanhSachBenhAnService getWrappedService() {
		return _viewDanhSachBenhAnService;
	}

	@Override
	public void setWrappedService(
		ViewDanhSachBenhAnService viewDanhSachBenhAnService) {

		_viewDanhSachBenhAnService = viewDanhSachBenhAnService;
	}

	private ViewDanhSachBenhAnService _viewDanhSachBenhAnService;

}