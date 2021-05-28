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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.ThongKeServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ThongKeSoap implements Serializable {

	public static ThongKeSoap toSoapModel(ThongKe model) {
		ThongKeSoap soapModel = new ThongKeSoap();

		soapModel.setId(model.getId());
		soapModel.setMaCoSo(model.getMaCoSo());
		soapModel.setNam(model.getNam());
		soapModel.setThang(model.getThang());
		soapModel.setTongHoSo(model.getTongHoSo());
		soapModel.setTienTongChi(model.getTienTongChi());
		soapModel.setTienBH(model.getTienBH());

		return soapModel;
	}

	public static ThongKeSoap[] toSoapModels(ThongKe[] models) {
		ThongKeSoap[] soapModels = new ThongKeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ThongKeSoap[][] toSoapModels(ThongKe[][] models) {
		ThongKeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ThongKeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ThongKeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ThongKeSoap[] toSoapModels(List<ThongKe> models) {
		List<ThongKeSoap> soapModels = new ArrayList<ThongKeSoap>(
			models.size());

		for (ThongKe model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ThongKeSoap[soapModels.size()]);
	}

	public ThongKeSoap() {
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

	public String getMaCoSo() {
		return _maCoSo;
	}

	public void setMaCoSo(String maCoSo) {
		_maCoSo = maCoSo;
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

	public double getTienTongChi() {
		return _tienTongChi;
	}

	public void setTienTongChi(double tienTongChi) {
		_tienTongChi = tienTongChi;
	}

	public double getTienBH() {
		return _tienBH;
	}

	public void setTienBH(double tienBH) {
		_tienBH = tienBH;
	}

	private long _id;
	private String _maCoSo;
	private int _nam;
	private int _thang;
	private long _tongHoSo;
	private double _tienTongChi;
	private double _tienBH;

}