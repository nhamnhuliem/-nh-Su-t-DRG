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
 * The table class for the &quot;rp_dashboard_chiphi_binhquan&quot; database table.
 *
 * @author SON
 * @see DashboardChiPhiBinhQuan
 * @generated
 */
public class DashboardChiPhiBinhQuanTable
	extends BaseTable<DashboardChiPhiBinhQuanTable> {

	public static final DashboardChiPhiBinhQuanTable INSTANCE =
		new DashboardChiPhiBinhQuanTable();

	public final Column<DashboardChiPhiBinhQuanTable, Long> id = createColumn(
		"id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DashboardChiPhiBinhQuanTable, Integer> mucBc =
		createColumn(
			"muc_bc", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiBinhQuanTable, Integer> nam =
		createColumn("nam", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiBinhQuanTable, Integer> thang =
		createColumn(
			"thang", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiBinhQuanTable, Long> orgId =
		createColumn(
			"organization_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiBinhQuanTable, String> orgName =
		createColumn(
			"organization_name", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiBinhQuanTable, Double> phiBqDichVu =
		createColumn(
			"phibq_dichvu", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiBinhQuanTable, Double> phiBqBenhVien =
		createColumn(
			"phibq_benhvien", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private DashboardChiPhiBinhQuanTable() {
		super(
			"rp_dashboard_chiphi_binhquan", DashboardChiPhiBinhQuanTable::new);
	}

}