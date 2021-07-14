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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.RpDashboardChiPhiBinhQuanServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RpDashboardChiPhiBinhQuanSoap implements Serializable {

	public static RpDashboardChiPhiBinhQuanSoap toSoapModel(
		RpDashboardChiPhiBinhQuan model) {

		RpDashboardChiPhiBinhQuanSoap soapModel =
			new RpDashboardChiPhiBinhQuanSoap();

		soapModel.setId(model.getId());
		soapModel.setChiPhi(model.getChiPhi());
		soapModel.setBinhQuan(model.getBinhQuan());

		return soapModel;
	}

	public static RpDashboardChiPhiBinhQuanSoap[] toSoapModels(
		RpDashboardChiPhiBinhQuan[] models) {

		RpDashboardChiPhiBinhQuanSoap[] soapModels =
			new RpDashboardChiPhiBinhQuanSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardChiPhiBinhQuanSoap[][] toSoapModels(
		RpDashboardChiPhiBinhQuan[][] models) {

		RpDashboardChiPhiBinhQuanSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new RpDashboardChiPhiBinhQuanSoap
					[models.length][models[0].length];
		}
		else {
			soapModels = new RpDashboardChiPhiBinhQuanSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardChiPhiBinhQuanSoap[] toSoapModels(
		List<RpDashboardChiPhiBinhQuan> models) {

		List<RpDashboardChiPhiBinhQuanSoap> soapModels =
			new ArrayList<RpDashboardChiPhiBinhQuanSoap>(models.size());

		for (RpDashboardChiPhiBinhQuan model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new RpDashboardChiPhiBinhQuanSoap[soapModels.size()]);
	}

	public RpDashboardChiPhiBinhQuanSoap() {
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

	public double getChiPhi() {
		return _chiPhi;
	}

	public void setChiPhi(double chiPhi) {
		_chiPhi = chiPhi;
	}

	public double getBinhQuan() {
		return _binhQuan;
	}

	public void setBinhQuan(double binhQuan) {
		_binhQuan = binhQuan;
	}

	private long _id;
	private double _chiPhi;
	private double _binhQuan;

}