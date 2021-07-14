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

import drg.moh.service.model.RpDashboardCphd;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RpDashboardCphd in entity cache.
 *
 * @author SON
 * @generated
 */
public class RpDashboardCphdCacheModel
	implements CacheModel<RpDashboardCphd>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RpDashboardCphdCacheModel)) {
			return false;
		}

		RpDashboardCphdCacheModel rpDashboardCphdCacheModel =
			(RpDashboardCphdCacheModel)object;

		if (id == rpDashboardCphdCacheModel.id) {
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
		StringBundler sb = new StringBundler(11);

		sb.append("{id=");
		sb.append(id);
		sb.append(", tenTinh=");
		sb.append(tenTinh);
		sb.append(", chiPhi=");
		sb.append(chiPhi);
		sb.append(", dinhSuat=");
		sb.append(dinhSuat);
		sb.append(", drg=");
		sb.append(drg);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RpDashboardCphd toEntityModel() {
		RpDashboardCphdImpl rpDashboardCphdImpl = new RpDashboardCphdImpl();

		rpDashboardCphdImpl.setId(id);

		if (tenTinh == null) {
			rpDashboardCphdImpl.setTenTinh("");
		}
		else {
			rpDashboardCphdImpl.setTenTinh(tenTinh);
		}

		rpDashboardCphdImpl.setChiPhi(chiPhi);
		rpDashboardCphdImpl.setDinhSuat(dinhSuat);
		rpDashboardCphdImpl.setDrg(drg);

		rpDashboardCphdImpl.resetOriginalValues();

		return rpDashboardCphdImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		tenTinh = objectInput.readUTF();

		chiPhi = objectInput.readDouble();

		dinhSuat = objectInput.readDouble();

		drg = objectInput.readDouble();
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

		objectOutput.writeDouble(chiPhi);

		objectOutput.writeDouble(dinhSuat);

		objectOutput.writeDouble(drg);
	}

	public long id;
	public String tenTinh;
	public double chiPhi;
	public double dinhSuat;
	public double drg;

}