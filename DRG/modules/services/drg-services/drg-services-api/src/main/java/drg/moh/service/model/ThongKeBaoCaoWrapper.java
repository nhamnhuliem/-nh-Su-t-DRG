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
 * This class is a wrapper for {@link ThongKeBaoCao}.
 * </p>
 *
 * @author SON
 * @see ThongKeBaoCao
 * @generated
 */
public class ThongKeBaoCaoWrapper
	extends BaseModelWrapper<ThongKeBaoCao>
	implements ModelWrapper<ThongKeBaoCao>, ThongKeBaoCao {

	public ThongKeBaoCaoWrapper(ThongKeBaoCao thongKeBaoCao) {
		super(thongKeBaoCao);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("id", getId());
		attributes.put("nam", getNam());
		attributes.put("thang", getThang());
		attributes.put("tongHoSo", getTongHoSo());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Integer nam = (Integer)attributes.get("nam");

		if (nam != null) {
			setNam(nam);
		}

		Integer thang = (Integer)attributes.get("thang");

		if (thang != null) {
			setThang(thang);
		}

		Long tongHoSo = (Long)attributes.get("tongHoSo");

		if (tongHoSo != null) {
			setTongHoSo(tongHoSo);
		}
	}

	/**
	 * Returns the ID of this thong ke bao cao.
	 *
	 * @return the ID of this thong ke bao cao
	 */
	@Override
	public long getId() {
		return model.getId();
	}

	/**
	 * Returns the nam of this thong ke bao cao.
	 *
	 * @return the nam of this thong ke bao cao
	 */
	@Override
	public int getNam() {
		return model.getNam();
	}

	/**
	 * Returns the primary key of this thong ke bao cao.
	 *
	 * @return the primary key of this thong ke bao cao
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the thang of this thong ke bao cao.
	 *
	 * @return the thang of this thong ke bao cao
	 */
	@Override
	public int getThang() {
		return model.getThang();
	}

	/**
	 * Returns the tong ho so of this thong ke bao cao.
	 *
	 * @return the tong ho so of this thong ke bao cao
	 */
	@Override
	public long getTongHoSo() {
		return model.getTongHoSo();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the ID of this thong ke bao cao.
	 *
	 * @param id the ID of this thong ke bao cao
	 */
	@Override
	public void setId(long id) {
		model.setId(id);
	}

	/**
	 * Sets the nam of this thong ke bao cao.
	 *
	 * @param nam the nam of this thong ke bao cao
	 */
	@Override
	public void setNam(int nam) {
		model.setNam(nam);
	}

	/**
	 * Sets the primary key of this thong ke bao cao.
	 *
	 * @param primaryKey the primary key of this thong ke bao cao
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the thang of this thong ke bao cao.
	 *
	 * @param thang the thang of this thong ke bao cao
	 */
	@Override
	public void setThang(int thang) {
		model.setThang(thang);
	}

	/**
	 * Sets the tong ho so of this thong ke bao cao.
	 *
	 * @param tongHoSo the tong ho so of this thong ke bao cao
	 */
	@Override
	public void setTongHoSo(long tongHoSo) {
		model.setTongHoSo(tongHoSo);
	}

	@Override
	protected ThongKeBaoCaoWrapper wrap(ThongKeBaoCao thongKeBaoCao) {
		return new ThongKeBaoCaoWrapper(thongKeBaoCao);
	}

}