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
 * This class is a wrapper for {@link RpDashboardChiPhiBinhQuan}.
 * </p>
 *
 * @author SON
 * @see RpDashboardChiPhiBinhQuan
 * @generated
 */
public class RpDashboardChiPhiBinhQuanWrapper
	extends BaseModelWrapper<RpDashboardChiPhiBinhQuan>
	implements ModelWrapper<RpDashboardChiPhiBinhQuan>,
			   RpDashboardChiPhiBinhQuan {

	public RpDashboardChiPhiBinhQuanWrapper(
		RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan) {

		super(rpDashboardChiPhiBinhQuan);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("chiPhi", getChiPhi());
		attributes.put("binhQuan", getBinhQuan());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Double chiPhi = (Double)attributes.get("chiPhi");

		if (chiPhi != null) {
			setChiPhi(chiPhi);
		}

		Double binhQuan = (Double)attributes.get("binhQuan");

		if (binhQuan != null) {
			setBinhQuan(binhQuan);
		}
	}

	/**
	 * Returns the binh quan of this rp dashboard chi phi binh quan.
	 *
	 * @return the binh quan of this rp dashboard chi phi binh quan
	 */
	@Override
	public double getBinhQuan() {
		return model.getBinhQuan();
	}

	/**
	 * Returns the chi phi of this rp dashboard chi phi binh quan.
	 *
	 * @return the chi phi of this rp dashboard chi phi binh quan
	 */
	@Override
	public double getChiPhi() {
		return model.getChiPhi();
	}

	/**
	 * Returns the ID of this rp dashboard chi phi binh quan.
	 *
	 * @return the ID of this rp dashboard chi phi binh quan
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this rp dashboard chi phi binh quan.
	 *
	 * @return the primary key of this rp dashboard chi phi binh quan
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
	 * Sets the binh quan of this rp dashboard chi phi binh quan.
	 *
	 * @param binhQuan the binh quan of this rp dashboard chi phi binh quan
	 */
	@Override
	public void setBinhQuan(double binhQuan) {
		model.setBinhQuan(binhQuan);
	}

	/**
	 * Sets the chi phi of this rp dashboard chi phi binh quan.
	 *
	 * @param chiPhi the chi phi of this rp dashboard chi phi binh quan
	 */
	@Override
	public void setChiPhi(double chiPhi) {
		model.setChiPhi(chiPhi);
	}

	/**
	 * Sets the ID of this rp dashboard chi phi binh quan.
	 *
	 * @param id the ID of this rp dashboard chi phi binh quan
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the primary key of this rp dashboard chi phi binh quan.
	 *
	 * @param primaryKey the primary key of this rp dashboard chi phi binh quan
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected RpDashboardChiPhiBinhQuanWrapper wrap(
		RpDashboardChiPhiBinhQuan rpDashboardChiPhiBinhQuan) {

		return new RpDashboardChiPhiBinhQuanWrapper(rpDashboardChiPhiBinhQuan);
	}

}