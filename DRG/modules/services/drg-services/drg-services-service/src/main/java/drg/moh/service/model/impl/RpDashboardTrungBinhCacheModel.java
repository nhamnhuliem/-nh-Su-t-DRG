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

import drg.moh.service.model.RpDashboardTrungBinh;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RpDashboardTrungBinh in entity cache.
 *
 * @author SON
 * @generated
 */
public class RpDashboardTrungBinhCacheModel
	implements CacheModel<RpDashboardTrungBinh>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RpDashboardTrungBinhCacheModel)) {
			return false;
		}

		RpDashboardTrungBinhCacheModel rpDashboardTrungBinhCacheModel =
			(RpDashboardTrungBinhCacheModel)object;

		if (data.equals(rpDashboardTrungBinhCacheModel.data)) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, data);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(3);

		sb.append("{data=");
		sb.append(data);

		return sb.toString();
	}

	@Override
	public RpDashboardTrungBinh toEntityModel() {
		RpDashboardTrungBinhImpl rpDashboardTrungBinhImpl =
			new RpDashboardTrungBinhImpl();

		if (data == null) {
			rpDashboardTrungBinhImpl.setData("");
		}
		else {
			rpDashboardTrungBinhImpl.setData(data);
		}

		rpDashboardTrungBinhImpl.resetOriginalValues();

		return rpDashboardTrungBinhImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		data = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (data == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(data);
		}
	}

	public String data;

}