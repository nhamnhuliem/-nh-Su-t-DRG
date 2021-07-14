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
 * The table class for the &quot;rp_dashboard_baohiem&quot; database table.
 *
 * @author SON
 * @see DashboardBaoHiem
 * @generated
 */
public class DashboardBaoHiemTable extends BaseTable<DashboardBaoHiemTable> {

	public static final DashboardBaoHiemTable INSTANCE =
		new DashboardBaoHiemTable();

	public final Column<DashboardBaoHiemTable, Long> id = createColumn(
		"id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DashboardBaoHiemTable, Integer> mucBc = createColumn(
		"muc_bc", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardBaoHiemTable, Integer> nam = createColumn(
		"nam", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardBaoHiemTable, Integer> thang = createColumn(
		"thang", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardBaoHiemTable, Long> orgId = createColumn(
		"organization_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DashboardBaoHiemTable, String> orgName = createColumn(
		"organization_name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DashboardBaoHiemTable, String> drgMa = createColumn(
		"drg_ma", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DashboardBaoHiemTable, String> drgTen = createColumn(
		"drg_ten", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DashboardBaoHiemTable, Double> drgValue = createColumn(
		"drg_value", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<DashboardBaoHiemTable, Double> drgUp = createColumn(
		"drg_up", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<DashboardBaoHiemTable, Double> drgDown = createColumn(
		"drg_down", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private DashboardBaoHiemTable() {
		super("rp_dashboard_baohiem", DashboardBaoHiemTable::new);
	}

}