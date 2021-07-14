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
 * This class is a wrapper for {@link DashboardChiPhiThanhPhan}.
 * </p>
 *
 * @author SON
 * @see DashboardChiPhiThanhPhan
 * @generated
 */
public class DashboardChiPhiThanhPhanWrapper
	extends BaseModelWrapper<DashboardChiPhiThanhPhan>
	implements DashboardChiPhiThanhPhan,
			   ModelWrapper<DashboardChiPhiThanhPhan> {

	public DashboardChiPhiThanhPhanWrapper(
		DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan) {

		super(dashboardChiPhiThanhPhan);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("mucBc", getMucBc());
		attributes.put("nam", getNam());
		attributes.put("orgId", getOrgId());
		attributes.put("orgName", getOrgName());
		attributes.put("phi", getPhi());
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

		Double phi = (Double)attributes.get("phi");

		if (phi != null) {
			setPhi(phi);
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
	 * Returns the dinh suat of this dashboard chi phi thanh phan.
	 *
	 * @return the dinh suat of this dashboard chi phi thanh phan
	 */
	@Override
	public double getDinhSuat() {
		return model.getDinhSuat();
	}

	/**
	 * Returns the drg of this dashboard chi phi thanh phan.
	 *
	 * @return the drg of this dashboard chi phi thanh phan
	 */
	@Override
	public double getDrg() {
		return model.getDrg();
	}

	/**
	 * Returns the ID of this dashboard chi phi thanh phan.
	 *
	 * @return the ID of this dashboard chi phi thanh phan
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the muc bc of this dashboard chi phi thanh phan.
	 *
	 * @return the muc bc of this dashboard chi phi thanh phan
	 */
	@Override
	public int getMucBc() {
		return model.getMucBc();
	}

	/**
	 * Returns the nam of this dashboard chi phi thanh phan.
	 *
	 * @return the nam of this dashboard chi phi thanh phan
	 */
	@Override
	public int getNam() {
		return model.getNam();
	}

	/**
	 * Returns the org ID of this dashboard chi phi thanh phan.
	 *
	 * @return the org ID of this dashboard chi phi thanh phan
	 */
	@Override
	public long getOrgId() {
		return model.getOrgId();
	}

	/**
	 * Returns the org name of this dashboard chi phi thanh phan.
	 *
	 * @return the org name of this dashboard chi phi thanh phan
	 */
	@Override
	public String getOrgName() {
		return model.getOrgName();
	}

	/**
	 * Returns the phi of this dashboard chi phi thanh phan.
	 *
	 * @return the phi of this dashboard chi phi thanh phan
	 */
	@Override
	public double getPhi() {
		return model.getPhi();
	}

	/**
	 * Returns the primary key of this dashboard chi phi thanh phan.
	 *
	 * @return the primary key of this dashboard chi phi thanh phan
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the dinh suat of this dashboard chi phi thanh phan.
	 *
	 * @param dinhSuat the dinh suat of this dashboard chi phi thanh phan
	 */
	@Override
	public void setDinhSuat(double dinhSuat) {
		model.setDinhSuat(dinhSuat);
	}

	/**
	 * Sets the drg of this dashboard chi phi thanh phan.
	 *
	 * @param drg the drg of this dashboard chi phi thanh phan
	 */
	@Override
	public void setDrg(double drg) {
		model.setDrg(drg);
	}

	/**
	 * Sets the ID of this dashboard chi phi thanh phan.
	 *
	 * @param id the ID of this dashboard chi phi thanh phan
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the muc bc of this dashboard chi phi thanh phan.
	 *
	 * @param mucBc the muc bc of this dashboard chi phi thanh phan
	 */
	@Override
	public void setMucBc(int mucBc) {
		model.setMucBc(mucBc);
	}

	/**
	 * Sets the nam of this dashboard chi phi thanh phan.
	 *
	 * @param nam the nam of this dashboard chi phi thanh phan
	 */
	@Override
	public void setNam(int nam) {
		model.setNam(nam);
	}

	/**
	 * Sets the org ID of this dashboard chi phi thanh phan.
	 *
	 * @param orgId the org ID of this dashboard chi phi thanh phan
	 */
	@Override
	public void setOrgId(long orgId) {
		model.setOrgId(orgId);
	}

	/**
	 * Sets the org name of this dashboard chi phi thanh phan.
	 *
	 * @param orgName the org name of this dashboard chi phi thanh phan
	 */
	@Override
	public void setOrgName(String orgName) {
		model.setOrgName(orgName);
	}

	/**
	 * Sets the phi of this dashboard chi phi thanh phan.
	 *
	 * @param phi the phi of this dashboard chi phi thanh phan
	 */
	@Override
	public void setPhi(double phi) {
		model.setPhi(phi);
	}

	/**
	 * Sets the primary key of this dashboard chi phi thanh phan.
	 *
	 * @param primaryKey the primary key of this dashboard chi phi thanh phan
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected DashboardChiPhiThanhPhanWrapper wrap(
		DashboardChiPhiThanhPhan dashboardChiPhiThanhPhan) {

		return new DashboardChiPhiThanhPhanWrapper(dashboardChiPhiThanhPhan);
	}

}