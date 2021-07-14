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
 * The table class for the &quot;func_dashboard_cmi_2&quot; database table.
 *
 * @author SON
 * @see RpDashboardCmi2
 * @generated
 */
public class RpDashboardCmi2Table extends BaseTable<RpDashboardCmi2Table> {

	public static final RpDashboardCmi2Table INSTANCE =
		new RpDashboardCmi2Table();

	public final Column<RpDashboardCmi2Table, Long> id = createColumn(
		"_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<RpDashboardCmi2Table, String> cmiTenTuyen =
		createColumn(
			"_cmi_tentuyen", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RpDashboardCmi2Table, Double> cmiTrungBinh =
		createColumn(
			"_cmi_trungbinh", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<RpDashboardCmi2Table, Double> cmiTrungMax =
		createColumn(
			"_cmi_max", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<RpDashboardCmi2Table, Double> cmiTrungMin =
		createColumn(
			"_cmi_min", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private RpDashboardCmi2Table() {
		super("func_dashboard_cmi_2", RpDashboardCmi2Table::new);
	}

}