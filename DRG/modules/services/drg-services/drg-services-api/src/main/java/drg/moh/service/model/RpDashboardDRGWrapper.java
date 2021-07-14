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
 * This class is a wrapper for {@link RpDashboardDRG}.
 * </p>
 *
 * @author SON
 * @see RpDashboardDRG
 * @generated
 */
public class RpDashboardDRGWrapper
	extends BaseModelWrapper<RpDashboardDRG>
	implements ModelWrapper<RpDashboardDRG>, RpDashboardDRG {

	public RpDashboardDRGWrapper(RpDashboardDRG rpDashboardDRG) {
		super(rpDashboardDRG);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("drg", getDrg());
		attributes.put("thang", getThang());
		attributes.put("value", getValue());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String drg = (String)attributes.get("drg");

		if (drg != null) {
			setDrg(drg);
		}

		String thang = (String)attributes.get("thang");

		if (thang != null) {
			setThang(thang);
		}

		Double value = (Double)attributes.get("value");

		if (value != null) {
			setValue(value);
		}
	}

	/**
	 * Returns the drg of this rp dashboard drg.
	 *
	 * @return the drg of this rp dashboard drg
	 */
	@Override
	public String getDrg() {
		return model.getDrg();
	}

	/**
	 * Returns the ID of this rp dashboard drg.
	 *
	 * @return the ID of this rp dashboard drg
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this rp dashboard drg.
	 *
	 * @return the primary key of this rp dashboard drg
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the thang of this rp dashboard drg.
	 *
	 * @return the thang of this rp dashboard drg
	 */
	@Override
	public String getThang() {
		return model.getThang();
	}

	/**
	 * Returns the value of this rp dashboard drg.
	 *
	 * @return the value of this rp dashboard drg
	 */
	@Override
	public double getValue() {
		return model.getValue();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the drg of this rp dashboard drg.
	 *
	 * @param drg the drg of this rp dashboard drg
	 */
	@Override
	public void setDrg(String drg) {
		model.setDrg(drg);
	}

	/**
	 * Sets the ID of this rp dashboard drg.
	 *
	 * @param id the ID of this rp dashboard drg
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the primary key of this rp dashboard drg.
	 *
	 * @param primaryKey the primary key of this rp dashboard drg
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the thang of this rp dashboard drg.
	 *
	 * @param thang the thang of this rp dashboard drg
	 */
	@Override
	public void setThang(String thang) {
		model.setThang(thang);
	}

	/**
	 * Sets the value of this rp dashboard drg.
	 *
	 * @param value the value of this rp dashboard drg
	 */
	@Override
	public void setValue(double value) {
		model.setValue(value);
	}

	@Override
	protected RpDashboardDRGWrapper wrap(RpDashboardDRG rpDashboardDRG) {
		return new RpDashboardDRGWrapper(rpDashboardDRG);
	}

}