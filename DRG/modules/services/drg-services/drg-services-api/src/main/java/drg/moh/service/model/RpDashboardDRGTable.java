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
 * The table class for the &quot;rp_dashboard_drg&quot; database table.
 *
 * @author SON
 * @see RpDashboardDRG
 * @generated
 */
public class RpDashboardDRGTable extends BaseTable<RpDashboardDRGTable> {

	public static final RpDashboardDRGTable INSTANCE =
		new RpDashboardDRGTable();

	public final Column<RpDashboardDRGTable, Long> id = createColumn(
		"_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<RpDashboardDRGTable, String> drg = createColumn(
		"_drg", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RpDashboardDRGTable, String> thang = createColumn(
		"_thang", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RpDashboardDRGTable, Double> value = createColumn(
		"_value", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private RpDashboardDRGTable() {
		super("rp_dashboard_drg", RpDashboardDRGTable::new);
	}

}