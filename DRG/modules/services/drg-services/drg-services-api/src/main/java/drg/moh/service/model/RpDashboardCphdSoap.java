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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.RpDashboardCphdServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RpDashboardCphdSoap implements Serializable {

	public static RpDashboardCphdSoap toSoapModel(RpDashboardCphd model) {
		RpDashboardCphdSoap soapModel = new RpDashboardCphdSoap();

		soapModel.setId(model.getId());
		soapModel.setTenTinh(model.getTenTinh());
		soapModel.setChiPhi(model.getChiPhi());
		soapModel.setDinhSuat(model.getDinhSuat());
		soapModel.setDrg(model.getDrg());

		return soapModel;
	}

	public static RpDashboardCphdSoap[] toSoapModels(RpDashboardCphd[] models) {
		RpDashboardCphdSoap[] soapModels =
			new RpDashboardCphdSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardCphdSoap[][] toSoapModels(
		RpDashboardCphd[][] models) {

		RpDashboardCphdSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new RpDashboardCphdSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RpDashboardCphdSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardCphdSoap[] toSoapModels(
		List<RpDashboardCphd> models) {

		List<RpDashboardCphdSoap> soapModels =
			new ArrayList<RpDashboardCphdSoap>(models.size());

		for (RpDashboardCphd model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RpDashboardCphdSoap[soapModels.size()]);
	}

	public RpDashboardCphdSoap() {
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

	public double getChiPhi() {
		return _chiPhi;
	}

	public void setChiPhi(double chiPhi) {
		_chiPhi = chiPhi;
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
	private String _tenTinh;
	private double _chiPhi;
	private double _dinhSuat;
	private double _drg;

}