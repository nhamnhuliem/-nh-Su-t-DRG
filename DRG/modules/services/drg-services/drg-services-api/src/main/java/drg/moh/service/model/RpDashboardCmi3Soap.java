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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.RpDashboardCmi3ServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RpDashboardCmi3Soap implements Serializable {

	public static RpDashboardCmi3Soap toSoapModel(RpDashboardCmi3 model) {
		RpDashboardCmi3Soap soapModel = new RpDashboardCmi3Soap();

		soapModel.setId(model.getId());
		soapModel.setCmiTinh(model.getCmiTinh());
		soapModel.setCmiTuyen(model.getCmiTuyen());
		soapModel.setCmiCoSo(model.getCmiCoSo());

		return soapModel;
	}

	public static RpDashboardCmi3Soap[] toSoapModels(RpDashboardCmi3[] models) {
		RpDashboardCmi3Soap[] soapModels =
			new RpDashboardCmi3Soap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardCmi3Soap[][] toSoapModels(
		RpDashboardCmi3[][] models) {

		RpDashboardCmi3Soap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new RpDashboardCmi3Soap[models.length][models[0].length];
		}
		else {
			soapModels = new RpDashboardCmi3Soap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardCmi3Soap[] toSoapModels(
		List<RpDashboardCmi3> models) {

		List<RpDashboardCmi3Soap> soapModels =
			new ArrayList<RpDashboardCmi3Soap>(models.size());

		for (RpDashboardCmi3 model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RpDashboardCmi3Soap[soapModels.size()]);
	}

	public RpDashboardCmi3Soap() {
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

	public double getCmiTinh() {
		return _cmiTinh;
	}

	public void setCmiTinh(double cmiTinh) {
		_cmiTinh = cmiTinh;
	}

	public double getCmiTuyen() {
		return _cmiTuyen;
	}

	public void setCmiTuyen(double cmiTuyen) {
		_cmiTuyen = cmiTuyen;
	}

	public double getCmiCoSo() {
		return _cmiCoSo;
	}

	public void setCmiCoSo(double cmiCoSo) {
		_cmiCoSo = cmiCoSo;
	}

	private long _id;
	private double _cmiTinh;
	private double _cmiTuyen;
	private double _cmiCoSo;

}