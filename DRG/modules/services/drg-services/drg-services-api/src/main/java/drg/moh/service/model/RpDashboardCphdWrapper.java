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
 * This class is a wrapper for {@link RpDashboardCphd}.
 * </p>
 *
 * @author SON
 * @see RpDashboardCphd
 * @generated
 */
public class RpDashboardCphdWrapper
	extends BaseModelWrapper<RpDashboardCphd>
	implements ModelWrapper<RpDashboardCphd>, RpDashboardCphd {

	public RpDashboardCphdWrapper(RpDashboardCphd rpDashboardCphd) {
		super(rpDashboardCphd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("tenTinh", getTenTinh());
		attributes.put("chiPhi", getChiPhi());
		attributes.put("dinhSuat", getDinhSuat());
		attributes.put("drg", getDrg());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String tenTinh = (String)attributes.get("tenTinh");

		if (tenTinh != null) {
			setTenTinh(tenTinh);
		}

		Double chiPhi = (Double)attributes.get("chiPhi");

		if (chiPhi != null) {
			setChiPhi(chiPhi);
		}

		Double dinhSuat = (Double)attributes.get("dinhSuat");

		if (dinhSuat != null) {
			setDinhSuat(dinhSuat);
		}

		Double drg = (Double)attributes.get("drg");

		if (drg != null) {
			setDrg(drg);
		}
	}

	/**
	 * Returns the chi phi of this rp dashboard cphd.
	 *
	 * @return the chi phi of this rp dashboard cphd
	 */
	@Override
	public double getChiPhi() {
		return model.getChiPhi();
	}

	/**
	 * Returns the dinh suat of this rp dashboard cphd.
	 *
	 * @return the dinh suat of this rp dashboard cphd
	 */
	@Override
	public double getDinhSuat() {
		return model.getDinhSuat();
	}

	/**
	 * Returns the drg of this rp dashboard cphd.
	 *
	 * @return the drg of this rp dashboard cphd
	 */
	@Override
	public double getDrg() {
		return model.getDrg();
	}

	/**
	 * Returns the ID of this rp dashboard cphd.
	 *
	 * @return the ID of this rp dashboard cphd
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this rp dashboard cphd.
	 *
	 * @return the primary key of this rp dashboard cphd
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the ten tinh of this rp dashboard cphd.
	 *
	 * @return the ten tinh of this rp dashboard cphd
	 */
	@Override
	public String getTenTinh() {
		return model.getTenTinh();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the chi phi of this rp dashboard cphd.
	 *
	 * @param chiPhi the chi phi of this rp dashboard cphd
	 */
	@Override
	public void setChiPhi(double chiPhi) {
		model.setChiPhi(chiPhi);
	}

	/**
	 * Sets the dinh suat of this rp dashboard cphd.
	 *
	 * @param dinhSuat the dinh suat of this rp dashboard cphd
	 */
	@Override
	public void setDinhSuat(double dinhSuat) {
		model.setDinhSuat(dinhSuat);
	}

	/**
	 * Sets the drg of this rp dashboard cphd.
	 *
	 * @param drg the drg of this rp dashboard cphd
	 */
	@Override
	public void setDrg(double drg) {
		model.setDrg(drg);
	}

	/**
	 * Sets the ID of this rp dashboard cphd.
	 *
	 * @param id the ID of this rp dashboard cphd
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the primary key of this rp dashboard cphd.
	 *
	 * @param primaryKey the primary key of this rp dashboard cphd
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the ten tinh of this rp dashboard cphd.
	 *
	 * @param tenTinh the ten tinh of this rp dashboard cphd
	 */
	@Override
	public void setTenTinh(String tenTinh) {
		model.setTenTinh(tenTinh);
	}

	@Override
	protected RpDashboardCphdWrapper wrap(RpDashboardCphd rpDashboardCphd) {
		return new RpDashboardCphdWrapper(rpDashboardCphd);
	}

}