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
 * The extended model interface for the RpDashboardDstc service. Represents a row in the &quot;rp_dashboard_dstc&quot; database table, with each column mapped to a property of this class.
 *
 * @author SON
 * @see RpDashboardDstcModel
 * @generated
 */
@ImplementationClassName("drg.moh.service.model.impl.RpDashboardDstcImpl")
@ProviderType
public interface RpDashboardDstc extends PersistedModel, RpDashboardDstcModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>drg.moh.service.model.impl.RpDashboardDstcImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RpDashboardDstc, String> ID_ACCESSOR =
		new Accessor<RpDashboardDstc, String>() {

			@Override
			public String get(RpDashboardDstc rpDashboardDstc) {
				return rpDashboardDstc.getId();
			}

			@Override
			public Class<String> getAttributeClass() {
				return String.class;
			}

			@Override
			public Class<RpDashboardDstc> getTypeClass() {
				return RpDashboardDstc.class;
			}

		};

}