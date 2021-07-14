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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link ViewDanhSachBenhAn}.
 * </p>
 *
 * @author SON
 * @see ViewDanhSachBenhAn
 * @generated
 */
public class ViewDanhSachBenhAnWrapper
	extends BaseModelWrapper<ViewDanhSachBenhAn>
	implements ModelWrapper<ViewDanhSachBenhAn>, ViewDanhSachBenhAn {

	public ViewDanhSachBenhAnWrapper(ViewDanhSachBenhAn viewDanhSachBenhAn) {
		super(viewDanhSachBenhAn);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("orgId", getOrgId());
		attributes.put("maCoSo", getMaCoSo());
		attributes.put("tenCoSo", getTenCoSo());
		attributes.put("maHoSo", getMaHoSo());
		attributes.put("maBenhNhan", getMaBenhNhan());
		attributes.put("hoTen", getHoTen());
		attributes.put("maThe", getMaThe());
		attributes.put("nam", getNam());
		attributes.put("chiPhi", getChiPhi());
		attributes.put("dinhSuat", getDinhSuat());
		attributes.put("giaTri", getGiaTri());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long orgId = (Long)attributes.get("orgId");

		if (orgId != null) {
			setOrgId(orgId);
		}

		String maCoSo = (String)attributes.get("maCoSo");

		if (maCoSo != null) {
			setMaCoSo(maCoSo);
		}

		String tenCoSo = (String)attributes.get("tenCoSo");

		if (tenCoSo != null) {
			setTenCoSo(tenCoSo);
		}

		String maHoSo = (String)attributes.get("maHoSo");

		if (maHoSo != null) {
			setMaHoSo(maHoSo);
		}

		String maBenhNhan = (String)attributes.get("maBenhNhan");

		if (maBenhNhan != null) {
			setMaBenhNhan(maBenhNhan);
		}

		String hoTen = (String)attributes.get("hoTen");

		if (hoTen != null) {
			setHoTen(hoTen);
		}

		String maThe = (String)attributes.get("maThe");

		if (maThe != null) {
			setMaThe(maThe);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Double chiPhi = (Double)attributes.get("chiPhi");

		if (chiPhi != null) {
			setChiPhi(chiPhi);
		}

		Double dinhSuat = (Double)attributes.get("dinhSuat");

		if (dinhSuat != null) {
			setDinhSuat(dinhSuat);
		}

		Double giaTri = (Double)attributes.get("giaTri");

		if (giaTri != null) {
			setGiaTri(giaTri);
		}
	}

	/**
	 * Returns the chi phi of this view danh sach benh an.
	 *
	 * @return the chi phi of this view danh sach benh an
	 */
	@Override
	public double getChiPhi() {
		return model.getChiPhi();
	}

	/**
	 * Returns the dinh suat of this view danh sach benh an.
	 *
	 * @return the dinh suat of this view danh sach benh an
	 */
	@Override
	public double getDinhSuat() {
		return model.getDinhSuat();
	}

	/**
	 * Returns the gia tri of this view danh sach benh an.
	 *
	 * @return the gia tri of this view danh sach benh an
	 */
	@Override
	public double getGiaTri() {
		return model.getGiaTri();
	}

	/**
	 * Returns the ho ten of this view danh sach benh an.
	 *
	 * @return the ho ten of this view danh sach benh an
	 */
	@Override
	public String getHoTen() {
		return model.getHoTen();
	}

	/**
	 * Returns the ID of this view danh sach benh an.
	 *
	 * @return the ID of this view danh sach benh an
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the ma benh nhan of this view danh sach benh an.
	 *
	 * @return the ma benh nhan of this view danh sach benh an
	 */
	@Override
	public String getMaBenhNhan() {
		return model.getMaBenhNhan();
	}

	/**
	 * Returns the ma co so of this view danh sach benh an.
	 *
	 * @return the ma co so of this view danh sach benh an
	 */
	@Override
	public String getMaCoSo() {
		return model.getMaCoSo();
	}

	/**
	 * Returns the ma ho so of this view danh sach benh an.
	 *
	 * @return the ma ho so of this view danh sach benh an
	 */
	@Override
	public String getMaHoSo() {
		return model.getMaHoSo();
	}

	/**
	 * Returns the ma the of this view danh sach benh an.
	 *
	 * @return the ma the of this view danh sach benh an
	 */
	@Override
	public String getMaThe() {
		return model.getMaThe();
	}

	/**
	 * Returns the nam of this view danh sach benh an.
	 *
	 * @return the nam of this view danh sach benh an
	 */
	@Override
	public int getNam() {
		return model.getNam();
	}

	/**
	 * Returns the org ID of this view danh sach benh an.
	 *
	 * @return the org ID of this view danh sach benh an
	 */
	@Override
	public long getOrgId() {
		return model.getOrgId();
	}

	/**
	 * Returns the primary key of this view danh sach benh an.
	 *
	 * @return the primary key of this view danh sach benh an
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the ten co so of this view danh sach benh an.
	 *
	 * @return the ten co so of this view danh sach benh an
	 */
	@Override
	public String getTenCoSo() {
		return model.getTenCoSo();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the chi phi of this view danh sach benh an.
	 *
	 * @param chiPhi the chi phi of this view danh sach benh an
	 */
	@Override
	public void setChiPhi(double chiPhi) {
		model.setChiPhi(chiPhi);
	}

	/**
	 * Sets the dinh suat of this view danh sach benh an.
	 *
	 * @param dinhSuat the dinh suat of this view danh sach benh an
	 */
	@Override
	public void setDinhSuat(double dinhSuat) {
		model.setDinhSuat(dinhSuat);
	}

	/**
	 * Sets the gia tri of this view danh sach benh an.
	 *
	 * @param giaTri the gia tri of this view danh sach benh an
	 */
	@Override
	public void setGiaTri(double giaTri) {
		model.setGiaTri(giaTri);
	}

	/**
	 * Sets the ho ten of this view danh sach benh an.
	 *
	 * @param hoTen the ho ten of this view danh sach benh an
	 */
	@Override
	public void setHoTen(String hoTen) {
		model.setHoTen(hoTen);
	}

	/**
	 * Sets the ID of this view danh sach benh an.
	 *
	 * @param id the ID of this view danh sach benh an
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the ma benh nhan of this view danh sach benh an.
	 *
	 * @param maBenhNhan the ma benh nhan of this view danh sach benh an
	 */
	@Override
	public void setMaBenhNhan(String maBenhNhan) {
		model.setMaBenhNhan(maBenhNhan);
	}

	/**
	 * Sets the ma co so of this view danh sach benh an.
	 *
	 * @param maCoSo the ma co so of this view danh sach benh an
	 */
	@Override
	public void setMaCoSo(String maCoSo) {
		model.setMaCoSo(maCoSo);
	}

	/**
	 * Sets the ma ho so of this view danh sach benh an.
	 *
	 * @param maHoSo the ma ho so of this view danh sach benh an
	 */
	@Override
	public void setMaHoSo(String maHoSo) {
		model.setMaHoSo(maHoSo);
	}

	/**
	 * Sets the ma the of this view danh sach benh an.
	 *
	 * @param maThe the ma the of this view danh sach benh an
	 */
	@Override
	public void setMaThe(String maThe) {
		model.setMaThe(maThe);
	}

	/**
	 * Sets the nam of this view danh sach benh an.
	 *
	 * @param nam the nam of this view danh sach benh an
	 */
	@Override
	public void setNam(int nam) {
		model.setNam(nam);
	}

	/**
	 * Sets the org ID of this view danh sach benh an.
	 *
	 * @param orgId the org ID of this view danh sach benh an
	 */
	@Override
	public void setOrgId(long orgId) {
		model.setOrgId(orgId);
	}

	/**
	 * Sets the primary key of this view danh sach benh an.
	 *
	 * @param primaryKey the primary key of this view danh sach benh an
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the ten co so of this view danh sach benh an.
	 *
	 * @param tenCoSo the ten co so of this view danh sach benh an
	 */
	@Override
	public void setTenCoSo(String tenCoSo) {
		model.setTenCoSo(tenCoSo);
	}

	@Override
	protected ViewDanhSachBenhAnWrapper wrap(
		ViewDanhSachBenhAn viewDanhSachBenhAn) {

		return new ViewDanhSachBenhAnWrapper(viewDanhSachBenhAn);
	}

}