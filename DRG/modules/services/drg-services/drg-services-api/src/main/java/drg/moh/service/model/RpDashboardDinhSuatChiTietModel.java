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
 * The base model interface for the RpDashboardDinhSuatChiTiet service. Represents a row in the &quot;rp_dashboard_dinhsuat_ct&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>drg.moh.service.model.impl.RpDashboardDinhSuatChiTietModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>drg.moh.service.model.impl.RpDashboardDinhSuatChiTietImpl</code>.
 * </p>
 *
 * @author SON
 * @see RpDashboardDinhSuatChiTiet
 * @generated
 */
@ProviderType
public interface RpDashboardDinhSuatChiTietModel
	extends BaseModel<RpDashboardDinhSuatChiTiet> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a rp dashboard dinh suat chi tiet model instance should use the {@link RpDashboardDinhSuatChiTiet} interface instead.
	 */

	/**
	 * Returns the primary key of this rp dashboard dinh suat chi tiet.
	 *
	 * @return the primary key of this rp dashboard dinh suat chi tiet
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this rp dashboard dinh suat chi tiet.
	 *
	 * @param primaryKey the primary key of this rp dashboard dinh suat chi tiet
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this rp dashboard dinh suat chi tiet.
	 *
	 * @return the ID of this rp dashboard dinh suat chi tiet
	 */
	public long getId();

	/**
	 * Sets the ID of this rp dashboard dinh suat chi tiet.
	 *
	 * @param id the ID of this rp dashboard dinh suat chi tiet
	 */
	public void setId(long id);

	/**
	 * Returns the ten tinh of this rp dashboard dinh suat chi tiet.
	 *
	 * @return the ten tinh of this rp dashboard dinh suat chi tiet
	 */
	@AutoEscape
	public String getTenTinh();

	/**
	 * Sets the ten tinh of this rp dashboard dinh suat chi tiet.
	 *
	 * @param tenTinh the ten tinh of this rp dashboard dinh suat chi tiet
	 */
	public void setTenTinh(String tenTinh);

	/**
	 * Returns the dinh suat of this rp dashboard dinh suat chi tiet.
	 *
	 * @return the dinh suat of this rp dashboard dinh suat chi tiet
	 */
	public double getDinhSuat();

	/**
	 * Sets the dinh suat of this rp dashboard dinh suat chi tiet.
	 *
	 * @param dinhSuat the dinh suat of this rp dashboard dinh suat chi tiet
	 */
	public void setDinhSuat(double dinhSuat);

}