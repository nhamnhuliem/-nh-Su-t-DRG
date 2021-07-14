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
 * This class is a wrapper for {@link DashboardCMI}.
 * </p>
 *
 * @author SON
 * @see DashboardCMI
 * @generated
 */
public class DashboardCMIWrapper
	extends BaseModelWrapper<DashboardCMI>
	implements DashboardCMI, ModelWrapper<DashboardCMI> {

	public DashboardCMIWrapper(DashboardCMI dashboardCMI) {
		super(dashboardCMI);
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
		attributes.put("cmiThap", getCmiThap());
		attributes.put("cmiCao", getCmiCao());
		attributes.put("cmiTrungBinh", getCmiTrungBinh());

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

		Double cmiThap = (Double)attributes.get("cmiThap");

		if (cmiThap != null) {
			setCmiThap(cmiThap);
		}

		Double cmiCao = (Double)attributes.get("cmiCao");

		if (cmiCao != null) {
			setCmiCao(cmiCao);
		}

		Double cmiTrungBinh = (Double)attributes.get("cmiTrungBinh");

		if (cmiTrungBinh != null) {
			setCmiTrungBinh(cmiTrungBinh);
		}
	}

	/**
	 * Returns the cmi cao of this dashboard cmi.
	 *
	 * @return the cmi cao of this dashboard cmi
	 */
	@Override
	public double getCmiCao() {
		return model.getCmiCao();
	}

	/**
	 * Returns the cmi thap of this dashboard cmi.
	 *
	 * @return the cmi thap of this dashboard cmi
	 */
	@Override
	public double getCmiThap() {
		return model.getCmiThap();
	}

	/**
	 * Returns the cmi trung binh of this dashboard cmi.
	 *
	 * @return the cmi trung binh of this dashboard cmi
	 */
	@Override
	public double getCmiTrungBinh() {
		return model.getCmiTrungBinh();
	}

	/**
	 * Returns the ID of this dashboard cmi.
	 *
	 * @return the ID of this dashboard cmi
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the muc bc of this dashboard cmi.
	 *
	 * @return the muc bc of this dashboard cmi
	 */
	@Override
	public int getMucBc() {
		return model.getMucBc();
	}

	/**
	 * Returns the nam of this dashboard cmi.
	 *
	 * @return the nam of this dashboard cmi
	 */
	@Override
	public int getNam() {
		return model.getNam();
	}

	/**
	 * Returns the org ID of this dashboard cmi.
	 *
	 * @return the org ID of this dashboard cmi
	 */
	@Override
	public long getOrgId() {
		return model.getOrgId();
	}

	/**
	 * Returns the org name of this dashboard cmi.
	 *
	 * @return the org name of this dashboard cmi
	 */
	@Override
	public String getOrgName() {
		return model.getOrgName();
	}

	/**
	 * Returns the primary key of this dashboard cmi.
	 *
	 * @return the primary key of this dashboard cmi
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the thang of this dashboard cmi.
	 *
	 * @return the thang of this dashboard cmi
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
	 * Sets the cmi cao of this dashboard cmi.
	 *
	 * @param cmiCao the cmi cao of this dashboard cmi
	 */
	@Override
	public void setCmiCao(double cmiCao) {
		model.setCmiCao(cmiCao);
	}

	/**
	 * Sets the cmi thap of this dashboard cmi.
	 *
	 * @param cmiThap the cmi thap of this dashboard cmi
	 */
	@Override
	public void setCmiThap(double cmiThap) {
		model.setCmiThap(cmiThap);
	}

	/**
	 * Sets the cmi trung binh of this dashboard cmi.
	 *
	 * @param cmiTrungBinh the cmi trung binh of this dashboard cmi
	 */
	@Override
	public void setCmiTrungBinh(double cmiTrungBinh) {
		model.setCmiTrungBinh(cmiTrungBinh);
	}

	/**
	 * Sets the ID of this dashboard cmi.
	 *
	 * @param id the ID of this dashboard cmi
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the muc bc of this dashboard cmi.
	 *
	 * @param mucBc the muc bc of this dashboard cmi
	 */
	@Override
	public void setMucBc(int mucBc) {
		model.setMucBc(mucBc);
	}

	/**
	 * Sets the nam of this dashboard cmi.
	 *
	 * @param nam the nam of this dashboard cmi
	 */
	@Override
	public void setNam(int nam) {
		model.setNam(nam);
	}

	/**
	 * Sets the org ID of this dashboard cmi.
	 *
	 * @param orgId the org ID of this dashboard cmi
	 */
	@Override
	public void setOrgId(long orgId) {
		model.setOrgId(orgId);
	}

	/**
	 * Sets the org name of this dashboard cmi.
	 *
	 * @param orgName the org name of this dashboard cmi
	 */
	@Override
	public void setOrgName(String orgName) {
		model.setOrgName(orgName);
	}

	/**
	 * Sets the primary key of this dashboard cmi.
	 *
	 * @param primaryKey the primary key of this dashboard cmi
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the thang of this dashboard cmi.
	 *
	 * @param thang the thang of this dashboard cmi
	 */
	@Override
	public void setThang(int thang) {
		model.setThang(thang);
	}

	@Override
	protected DashboardCMIWrapper wrap(DashboardCMI dashboardCMI) {
		return new DashboardCMIWrapper(dashboardCMI);
	}

}