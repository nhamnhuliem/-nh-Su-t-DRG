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
 * The table class for the &quot;func_dashboard_cmi_3&quot; database table.
 *
 * @author SON
 * @see RpDashboardCmi3
 * @generated
 */
public class RpDashboardCmi3Table extends BaseTable<RpDashboardCmi3Table> {

	public static final RpDashboardCmi3Table INSTANCE =
		new RpDashboardCmi3Table();

	public final Column<RpDashboardCmi3Table, Long> id = createColumn(
		"_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<RpDashboardCmi3Table, Double> cmiTinh = createColumn(
		"_cmi_tinh", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<RpDashboardCmi3Table, Double> cmiTuyen = createColumn(
		"_cmi_tuyen", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<RpDashboardCmi3Table, Double> cmiCoSo = createColumn(
		"_cmi_coso", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private RpDashboardCmi3Table() {
		super("func_dashboard_cmi_3", RpDashboardCmi3Table::new);
	}

}