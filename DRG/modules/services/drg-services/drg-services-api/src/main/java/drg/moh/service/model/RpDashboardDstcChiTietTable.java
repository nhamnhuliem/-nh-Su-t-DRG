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
 * The table class for the &quot;rp_dashboard_dstc_chitiet&quot; database table.
 *
 * @author SON
 * @see RpDashboardDstcChiTiet
 * @generated
 */
public class RpDashboardDstcChiTietTable
	extends BaseTable<RpDashboardDstcChiTietTable> {

	public static final RpDashboardDstcChiTietTable INSTANCE =
		new RpDashboardDstcChiTietTable();

	public final Column<RpDashboardDstcChiTietTable, String> id = createColumn(
		"_id", String.class, Types.VARCHAR, Column.FLAG_PRIMARY);
	public final Column<RpDashboardDstcChiTietTable, String> tenTinh =
		createColumn(
			"_ten_tinh", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RpDashboardDstcChiTietTable, Integer> dinhSuat =
		createColumn(
			"_dinhsuat", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);

	private RpDashboardDstcChiTietTable() {
		super("rp_dashboard_dstc_chitiet", RpDashboardDstcChiTietTable::new);
	}

}