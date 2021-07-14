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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.DashboardCMIServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class DashboardCMISoap implements Serializable {

	public static DashboardCMISoap toSoapModel(DashboardCMI model) {
		DashboardCMISoap soapModel = new DashboardCMISoap();

		soapModel.setId(model.getId());
		soapModel.setMucBc(model.getMucBc());
		soapModel.setNam(model.getNam());
		soapModel.setThang(model.getThang());
		soapModel.setOrgId(model.getOrgId());
		soapModel.setOrgName(model.getOrgName());
		soapModel.setCmiThap(model.getCmiThap());
		soapModel.setCmiCao(model.getCmiCao());
		soapModel.setCmiTrungBinh(model.getCmiTrungBinh());

		return soapModel;
	}

	public static DashboardCMISoap[] toSoapModels(DashboardCMI[] models) {
		DashboardCMISoap[] soapModels = new DashboardCMISoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DashboardCMISoap[][] toSoapModels(DashboardCMI[][] models) {
		DashboardCMISoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DashboardCMISoap[models.length][models[0].length];
		}
		else {
			soapModels = new DashboardCMISoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DashboardCMISoap[] toSoapModels(List<DashboardCMI> models) {
		List<DashboardCMISoap> soapModels = new ArrayList<DashboardCMISoap>(
			models.size());

		for (DashboardCMI model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DashboardCMISoap[soapModels.size()]);
	}

	public DashboardCMISoap() {
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

	public double getCmiThap() {
		return _cmiThap;
	}

	public void setCmiThap(double cmiThap) {
		_cmiThap = cmiThap;
	}

	public double getCmiCao() {
		return _cmiCao;
	}

	public void setCmiCao(double cmiCao) {
		_cmiCao = cmiCao;
	}

	public double getCmiTrungBinh() {
		return _cmiTrungBinh;
	}

	public void setCmiTrungBinh(double cmiTrungBinh) {
		_cmiTrungBinh = cmiTrungBinh;
	}

	private long _id;
	private int _mucBc;
	private int _nam;
	private int _thang;
	private long _orgId;
	private String _orgName;
	private double _cmiThap;
	private double _cmiCao;
	private double _cmiTrungBinh;

}