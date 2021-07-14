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
 * This class is a wrapper for {@link RpDashboardCmi2}.
 * </p>
 *
 * @author SON
 * @see RpDashboardCmi2
 * @generated
 */
public class RpDashboardCmi2Wrapper
	extends BaseModelWrapper<RpDashboardCmi2>
	implements ModelWrapper<RpDashboardCmi2>, RpDashboardCmi2 {

	public RpDashboardCmi2Wrapper(RpDashboardCmi2 rpDashboardCmi2) {
		super(rpDashboardCmi2);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("cmiTenTuyen", getCmiTenTuyen());
		attributes.put("cmiTrungBinh", getCmiTrungBinh());
		attributes.put("cmiTrungMax", getCmiTrungMax());
		attributes.put("cmiTrungMin", getCmiTrungMin());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		String cmiTenTuyen = (String)attributes.get("cmiTenTuyen");

		if (cmiTenTuyen != null) {
			setCmiTenTuyen(cmiTenTuyen);
		}

		Double cmiTrungBinh = (Double)attributes.get("cmiTrungBinh");

		if (cmiTrungBinh != null) {
			setCmiTrungBinh(cmiTrungBinh);
		}

		Double cmiTrungMax = (Double)attributes.get("cmiTrungMax");

		if (cmiTrungMax != null) {
			setCmiTrungMax(cmiTrungMax);
		}

		Double cmiTrungMin = (Double)attributes.get("cmiTrungMin");

		if (cmiTrungMin != null) {
			setCmiTrungMin(cmiTrungMin);
		}
	}

	/**
	 * Returns the cmi ten tuyen of this rp dashboard cmi2.
	 *
	 * @return the cmi ten tuyen of this rp dashboard cmi2
	 */
	@Override
	public String getCmiTenTuyen() {
		return model.getCmiTenTuyen();
	}

	/**
	 * Returns the cmi trung binh of this rp dashboard cmi2.
	 *
	 * @return the cmi trung binh of this rp dashboard cmi2
	 */
	@Override
	public double getCmiTrungBinh() {
		return model.getCmiTrungBinh();
	}

	/**
	 * Returns the cmi trung max of this rp dashboard cmi2.
	 *
	 * @return the cmi trung max of this rp dashboard cmi2
	 */
	@Override
	public double getCmiTrungMax() {
		return model.getCmiTrungMax();
	}

	/**
	 * Returns the cmi trung min of this rp dashboard cmi2.
	 *
	 * @return the cmi trung min of this rp dashboard cmi2
	 */
	@Override
	public double getCmiTrungMin() {
		return model.getCmiTrungMin();
	}

	/**
	 * Returns the ID of this rp dashboard cmi2.
	 *
	 * @return the ID of this rp dashboard cmi2
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this rp dashboard cmi2.
	 *
	 * @return the primary key of this rp dashboard cmi2
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
	 * Sets the cmi ten tuyen of this rp dashboard cmi2.
	 *
	 * @param cmiTenTuyen the cmi ten tuyen of this rp dashboard cmi2
	 */
	@Override
	public void setCmiTenTuyen(String cmiTenTuyen) {
		model.setCmiTenTuyen(cmiTenTuyen);
	}

	/**
	 * Sets the cmi trung binh of this rp dashboard cmi2.
	 *
	 * @param cmiTrungBinh the cmi trung binh of this rp dashboard cmi2
	 */
	@Override
	public void setCmiTrungBinh(double cmiTrungBinh) {
		model.setCmiTrungBinh(cmiTrungBinh);
	}

	/**
	 * Sets the cmi trung max of this rp dashboard cmi2.
	 *
	 * @param cmiTrungMax the cmi trung max of this rp dashboard cmi2
	 */
	@Override
	public void setCmiTrungMax(double cmiTrungMax) {
		model.setCmiTrungMax(cmiTrungMax);
	}

	/**
	 * Sets the cmi trung min of this rp dashboard cmi2.
	 *
	 * @param cmiTrungMin the cmi trung min of this rp dashboard cmi2
	 */
	@Override
	public void setCmiTrungMin(double cmiTrungMin) {
		model.setCmiTrungMin(cmiTrungMin);
	}

	/**
	 * Sets the ID of this rp dashboard cmi2.
	 *
	 * @param id the ID of this rp dashboard cmi2
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the primary key of this rp dashboard cmi2.
	 *
	 * @param primaryKey the primary key of this rp dashboard cmi2
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected RpDashboardCmi2Wrapper wrap(RpDashboardCmi2 rpDashboardCmi2) {
		return new RpDashboardCmi2Wrapper(rpDashboardCmi2);
	}

}