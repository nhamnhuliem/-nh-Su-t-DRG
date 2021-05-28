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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.ThongKeBaoCaoServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ThongKeBaoCaoSoap implements Serializable {

	public static ThongKeBaoCaoSoap toSoapModel(ThongKeBaoCao model) {
		ThongKeBaoCaoSoap soapModel = new ThongKeBaoCaoSoap();

		soapModel.setId(model.getId());
		soapModel.setNam(model.getNam());
		soapModel.setThang(model.getThang());
		soapModel.setTongHoSo(model.getTongHoSo());

		return soapModel;
	}

	public static ThongKeBaoCaoSoap[] toSoapModels(ThongKeBaoCao[] models) {
		ThongKeBaoCaoSoap[] soapModels = new ThongKeBaoCaoSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ThongKeBaoCaoSoap[][] toSoapModels(ThongKeBaoCao[][] models) {
		ThongKeBaoCaoSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ThongKeBaoCaoSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ThongKeBaoCaoSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ThongKeBaoCaoSoap[] toSoapModels(List<ThongKeBaoCao> models) {
		List<ThongKeBaoCaoSoap> soapModels = new ArrayList<ThongKeBaoCaoSoap>(
			models.size());

		for (ThongKeBaoCao model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ThongKeBaoCaoSoap[soapModels.size()]);
	}

	public ThongKeBaoCaoSoap() {
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

	public long getTongHoSo() {
		return _tongHoSo;
	}

	public void setTongHoSo(long tongHoSo) {
		_tongHoSo = tongHoSo;
	}

	private long _id;
	private int _nam;
	private int _thang;
	private long _tongHoSo;

}