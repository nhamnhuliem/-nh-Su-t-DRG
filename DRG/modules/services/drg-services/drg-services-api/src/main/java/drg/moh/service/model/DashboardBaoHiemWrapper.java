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
 * This class is a wrapper for {@link DashboardBaoHiem}.
 * </p>
 *
 * @author SON
 * @see DashboardBaoHiem
 * @generated
 */
public class DashboardBaoHiemWrapper
	extends BaseModelWrapper<DashboardBaoHiem>
	implements DashboardBaoHiem, ModelWrapper<DashboardBaoHiem> {

	public DashboardBaoHiemWrapper(DashboardBaoHiem dashboardBaoHiem) {
		super(dashboardBaoHiem);
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
		attributes.put("drgMa", getDrgMa());
		attributes.put("drgTen", getDrgTen());
		attributes.put("drgValue", getDrgValue());
		attributes.put("drgUp", getDrgUp());
		attributes.put("drgDown", getDrgDown());

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

		String drgMa = (String)attributes.get("drgMa");

		if (drgMa != null) {
			setDrgMa(drgMa);
		}

		String drgTen = (String)attributes.get("drgTen");

		if (drgTen != null) {
			setDrgTen(drgTen);
		}

		Double drgValue = (Double)attributes.get("drgValue");

		if (drgValue != null) {
			setDrgValue(drgValue);
		}

		Double drgUp = (Double)attributes.get("drgUp");

		if (drgUp != null) {
			setDrgUp(drgUp);
		}

		Double drgDown = (Double)attributes.get("drgDown");

		if (drgDown != null) {
			setDrgDown(drgDown);
		}
	}

	/**
	 * Returns the drg down of this dashboard bao hiem.
	 *
	 * @return the drg down of this dashboard bao hiem
	 */
	@Override
	public double getDrgDown() {
		return model.getDrgDown();
	}

	/**
	 * Returns the drg ma of this dashboard bao hiem.
	 *
	 * @return the drg ma of this dashboard bao hiem
	 */
	@Override
	public String getDrgMa() {
		return model.getDrgMa();
	}

	/**
	 * Returns the drg ten of this dashboard bao hiem.
	 *
	 * @return the drg ten of this dashboard bao hiem
	 */
	@Override
	public String getDrgTen() {
		return model.getDrgTen();
	}

	/**
	 * Returns the drg up of this dashboard bao hiem.
	 *
	 * @return the drg up of this dashboard bao hiem
	 */
	@Override
	public double getDrgUp() {
		return model.getDrgUp();
	}

	/**
	 * Returns the drg value of this dashboard bao hiem.
	 *
	 * @return the drg value of this dashboard bao hiem
	 */
	@Override
	public double getDrgValue() {
		return model.getDrgValue();
	}

	/**
	 * Returns the ID of this dashboard bao hiem.
	 *
	 * @return the ID of this dashboard bao hiem
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the muc bc of this dashboard bao hiem.
	 *
	 * @return the muc bc of this dashboard bao hiem
	 */
	@Override
	public int getMucBc() {
		return model.getMucBc();
	}

	/**
	 * Returns the nam of this dashboard bao hiem.
	 *
	 * @return the nam of this dashboard bao hiem
	 */
	@Override
	public int getNam() {
		return model.getNam();
	}

	/**
	 * Returns the org ID of this dashboard bao hiem.
	 *
	 * @return the org ID of this dashboard bao hiem
	 */
	@Override
	public long getOrgId() {
		return model.getOrgId();
	}

	/**
	 * Returns the org name of this dashboard bao hiem.
	 *
	 * @return the org name of this dashboard bao hiem
	 */
	@Override
	public String getOrgName() {
		return model.getOrgName();
	}

	/**
	 * Returns the primary key of this dashboard bao hiem.
	 *
	 * @return the primary key of this dashboard bao hiem
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the thang of this dashboard bao hiem.
	 *
	 * @return the thang of this dashboard bao hiem
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
	 * Sets the drg down of this dashboard bao hiem.
	 *
	 * @param drgDown the drg down of this dashboard bao hiem
	 */
	@Override
	public void setDrgDown(double drgDown) {
		model.setDrgDown(drgDown);
	}

	/**
	 * Sets the drg ma of this dashboard bao hiem.
	 *
	 * @param drgMa the drg ma of this dashboard bao hiem
	 */
	@Override
	public void setDrgMa(String drgMa) {
		model.setDrgMa(drgMa);
	}

	/**
	 * Sets the drg ten of this dashboard bao hiem.
	 *
	 * @param drgTen the drg ten of this dashboard bao hiem
	 */
	@Override
	public void setDrgTen(String drgTen) {
		model.setDrgTen(drgTen);
	}

	/**
	 * Sets the drg up of this dashboard bao hiem.
	 *
	 * @param drgUp the drg up of this dashboard bao hiem
	 */
	@Override
	public void setDrgUp(double drgUp) {
		model.setDrgUp(drgUp);
	}

	/**
	 * Sets the drg value of this dashboard bao hiem.
	 *
	 * @param drgValue the drg value of this dashboard bao hiem
	 */
	@Override
	public void setDrgValue(double drgValue) {
		model.setDrgValue(drgValue);
	}

	/**
	 * Sets the ID of this dashboard bao hiem.
	 *
	 * @param id the ID of this dashboard bao hiem
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the muc bc of this dashboard bao hiem.
	 *
	 * @param mucBc the muc bc of this dashboard bao hiem
	 */
	@Override
	public void setMucBc(int mucBc) {
		model.setMucBc(mucBc);
	}

	/**
	 * Sets the nam of this dashboard bao hiem.
	 *
	 * @param nam the nam of this dashboard bao hiem
	 */
	@Override
	public void setNam(int nam) {
		model.setNam(nam);
	}

	/**
	 * Sets the org ID of this dashboard bao hiem.
	 *
	 * @param orgId the org ID of this dashboard bao hiem
	 */
	@Override
	public void setOrgId(long orgId) {
		model.setOrgId(orgId);
	}

	/**
	 * Sets the org name of this dashboard bao hiem.
	 *
	 * @param orgName the org name of this dashboard bao hiem
	 */
	@Override
	public void setOrgName(String orgName) {
		model.setOrgName(orgName);
	}

	/**
	 * Sets the primary key of this dashboard bao hiem.
	 *
	 * @param primaryKey the primary key of this dashboard bao hiem
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the thang of this dashboard bao hiem.
	 *
	 * @param thang the thang of this dashboard bao hiem
	 */
	@Override
	public void setThang(int thang) {
		model.setThang(thang);
	}

	@Override
	protected DashboardBaoHiemWrapper wrap(DashboardBaoHiem dashboardBaoHiem) {
		return new DashboardBaoHiemWrapper(dashboardBaoHiem);
	}

}