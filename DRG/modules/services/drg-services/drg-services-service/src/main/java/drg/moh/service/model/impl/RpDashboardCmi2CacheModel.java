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

import drg.moh.service.model.RpDashboardCmi2;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RpDashboardCmi2 in entity cache.
 *
 * @author SON
 * @generated
 */
public class RpDashboardCmi2CacheModel
	implements CacheModel<RpDashboardCmi2>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RpDashboardCmi2CacheModel)) {
			return false;
		}

		RpDashboardCmi2CacheModel rpDashboardCmi2CacheModel =
			(RpDashboardCmi2CacheModel)object;

		if (id == rpDashboardCmi2CacheModel.id) {
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
		sb.append(", cmiTenTuyen=");
		sb.append(cmiTenTuyen);
		sb.append(", cmiTrungBinh=");
		sb.append(cmiTrungBinh);
		sb.append(", cmiTrungMax=");
		sb.append(cmiTrungMax);
		sb.append(", cmiTrungMin=");
		sb.append(cmiTrungMin);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RpDashboardCmi2 toEntityModel() {
		RpDashboardCmi2Impl rpDashboardCmi2Impl = new RpDashboardCmi2Impl();

		rpDashboardCmi2Impl.setId(id);

		if (cmiTenTuyen == null) {
			rpDashboardCmi2Impl.setCmiTenTuyen("");
		}
		else {
			rpDashboardCmi2Impl.setCmiTenTuyen(cmiTenTuyen);
		}

		rpDashboardCmi2Impl.setCmiTrungBinh(cmiTrungBinh);
		rpDashboardCmi2Impl.setCmiTrungMax(cmiTrungMax);
		rpDashboardCmi2Impl.setCmiTrungMin(cmiTrungMin);

		rpDashboardCmi2Impl.resetOriginalValues();

		return rpDashboardCmi2Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();
		cmiTenTuyen = objectInput.readUTF();

		cmiTrungBinh = objectInput.readDouble();

		cmiTrungMax = objectInput.readDouble();

		cmiTrungMin = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		if (cmiTenTuyen == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cmiTenTuyen);
		}

		objectOutput.writeDouble(cmiTrungBinh);

		objectOutput.writeDouble(cmiTrungMax);

		objectOutput.writeDouble(cmiTrungMin);
	}

	public long id;
	public String cmiTenTuyen;
	public double cmiTrungBinh;
	public double cmiTrungMax;
	public double cmiTrungMin;

}