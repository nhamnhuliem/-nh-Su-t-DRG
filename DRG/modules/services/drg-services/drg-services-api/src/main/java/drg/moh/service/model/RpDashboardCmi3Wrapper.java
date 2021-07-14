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
 * This class is a wrapper for {@link RpDashboardCmi3}.
 * </p>
 *
 * @author SON
 * @see RpDashboardCmi3
 * @generated
 */
public class RpDashboardCmi3Wrapper
	extends BaseModelWrapper<RpDashboardCmi3>
	implements ModelWrapper<RpDashboardCmi3>, RpDashboardCmi3 {

	public RpDashboardCmi3Wrapper(RpDashboardCmi3 rpDashboardCmi3) {
		super(rpDashboardCmi3);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("cmiTinh", getCmiTinh());
		attributes.put("cmiTuyen", getCmiTuyen());
		attributes.put("cmiCoSo", getCmiCoSo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Double cmiTinh = (Double)attributes.get("cmiTinh");

		if (cmiTinh != null) {
			setCmiTinh(cmiTinh);
		}

		Double cmiTuyen = (Double)attributes.get("cmiTuyen");

		if (cmiTuyen != null) {
			setCmiTuyen(cmiTuyen);
		}

		Double cmiCoSo = (Double)attributes.get("cmiCoSo");

		if (cmiCoSo != null) {
			setCmiCoSo(cmiCoSo);
		}
	}

	/**
	 * Returns the cmi co so of this rp dashboard cmi3.
	 *
	 * @return the cmi co so of this rp dashboard cmi3
	 */
	@Override
	public double getCmiCoSo() {
		return model.getCmiCoSo();
	}

	/**
	 * Returns the cmi tinh of this rp dashboard cmi3.
	 *
	 * @return the cmi tinh of this rp dashboard cmi3
	 */
	@Override
	public double getCmiTinh() {
		return model.getCmiTinh();
	}

	/**
	 * Returns the cmi tuyen of this rp dashboard cmi3.
	 *
	 * @return the cmi tuyen of this rp dashboard cmi3
	 */
	@Override
	public double getCmiTuyen() {
		return model.getCmiTuyen();
	}

	/**
	 * Returns the ID of this rp dashboard cmi3.
	 *
	 * @return the ID of this rp dashboard cmi3
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the primary key of this rp dashboard cmi3.
	 *
	 * @return the primary key of this rp dashboard cmi3
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
	 * Sets the cmi co so of this rp dashboard cmi3.
	 *
	 * @param cmiCoSo the cmi co so of this rp dashboard cmi3
	 */
	@Override
	public void setCmiCoSo(double cmiCoSo) {
		model.setCmiCoSo(cmiCoSo);
	}

	/**
	 * Sets the cmi tinh of this rp dashboard cmi3.
	 *
	 * @param cmiTinh the cmi tinh of this rp dashboard cmi3
	 */
	@Override
	public void setCmiTinh(double cmiTinh) {
		model.setCmiTinh(cmiTinh);
	}

	/**
	 * Sets the cmi tuyen of this rp dashboard cmi3.
	 *
	 * @param cmiTuyen the cmi tuyen of this rp dashboard cmi3
	 */
	@Override
	public void setCmiTuyen(double cmiTuyen) {
		model.setCmiTuyen(cmiTuyen);
	}

	/**
	 * Sets the ID of this rp dashboard cmi3.
	 *
	 * @param id the ID of this rp dashboard cmi3
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the primary key of this rp dashboard cmi3.
	 *
	 * @param primaryKey the primary key of this rp dashboard cmi3
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected RpDashboardCmi3Wrapper wrap(RpDashboardCmi3 rpDashboardCmi3) {
		return new RpDashboardCmi3Wrapper(rpDashboardCmi3);
	}

}