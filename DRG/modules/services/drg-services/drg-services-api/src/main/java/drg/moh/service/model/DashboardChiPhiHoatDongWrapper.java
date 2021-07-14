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
 * This class is a wrapper for {@link DashboardChiPhiHoatDong}.
 * </p>
 *
 * @author SON
 * @see DashboardChiPhiHoatDong
 * @generated
 */
public class DashboardChiPhiHoatDongWrapper
	extends BaseModelWrapper<DashboardChiPhiHoatDong>
	implements DashboardChiPhiHoatDong, ModelWrapper<DashboardChiPhiHoatDong> {

	public DashboardChiPhiHoatDongWrapper(
		DashboardChiPhiHoatDong dashboardChiPhiHoatDong) {

		super(dashboardChiPhiHoatDong);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mucBc", getMucBc());
		attributes.put("nam", getNam());
		attributes.put("orgId", getOrgId());
		attributes.put("orgName", getOrgName());
		attributes.put("thanhPhanId", getThanhPhanId());
		attributes.put("thanhPhanMa", getThanhPhanMa());
		attributes.put("thanhPhanTen", getThanhPhanTen());
		attributes.put("drgPhiDv", getDrgPhiDv());
		attributes.put("drgDinhSuat", getDrgDinhSuat());
		attributes.put("drgValues", getDrgValues());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer mucBc = (Integer)attributes.get("mucBc");

		if (mucBc != null) {
			setMucBc(mucBc);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Long orgId = (Long)attributes.get("orgId");

		if (orgId != null) {
			setOrgId(orgId);
		}

		String orgName = (String)attributes.get("orgName");

		if (orgName != null) {
			setOrgName(orgName);
		}

		String thanhPhanId = (String)attributes.get("thanhPhanId");

		if (thanhPhanId != null) {
			setThanhPhanId(thanhPhanId);
		}

		String thanhPhanMa = (String)attributes.get("thanhPhanMa");

		if (thanhPhanMa != null) {
			setThanhPhanMa(thanhPhanMa);
		}

		String thanhPhanTen = (String)attributes.get("thanhPhanTen");

		if (thanhPhanTen != null) {
			setThanhPhanTen(thanhPhanTen);
		}

		Double drgPhiDv = (Double)attributes.get("drgPhiDv");

		if (drgPhiDv != null) {
			setDrgPhiDv(drgPhiDv);
		}

		Double drgDinhSuat = (Double)attributes.get("drgDinhSuat");

		if (drgDinhSuat != null) {
			setDrgDinhSuat(drgDinhSuat);
		}

		Double drgValues = (Double)attributes.get("drgValues");

		if (drgValues != null) {
			setDrgValues(drgValues);
		}
	}

	/**
	 * Returns the drg dinh suat of this dashboard chi phi hoat dong.
	 *
	 * @return the drg dinh suat of this dashboard chi phi hoat dong
	 */
	@Override
	public double getDrgDinhSuat() {
		return model.getDrgDinhSuat();
	}

	/**
	 * Returns the drg phi dv of this dashboard chi phi hoat dong.
	 *
	 * @return the drg phi dv of this dashboard chi phi hoat dong
	 */
	@Override
	public double getDrgPhiDv() {
		return model.getDrgPhiDv();
	}

	/**
	 * Returns the drg values of this dashboard chi phi hoat dong.
	 *
	 * @return the drg values of this dashboard chi phi hoat dong
	 */
	@Override
	public double getDrgValues() {
		return model.getDrgValues();
	}

	/**
	 * Returns the ID of this dashboard chi phi hoat dong.
	 *
	 * @return the ID of this dashboard chi phi hoat dong
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the muc bc of this dashboard chi phi hoat dong.
	 *
	 * @return the muc bc of this dashboard chi phi hoat dong
	 */
	@Override
	public int getMucBc() {
		return model.getMucBc();
	}

	/**
	 * Returns the nam of this dashboard chi phi hoat dong.
	 *
	 * @return the nam of this dashboard chi phi hoat dong
	 */
	@Override
	public int getNam() {
		return model.getNam();
	}

	/**
	 * Returns the org ID of this dashboard chi phi hoat dong.
	 *
	 * @return the org ID of this dashboard chi phi hoat dong
	 */
	@Override
	public long getOrgId() {
		return model.getOrgId();
	}

	/**
	 * Returns the org name of this dashboard chi phi hoat dong.
	 *
	 * @return the org name of this dashboard chi phi hoat dong
	 */
	@Override
	public String getOrgName() {
		return model.getOrgName();
	}

	/**
	 * Returns the primary key of this dashboard chi phi hoat dong.
	 *
	 * @return the primary key of this dashboard chi phi hoat dong
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the thanh phan ID of this dashboard chi phi hoat dong.
	 *
	 * @return the thanh phan ID of this dashboard chi phi hoat dong
	 */
	@Override
	public String getThanhPhanId() {
		return model.getThanhPhanId();
	}

	/**
	 * Returns the thanh phan ma of this dashboard chi phi hoat dong.
	 *
	 * @return the thanh phan ma of this dashboard chi phi hoat dong
	 */
	@Override
	public String getThanhPhanMa() {
		return model.getThanhPhanMa();
	}

	/**
	 * Returns the thanh phan ten of this dashboard chi phi hoat dong.
	 *
	 * @return the thanh phan ten of this dashboard chi phi hoat dong
	 */
	@Override
	public String getThanhPhanTen() {
		return model.getThanhPhanTen();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the drg dinh suat of this dashboard chi phi hoat dong.
	 *
	 * @param drgDinhSuat the drg dinh suat of this dashboard chi phi hoat dong
	 */
	@Override
	public void setDrgDinhSuat(double drgDinhSuat) {
		model.setDrgDinhSuat(drgDinhSuat);
	}

	/**
	 * Sets the drg phi dv of this dashboard chi phi hoat dong.
	 *
	 * @param drgPhiDv the drg phi dv of this dashboard chi phi hoat dong
	 */
	@Override
	public void setDrgPhiDv(double drgPhiDv) {
		model.setDrgPhiDv(drgPhiDv);
	}

	/**
	 * Sets the drg values of this dashboard chi phi hoat dong.
	 *
	 * @param drgValues the drg values of this dashboard chi phi hoat dong
	 */
	@Override
	public void setDrgValues(double drgValues) {
		model.setDrgValues(drgValues);
	}

	/**
	 * Sets the ID of this dashboard chi phi hoat dong.
	 *
	 * @param id the ID of this dashboard chi phi hoat dong
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the muc bc of this dashboard chi phi hoat dong.
	 *
	 * @param mucBc the muc bc of this dashboard chi phi hoat dong
	 */
	@Override
	public void setMucBc(int mucBc) {
		model.setMucBc(mucBc);
	}

	/**
	 * Sets the nam of this dashboard chi phi hoat dong.
	 *
	 * @param nam the nam of this dashboard chi phi hoat dong
	 */
	@Override
	public void setNam(int nam) {
		model.setNam(nam);
	}

	/**
	 * Sets the org ID of this dashboard chi phi hoat dong.
	 *
	 * @param orgId the org ID of this dashboard chi phi hoat dong
	 */
	@Override
	public void setOrgId(long orgId) {
		model.setOrgId(orgId);
	}

	/**
	 * Sets the org name of this dashboard chi phi hoat dong.
	 *
	 * @param orgName the org name of this dashboard chi phi hoat dong
	 */
	@Override
	public void setOrgName(String orgName) {
		model.setOrgName(orgName);
	}

	/**
	 * Sets the primary key of this dashboard chi phi hoat dong.
	 *
	 * @param primaryKey the primary key of this dashboard chi phi hoat dong
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the thanh phan ID of this dashboard chi phi hoat dong.
	 *
	 * @param thanhPhanId the thanh phan ID of this dashboard chi phi hoat dong
	 */
	@Override
	public void setThanhPhanId(String thanhPhanId) {
		model.setThanhPhanId(thanhPhanId);
	}

	/**
	 * Sets the thanh phan ma of this dashboard chi phi hoat dong.
	 *
	 * @param thanhPhanMa the thanh phan ma of this dashboard chi phi hoat dong
	 */
	@Override
	public void setThanhPhanMa(String thanhPhanMa) {
		model.setThanhPhanMa(thanhPhanMa);
	}

	/**
	 * Sets the thanh phan ten of this dashboard chi phi hoat dong.
	 *
	 * @param thanhPhanTen the thanh phan ten of this dashboard chi phi hoat dong
	 */
	@Override
	public void setThanhPhanTen(String thanhPhanTen) {
		model.setThanhPhanTen(thanhPhanTen);
	}

	@Override
	protected DashboardChiPhiHoatDongWrapper wrap(
		DashboardChiPhiHoatDong dashboardChiPhiHoatDong) {

		return new DashboardChiPhiHoatDongWrapper(dashboardChiPhiHoatDong);
	}

}