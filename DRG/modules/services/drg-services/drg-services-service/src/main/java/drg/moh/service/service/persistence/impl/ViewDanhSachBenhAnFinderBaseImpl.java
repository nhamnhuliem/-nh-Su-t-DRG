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

package drg.moh.service.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import drg.moh.service.model.ViewDanhSachBenhAn;
import drg.moh.service.service.persistence.ViewDanhSachBenhAnPersistence;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author SON
 * @generated
 */
public class ViewDanhSachBenhAnFinderBaseImpl
	extends BasePersistenceImpl<ViewDanhSachBenhAn> {

	public ViewDanhSachBenhAnFinderBaseImpl() {
		setModelClass(ViewDanhSachBenhAn.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("orgId", "organization_id");
		dbColumnNames.put("maCoSo", "ma_cskcb");
		dbColumnNames.put("tenCoSo", "ten_cskcb");
		dbColumnNames.put("maHoSo", "ma_lk");
		dbColumnNames.put("maBenhNhan", "ma_bn");
		dbColumnNames.put("hoTen", "ho_ten");
		dbColumnNames.put("maThe", "ma_the");
		dbColumnNames.put("chiPhi", "drg_chiphi");
		dbColumnNames.put("dinhSuat", "drg_dinhsuat");
		dbColumnNames.put("giaTri", "drg_giatri");

		setDBColumnNames(dbColumnNames);
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getViewDanhSachBenhAnPersistence().getBadColumnNames();
	}

	/**
	 * Returns the view danh sach benh an persistence.
	 *
	 * @return the view danh sach benh an persistence
	 */
	public ViewDanhSachBenhAnPersistence getViewDanhSachBenhAnPersistence() {
		return viewDanhSachBenhAnPersistence;
	}

	/**
	 * Sets the view danh sach benh an persistence.
	 *
	 * @param viewDanhSachBenhAnPersistence the view danh sach benh an persistence
	 */
	public void setViewDanhSachBenhAnPersistence(
		ViewDanhSachBenhAnPersistence viewDanhSachBenhAnPersistence) {

		this.viewDanhSachBenhAnPersistence = viewDanhSachBenhAnPersistence;
	}

	@BeanReference(type = ViewDanhSachBenhAnPersistence.class)
	protected ViewDanhSachBenhAnPersistence viewDanhSachBenhAnPersistence;

	private static final Log _log = LogFactoryUtil.getLog(
		ViewDanhSachBenhAnFinderBaseImpl.class);

}