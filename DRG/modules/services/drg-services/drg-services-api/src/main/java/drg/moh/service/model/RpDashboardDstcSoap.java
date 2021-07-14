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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.RpDashboardDstcServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RpDashboardDstcSoap implements Serializable {

	public static RpDashboardDstcSoap toSoapModel(RpDashboardDstc model) {
		RpDashboardDstcSoap soapModel = new RpDashboardDstcSoap();

		soapModel.setId(model.getId());
		soapModel.setTenTinh(model.getTenTinh());
		soapModel.setThang(model.getThang());
		soapModel.setSoLuot(model.getSoLuot());
		soapModel.setChiPhi(model.getChiPhi());
		soapModel.setQuyDs(model.getQuyDs());

		return soapModel;
	}

	public static RpDashboardDstcSoap[] toSoapModels(RpDashboardDstc[] models) {
		RpDashboardDstcSoap[] soapModels =
			new RpDashboardDstcSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardDstcSoap[][] toSoapModels(
		RpDashboardDstc[][] models) {

		RpDashboardDstcSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new RpDashboardDstcSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RpDashboardDstcSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardDstcSoap[] toSoapModels(
		List<RpDashboardDstc> models) {

		List<RpDashboardDstcSoap> soapModels =
			new ArrayList<RpDashboardDstcSoap>(models.size());

		for (RpDashboardDstc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RpDashboardDstcSoap[soapModels.size()]);
	}

	public RpDashboardDstcSoap() {
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

	public int getThang() {
		return _thang;
	}

	public void setThang(int thang) {
		_thang = thang;
	}

	public int getSoLuot() {
		return _soLuot;
	}

	public void setSoLuot(int soLuot) {
		_soLuot = soLuot;
	}

	public double getChiPhi() {
		return _chiPhi;
	}

	public void setChiPhi(double chiPhi) {
		_chiPhi = chiPhi;
	}

	public double getQuyDs() {
		return _quyDs;
	}

	public void setQuyDs(double quyDs) {
		_quyDs = quyDs;
	}

	private String _id;
	private String _tenTinh;
	private int _thang;
	private int _soLuot;
	private double _chiPhi;
	private double _quyDs;

}