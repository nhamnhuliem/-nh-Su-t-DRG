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
 * This class is a wrapper for {@link RpDashboardCmi}.
 * </p>
 *
 * @author SON
 * @see RpDashboardCmi
 * @generated
 */
public class RpDashboardCmiWrapper
	extends BaseModelWrapper<RpDashboardCmi>
	implements ModelWrapper<RpDashboardCmi>, RpDashboardCmi {

	public RpDashboardCmiWrapper(RpDashboardCmi rpDashboardCmi) {
		super(rpDashboardCmi);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("cmiToanQuoc", getCmiToanQuoc());
		attributes.put("cmiTinh", getCmiTinh());
		attributes.put("cmiTuyen", getCmiTuyen());
		attributes.put("cmiTrungBinh", getCmiTrungBinh());
		attributes.put("cmiTrungMax", getCmiTrungMax());
		attributes.put("cmiTrungMin", getCmiTrungMin());
		attributes.put("cmiCoSo", getCmiCoSo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Double cmiToanQuoc = (Double)attributes.get("cmiToanQuoc");

		if (cmiToanQuoc != null) {
			setCmiToanQuoc(cmiToanQuoc);
		}

		Double cmiTinh = (Double)attributes.get("cmiTinh");

		if (cmiTinh != null) {
			setCmiTinh(cmiTinh);
		}

		String cmiTuyen = (String)attributes.get("cmiTuyen");

		if (cmiTuyen != null) {
			setCmiTuyen(cmiTuyen);
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

		Double cmiCoSo = (Double)attributes.get("cmiCoSo");

		if (cmiCoSo != null) {
			setCmiCoSo(cmiCoSo);
		}
	}

	/**
	 * Returns the cmi co so of this rp dashboard cmi.
	 *
	 * @return the cmi co so of this rp dashboard cmi
	 */
	@Override
	public double getCmiCoSo() {
		return model.getCmiCoSo();
	}

	/**
	 * Returns the cmi tinh of this rp dashboard cmi.
	 *
	 * @return the cmi tinh of this rp dashboard cmi
	 */
	@Override
	public double getCmiTinh() {
		return model.getCmiTinh();
	}

	/**
	 * Returns the cmi toan quoc of this rp dashboard cmi.
	 *
	 * @return the cmi toan quoc of this rp dashboard cmi
	 */
	@Override
	public double getCmiToanQuoc() {
		return model.getCmiToanQuoc();
	}

	/**
	 * Returns the cmi trung binh of this rp dashboard cmi.
	 *
	 * @return the cmi trung binh of this rp dashboard cmi
	 */
	@Override
	public double getCmiTrungBinh() {
		return model.getCmiTrungBinh();
	}

	/**
	 * Returns the cmi trung max of this rp dashboard cmi.
	 *
	 * @return the cmi trung max of this rp dashboard cmi
	 */
	@Override
	public double getCmiTrungMax() {
		return model.getCmiTrungMax();
	}

	/**
	 * Returns the cmi trung min of this rp dashboard cmi.
	 *
	 * @return the cmi trung min of this rp dashboard cmi
	 */
	@Override
	public double getCmiTrungMin() {
		return model.getCmiTrungMin();
	}

	/**
	 * Returns the cmi tuyen of this rp dashboard cmi.
	 *
	 * @return the cmi tuyen of this rp dashboard cmi
	 */
	@Override
	public String getCmiTuyen() {
		return model.getCmiTuyen();
	}

	/**
	 * Returns the ID of this rp dashboard cmi.
	 *
	 * @return the ID of this rp dashboard cmi
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this rp dashboard cmi.
	 *
	 * @return the primary key of this rp dashboard cmi
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
	 * Sets the cmi co so of this rp dashboard cmi.
	 *
	 * @param cmiCoSo the cmi co so of this rp dashboard cmi
	 */
	@Override
	public void setCmiCoSo(double cmiCoSo) {
		model.setCmiCoSo(cmiCoSo);
	}

	/**
	 * Sets the cmi tinh of this rp dashboard cmi.
	 *
	 * @param cmiTinh the cmi tinh of this rp dashboard cmi
	 */
	@Override
	public void setCmiTinh(double cmiTinh) {
		model.setCmiTinh(cmiTinh);
	}

	/**
	 * Sets the cmi toan quoc of this rp dashboard cmi.
	 *
	 * @param cmiToanQuoc the cmi toan quoc of this rp dashboard cmi
	 */
	@Override
	public void setCmiToanQuoc(double cmiToanQuoc) {
		model.setCmiToanQuoc(cmiToanQuoc);
	}

	/**
	 * Sets the cmi trung binh of this rp dashboard cmi.
	 *
	 * @param cmiTrungBinh the cmi trung binh of this rp dashboard cmi
	 */
	@Override
	public void setCmiTrungBinh(double cmiTrungBinh) {
		model.setCmiTrungBinh(cmiTrungBinh);
	}

	/**
	 * Sets the cmi trung max of this rp dashboard cmi.
	 *
	 * @param cmiTrungMax the cmi trung max of this rp dashboard cmi
	 */
	@Override
	public void setCmiTrungMax(double cmiTrungMax) {
		model.setCmiTrungMax(cmiTrungMax);
	}

	/**
	 * Sets the cmi trung min of this rp dashboard cmi.
	 *
	 * @param cmiTrungMin the cmi trung min of this rp dashboard cmi
	 */
	@Override
	public void setCmiTrungMin(double cmiTrungMin) {
		model.setCmiTrungMin(cmiTrungMin);
	}

	/**
	 * Sets the cmi tuyen of this rp dashboard cmi.
	 *
	 * @param cmiTuyen the cmi tuyen of this rp dashboard cmi
	 */
	@Override
	public void setCmiTuyen(String cmiTuyen) {
		model.setCmiTuyen(cmiTuyen);
	}

	/**
	 * Sets the ID of this rp dashboard cmi.
	 *
	 * @param id the ID of this rp dashboard cmi
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the primary key of this rp dashboard cmi.
	 *
	 * @param primaryKey the primary key of this rp dashboard cmi
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected RpDashboardCmiWrapper wrap(RpDashboardCmi rpDashboardCmi) {
		return new RpDashboardCmiWrapper(rpDashboardCmi);
	}

}