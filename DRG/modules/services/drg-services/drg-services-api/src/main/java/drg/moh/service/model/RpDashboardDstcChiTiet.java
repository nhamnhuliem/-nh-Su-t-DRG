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

package drg.moh.service.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the RpDashboardDstcChiTiet service. Represents a row in the &quot;rp_dashboard_dstc_chitiet&quot; database table, with each column mapped to a property of this class.
 *
 * @author SON
 * @see RpDashboardDstcChiTietModel
 * @generated
 */
@ImplementationClassName(
	"drg.moh.service.model.impl.RpDashboardDstcChiTietImpl"
)
@ProviderType
public interface RpDashboardDstcChiTiet
	extends PersistedModel, RpDashboardDstcChiTietModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>drg.moh.service.model.impl.RpDashboardDstcChiTietImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RpDashboardDstcChiTiet, String> ID_ACCESSOR =
		new Accessor<RpDashboardDstcChiTiet, String>() {

			@Override
			public String get(RpDashboardDstcChiTiet rpDashboardDstcChiTiet) {
				return rpDashboardDstcChiTiet.getId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<RpDashboardDstcChiTiet> getTypeClass() {
				return RpDashboardDstcChiTiet.class;
			}

		};

}