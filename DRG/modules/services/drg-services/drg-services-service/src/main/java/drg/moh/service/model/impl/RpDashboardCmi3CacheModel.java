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

import drg.moh.service.model.RpDashboardCmi3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RpDashboardCmi3 in entity cache.
 *
 * @author SON
 * @generated
 */
public class RpDashboardCmi3CacheModel
	implements CacheModel<RpDashboardCmi3>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RpDashboardCmi3CacheModel)) {
			return false;
		}

		RpDashboardCmi3CacheModel rpDashboardCmi3CacheModel =
			(RpDashboardCmi3CacheModel)object;

		if (id == rpDashboardCmi3CacheModel.id) {
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
		sb.append(", cmiTinh=");
		sb.append(cmiTinh);
		sb.append(", cmiTuyen=");
		sb.append(cmiTuyen);
		sb.append(", cmiCoSo=");
		sb.append(cmiCoSo);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RpDashboardCmi3 toEntityModel() {
		RpDashboardCmi3Impl rpDashboardCmi3Impl = new RpDashboardCmi3Impl();

		rpDashboardCmi3Impl.setId(id);
		rpDashboardCmi3Impl.setCmiTinh(cmiTinh);
		rpDashboardCmi3Impl.setCmiTuyen(cmiTuyen);
		rpDashboardCmi3Impl.setCmiCoSo(cmiCoSo);

		rpDashboardCmi3Impl.resetOriginalValues();

		return rpDashboardCmi3Impl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		cmiTinh = objectInput.readDouble();

		cmiTuyen = objectInput.readDouble();

		cmiCoSo = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeDouble(cmiTinh);

		objectOutput.writeDouble(cmiTuyen);

		objectOutput.writeDouble(cmiCoSo);
	}

	public long id;
	public double cmiTinh;
	public double cmiTuyen;
	public double cmiCoSo;

}