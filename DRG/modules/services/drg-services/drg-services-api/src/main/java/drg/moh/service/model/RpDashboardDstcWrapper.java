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
 * This class is a wrapper for {@link RpDashboardDstc}.
 * </p>
 *
 * @author SON
 * @see RpDashboardDstc
 * @generated
 */
public class RpDashboardDstcWrapper
	extends BaseModelWrapper<RpDashboardDstc>
	implements ModelWrapper<RpDashboardDstc>, RpDashboardDstc {

	public RpDashboardDstcWrapper(RpDashboardDstc rpDashboardDstc) {
		super(rpDashboardDstc);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("tenTinh", getTenTinh());
		attributes.put("thang", getThang());
		attributes.put("soLuot", getSoLuot());
		attributes.put("chiPhi", getChiPhi());
		attributes.put("quyDs", getQuyDs());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String id = (String)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String tenTinh = (String)attributes.get("tenTinh");

		if (tenTinh != null) {
			setTenTinh(tenTinh);
		}

		Integer thang = (Integer)attributes.get("thang");

		if (thang != null) {
			setThang(thang);
		}

		Integer soLuot = (Integer)attributes.get("soLuot");

		if (soLuot != null) {
			setSoLuot(soLuot);
		}

		Double chiPhi = (Double)attributes.get("chiPhi");

		if (chiPhi != null) {
			setChiPhi(chiPhi);
		}

		Double quyDs = (Double)attributes.get("quyDs");

		if (quyDs != null) {
			setQuyDs(quyDs);
		}
	}

	/**
	 * Returns the chi phi of this rp dashboard dstc.
	 *
	 * @return the chi phi of this rp dashboard dstc
	 */
	@Override
	public double getChiPhi() {
		return model.getChiPhi();
	}

	/**
	 * Returns the ID of this rp dashboard dstc.
	 *
	 * @return the ID of this rp dashboard dstc
	 */
	@Override
	public String getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this rp dashboard dstc.
	 *
	 * @return the primary key of this rp dashboard dstc
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quy ds of this rp dashboard dstc.
	 *
	 * @return the quy ds of this rp dashboard dstc
	 */
	@Override
	public double getQuyDs() {
		return model.getQuyDs();
	}

	/**
	 * Returns the so luot of this rp dashboard dstc.
	 *
	 * @return the so luot of this rp dashboard dstc
	 */
	@Override
	public int getSoLuot() {
		return model.getSoLuot();
	}

	/**
	 * Returns the ten tinh of this rp dashboard dstc.
	 *
	 * @return the ten tinh of this rp dashboard dstc
	 */
	@Override
	public String getTenTinh() {
		return model.getTenTinh();
	}

	/**
	 * Returns the thang of this rp dashboard dstc.
	 *
	 * @return the thang of this rp dashboard dstc
	 */
	@Override
	public int getThang() {
		return model.getThang();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the chi phi of this rp dashboard dstc.
	 *
	 * @param chiPhi the chi phi of this rp dashboard dstc
	 */
	@Override
	public void setChiPhi(double chiPhi) {
		model.setChiPhi(chiPhi);
	}

	/**
	 * Sets the ID of this rp dashboard dstc.
	 *
	 * @param id the ID of this rp dashboard dstc
	 */
	@Override
	public void setId(String id) {
		model.setId(id);
	}

	/**
	 * Sets the primary key of this rp dashboard dstc.
	 *
	 * @param primaryKey the primary key of this rp dashboard dstc
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quy ds of this rp dashboard dstc.
	 *
	 * @param quyDs the quy ds of this rp dashboard dstc
	 */
	@Override
	public void setQuyDs(double quyDs) {
		model.setQuyDs(quyDs);
	}

	/**
	 * Sets the so luot of this rp dashboard dstc.
	 *
	 * @param soLuot the so luot of this rp dashboard dstc
	 */
	@Override
	public void setSoLuot(int soLuot) {
		model.setSoLuot(soLuot);
	}

	/**
	 * Sets the ten tinh of this rp dashboard dstc.
	 *
	 * @param tenTinh the ten tinh of this rp dashboard dstc
	 */
	@Override
	public void setTenTinh(String tenTinh) {
		model.setTenTinh(tenTinh);
	}

	/**
	 * Sets the thang of this rp dashboard dstc.
	 *
	 * @param thang the thang of this rp dashboard dstc
	 */
	@Override
	public void setThang(int thang) {
		model.setThang(thang);
	}

	@Override
	protected RpDashboardDstcWrapper wrap(RpDashboardDstc rpDashboardDstc) {
		return new RpDashboardDstcWrapper(rpDashboardDstc);
	}

}