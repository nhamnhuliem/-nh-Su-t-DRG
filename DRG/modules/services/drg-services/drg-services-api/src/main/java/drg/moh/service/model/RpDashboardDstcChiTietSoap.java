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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.RpDashboardDstcChiTietServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RpDashboardDstcChiTietSoap implements Serializable {

	public static RpDashboardDstcChiTietSoap toSoapModel(
		RpDashboardDstcChiTiet model) {

		RpDashboardDstcChiTietSoap soapModel = new RpDashboardDstcChiTietSoap();

		soapModel.setId(model.getId());
		soapModel.setTenTinh(model.getTenTinh());
		soapModel.setDinhSuat(model.getDinhSuat());

		return soapModel;
	}

	public static RpDashboardDstcChiTietSoap[] toSoapModels(
		RpDashboardDstcChiTiet[] models) {

		RpDashboardDstcChiTietSoap[] soapModels =
			new RpDashboardDstcChiTietSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardDstcChiTietSoap[][] toSoapModels(
		RpDashboardDstcChiTiet[][] models) {

		RpDashboardDstcChiTietSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new RpDashboardDstcChiTietSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RpDashboardDstcChiTietSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardDstcChiTietSoap[] toSoapModels(
		List<RpDashboardDstcChiTiet> models) {

		List<RpDashboardDstcChiTietSoap> soapModels =
			new ArrayList<RpDashboardDstcChiTietSoap>(models.size());

		for (RpDashboardDstcChiTiet model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new RpDashboardDstcChiTietSoap[soapModels.size()]);
	}

	public RpDashboardDstcChiTietSoap() {
	}

	public String getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(String pk) {
		setId(pk);
	}

	public String getId() {
		return _id;
	}

	public void setId(String id) {
		_id = id;
	}

	public String getTenTinh() {
		return _tenTinh;
	}

	public void setTenTinh(String tenTinh) {
		_tenTinh = tenTinh;
	}

	public int getDinhSuat() {
		return _dinhSuat;
	}

	public void setDinhSuat(int dinhSuat) {
		_dinhSuat = dinhSuat;
	}

	private String _id;
	private String _tenTinh;
	private int _dinhSuat;

}