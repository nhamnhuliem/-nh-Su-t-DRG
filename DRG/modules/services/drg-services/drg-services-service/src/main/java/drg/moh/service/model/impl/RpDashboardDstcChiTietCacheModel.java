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

import drg.moh.service.model.RpDashboardDstcChiTiet;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RpDashboardDstcChiTiet in entity cache.
 *
 * @author SON
 * @generated
 */
public class RpDashboardDstcChiTietCacheModel
	implements CacheModel<RpDashboardDstcChiTiet>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RpDashboardDstcChiTietCacheModel)) {
			return false;
		}

		RpDashboardDstcChiTietCacheModel rpDashboardDstcChiTietCacheModel =
			(RpDashboardDstcChiTietCacheModel)object;

		if (id.equals(rpDashboardDstcChiTietCacheModel.id)) {
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
		StringBundler sb = new StringBundler(7);

		sb.append("{id=");
		sb.append(id);
		sb.append(", tenTinh=");
		sb.append(tenTinh);
		sb.append(", dinhSuat=");
		sb.append(dinhSuat);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RpDashboardDstcChiTiet toEntityModel() {
		RpDashboardDstcChiTietImpl rpDashboardDstcChiTietImpl =
			new RpDashboardDstcChiTietImpl();

		if (id == null) {
			rpDashboardDstcChiTietImpl.setId("");
		}
		else {
			rpDashboardDstcChiTietImpl.setId(id);
		}

		if (tenTinh == null) {
			rpDashboardDstcChiTietImpl.setTenTinh("");
		}
		else {
			rpDashboardDstcChiTietImpl.setTenTinh(tenTinh);
		}

		rpDashboardDstcChiTietImpl.setDinhSuat(dinhSuat);

		rpDashboardDstcChiTietImpl.resetOriginalValues();

		return rpDashboardDstcChiTietImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readUTF();
		tenTinh = objectInput.readUTF();

		dinhSuat = objectInput.readInt();
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

		objectOutput.writeInt(dinhSuat);
	}

	public String id;
	public String tenTinh;
	public int dinhSuat;

}