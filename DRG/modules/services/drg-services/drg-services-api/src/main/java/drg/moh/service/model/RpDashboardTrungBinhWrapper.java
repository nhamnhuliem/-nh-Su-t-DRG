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
 * This class is a wrapper for {@link RpDashboardTrungBinh}.
 * </p>
 *
 * @author SON
 * @see RpDashboardTrungBinh
 * @generated
 */
public class RpDashboardTrungBinhWrapper
	extends BaseModelWrapper<RpDashboardTrungBinh>
	implements ModelWrapper<RpDashboardTrungBinh>, RpDashboardTrungBinh {

	public RpDashboardTrungBinhWrapper(
		RpDashboardTrungBinh rpDashboardTrungBinh) {

		super(rpDashboardTrungBinh);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("data", getData());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String data = (String)attributes.get("data");

		if (data != null) {
			setData(data);
		}
	}

	/**
	 * Returns the data of this rp dashboard trung binh.
	 *
	 * @return the data of this rp dashboard trung binh
	 */
	@Override
	public String getData() {
		return model.getData();
	}

	/**
	 * Returns the primary key of this rp dashboard trung binh.
	 *
	 * @return the primary key of this rp dashboard trung binh
	 */
	@Override
	public String getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the data of this rp dashboard trung binh.
	 *
	 * @param data the data of this rp dashboard trung binh
	 */
	@Override
	public void setData(String data) {
		model.setData(data);
	}

	/**
	 * Sets the primary key of this rp dashboard trung binh.
	 *
	 * @param primaryKey the primary key of this rp dashboard trung binh
	 */
	@Override
	public void setPrimaryKey(String primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected RpDashboardTrungBinhWrapper wrap(
		RpDashboardTrungBinh rpDashboardTrungBinh) {

		return new RpDashboardTrungBinhWrapper(rpDashboardTrungBinh);
	}

}