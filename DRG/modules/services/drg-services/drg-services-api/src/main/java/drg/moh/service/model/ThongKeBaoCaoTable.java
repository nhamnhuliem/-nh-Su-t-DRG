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
 * The table class for the &quot;dashboard_thongke_1&quot; database table.
 *
 * @author SON
 * @see ThongKeBaoCao
 * @generated
 */
public class ThongKeBaoCaoTable extends BaseTable<ThongKeBaoCaoTable> {

	public static final ThongKeBaoCaoTable INSTANCE = new ThongKeBaoCaoTable();

	public final Column<ThongKeBaoCaoTable, Long> id = createColumn(
		"id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ThongKeBaoCaoTable, Integer> nam = createColumn(
		"nam", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<ThongKeBaoCaoTable, Integer> thang = createColumn(
		"thang", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<ThongKeBaoCaoTable, Long> tongHoSo = createColumn(
		"tong_hoso", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);

	private ThongKeBaoCaoTable() {
		super("dashboard_thongke_1", ThongKeBaoCaoTable::new);
	}

}