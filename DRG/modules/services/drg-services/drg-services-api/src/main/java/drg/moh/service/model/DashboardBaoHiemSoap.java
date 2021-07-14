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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.DashboardBaoHiemServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class DashboardBaoHiemSoap implements Serializable {

	public static DashboardBaoHiemSoap toSoapModel(DashboardBaoHiem model) {
		DashboardBaoHiemSoap soapModel = new DashboardBaoHiemSoap();

		soapModel.setId(model.getId());
		soapModel.setMucBc(model.getMucBc());
		soapModel.setNam(model.getNam());
		soapModel.setThang(model.getThang());
		soapModel.setOrgId(model.getOrgId());
		soapModel.setOrgName(model.getOrgName());
		soapModel.setDrgMa(model.getDrgMa());
		soapModel.setDrgTen(model.getDrgTen());
		soapModel.setDrgValue(model.getDrgValue());
		soapModel.setDrgUp(model.getDrgUp());
		soapModel.setDrgDown(model.getDrgDown());

		return soapModel;
	}

	public static DashboardBaoHiemSoap[] toSoapModels(
		DashboardBaoHiem[] models) {

		DashboardBaoHiemSoap[] soapModels =
			new DashboardBaoHiemSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DashboardBaoHiemSoap[][] toSoapModels(
		DashboardBaoHiem[][] models) {

		DashboardBaoHiemSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new DashboardBaoHiemSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DashboardBaoHiemSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DashboardBaoHiemSoap[] toSoapModels(
		List<DashboardBaoHiem> models) {

		List<DashboardBaoHiemSoap> soapModels =
			new ArrayList<DashboardBaoHiemSoap>(models.size());

		for (DashboardBaoHiem model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DashboardBaoHiemSoap[soapModels.size()]);
	}

	public DashboardBaoHiemSoap() {
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

	public String getDrgMa() {
		return _drgMa;
	}

	public void setDrgMa(String drgMa) {
		_drgMa = drgMa;
	}

	public String getDrgTen() {
		return _drgTen;
	}

	public void setDrgTen(String drgTen) {
		_drgTen = drgTen;
	}

	public double getDrgValue() {
		return _drgValue;
	}

	public void setDrgValue(double drgValue) {
		_drgValue = drgValue;
	}

	public double getDrgUp() {
		return _drgUp;
	}

	public void setDrgUp(double drgUp) {
		_drgUp = drgUp;
	}

	public double getDrgDown() {
		return _drgDown;
	}

	public void setDrgDown(double drgDown) {
		_drgDown = drgDown;
	}

	private long _id;
	private int _mucBc;
	private int _nam;
	private int _thang;
	private long _orgId;
	private String _orgName;
	private String _drgMa;
	private String _drgTen;
	private double _drgValue;
	private double _drgUp;
	private double _drgDown;

}