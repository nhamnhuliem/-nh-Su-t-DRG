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

import drg.moh.service.model.RpDashboardDstc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RpDashboardDstc in entity cache.
 *
 * @author SON
 * @generated
 */
public class RpDashboardDstcCacheModel
	implements CacheModel<RpDashboardDstc>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RpDashboardDstcCacheModel)) {
			return false;
		}

		RpDashboardDstcCacheModel rpDashboardDstcCacheModel =
			(RpDashboardDstcCacheModel)object;

		if (id.equals(rpDashboardDstcCacheModel.id)) {
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
		StringBundler sb = new StringBundler(13);

		sb.append("{id=");
		sb.append(id);
		sb.append(", tenTinh=");
		sb.append(tenTinh);
		sb.append(", thang=");
		sb.append(thang);
		sb.append(", soLuot=");
		sb.append(soLuot);
		sb.append(", chiPhi=");
		sb.append(chiPhi);
		sb.append(", quyDs=");
		sb.append(quyDs);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RpDashboardDstc toEntityModel() {
		RpDashboardDstcImpl rpDashboardDstcImpl = new RpDashboardDstcImpl();

		if (id == null) {
			rpDashboardDstcImpl.setId("");
		}
		else {
			rpDashboardDstcImpl.setId(id);
		}

		if (tenTinh == null) {
			rpDashboardDstcImpl.setTenTinh("");
		}
		else {
			rpDashboardDstcImpl.setTenTinh(tenTinh);
		}

		rpDashboardDstcImpl.setThang(thang);
		rpDashboardDstcImpl.setSoLuot(soLuot);
		rpDashboardDstcImpl.setChiPhi(chiPhi);
		rpDashboardDstcImpl.setQuyDs(quyDs);

		rpDashboardDstcImpl.resetOriginalValues();

		return rpDashboardDstcImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readUTF();
		tenTinh = objectInput.readUTF();

		thang = objectInput.readInt();

		soLuot = objectInput.readInt();

		chiPhi = objectInput.readDouble();

		quyDs = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (id == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(id);
		}

		if (tenTinh == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tenTinh);
		}

		objectOutput.writeInt(thang);

		objectOutput.writeInt(soLuot);

		objectOutput.writeDouble(chiPhi);

		objectOutput.writeDouble(quyDs);
	}

	public String id;
	public String tenTinh;
	public int thang;
	public int soLuot;
	public double chiPhi;
	public double quyDs;

}