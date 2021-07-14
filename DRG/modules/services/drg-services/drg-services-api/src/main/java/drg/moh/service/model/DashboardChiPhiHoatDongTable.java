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
 * The table class for the &quot;rp_dashboard_chiphi_hoatdong&quot; database table.
 *
 * @author SON
 * @see DashboardChiPhiHoatDong
 * @generated
 */
public class DashboardChiPhiHoatDongTable
	extends BaseTable<DashboardChiPhiHoatDongTable> {

	public static final DashboardChiPhiHoatDongTable INSTANCE =
		new DashboardChiPhiHoatDongTable();

	public final Column<DashboardChiPhiHoatDongTable, Long> id = createColumn(
		"id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DashboardChiPhiHoatDongTable, Integer> mucBc =
		createColumn(
			"muc_bc", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiHoatDongTable, Integer> nam =
		createColumn("nam", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiHoatDongTable, Long> orgId =
		createColumn(
			"organization_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiHoatDongTable, String> orgName =
		createColumn(
			"organization_name", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiHoatDongTable, String> thanhPhanId =
		createColumn(
			"thanhphan_id", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiHoatDongTable, String> thanhPhanMa =
		createColumn(
			"thanhphan_ma", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiHoatDongTable, String> thanhPhanTen =
		createColumn(
			"thanhphan_ten", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiHoatDongTable, Double> drgPhiDv =
		createColumn(
			"drg_phidv", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiHoatDongTable, Double> drgDinhSuat =
		createColumn(
			"drg_dinhsuat", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<DashboardChiPhiHoatDongTable, Double> drgValues =
		createColumn(
			"drg_values", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private DashboardChiPhiHoatDongTable() {
		super(
			"rp_dashboard_chiphi_hoatdong", DashboardChiPhiHoatDongTable::new);
	}

}