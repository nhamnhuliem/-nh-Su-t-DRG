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
 * @see RpDashboardCmi
 * @generated
 */
public class RpDashboardCmiTable extends BaseTable<RpDashboardCmiTable> {

	public static final RpDashboardCmiTable INSTANCE =
		new RpDashboardCmiTable();

	public final Column<RpDashboardCmiTable, Long> id = createColumn(
		"_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<RpDashboardCmiTable, Double> cmiToanQuoc = createColumn(
		"_cmi_toanquoc", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<RpDashboardCmiTable, Double> cmiTinh = createColumn(
		"_cmi_tinh", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<RpDashboardCmiTable, String> cmiTuyen = createColumn(
		"_cmi_tuyen", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RpDashboardCmiTable, Double> cmiTrungBinh =
		createColumn(
			"_cmi_trungbinh", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<RpDashboardCmiTable, Double> cmiTrungMax = createColumn(
		"_cmi_trungmax", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<RpDashboardCmiTable, Double> cmiTrungMin = createColumn(
		"_cmi_trungmin", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<RpDashboardCmiTable, Double> cmiCoSo = createColumn(
		"_cmi_coso", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private RpDashboardCmiTable() {
		super("rp_dashboard_cmi", RpDashboardCmiTable::new);
	}

}