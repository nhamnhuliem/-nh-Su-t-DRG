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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.RpDashboardCmi2ServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RpDashboardCmi2Soap implements Serializable {

	public static RpDashboardCmi2Soap toSoapModel(RpDashboardCmi2 model) {
		RpDashboardCmi2Soap soapModel = new RpDashboardCmi2Soap();

		soapModel.setId(model.getId());
		soapModel.setCmiTenTuyen(model.getCmiTenTuyen());
		soapModel.setCmiTrungBinh(model.getCmiTrungBinh());
		soapModel.setCmiTrungMax(model.getCmiTrungMax());
		soapModel.setCmiTrungMin(model.getCmiTrungMin());

		return soapModel;
	}

	public static RpDashboardCmi2Soap[] toSoapModels(RpDashboardCmi2[] models) {
		RpDashboardCmi2Soap[] soapModels =
			new RpDashboardCmi2Soap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardCmi2Soap[][] toSoapModels(
		RpDashboardCmi2[][] models) {

		RpDashboardCmi2Soap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new RpDashboardCmi2Soap[models.length][models[0].length];
		}
		else {
			soapModels = new RpDashboardCmi2Soap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardCmi2Soap[] toSoapModels(
		List<RpDashboardCmi2> models) {

		List<RpDashboardCmi2Soap> soapModels =
			new ArrayList<RpDashboardCmi2Soap>(models.size());

		for (RpDashboardCmi2 model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RpDashboardCmi2Soap[soapModels.size()]);
	}

	public RpDashboardCmi2Soap() {
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

	public String getCmiTenTuyen() {
		return _cmiTenTuyen;
	}

	public void setCmiTenTuyen(String cmiTenTuyen) {
		_cmiTenTuyen = cmiTenTuyen;
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

	private long _id;
	private String _cmiTenTuyen;
	private double _cmiTrungBinh;
	private double _cmiTrungMax;
	private double _cmiTrungMin;

}