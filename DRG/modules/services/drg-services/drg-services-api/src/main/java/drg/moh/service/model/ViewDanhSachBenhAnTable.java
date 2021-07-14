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
 * The table class for the &quot;view_danhsach_hsba&quot; database table.
 *
 * @author SON
 * @see ViewDanhSachBenhAn
 * @generated
 */
public class ViewDanhSachBenhAnTable
	extends BaseTable<ViewDanhSachBenhAnTable> {

	public static final ViewDanhSachBenhAnTable INSTANCE =
		new ViewDanhSachBenhAnTable();

	public final Column<ViewDanhSachBenhAnTable, Long> id = createColumn(
		"id", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ViewDanhSachBenhAnTable, Long> orgId = createColumn(
		"organization_id", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<ViewDanhSachBenhAnTable, String> maCoSo = createColumn(
		"ma_cskcb", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ViewDanhSachBenhAnTable, String> tenCoSo = createColumn(
		"ten_cskcb", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ViewDanhSachBenhAnTable, String> maHoSo = createColumn(
		"ma_lk", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ViewDanhSachBenhAnTable, String> maBenhNhan =
		createColumn("ma_bn", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ViewDanhSachBenhAnTable, String> hoTen = createColumn(
		"ho_ten", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ViewDanhSachBenhAnTable, String> maThe = createColumn(
		"ma_the", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ViewDanhSachBenhAnTable, Integer> nam = createColumn(
		"nam", Integer.class, Types.INTEGER, Column.FLAG_DEFAULT);
	public final Column<ViewDanhSachBenhAnTable, Double> chiPhi = createColumn(
		"drg_chiphi", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<ViewDanhSachBenhAnTable, Double> dinhSuat =
		createColumn(
			"drg_dinhsuat", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);
	public final Column<ViewDanhSachBenhAnTable, Double> giaTri = createColumn(
		"drg_giatri", Double.class, Types.DOUBLE, Column.FLAG_DEFAULT);

	private ViewDanhSachBenhAnTable() {
		super("view_danhsach_hsba", ViewDanhSachBenhAnTable::new);
	}

}