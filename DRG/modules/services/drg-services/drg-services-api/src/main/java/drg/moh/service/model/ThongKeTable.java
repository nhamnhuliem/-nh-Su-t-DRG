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
 * The table class for the &quot;hsbhyt_tonghop_thongke&quot; database table.
 *
 * @author SON
 * @see ThongKe
 * @generated
 */
public class ThongKeTable extends BaseTable<ThongKeTable> {

	public static final ThongKeTable INSTANCE = new ThongKeTable();

	public final Column<ThongKeTable, Long> id = createColumn(
		"id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ThongKeTable, String> maCoSo = createColumn(
		"ma_cskcb", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ThongKeTable, Integer> nam = createColumn(
		"nam_qt", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<ThongKeTable, Integer> thang = createColumn(
		"thang_qt", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<ThongKeTable, Long> tongHoSo = createColumn(
		"tong_hoso", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ThongKeTable, Double> tienTongChi = createColumn(
		"t_tongchi", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<ThongKeTable, Double> tienBH = createColumn(
		"t_bhtt", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private ThongKeTable() {
		super("hsbhyt_tonghop_thongke", ThongKeTable::new);
	}

}