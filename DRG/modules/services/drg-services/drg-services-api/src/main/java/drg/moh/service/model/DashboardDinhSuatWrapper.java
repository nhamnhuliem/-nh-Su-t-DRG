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
 * This class is a wrapper for {@link DashboardDinhSuat}.
 * </p>
 *
 * @author SON
 * @see DashboardDinhSuat
 * @generated
 */
public class DashboardDinhSuatWrapper
	extends BaseModelWrapper<DashboardDinhSuat>
	implements DashboardDinhSuat, ModelWrapper<DashboardDinhSuat> {

	public DashboardDinhSuatWrapper(DashboardDinhSuat dashboardDinhSuat) {
		super(dashboardDinhSuat);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mucBc", getMucBc());
		attributes.put("nam", getNam());
		attributes.put("thang", getThang());
		attributes.put("orgId", getOrgId());
		attributes.put("orgName", getOrgName());
		attributes.put("dinhSuatTieuChuan", getDinhSuatTieuChuan());
		attributes.put("dinhSuatThucTe", getDinhSuatThucTe());
		attributes.put("dinhSuatBenhNhan", getDinhSuatBenhNhan());

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

		Integer thang = (Integer)attributes.get("thang");

		if (thang != null) {
			setThang(thang);
		}

		Long orgId = (Long)attributes.get("orgId");

		if (orgId != null) {
			setOrgId(orgId);
		}

		String orgName = (String)attributes.get("orgName");

		if (orgName != null) {
			setOrgName(orgName);
		}

		Double dinhSuatTieuChuan = (Double)attributes.get("dinhSuatTieuChuan");

		if (dinhSuatTieuChuan != null) {
			setDinhSuatTieuChuan(dinhSuatTieuChuan);
		}

		Double dinhSuatThucTe = (Double)attributes.get("dinhSuatThucTe");

		if (dinhSuatThucTe != null) {
			setDinhSuatThucTe(dinhSuatThucTe);
		}

		Double dinhSuatBenhNhan = (Double)attributes.get("dinhSuatBenhNhan");

		if (dinhSuatBenhNhan != null) {
			setDinhSuatBenhNhan(dinhSuatBenhNhan);
		}
	}

	/**
	 * Returns the dinh suat benh nhan of this dashboard dinh suat.
	 *
	 * @return the dinh suat benh nhan of this dashboard dinh suat
	 */
	@Override
	public double getDinhSuatBenhNhan() {
		return model.getDinhSuatBenhNhan();
	}

	/**
	 * Returns the dinh suat thuc te of this dashboard dinh suat.
	 *
	 * @return the dinh suat thuc te of this dashboard dinh suat
	 */
	@Override
	public double getDinhSuatThucTe() {
		return model.getDinhSuatThucTe();
	}

	/**
	 * Returns the dinh suat tieu chuan of this dashboard dinh suat.
	 *
	 * @return the dinh suat tieu chuan of this dashboard dinh suat
	 */
	@Override
	public double getDinhSuatTieuChuan() {
		return model.getDinhSuatTieuChuan();
	}

	/**
	 * Returns the ID of this dashboard dinh suat.
	 *
	 * @return the ID of this dashboard dinh suat
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the muc bc of this dashboard dinh suat.
	 *
	 * @return the muc bc of this dashboard dinh suat
	 */
	@Override
	public int getMucBc() {
		return model.getMucBc();
	}

	/**
	 * Returns the nam of this dashboard dinh suat.
	 *
	 * @return the nam of this dashboard dinh suat
	 */
	@Override
	public int getNam() {
		return model.getNam();
	}

	/**
	 * Returns the org ID of this dashboard dinh suat.
	 *
	 * @return the org ID of this dashboard dinh suat
	 */
	@Override
	public long getOrgId() {
		return model.getOrgId();
	}

	/**
	 * Returns the org name of this dashboard dinh suat.
	 *
	 * @return the org name of this dashboard dinh suat
	 */
	@Override
	public String getOrgName() {
		return model.getOrgName();
	}

	/**
	 * Returns the primary key of this dashboard dinh suat.
	 *
	 * @return the primary key of this dashboard dinh suat
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the thang of this dashboard dinh suat.
	 *
	 * @return the thang of this dashboard dinh suat
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
	 * Sets the dinh suat benh nhan of this dashboard dinh suat.
	 *
	 * @param dinhSuatBenhNhan the dinh suat benh nhan of this dashboard dinh suat
	 */
	@Override
	public void setDinhSuatBenhNhan(double dinhSuatBenhNhan) {
		model.setDinhSuatBenhNhan(dinhSuatBenhNhan);
	}

	/**
	 * Sets the dinh suat thuc te of this dashboard dinh suat.
	 *
	 * @param dinhSuatThucTe the dinh suat thuc te of this dashboard dinh suat
	 */
	@Override
	public void setDinhSuatThucTe(double dinhSuatThucTe) {
		model.setDinhSuatThucTe(dinhSuatThucTe);
	}

	/**
	 * Sets the dinh suat tieu chuan of this dashboard dinh suat.
	 *
	 * @param dinhSuatTieuChuan the dinh suat tieu chuan of this dashboard dinh suat
	 */
	@Override
	public void setDinhSuatTieuChuan(double dinhSuatTieuChuan) {
		model.setDinhSuatTieuChuan(dinhSuatTieuChuan);
	}

	/**
	 * Sets the ID of this dashboard dinh suat.
	 *
	 * @param id the ID of this dashboard dinh suat
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the muc bc of this dashboard dinh suat.
	 *
	 * @param mucBc the muc bc of this dashboard dinh suat
	 */
	@Override
	public void setMucBc(int mucBc) {
		model.setMucBc(mucBc);
	}

	/**
	 * Sets the nam of this dashboard dinh suat.
	 *
	 * @param nam the nam of this dashboard dinh suat
	 */
	@Override
	public void setNam(int nam) {
		model.setNam(nam);
	}

	/**
	 * Sets the org ID of this dashboard dinh suat.
	 *
	 * @param orgId the org ID of this dashboard dinh suat
	 */
	@Override
	public void setOrgId(long orgId) {
		model.setOrgId(orgId);
	}

	/**
	 * Sets the org name of this dashboard dinh suat.
	 *
	 * @param orgName the org name of this dashboard dinh suat
	 */
	@Override
	public void setOrgName(String orgName) {
		model.setOrgName(orgName);
	}

	/**
	 * Sets the primary key of this dashboard dinh suat.
	 *
	 * @param primaryKey the primary key of this dashboard dinh suat
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the thang of this dashboard dinh suat.
	 *
	 * @param thang the thang of this dashboard dinh suat
	 */
	@Override
	public void setThang(int thang) {
		model.setThang(thang);
	}

	@Override
	protected DashboardDinhSuatWrapper wrap(
		DashboardDinhSuat dashboardDinhSuat) {

		return new DashboardDinhSuatWrapper(dashboardDinhSuat);
	}

}