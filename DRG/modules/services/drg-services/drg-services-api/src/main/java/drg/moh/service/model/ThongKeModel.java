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

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the ThongKe service. Represents a row in the &quot;hsbhyt_tonghop_thongke&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>drg.moh.service.model.impl.ThongKeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>drg.moh.service.model.impl.ThongKeImpl</code>.
 * </p>
 *
 * @author SON
 * @see ThongKe
 * @generated
 */
@ProviderType
public interface ThongKeModel extends BaseModel<ThongKe> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a thong ke model instance should use the {@link ThongKe} interface instead.
	 */

	/**
	 * Returns the primary key of this thong ke.
	 *
	 * @return the primary key of this thong ke
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this thong ke.
	 *
	 * @param primaryKey the primary key of this thong ke
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this thong ke.
	 *
	 * @return the ID of this thong ke
	 */
	public long getId();

	/**
	 * Sets the ID of this thong ke.
	 *
	 * @param id the ID of this thong ke
	 */
	public void setId(long id);

	/**
	 * Returns the ma co so of this thong ke.
	 *
	 * @return the ma co so of this thong ke
	 */
	@AutoEscape
	public String getMaCoSo();

	/**
	 * Sets the ma co so of this thong ke.
	 *
	 * @param maCoSo the ma co so of this thong ke
	 */
	public void setMaCoSo(String maCoSo);

	/**
	 * Returns the nam of this thong ke.
	 *
	 * @return the nam of this thong ke
	 */
	public int getNam();

	/**
	 * Sets the nam of this thong ke.
	 *
	 * @param nam the nam of this thong ke
	 */
	public void setNam(int nam);

	/**
	 * Returns the thang of this thong ke.
	 *
	 * @return the thang of this thong ke
	 */
	public int getThang();

	/**
	 * Sets the thang of this thong ke.
	 *
	 * @param thang the thang of this thong ke
	 */
	public void setThang(int thang);

	/**
	 * Returns the tong ho so of this thong ke.
	 *
	 * @return the tong ho so of this thong ke
	 */
	public long getTongHoSo();

	/**
	 * Sets the tong ho so of this thong ke.
	 *
	 * @param tongHoSo the tong ho so of this thong ke
	 */
	public void setTongHoSo(long tongHoSo);

	/**
	 * Returns the tien tong chi of this thong ke.
	 *
	 * @return the tien tong chi of this thong ke
	 */
	public double getTienTongChi();

	/**
	 * Sets the tien tong chi of this thong ke.
	 *
	 * @param tienTongChi the tien tong chi of this thong ke
	 */
	public void setTienTongChi(double tienTongChi);

	/**
	 * Returns the tien bh of this thong ke.
	 *
	 * @return the tien bh of this thong ke
	 */
	public double getTienBH();

	/**
	 * Sets the tien bh of this thong ke.
	 *
	 * @param tienBH the tien bh of this thong ke
	 */
	public void setTienBH(double tienBH);

}