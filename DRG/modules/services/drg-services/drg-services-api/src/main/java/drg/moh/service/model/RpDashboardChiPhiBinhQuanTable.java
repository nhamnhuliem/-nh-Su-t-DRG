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

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;rp_dashboard_chiphibinhquan&quot; database table.
 *
 * @author SON
 * @see RpDashboardChiPhiBinhQuan
 * @generated
 */
public class RpDashboardChiPhiBinhQuanTable
	extends BaseTable<RpDashboardChiPhiBinhQuanTable> {

	public static final RpDashboardChiPhiBinhQuanTable INSTANCE =
		new RpDashboardChiPhiBinhQuanTable();

	public final Column<RpDashboardChiPhiBinhQuanTable, Long> id = createColumn(
		"_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<RpDashboardChiPhiBinhQuanTable, Double> chiPhi =
		createColumn(
			"_chiphi", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<RpDashboardChiPhiBinhQuanTable, Double> binhQuan =
		createColumn(
			"_binhquan", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private RpDashboardChiPhiBinhQuanTable() {
		super(
			"rp_dashboard_chiphibinhquan", RpDashboardChiPhiBinhQuanTable::new);
	}

}