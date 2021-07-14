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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.RpDashboardTrungBinhServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class RpDashboardTrungBinhSoap implements Serializable {

	public static RpDashboardTrungBinhSoap toSoapModel(
		RpDashboardTrungBinh model) {

		RpDashboardTrungBinhSoap soapModel = new RpDashboardTrungBinhSoap();

		soapModel.setData(model.getData());

		return soapModel;
	}

	public static RpDashboardTrungBinhSoap[] toSoapModels(
		RpDashboardTrungBinh[] models) {

		RpDashboardTrungBinhSoap[] soapModels =
			new RpDashboardTrungBinhSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardTrungBinhSoap[][] toSoapModels(
		RpDashboardTrungBinh[][] models) {

		RpDashboardTrungBinhSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new RpDashboardTrungBinhSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RpDashboardTrungBinhSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RpDashboardTrungBinhSoap[] toSoapModels(
		List<RpDashboardTrungBinh> models) {

		List<RpDashboardTrungBinhSoap> soapModels =
			new ArrayList<RpDashboardTrungBinhSoap>(models.size());

		for (RpDashboardTrungBinh model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new RpDashboardTrungBinhSoap[soapModels.size()]);
	}

	public RpDashboardTrungBinhSoap() {
	}

	public String getPrimaryKey() {
		return _data;
	}

	public void setPrimaryKey(String pk) {
		setData(pk);
	}

	public String getData() {
		return _data;
	}

	public void setData(String data) {
		_data = data;
	}

	private String _data;

}