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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.DashboardDinhSuatServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class DashboardDinhSuatSoap implements Serializable {

	public static DashboardDinhSuatSoap toSoapModel(DashboardDinhSuat model) {
		DashboardDinhSuatSoap soapModel = new DashboardDinhSuatSoap();

		soapModel.setId(model.getId());
		soapModel.setMucBc(model.getMucBc());
		soapModel.setNam(model.getNam());
		soapModel.setThang(model.getThang());
		soapModel.setOrgId(model.getOrgId());
		soapModel.setOrgName(model.getOrgName());
		soapModel.setDinhSuatTieuChuan(model.getDinhSuatTieuChuan());
		soapModel.setDinhSuatThucTe(model.getDinhSuatThucTe());
		soapModel.setDinhSuatBenhNhan(model.getDinhSuatBenhNhan());

		return soapModel;
	}

	public static DashboardDinhSuatSoap[] toSoapModels(
		DashboardDinhSuat[] models) {

		DashboardDinhSuatSoap[] soapModels =
			new DashboardDinhSuatSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DashboardDinhSuatSoap[][] toSoapModels(
		DashboardDinhSuat[][] models) {

		DashboardDinhSuatSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new DashboardDinhSuatSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DashboardDinhSuatSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DashboardDinhSuatSoap[] toSoapModels(
		List<DashboardDinhSuat> models) {

		List<DashboardDinhSuatSoap> soapModels =
			new ArrayList<DashboardDinhSuatSoap>(models.size());

		for (DashboardDinhSuat model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DashboardDinhSuatSoap[soapModels.size()]);
	}

	public DashboardDinhSuatSoap() {
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

	public int getMucBc() {
		return _mucBc;
	}

	public void setMucBc(int mucBc) {
		_mucBc = mucBc;
	}

	public int getNam() {
		return _nam;
	}

	public void setNam(int nam) {
		_nam = nam;
	}

	public int getThang() {
		return _thang;
	}

	public void setThang(int thang) {
		_thang = thang;
	}

	public long getOrgId() {
		return _orgId;
	}

	public void setOrgId(long orgId) {
		_orgId = orgId;
	}

	public String getOrgName() {
		return _orgName;
	}

	public void setOrgName(String orgName) {
		_orgName = orgName;
	}

	public double getDinhSuatTieuChuan() {
		return _dinhSuatTieuChuan;
	}

	public void setDinhSuatTieuChuan(double dinhSuatTieuChuan) {
		_dinhSuatTieuChuan = dinhSuatTieuChuan;
	}

	public double getDinhSuatThucTe() {
		return _dinhSuatThucTe;
	}

	public void setDinhSuatThucTe(double dinhSuatThucTe) {
		_dinhSuatThucTe = dinhSuatThucTe;
	}

	public double getDinhSuatBenhNhan() {
		return _dinhSuatBenhNhan;
	}

	public void setDinhSuatBenhNhan(double dinhSuatBenhNhan) {
		_dinhSuatBenhNhan = dinhSuatBenhNhan;
	}

	private long _id;
	private int _mucBc;
	private int _nam;
	private int _thang;
	private long _orgId;
	private String _orgName;
	private double _dinhSuatTieuChuan;
	private double _dinhSuatThucTe;
	private double _dinhSuatBenhNhan;

}