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

import drg.moh.service.model.RpDashboardDRG;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RpDashboardDRG in entity cache.
 *
 * @author SON
 * @generated
 */
public class RpDashboardDRGCacheModel
	implements CacheModel<RpDashboardDRG>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RpDashboardDRGCacheModel)) {
			return false;
		}

		RpDashboardDRGCacheModel rpDashboardDRGCacheModel =
			(RpDashboardDRGCacheModel)object;

		if (id == rpDashboardDRGCacheModel.id) {
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
		sb.append(", drg=");
		sb.append(drg);
		sb.append(", thang=");
		sb.append(thang);
		sb.append(", value=");
		sb.append(value);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RpDashboardDRG toEntityModel() {
		RpDashboardDRGImpl rpDashboardDRGImpl = new RpDashboardDRGImpl();

		rpDashboardDRGImpl.setId(id);

		if (drg == null) {
			rpDashboardDRGImpl.setDrg("");
		}
		else {
			rpDashboardDRGImpl.setDrg(drg);
		}

		if (thang == null) {
			rpDashboardDRGImpl.setThang("");
		}
		else {
			rpDashboardDRGImpl.setThang(thang);
		}

		rpDashboardDRGImpl.setValue(value);

		rpDashboardDRGImpl.resetOriginalValues();

		return rpDashboardDRGImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		drg = objectInput.readUTF();
		thang = objectInput.readUTF();

		value = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		if (drg == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(drg);
		}

		if (thang == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thang);
		}

		objectOutput.writeDouble(value);
	}

	public long id;
	public String drg;
	public String thang;
	public double value;

}