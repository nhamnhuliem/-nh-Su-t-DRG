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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.RpDashboardDRGServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RpDashboardDRGSoap implements Serializable {

	public static RpDashboardDRGSoap toSoapModel(RpDashboardDRG model) {
		RpDashboardDRGSoap soapModel = new RpDashboardDRGSoap();

		soapModel.setId(model.getId());
		soapModel.setDrg(model.getDrg());
		soapModel.setThang(model.getThang());
		soapModel.setValue(model.getValue());

		return soapModel;
	}

	public static RpDashboardDRGSoap[] toSoapModels(RpDashboardDRG[] models) {
		RpDashboardDRGSoap[] soapModels = new RpDashboardDRGSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardDRGSoap[][] toSoapModels(
		RpDashboardDRG[][] models) {

		RpDashboardDRGSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new RpDashboardDRGSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RpDashboardDRGSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardDRGSoap[] toSoapModels(
		List<RpDashboardDRG> models) {

		List<RpDashboardDRGSoap> soapModels = new ArrayList<RpDashboardDRGSoap>(
			models.size());

		for (RpDashboardDRG model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RpDashboardDRGSoap[soapModels.size()]);
	}

	public RpDashboardDRGSoap() {
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

	public String getDrg() {
		return _drg;
	}

	public void setDrg(String drg) {
		_drg = drg;
	}

	public String getThang() {
		return _thang;
	}

	public void setThang(String thang) {
		_thang = thang;
	}

	public double getValue() {
		return _value;
	}

	public void setValue(double value) {
		_value = value;
	}

	private long _id;
	private String _drg;
	private String _thang;
	private double _value;

}