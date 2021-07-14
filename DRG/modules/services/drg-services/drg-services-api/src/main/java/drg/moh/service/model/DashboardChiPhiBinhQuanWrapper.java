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
 * This class is a wrapper for {@link DashboardChiPhiBinhQuan}.
 * </p>
 *
 * @author SON
 * @see DashboardChiPhiBinhQuan
 * @generated
 */
public class DashboardChiPhiBinhQuanWrapper
	extends BaseModelWrapper<DashboardChiPhiBinhQuan>
	implements DashboardChiPhiBinhQuan, ModelWrapper<DashboardChiPhiBinhQuan> {

	public DashboardChiPhiBinhQuanWrapper(
		DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan) {

		super(dashboardChiPhiBinhQuan);
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
		attributes.put("phiBqDichVu", getPhiBqDichVu());
		attributes.put("phiBqBenhVien", getPhiBqBenhVien());

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

		Double phiBqDichVu = (Double)attributes.get("phiBqDichVu");

		if (phiBqDichVu != null) {
			setPhiBqDichVu(phiBqDichVu);
		}

		Double phiBqBenhVien = (Double)attributes.get("phiBqBenhVien");

		if (phiBqBenhVien != null) {
			setPhiBqBenhVien(phiBqBenhVien);
		}
	}

	/**
	 * Returns the ID of this dashboard chi phi binh quan.
	 *
	 * @return the ID of this dashboard chi phi binh quan
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the muc bc of this dashboard chi phi binh quan.
	 *
	 * @return the muc bc of this dashboard chi phi binh quan
	 */
	@Override
	public int getMucBc() {
		return model.getMucBc();
	}

	/**
	 * Returns the nam of this dashboard chi phi binh quan.
	 *
	 * @return the nam of this dashboard chi phi binh quan
	 */
	@Override
	public int getNam() {
		return model.getNam();
	}

	/**
	 * Returns the org ID of this dashboard chi phi binh quan.
	 *
	 * @return the org ID of this dashboard chi phi binh quan
	 */
	@Override
	public long getOrgId() {
		return model.getOrgId();
	}

	/**
	 * Returns the org name of this dashboard chi phi binh quan.
	 *
	 * @return the org name of this dashboard chi phi binh quan
	 */
	@Override
	public String getOrgName() {
		return model.getOrgName();
	}

	/**
	 * Returns the phi bq benh vien of this dashboard chi phi binh quan.
	 *
	 * @return the phi bq benh vien of this dashboard chi phi binh quan
	 */
	@Override
	public double getPhiBqBenhVien() {
		return model.getPhiBqBenhVien();
	}

	/**
	 * Returns the phi bq dich vu of this dashboard chi phi binh quan.
	 *
	 * @return the phi bq dich vu of this dashboard chi phi binh quan
	 */
	@Override
	public double getPhiBqDichVu() {
		return model.getPhiBqDichVu();
	}

	/**
	 * Returns the primary key of this dashboard chi phi binh quan.
	 *
	 * @return the primary key of this dashboard chi phi binh quan
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the thang of this dashboard chi phi binh quan.
	 *
	 * @return the thang of this dashboard chi phi binh quan
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
	 * Sets the ID of this dashboard chi phi binh quan.
	 *
	 * @param id the ID of this dashboard chi phi binh quan
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the muc bc of this dashboard chi phi binh quan.
	 *
	 * @param mucBc the muc bc of this dashboard chi phi binh quan
	 */
	@Override
	public void setMucBc(int mucBc) {
		model.setMucBc(mucBc);
	}

	/**
	 * Sets the nam of this dashboard chi phi binh quan.
	 *
	 * @param nam the nam of this dashboard chi phi binh quan
	 */
	@Override
	public void setNam(int nam) {
		model.setNam(nam);
	}

	/**
	 * Sets the org ID of this dashboard chi phi binh quan.
	 *
	 * @param orgId the org ID of this dashboard chi phi binh quan
	 */
	@Override
	public void setOrgId(long orgId) {
		model.setOrgId(orgId);
	}

	/**
	 * Sets the org name of this dashboard chi phi binh quan.
	 *
	 * @param orgName the org name of this dashboard chi phi binh quan
	 */
	@Override
	public void setOrgName(String orgName) {
		model.setOrgName(orgName);
	}

	/**
	 * Sets the phi bq benh vien of this dashboard chi phi binh quan.
	 *
	 * @param phiBqBenhVien the phi bq benh vien of this dashboard chi phi binh quan
	 */
	@Override
	public void setPhiBqBenhVien(double phiBqBenhVien) {
		model.setPhiBqBenhVien(phiBqBenhVien);
	}

	/**
	 * Sets the phi bq dich vu of this dashboard chi phi binh quan.
	 *
	 * @param phiBqDichVu the phi bq dich vu of this dashboard chi phi binh quan
	 */
	@Override
	public void setPhiBqDichVu(double phiBqDichVu) {
		model.setPhiBqDichVu(phiBqDichVu);
	}

	/**
	 * Sets the primary key of this dashboard chi phi binh quan.
	 *
	 * @param primaryKey the primary key of this dashboard chi phi binh quan
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the thang of this dashboard chi phi binh quan.
	 *
	 * @param thang the thang of this dashboard chi phi binh quan
	 */
	@Override
	public void setThang(int thang) {
		model.setThang(thang);
	}

	@Override
	protected DashboardChiPhiBinhQuanWrapper wrap(
		DashboardChiPhiBinhQuan dashboardChiPhiBinhQuan) {

		return new DashboardChiPhiBinhQuanWrapper(dashboardChiPhiBinhQuan);
	}

}