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
 * The table class for the &quot;rp_dashboard_chiphi_thanhphan&quot; database table.
 *
 * @author SON
 * @see DashboardChiPhiThanhPhan
 * @generated
 */
public class DashboardChiPhiThanhPhanTable
	extends BaseTable<DashboardChiPhiThanhPhanTable> {

	public static final DashboardChiPhiThanhPhanTable INSTANCE =
		new DashboardChiPhiThanhPhanTable();

	public final Column<DashboardChiPhiThanhPhanTable, Long> id = createColumn(
		"id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DashboardChiPhiThanhPhanTable, Integer> mucBc =
		createColumn(
			"muc_bc", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiThanhPhanTable, Integer> nam =
		createColumn("nam", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiThanhPhanTable, Long> orgId =
		createColumn(
			"organization_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiThanhPhanTable, String> orgName =
		createColumn(
			"organization_name", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiThanhPhanTable, Double> phi =
		createColumn("phi", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiThanhPhanTable, Double> dinhSuat =
		createColumn(
			"dinhsuat", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiThanhPhanTable, Double> drg =
		createColumn("drg", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private DashboardChiPhiThanhPhanTable() {
		super(
			"rp_dashboard_chiphi_thanhphan",
			DashboardChiPhiThanhPhanTable::new);
	}

}