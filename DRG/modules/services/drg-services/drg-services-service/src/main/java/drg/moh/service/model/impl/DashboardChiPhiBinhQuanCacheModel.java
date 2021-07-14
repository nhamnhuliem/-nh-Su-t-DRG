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

import drg.moh.service.model.DashboardChiPhiBinhQuan;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DashboardChiPhiBinhQuan in entity cache.
 *
 * @author SON
 * @generated
 */
public class DashboardChiPhiBinhQuanCacheModel
	implements CacheModel<DashboardChiPhiBinhQuan>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DashboardChiPhiBinhQuanCacheModel)) {
			return false;
		}

		DashboardChiPhiBinhQuanCacheModel dashboardChiPhiBinhQuanCacheModel =
			(DashboardChiPhiBinhQuanCacheModel)object;

		if (id == dashboardChiPhiBinhQuanCacheModel.id) {
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
		sb.append(", phiBqDichVu=");
		sb.append(phiBqDichVu);
		sb.append(", phiBqBenhVien=");
		sb.append(phiBqBenhVien);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DashboardChiPhiBinhQuan toEntityModel() {
		DashboardChiPhiBinhQuanImpl dashboardChiPhiBinhQuanImpl =
			new DashboardChiPhiBinhQuanImpl();

		dashboardChiPhiBinhQuanImpl.setId(id);
		dashboardChiPhiBinhQuanImpl.setMucBc(mucBc);
		dashboardChiPhiBinhQuanImpl.setNam(nam);
		dashboardChiPhiBinhQuanImpl.setThang(thang);
		dashboardChiPhiBinhQuanImpl.setOrgId(orgId);

		if (orgName == null) {
			dashboardChiPhiBinhQuanImpl.setOrgName("");
		}
		else {
			dashboardChiPhiBinhQuanImpl.setOrgName(orgName);
		}

		dashboardChiPhiBinhQuanImpl.setPhiBqDichVu(phiBqDichVu);
		dashboardChiPhiBinhQuanImpl.setPhiBqBenhVien(phiBqBenhVien);

		dashboardChiPhiBinhQuanImpl.resetOriginalValues();

		return dashboardChiPhiBinhQuanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mucBc = objectInput.readInt();

		nam = objectInput.readInt();

		thang = objectInput.readInt();

		orgId = objectInput.readLong();
		orgName = objectInput.readUTF();

		phiBqDichVu = objectInput.readDouble();

		phiBqBenhVien = objectInput.readDouble();
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

		objectOutput.writeDouble(phiBqDichVu);

		objectOutput.writeDouble(phiBqBenhVien);
	}

	public long id;
	public int mucBc;
	public int nam;
	public int thang;
	public long orgId;
	public String orgName;
	public double phiBqDichVu;
	public double phiBqBenhVien;

}