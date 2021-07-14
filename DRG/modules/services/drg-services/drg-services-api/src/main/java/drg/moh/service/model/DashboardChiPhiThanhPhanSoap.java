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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.DashboardChiPhiThanhPhanServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class DashboardChiPhiThanhPhanSoap implements Serializable {

	public static DashboardChiPhiThanhPhanSoap toSoapModel(
		DashboardChiPhiThanhPhan model) {

		DashboardChiPhiThanhPhanSoap soapModel =
			new DashboardChiPhiThanhPhanSoap();

		soapModel.setId(model.getId());
		soapModel.setMucBc(model.getMucBc());
		soapModel.setNam(model.getNam());
		soapModel.setOrgId(model.getOrgId());
		soapModel.setOrgName(model.getOrgName());
		soapModel.setPhi(model.getPhi());
		soapModel.setDinhSuat(model.getDinhSuat());
		soapModel.setDrg(model.getDrg());

		return soapModel;
	}

	public static DashboardChiPhiThanhPhanSoap[] toSoapModels(
		DashboardChiPhiThanhPhan[] models) {

		DashboardChiPhiThanhPhanSoap[] soapModels =
			new DashboardChiPhiThanhPhanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DashboardChiPhiThanhPhanSoap[][] toSoapModels(
		DashboardChiPhiThanhPhan[][] models) {

		DashboardChiPhiThanhPhanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new DashboardChiPhiThanhPhanSoap
					[models.length][models[0].length];
		}
		else {
			soapModels = new DashboardChiPhiThanhPhanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DashboardChiPhiThanhPhanSoap[] toSoapModels(
		List<DashboardChiPhiThanhPhan> models) {

		List<DashboardChiPhiThanhPhanSoap> soapModels =
			new ArrayList<DashboardChiPhiThanhPhanSoap>(models.size());

		for (DashboardChiPhiThanhPhan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new DashboardChiPhiThanhPhanSoap[soapModels.size()]);
	}

	public DashboardChiPhiThanhPhanSoap() {
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

	public double getPhi() {
		return _phi;
	}

	public void setPhi(double phi) {
		_phi = phi;
	}

	public double getDinhSuat() {
		return _dinhSuat;
	}

	public void setDinhSuat(double dinhSuat) {
		_dinhSuat = dinhSuat;
	}

	public double getDrg() {
		return _drg;
	}

	public void setDrg(double drg) {
		_drg = drg;
	}

	private long _id;
	private int _mucBc;
	private int _nam;
	private long _orgId;
	private String _orgName;
	private double _phi;
	private double _dinhSuat;
	private double _drg;

}