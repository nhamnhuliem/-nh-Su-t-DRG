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

import drg.moh.service.model.DashboardCMI;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DashboardCMI in entity cache.
 *
 * @author SON
 * @generated
 */
public class DashboardCMICacheModel
	implements CacheModel<DashboardCMI>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DashboardCMICacheModel)) {
			return false;
		}

		DashboardCMICacheModel dashboardCMICacheModel =
			(DashboardCMICacheModel)object;

		if (id == dashboardCMICacheModel.id) {
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
		StringBundler sb = new StringBundler(19);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mucBc=");
		sb.append(mucBc);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", thang=");
		sb.append(thang);
		sb.append(", orgId=");
		sb.append(orgId);
		sb.append(", orgName=");
		sb.append(orgName);
		sb.append(", cmiThap=");
		sb.append(cmiThap);
		sb.append(", cmiCao=");
		sb.append(cmiCao);
		sb.append(", cmiTrungBinh=");
		sb.append(cmiTrungBinh);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DashboardCMI toEntityModel() {
		DashboardCMIImpl dashboardCMIImpl = new DashboardCMIImpl();

		dashboardCMIImpl.setId(id);
		dashboardCMIImpl.setMucBc(mucBc);
		dashboardCMIImpl.setNam(nam);
		dashboardCMIImpl.setThang(thang);
		dashboardCMIImpl.setOrgId(orgId);

		if (orgName == null) {
			dashboardCMIImpl.setOrgName("");
		}
		else {
			dashboardCMIImpl.setOrgName(orgName);
		}

		dashboardCMIImpl.setCmiThap(cmiThap);
		dashboardCMIImpl.setCmiCao(cmiCao);
		dashboardCMIImpl.setCmiTrungBinh(cmiTrungBinh);

		dashboardCMIImpl.resetOriginalValues();

		return dashboardCMIImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mucBc = objectInput.readInt();

		nam = objectInput.readInt();

		thang = objectInput.readInt();

		orgId = objectInput.readLong();
		orgName = objectInput.readUTF();

		cmiThap = objectInput.readDouble();

		cmiCao = objectInput.readDouble();

		cmiTrungBinh = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeInt(mucBc);

		objectOutput.writeInt(nam);

		objectOutput.writeInt(thang);

		objectOutput.writeLong(orgId);

		if (orgName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(orgName);
		}

		objectOutput.writeDouble(cmiThap);

		objectOutput.writeDouble(cmiCao);

		objectOutput.writeDouble(cmiTrungBinh);
	}

	public long id;
	public int mucBc;
	public int nam;
	public int thang;
	public long orgId;
	public String orgName;
	public double cmiThap;
	public double cmiCao;
	public double cmiTrungBinh;

}