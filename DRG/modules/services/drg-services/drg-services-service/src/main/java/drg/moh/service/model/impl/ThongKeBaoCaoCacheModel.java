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

import drg.moh.service.model.ThongKeBaoCao;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing ThongKeBaoCao in entity cache.
 *
 * @author SON
 * @generated
 */
public class ThongKeBaoCaoCacheModel
	implements CacheModel<ThongKeBaoCao>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof ThongKeBaoCaoCacheModel)) {
			return false;
		}

		ThongKeBaoCaoCacheModel thongKeBaoCaoCacheModel =
			(ThongKeBaoCaoCacheModel)object;

		if (id == thongKeBaoCaoCacheModel.id) {
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
		StringBundler sb = new StringBundler(9);

		sb.append("{id=");
		sb.append(id);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", thang=");
		sb.append(thang);
		sb.append(", tongHoSo=");
		sb.append(tongHoSo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ThongKeBaoCao toEntityModel() {
		ThongKeBaoCaoImpl thongKeBaoCaoImpl = new ThongKeBaoCaoImpl();

		thongKeBaoCaoImpl.setId(id);
		thongKeBaoCaoImpl.setNam(nam);
		thongKeBaoCaoImpl.setThang(thang);
		thongKeBaoCaoImpl.setTongHoSo(tongHoSo);

		thongKeBaoCaoImpl.resetOriginalValues();

		return thongKeBaoCaoImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		nam = objectInput.readInt();

		thang = objectInput.readInt();

		tongHoSo = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeInt(nam);

		objectOutput.writeInt(thang);

		objectOutput.writeLong(tongHoSo);
	}

	public long id;
	public int nam;
	public int thang;
	public long tongHoSo;

}