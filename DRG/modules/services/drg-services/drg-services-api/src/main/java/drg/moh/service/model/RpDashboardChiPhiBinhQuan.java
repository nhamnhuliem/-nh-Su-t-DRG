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
 * The extended model interface for the RpDashboardChiPhiBinhQuan service. Represents a row in the &quot;rp_dashboard_chiphibinhquan&quot; database table, with each column mapped to a property of this class.
 *
 * @author SON
 * @see RpDashboardChiPhiBinhQuanModel
 * @generated
 */
@ImplementationClassName(
	"drg.moh.service.model.impl.RpDashboardChiPhiBinhQuanImpl"
)
@ProviderType
public interface RpDashboardChiPhiBinhQuan
	extends PersistedModel, RpDashboardChiPhiBinhQuanModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>drg.moh.service.model.impl.RpDashboardChiPhiBinhQuanImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<RpDashboardChiPhiBinhQuan, Long> ID_ACCESSOR =
		new Accessor<RpDashboardChiPhiBinhQuan, Long>() {

			@Override
			public Long get(
				RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan) {

				return rpDashboardChiPhiBinhQuan.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<RpDashboardChiPhiBinhQuan> getTypeClass() {
				return RpDashboardChiPhiBinhQuan.class;
			}

		};

}