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

package drg.moh.service.service.persistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * @author SON
 * @generated
 */
@ProviderType
public interface DashboardBaoHiemFinder {

	public java.util.List<drg.moh.service.model.DashboardBaoHiem>
		getBaoHiemData(long orgId, int muc, int nam);

	public java.util.List<String> getDrgBaoHiem(long orgId, int muc, int nam);

}