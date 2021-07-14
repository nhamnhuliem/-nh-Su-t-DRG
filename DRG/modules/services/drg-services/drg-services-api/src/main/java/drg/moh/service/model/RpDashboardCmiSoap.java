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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.RpDashboardCmiServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RpDashboardCmiSoap implements Serializable {

	public static RpDashboardCmiSoap toSoapModel(RpDashboardCmi model) {
		RpDashboardCmiSoap soapModel = new RpDashboardCmiSoap();

		soapModel.setId(model.getId());
		soapModel.setCmiToanQuoc(model.getCmiToanQuoc());
		soapModel.setCmiTinh(model.getCmiTinh());
		soapModel.setCmiTuyen(model.getCmiTuyen());
		soapModel.setCmiTrungBinh(model.getCmiTrungBinh());
		soapModel.setCmiTrungMax(model.getCmiTrungMax());
		soapModel.setCmiTrungMin(model.getCmiTrungMin());
		soapModel.setCmiCoSo(model.getCmiCoSo());

		return soapModel;
	}

	public static RpDashboardCmiSoap[] toSoapModels(RpDashboardCmi[] models) {
		RpDashboardCmiSoap[] soapModels = new RpDashboardCmiSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardCmiSoap[][] toSoapModels(
		RpDashboardCmi[][] models) {

		RpDashboardCmiSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new RpDashboardCmiSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RpDashboardCmiSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardCmiSoap[] toSoapModels(
		List<RpDashboardCmi> models) {

		List<RpDashboardCmiSoap> soapModels = new ArrayList<RpDashboardCmiSoap>(
			models.size());

		for (RpDashboardCmi model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RpDashboardCmiSoap[soapModels.size()]);
	}

	public RpDashboardCmiSoap() {
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

	public double getCmiToanQuoc() {
		return _cmiToanQuoc;
	}

	public void setCmiToanQuoc(double cmiToanQuoc) {
		_cmiToanQuoc = cmiToanQuoc;
	}

	public double getCmiTinh() {
		return _cmiTinh;
	}

	public void setCmiTinh(double cmiTinh) {
		_cmiTinh = cmiTinh;
	}

	public String getCmiTuyen() {
		return _cmiTuyen;
	}

	public void setCmiTuyen(String cmiTuyen) {
		_cmiTuyen = cmiTuyen;
	}

	public double getCmiTrungBinh() {
		return _cmiTrungBinh;
	}

	public void setCmiTrungBinh(double cmiTrungBinh) {
		_cmiTrungBinh = cmiTrungBinh;
	}

	public double getCmiTrungMax() {
		return _cmiTrungMax;
	}

	public void setCmiTrungMax(double cmiTrungMax) {
		_cmiTrungMax = cmiTrungMax;
	}

	public double getCmiTrungMin() {
		return _cmiTrungMin;
	}

	public void setCmiTrungMin(double cmiTrungMin) {
		_cmiTrungMin = cmiTrungMin;
	}

	public double getCmiCoSo() {
		return _cmiCoSo;
	}

	public void setCmiCoSo(double cmiCoSo) {
		_cmiCoSo = cmiCoSo;
	}

	private long _id;
	private double _cmiToanQuoc;
	private double _cmiTinh;
	private String _cmiTuyen;
	private double _cmiTrungBinh;
	private double _cmiTrungMax;
	private double _cmiTrungMin;
	private double _cmiCoSo;

}