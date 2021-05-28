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
 * This class is a wrapper for {@link ThongKe}.
 * </p>
 *
 * @author SON
 * @see ThongKe
 * @generated
 */
public class ThongKeWrapper
	extends BaseModelWrapper<ThongKe>
	implements ModelWrapper<ThongKe>, ThongKe {

	public ThongKeWrapper(ThongKe thongKe) {
		super(thongKe);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("maCoSo", getMaCoSo());
		attributes.put("nam", getNam());
		attributes.put("thang", getThang());
		attributes.put("tongHoSo", getTongHoSo());
		attributes.put("tienTongChi", getTienTongChi());
		attributes.put("tienBH", getTienBH());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String maCoSo = (String)attributes.get("maCoSo");

		if (maCoSo != null) {
			setMaCoSo(maCoSo);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer thang = (Integer)attributes.get("thang");

		if (thang != null) {
			setThang(thang);
		}

		Long tongHoSo = (Long)attributes.get("tongHoSo");

		if (tongHoSo != null) {
			setTongHoSo(tongHoSo);
		}

		Double tienTongChi = (Double)attributes.get("tienTongChi");

		if (tienTongChi != null) {
			setTienTongChi(tienTongChi);
		}

		Double tienBH = (Double)attributes.get("tienBH");

		if (tienBH != null) {
			setTienBH(tienBH);
		}
	}

	/**
	 * Returns the ID of this thong ke.
	 *
	 * @return the ID of this thong ke
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the ma co so of this thong ke.
	 *
	 * @return the ma co so of this thong ke
	 */
	@Override
	public String getMaCoSo() {
		return model.getMaCoSo();
	}

	/**
	 * Returns the nam of this thong ke.
	 *
	 * @return the nam of this thong ke
	 */
	@Override
	public int getNam() {
		return model.getNam();
	}

	/**
	 * Returns the primary key of this thong ke.
	 *
	 * @return the primary key of this thong ke
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the thang of this thong ke.
	 *
	 * @return the thang of this thong ke
	 */
	@Override
	public int getThang() {
		return model.getThang();
	}

	/**
	 * Returns the tien bh of this thong ke.
	 *
	 * @return the tien bh of this thong ke
	 */
	@Override
	public double getTienBH() {
		return model.getTienBH();
	}

	/**
	 * Returns the tien tong chi of this thong ke.
	 *
	 * @return the tien tong chi of this thong ke
	 */
	@Override
	public double getTienTongChi() {
		return model.getTienTongChi();
	}

	/**
	 * Returns the tong ho so of this thong ke.
	 *
	 * @return the tong ho so of this thong ke
	 */
	@Override
	public long getTongHoSo() {
		return model.getTongHoSo();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the ID of this thong ke.
	 *
	 * @param id the ID of this thong ke
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the ma co so of this thong ke.
	 *
	 * @param maCoSo the ma co so of this thong ke
	 */
	@Override
	public void setMaCoSo(String maCoSo) {
		model.setMaCoSo(maCoSo);
	}

	/**
	 * Sets the nam of this thong ke.
	 *
	 * @param nam the nam of this thong ke
	 */
	@Override
	public void setNam(int nam) {
		model.setNam(nam);
	}

	/**
	 * Sets the primary key of this thong ke.
	 *
	 * @param primaryKey the primary key of this thong ke
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the thang of this thong ke.
	 *
	 * @param thang the thang of this thong ke
	 */
	@Override
	public void setThang(int thang) {
		model.setThang(thang);
	}

	/**
	 * Sets the tien bh of this thong ke.
	 *
	 * @param tienBH the tien bh of this thong ke
	 */
	@Override
	public void setTienBH(double tienBH) {
		model.setTienBH(tienBH);
	}

	/**
	 * Sets the tien tong chi of this thong ke.
	 *
	 * @param tienTongChi the tien tong chi of this thong ke
	 */
	@Override
	public void setTienTongChi(double tienTongChi) {
		model.setTienTongChi(tienTongChi);
	}

	/**
	 * Sets the tong ho so of this thong ke.
	 *
	 * @param tongHoSo the tong ho so of this thong ke
	 */
	@Override
	public void setTongHoSo(long tongHoSo) {
		model.setTongHoSo(tongHoSo);
	}

	@Override
	protected ThongKeWrapper wrap(ThongKe thongKe) {
		return new ThongKeWrapper(thongKe);
	}

}