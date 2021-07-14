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

import drg.moh.service.model.RpDashboardCmi;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RpDashboardCmi in entity cache.
 *
 * @author SON
 * @generated
 */
public class RpDashboardCmiCacheModel
	implements CacheModel<RpDashboardCmi>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RpDashboardCmiCacheModel)) {
			return false;
		}

		RpDashboardCmiCacheModel rpDashboardCmiCacheModel =
			(RpDashboardCmiCacheModel)object;

		if (id == rpDashboardCmiCacheModel.id) {
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
		StringBundler sb = new StringBundler(17);

		sb.append("{id=");
		sb.append(id);
		sb.append(", cmiToanQuoc=");
		sb.append(cmiToanQuoc);
		sb.append(", cmiTinh=");
		sb.append(cmiTinh);
		sb.append(", cmiTuyen=");
		sb.append(cmiTuyen);
		sb.append(", cmiTrungBinh=");
		sb.append(cmiTrungBinh);
		sb.append(", cmiTrungMax=");
		sb.append(cmiTrungMax);
		sb.append(", cmiTrungMin=");
		sb.append(cmiTrungMin);
		sb.append(", cmiCoSo=");
		sb.append(cmiCoSo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RpDashboardCmi toEntityModel() {
		RpDashboardCmiImpl rpDashboardCmiImpl = new RpDashboardCmiImpl();

		rpDashboardCmiImpl.setId(id);
		rpDashboardCmiImpl.setCmiToanQuoc(cmiToanQuoc);
		rpDashboardCmiImpl.setCmiTinh(cmiTinh);

		if (cmiTuyen == null) {
			rpDashboardCmiImpl.setCmiTuyen("");
		}
		else {
			rpDashboardCmiImpl.setCmiTuyen(cmiTuyen);
		}

		rpDashboardCmiImpl.setCmiTrungBinh(cmiTrungBinh);
		rpDashboardCmiImpl.setCmiTrungMax(cmiTrungMax);
		rpDashboardCmiImpl.setCmiTrungMin(cmiTrungMin);
		rpDashboardCmiImpl.setCmiCoSo(cmiCoSo);

		rpDashboardCmiImpl.resetOriginalValues();

		return rpDashboardCmiImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		cmiToanQuoc = objectInput.readDouble();

		cmiTinh = objectInput.readDouble();
		cmiTuyen = objectInput.readUTF();

		cmiTrungBinh = objectInput.readDouble();

		cmiTrungMax = objectInput.readDouble();

		cmiTrungMin = objectInput.readDouble();

		cmiCoSo = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeDouble(cmiToanQuoc);

		objectOutput.writeDouble(cmiTinh);

		if (cmiTuyen == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(cmiTuyen);
		}

		objectOutput.writeDouble(cmiTrungBinh);

		objectOutput.writeDouble(cmiTrungMax);

		objectOutput.writeDouble(cmiTrungMin);

		objectOutput.writeDouble(cmiCoSo);
	}

	public long id;
	public double cmiToanQuoc;
	public double cmiTinh;
	public String cmiTuyen;
	public double cmiTrungBinh;
	public double cmiTrungMax;
	public double cmiTrungMin;
	public double cmiCoSo;

}