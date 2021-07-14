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
 * The table class for the &quot;rp_dashboard_dstc&quot; database table.
 *
 * @author SON
 * @see RpDashboardDstc
 * @generated
 */
public class RpDashboardDstcTable extends BaseTable<RpDashboardDstcTable> {

	public static final RpDashboardDstcTable INSTANCE =
		new RpDashboardDstcTable();

	public final Column<RpDashboardDstcTable, String> id = createColumn(
		"_id", String.class, Types.VARCHAR, Column.FLAG_PRIMARY);
	public final Column<RpDashboardDstcTable, String> tenTinh = createColumn(
		"_ten_tinh", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RpDashboardDstcTable, Integer> thang = createColumn(
		"_thang", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<RpDashboardDstcTable, Integer> soLuot = createColumn(
		"_soluot", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<RpDashboardDstcTable, Double> chiPhi = createColumn(
		"_chiphi", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<RpDashboardDstcTable, Double> quyDs = createColumn(
		"_quyds", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private RpDashboardDstcTable() {
		super("rp_dashboard_dstc", RpDashboardDstcTable::new);
	}

}