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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.RpDashboardDinhSuatChiTietServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RpDashboardDinhSuatChiTietSoap implements Serializable {

	public static RpDashboardDinhSuatChiTietSoap toSoapModel(
		RpDashboardDinhSuatChiTiet model) {

		RpDashboardDinhSuatChiTietSoap soapModel =
			new RpDashboardDinhSuatChiTietSoap();

		soapModel.setId(model.getId());
		soapModel.setTenTinh(model.getTenTinh());
		soapModel.setDinhSuat(model.getDinhSuat());

		return soapModel;
	}

	public static RpDashboardDinhSuatChiTietSoap[] toSoapModels(
		RpDashboardDinhSuatChiTiet[] models) {

		RpDashboardDinhSuatChiTietSoap[] soapModels =
			new RpDashboardDinhSuatChiTietSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardDinhSuatChiTietSoap[][] toSoapModels(
		RpDashboardDinhSuatChiTiet[][] models) {

		RpDashboardDinhSuatChiTietSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new RpDashboardDinhSuatChiTietSoap
					[models.length][models[0].length];
		}
		else {
			soapModels = new RpDashboardDinhSuatChiTietSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardDinhSuatChiTietSoap[] toSoapModels(
		List<RpDashboardDinhSuatChiTiet> models) {

		List<RpDashboardDinhSuatChiTietSoap> soapModels =
			new ArrayList<RpDashboardDinhSuatChiTietSoap>(models.size());

		for (RpDashboardDinhSuatChiTiet model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new RpDashboardDinhSuatChiTietSoap[soapModels.size()]);
	}

	public RpDashboardDinhSuatChiTietSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public String getTenTinh() {
		return _tenTinh;
	}

	public void setTenTinh(String tenTinh) {
		_tenTinh = tenTinh;
	}

	public double getDinhSuat() {
		return _dinhSuat;
	}

	public void setDinhSuat(double dinhSuat) {
		_dinhSuat = dinhSuat;
	}

	private long _id;
	private String _tenTinh;
	private double _dinhSuat;

}