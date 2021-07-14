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
 * This class is a wrapper for {@link RpDashboardDstcChiTiet}.
 * </p>
 *
 * @author SON
 * @see RpDashboardDstcChiTiet
 * @generated
 */
public class RpDashboardDstcChiTietWrapper
	extends BaseModelWrapper<RpDashboardDstcChiTiet>
	implements ModelWrapper<RpDashboardDstcChiTiet>, RpDashboardDstcChiTiet {

	public RpDashboardDstcChiTietWrapper(
		RpDashboardDstcChiTiet rpDashboardDstcChiTiet) {

		super(rpDashboardDstcChiTiet);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("tenTinh", getTenTinh());
		attributes.put("dinhSuat", getDinhSuat());

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

		Integer dinhSuat = (Integer)attributes.get("dinhSuat");

		if (dinhSuat != null) {
			setDinhSuat(dinhSuat);
		}
	}

	/**
	 * Returns the dinh suat of this rp dashboard dstc chi tiet.
	 *
	 * @return the dinh suat of this rp dashboard dstc chi tiet
	 */
	@Override
	public int getDinhSuat() {
		return model.getDinhSuat();
	}

	/**
	 * Returns the ID of this rp dashboard dstc chi tiet.
	 *
	 * @return the ID of this rp dashboard dstc chi tiet
	 */
	@Override
	public String getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this rp dashboard dstc chi tiet.
	 *
	 * @return the primary key of this rp dashboard dstc chi tiet
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the ten tinh of this rp dashboard dstc chi tiet.
	 *
	 * @return the ten tinh of this rp dashboard dstc chi tiet
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
	 * Sets the dinh suat of this rp dashboard dstc chi tiet.
	 *
	 * @param dinhSuat the dinh suat of this rp dashboard dstc chi tiet
	 */
	@Override
	public void setDinhSuat(int dinhSuat) {
		model.setDinhSuat(dinhSuat);
	}

	/**
	 * Sets the ID of this rp dashboard dstc chi tiet.
	 *
	 * @param id the ID of this rp dashboard dstc chi tiet
	 */
	@Override
	public void setId(String id) {
		model.setId(id);
	}

	/**
	 * Sets the primary key of this rp dashboard dstc chi tiet.
	 *
	 * @param primaryKey the primary key of this rp dashboard dstc chi tiet
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the ten tinh of this rp dashboard dstc chi tiet.
	 *
	 * @param tenTinh the ten tinh of this rp dashboard dstc chi tiet
	 */
	@Override
	public void setTenTinh(String tenTinh) {
		model.setTenTinh(tenTinh);
	}

	@Override
	protected RpDashboardDstcChiTietWrapper wrap(
		RpDashboardDstcChiTiet rpDashboardDstcChiTiet) {

		return new RpDashboardDstcChiTietWrapper(rpDashboardDstcChiTiet);
	}

}