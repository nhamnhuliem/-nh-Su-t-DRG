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
 * The table class for the &quot;rp_dashboard_cmi&quot; database table.
 *
 * @author SON
 * @see DashboardCMI
 * @generated
 */
public class DashboardCMITable extends BaseTable<DashboardCMITable> {

	public static final DashboardCMITable INSTANCE = new DashboardCMITable();

	public final Column<DashboardCMITable, Long> id = createColumn(
		"id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<DashboardCMITable, Integer> mucBc = createColumn(
		"muc_bc", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardCMITable, Integer> nam = createColumn(
		"nam", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardCMITable, Integer> thang = createColumn(
		"thang", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<DashboardCMITable, Long> orgId = createColumn(
		"organization_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<DashboardCMITable, String> orgName = createColumn(
		"organization_name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<DashboardCMITable, Double> cmiThap = createColumn(
		"cmi_thap", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<DashboardCMITable, Double> cmiCao = createColumn(
		"cmi_cao", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<DashboardCMITable, Double> cmiTrungBinh = createColumn(
		"cmi_trungbinh", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private DashboardCMITable() {
		super("rp_dashboard_cmi", DashboardCMITable::new);
	}

}