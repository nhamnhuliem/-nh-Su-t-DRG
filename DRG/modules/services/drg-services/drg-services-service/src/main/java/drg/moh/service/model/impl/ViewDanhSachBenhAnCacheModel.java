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

package drg.moh.service.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import drg.moh.service.model.ViewDanhSachBenhAn;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ViewDanhSachBenhAn in entity cache.
 *
 * @author SON
 * @generated
 */
public class ViewDanhSachBenhAnCacheModel
	implements CacheModel<ViewDanhSachBenhAn>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ViewDanhSachBenhAnCacheModel)) {
			return false;
		}

		ViewDanhSachBenhAnCacheModel viewDanhSachBenhAnCacheModel =
			(ViewDanhSachBenhAnCacheModel)object;

		if (id == viewDanhSachBenhAnCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{id=");
		sb.append(id);
		sb.append(", orgId=");
		sb.append(orgId);
		sb.append(", maCoSo=");
		sb.append(maCoSo);
		sb.append(", tenCoSo=");
		sb.append(tenCoSo);
		sb.append(", maHoSo=");
		sb.append(maHoSo);
		sb.append(", maBenhNhan=");
		sb.append(maBenhNhan);
		sb.append(", hoTen=");
		sb.append(hoTen);
		sb.append(", maThe=");
		sb.append(maThe);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", chiPhi=");
		sb.append(chiPhi);
		sb.append(", dinhSuat=");
		sb.append(dinhSuat);
		sb.append(", giaTri=");
		sb.append(giaTri);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ViewDanhSachBenhAn toEntityModel() {
		ViewDanhSachBenhAnImpl viewDanhSachBenhAnImpl =
			new ViewDanhSachBenhAnImpl();

		viewDanhSachBenhAnImpl.setId(id);
		viewDanhSachBenhAnImpl.setOrgId(orgId);

		if (maCoSo == null) {
			viewDanhSachBenhAnImpl.setMaCoSo("");
		}
		else {
			viewDanhSachBenhAnImpl.setMaCoSo(maCoSo);
		}

		if (tenCoSo == null) {
			viewDanhSachBenhAnImpl.setTenCoSo("");
		}
		else {
			viewDanhSachBenhAnImpl.setTenCoSo(tenCoSo);
		}

		if (maHoSo == null) {
			viewDanhSachBenhAnImpl.setMaHoSo("");
		}
		else {
			viewDanhSachBenhAnImpl.setMaHoSo(maHoSo);
		}

		if (maBenhNhan == null) {
			viewDanhSachBenhAnImpl.setMaBenhNhan("");
		}
		else {
			viewDanhSachBenhAnImpl.setMaBenhNhan(maBenhNhan);
		}

		if (hoTen == null) {
			viewDanhSachBenhAnImpl.setHoTen("");
		}
		else {
			viewDanhSachBenhAnImpl.setHoTen(hoTen);
		}

		if (maThe == null) {
			viewDanhSachBenhAnImpl.setMaThe("");
		}
		else {
			viewDanhSachBenhAnImpl.setMaThe(maThe);
		}

		viewDanhSachBenhAnImpl.setNam(nam);
		viewDanhSachBenhAnImpl.setChiPhi(chiPhi);
		viewDanhSachBenhAnImpl.setDinhSuat(dinhSuat);
		viewDanhSachBenhAnImpl.setGiaTri(giaTri);

		viewDanhSachBenhAnImpl.resetOriginalValues();

		return viewDanhSachBenhAnImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		orgId = objectInput.readLong();
		maCoSo = objectInput.readUTF();
		tenCoSo = objectInput.readUTF();
		maHoSo = objectInput.readUTF();
		maBenhNhan = objectInput.readUTF();
		hoTen = objectInput.readUTF();
		maThe = objectInput.readUTF();

		nam = objectInput.readInt();

		chiPhi = objectInput.readDouble();

		dinhSuat = objectInput.readDouble();

		giaTri = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeLong(orgId);

		if (maCoSo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maCoSo);
		}

		if (tenCoSo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tenCoSo);
		}

		if (maHoSo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maHoSo);
		}

		if (maBenhNhan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maBenhNhan);
		}

		if (hoTen == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hoTen);
		}

		if (maThe == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maThe);
		}

		objectOutput.writeInt(nam);

		objectOutput.writeDouble(chiPhi);

		objectOutput.writeDouble(dinhSuat);

		objectOutput.writeDouble(giaTri);
	}

	public long id;
	public long orgId;
	public String maCoSo;
	public String tenCoSo;
	public String maHoSo;
	public String maBenhNhan;
	public String hoTen;
	public String maThe;
	public int nam;
	public double chiPhi;
	public double dinhSuat;
	public double giaTri;

}