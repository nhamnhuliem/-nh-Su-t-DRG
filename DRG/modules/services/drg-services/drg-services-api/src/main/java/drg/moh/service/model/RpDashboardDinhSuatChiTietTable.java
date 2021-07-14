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
 * The table class for the &quot;rp_dashboard_dinhsuat_ct&quot; database table.
 *
 * @author SON
 * @see RpDashboardDinhSuatChiTiet
 * @generated
 */
public class RpDashboardDinhSuatChiTietTable
	extends BaseTable<RpDashboardDinhSuatChiTietTable> {

	public static final RpDashboardDinhSuatChiTietTable INSTANCE =
		new RpDashboardDinhSuatChiTietTable();

	public final Column<RpDashboardDinhSuatChiTietTable, Long> id =
		createColumn("_id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<RpDashboardDinhSuatChiTietTable, String> tenTinh =
		createColumn(
			"_tentinh", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<RpDashboardDinhSuatChiTietTable, Double> dinhSuat =
		createColumn(
			"_dinhsuat", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private RpDashboardDinhSuatChiTietTable() {
		super("rp_dashboard_dinhsuat_ct", RpDashboardDinhSuatChiTietTable::new);
	}

}