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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.DashboardChiPhiHoatDongServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class DashboardChiPhiHoatDongSoap implements Serializable {

	public static DashboardChiPhiHoatDongSoap toSoapModel(
		DashboardChiPhiHoatDong model) {

		DashboardChiPhiHoatDongSoap soapModel =
			new DashboardChiPhiHoatDongSoap();

		soapModel.setId(model.getId());
		soapModel.setMucBc(model.getMucBc());
		soapModel.setNam(model.getNam());
		soapModel.setOrgId(model.getOrgId());
		soapModel.setOrgName(model.getOrgName());
		soapModel.setThanhPhanId(model.getThanhPhanId());
		soapModel.setThanhPhanMa(model.getThanhPhanMa());
		soapModel.setThanhPhanTen(model.getThanhPhanTen());
		soapModel.setDrgPhiDv(model.getDrgPhiDv());
		soapModel.setDrgDinhSuat(model.getDrgDinhSuat());
		soapModel.setDrgValues(model.getDrgValues());

		return soapModel;
	}

	public static DashboardChiPhiHoatDongSoap[] toSoapModels(
		DashboardChiPhiHoatDong[] models) {

		DashboardChiPhiHoatDongSoap[] soapModels =
			new DashboardChiPhiHoatDongSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DashboardChiPhiHoatDongSoap[][] toSoapModels(
		DashboardChiPhiHoatDong[][] models) {

		DashboardChiPhiHoatDongSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new DashboardChiPhiHoatDongSoap
					[models.length][models[0].length];
		}
		else {
			soapModels = new DashboardChiPhiHoatDongSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DashboardChiPhiHoatDongSoap[] toSoapModels(
		List<DashboardChiPhiHoatDong> models) {

		List<DashboardChiPhiHoatDongSoap> soapModels =
			new ArrayList<DashboardChiPhiHoatDongSoap>(models.size());

		for (DashboardChiPhiHoatDong model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new DashboardChiPhiHoatDongSoap[soapModels.size()]);
	}

	public DashboardChiPhiHoatDongSoap() {
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

	public String getThanhPhanId() {
		return _thanhPhanId;
	}

	public void setThanhPhanId(String thanhPhanId) {
		_thanhPhanId = thanhPhanId;
	}

	public String getThanhPhanMa() {
		return _thanhPhanMa;
	}

	public void setThanhPhanMa(String thanhPhanMa) {
		_thanhPhanMa = thanhPhanMa;
	}

	public String getThanhPhanTen() {
		return _thanhPhanTen;
	}

	public void setThanhPhanTen(String thanhPhanTen) {
		_thanhPhanTen = thanhPhanTen;
	}

	public double getDrgPhiDv() {
		return _drgPhiDv;
	}

	public void setDrgPhiDv(double drgPhiDv) {
		_drgPhiDv = drgPhiDv;
	}

	public double getDrgDinhSuat() {
		return _drgDinhSuat;
	}

	public void setDrgDinhSuat(double drgDinhSuat) {
		_drgDinhSuat = drgDinhSuat;
	}

	public double getDrgValues() {
		return _drgValues;
	}

	public void setDrgValues(double drgValues) {
		_drgValues = drgValues;
	}

	private long _id;
	private int _mucBc;
	private int _nam;
	private long _orgId;
	private String _orgName;
	private String _thanhPhanId;
	private String _thanhPhanMa;
	private String _thanhPhanTen;
	private double _drgPhiDv;
	private double _drgDinhSuat;
	private double _drgValues;

}