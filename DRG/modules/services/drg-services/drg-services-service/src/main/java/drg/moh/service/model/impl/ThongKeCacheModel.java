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

import drg.moh.service.model.ThongKe;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ThongKe in entity cache.
 *
 * @author SON
 * @generated
 */
public class ThongKeCacheModel implements CacheModel<ThongKe>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ThongKeCacheModel)) {
			return false;
		}

		ThongKeCacheModel thongKeCacheModel = (ThongKeCacheModel)object;

		if (id == thongKeCacheModel.id) {
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
		StringBundler sb = new StringBundler(15);

		sb.append("{id=");
		sb.append(id);
		sb.append(", maCoSo=");
		sb.append(maCoSo);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", thang=");
		sb.append(thang);
		sb.append(", tongHoSo=");
		sb.append(tongHoSo);
		sb.append(", tienTongChi=");
		sb.append(tienTongChi);
		sb.append(", tienBH=");
		sb.append(tienBH);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ThongKe toEntityModel() {
		ThongKeImpl thongKeImpl = new ThongKeImpl();

		thongKeImpl.setId(id);

		if (maCoSo == null) {
			thongKeImpl.setMaCoSo("");
		}
		else {
			thongKeImpl.setMaCoSo(maCoSo);
		}

		thongKeImpl.setNam(nam);
		thongKeImpl.setThang(thang);
		thongKeImpl.setTongHoSo(tongHoSo);
		thongKeImpl.setTienTongChi(tienTongChi);
		thongKeImpl.setTienBH(tienBH);

		thongKeImpl.resetOriginalValues();

		return thongKeImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		maCoSo = objectInput.readUTF();

		nam = objectInput.readInt();

		thang = objectInput.readInt();

		tongHoSo = objectInput.readLong();

		tienTongChi = objectInput.readDouble();

		tienBH = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		if (maCoSo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maCoSo);
		}

		objectOutput.writeInt(nam);

		objectOutput.writeInt(thang);

		objectOutput.writeLong(tongHoSo);

		objectOutput.writeDouble(tienTongChi);

		objectOutput.writeDouble(tienBH);
	}

	public long id;
	public String maCoSo;
	public int nam;
	public int thang;
	public long tongHoSo;
	public double tienTongChi;
	public double tienBH;

}