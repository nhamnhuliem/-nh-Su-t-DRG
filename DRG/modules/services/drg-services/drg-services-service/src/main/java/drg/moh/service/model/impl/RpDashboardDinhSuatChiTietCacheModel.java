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

import drg.moh.service.model.RpDashboardDinhSuatChiTiet;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RpDashboardDinhSuatChiTiet in entity cache.
 *
 * @author SON
 * @generated
 */
public class RpDashboardDinhSuatChiTietCacheModel
	implements CacheModel<RpDashboardDinhSuatChiTiet>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RpDashboardDinhSuatChiTietCacheModel)) {
			return false;
		}

		RpDashboardDinhSuatChiTietCacheModel
			rpDashboardDinhSuatChiTietCacheModel =
				(RpDashboardDinhSuatChiTietCacheModel)object;

		if (id == rpDashboardDinhSuatChiTietCacheModel.id) {
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
	public RpDashboardDinhSuatChiTiet toEntityModel() {
		RpDashboardDinhSuatChiTietImpl rpDashboardDinhSuatChiTietImpl =
			new RpDashboardDinhSuatChiTietImpl();

		rpDashboardDinhSuatChiTietImpl.setId(id);

		if (tenTinh == null) {
			rpDashboardDinhSuatChiTietImpl.setTenTinh("");
		}
		else {
			rpDashboardDinhSuatChiTietImpl.setTenTinh(tenTinh);
		}

		rpDashboardDinhSuatChiTietImpl.setDinhSuat(dinhSuat);

		rpDashboardDinhSuatChiTietImpl.resetOriginalValues();

		return rpDashboardDinhSuatChiTietImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		tenTinh = objectInput.readUTF();

		dinhSuat = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		if (tenTinh == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tenTinh);
		}

		objectOutput.writeDouble(dinhSuat);
	}

	public long id;
	public String tenTinh;
	public double dinhSuat;

}