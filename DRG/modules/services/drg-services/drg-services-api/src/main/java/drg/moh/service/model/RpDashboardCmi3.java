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
 * The extended model interface for the RpDashboardCmi3 service. Represents a row in the &quot;func_dashboard_cmi_3&quot; database table, with each column mapped to a property of this class.
 *
 * @author SON
 * @see RpDashboardCmi3Model
 * @generated
 */
@ImplementationClassName("drg.moh.service.model.impl.RpDashboardCmi3Impl")
@ProviderType
public interface RpDashboardCmi3 extends PersistedModel, RpDashboardCmi3Model {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>drg.moh.service.model.impl.RpDashboardCmi3Impl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RpDashboardCmi3, Long> ID_ACCESSOR =
		new Accessor<RpDashboardCmi3, Long>() {

			@Override
			public Long get(RpDashboardCmi3 rpDashboardCmi3) {
				return rpDashboardCmi3.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<RpDashboardCmi3> getTypeClass() {
				return RpDashboardCmi3.class;
			}

		};

}