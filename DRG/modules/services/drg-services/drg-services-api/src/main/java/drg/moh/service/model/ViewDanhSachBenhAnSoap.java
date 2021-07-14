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
 * This class is used by SOAP remote services, specifically {@link drg.moh.service.service.http.ViewDanhSachBenhAnServiceSoap}.
 *
 * @author SON
 * @deprecated As of Athanasius (7.3.x), with no direct replacement
 * @generated
 */
@Deprecated
public class ViewDanhSachBenhAnSoap implements Serializable {

	public static ViewDanhSachBenhAnSoap toSoapModel(ViewDanhSachBenhAn model) {
		ViewDanhSachBenhAnSoap soapModel = new ViewDanhSachBenhAnSoap();

		soapModel.setId(model.getId());
		soapModel.setOrgId(model.getOrgId());
		soapModel.setMaCoSo(model.getMaCoSo());
		soapModel.setTenCoSo(model.getTenCoSo());
		soapModel.setMaHoSo(model.getMaHoSo());
		soapModel.setMaBenhNhan(model.getMaBenhNhan());
		soapModel.setHoTen(model.getHoTen());
		soapModel.setMaThe(model.getMaThe());
		soapModel.setNam(model.getNam());
		soapModel.setChiPhi(model.getChiPhi());
		soapModel.setDinhSuat(model.getDinhSuat());
		soapModel.setGiaTri(model.getGiaTri());

		return soapModel;
	}

	public static ViewDanhSachBenhAnSoap[] toSoapModels(
		ViewDanhSachBenhAn[] models) {

		ViewDanhSachBenhAnSoap[] soapModels =
			new ViewDanhSachBenhAnSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ViewDanhSachBenhAnSoap[][] toSoapModels(
		ViewDanhSachBenhAn[][] models) {

		ViewDanhSachBenhAnSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels =
				new ViewDanhSachBenhAnSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ViewDanhSachBenhAnSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ViewDanhSachBenhAnSoap[] toSoapModels(
		List<ViewDanhSachBenhAn> models) {

		List<ViewDanhSachBenhAnSoap> soapModels =
			new ArrayList<ViewDanhSachBenhAnSoap>(models.size());

		for (ViewDanhSachBenhAn model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(
			new ViewDanhSachBenhAnSoap[soapModels.size()]);
	}

	public ViewDanhSachBenhAnSoap() {
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

	public long getOrgId() {
		return _orgId;
	}

	public void setOrgId(long orgId) {
		_orgId = orgId;
	}

	public String getMaCoSo() {
		return _maCoSo;
	}

	public void setMaCoSo(String maCoSo) {
		_maCoSo = maCoSo;
	}

	public String getTenCoSo() {
		return _tenCoSo;
	}

	public void setTenCoSo(String tenCoSo) {
		_tenCoSo = tenCoSo;
	}

	public String getMaHoSo() {
		return _maHoSo;
	}

	public void setMaHoSo(String maHoSo) {
		_maHoSo = maHoSo;
	}

	public String getMaBenhNhan() {
		return _maBenhNhan;
	}

	public void setMaBenhNhan(String maBenhNhan) {
		_maBenhNhan = maBenhNhan;
	}

	public String getHoTen() {
		return _hoTen;
	}

	public void setHoTen(String hoTen) {
		_hoTen = hoTen;
	}

	public String getMaThe() {
		return _maThe;
	}

	public void setMaThe(String maThe) {
		_maThe = maThe;
	}

	public int getNam() {
		return _nam;
	}

	public void setNam(int nam) {
		_nam = nam;
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

	public double getGiaTri() {
		return _giaTri;
	}

	public void setGiaTri(double giaTri) {
		_giaTri = giaTri;
	}

	private long _id;
	private long _orgId;
	private String _maCoSo;
	private String _tenCoSo;
	private String _maHoSo;
	private String _maBenhNhan;
	private String _hoTen;
	private String _maThe;
	private int _nam;
	private double _chiPhi;
	private double _dinhSuat;
	private double _giaTri;

}