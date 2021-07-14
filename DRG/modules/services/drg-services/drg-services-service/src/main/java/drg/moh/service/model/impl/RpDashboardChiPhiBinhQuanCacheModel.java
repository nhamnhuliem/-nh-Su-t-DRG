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

import drg.moh.service.model.RpDashboardChiPhiBinhQuan;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing RpDashboardChiPhiBinhQuan in entity cache.
 *
 * @author SON
 * @generated
 */
public class RpDashboardChiPhiBinhQuanCacheModel
	implements CacheModel<RpDashboardChiPhiBinhQuan>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof RpDashboardChiPhiBinhQuanCacheModel)) {
			return false;
		}

		RpDashboardChiPhiBinhQuanCacheModel
			rpDashboardChiPhiBinhQuanCacheModel =
				(RpDashboardChiPhiBinhQuanCacheModel)object;

		if (id == rpDashboardChiPhiBinhQuanCacheModel.id) {
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
		sb.append(", chiPhi=");
		sb.append(chiPhi);
		sb.append(", binhQuan=");
		sb.append(binhQuan);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public RpDashboardChiPhiBinhQuan toEntityModel() {
		RpDashboardChiPhiBinhQuanImpl rpDashboardChiPhiBinhQuanImpl =
			new RpDashboardChiPhiBinhQuanImpl();

		rpDashboardChiPhiBinhQuanImpl.setId(id);
		rpDashboardChiPhiBinhQuanImpl.setChiPhi(chiPhi);
		rpDashboardChiPhiBinhQuanImpl.setBinhQuan(binhQuan);

		rpDashboardChiPhiBinhQuanImpl.resetOriginalValues();

		return rpDashboardChiPhiBinhQuanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		chiPhi = objectInput.readDouble();

		binhQuan = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeDouble(chiPhi);

		objectOutput.writeDouble(binhQuan);
	}

	public long id;
	public double chiPhi;
	public double binhQuan;

}