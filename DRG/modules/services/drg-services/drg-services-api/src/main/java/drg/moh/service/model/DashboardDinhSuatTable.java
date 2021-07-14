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
 * The table class for the &quot;rp_dashboard_dinhsuat&quot; database table.
 *
 * @author SON
 * @see DashboardDinhSuat
 * @generated
 */
public class DashboardDinhSuatTable extends BaseTable<DashboardDinhSuatTable> {

	public static final DashboardDinhSuatTable INSTANCE =
		new DashboardDinhSuatTable();

	public final Column<DashboardDinhSuatTable, Long> id = createColumn(
		"id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DashboardDinhSuatTable, Integer> mucBc = createColumn(
		"muc_bc", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardDinhSuatTable, Integer> nam = createColumn(
		"nam", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardDinhSuatTable, Integer> thang = createColumn(
		"thang", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardDinhSuatTable, Long> orgId = createColumn(
		"organization_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DashboardDinhSuatTable, String> orgName = createColumn(
		"organization_name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DashboardDinhSuatTable, Double> dinhSuatTieuChuan =
		createColumn(
			"dinhsuat_tieuchuan", Double.class, Types.DOUBLE,
			Column.FLAG_DEFAULT);
	public final Column<DashboardDinhSuatTable, Double> dinhSuatThucTe =
		createColumn(
			"dinhsuat_thucte", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<DashboardDinhSuatTable, Double> dinhSuatBenhNhan =
		createColumn(
			"dinhsuat_benhnhan", Double.class, Types.DOUBLE,
			Column.FLAG_DEFAULT);

	private DashboardDinhSuatTable() {
		super("rp_dashboard_dinhsuat", DashboardDinhSuatTable::new);
	}

}