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

import drg.moh.service.model.DashboardChiPhiHoatDong;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DashboardChiPhiHoatDong in entity cache.
 *
 * @author SON
 * @generated
 */
public class DashboardChiPhiHoatDongCacheModel
	implements CacheModel<DashboardChiPhiHoatDong>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DashboardChiPhiHoatDongCacheModel)) {
			return false;
		}

		DashboardChiPhiHoatDongCacheModel dashboardChiPhiHoatDongCacheModel =
			(DashboardChiPhiHoatDongCacheModel)object;

		if (id == dashboardChiPhiHoatDongCacheModel.id) {
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
		StringBundler sb = new StringBundler(23);

		sb.append("{id=");
		sb.append(id);
		sb.append(", mucBc=");
		sb.append(mucBc);
		sb.append(", nam=");
		sb.append(nam);
		sb.append(", orgId=");
		sb.append(orgId);
		sb.append(", orgName=");
		sb.append(orgName);
		sb.append(", thanhPhanId=");
		sb.append(thanhPhanId);
		sb.append(", thanhPhanMa=");
		sb.append(thanhPhanMa);
		sb.append(", thanhPhanTen=");
		sb.append(thanhPhanTen);
		sb.append(", drgPhiDv=");
		sb.append(drgPhiDv);
		sb.append(", drgDinhSuat=");
		sb.append(drgDinhSuat);
		sb.append(", drgValues=");
		sb.append(drgValues);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DashboardChiPhiHoatDong toEntityModel() {
		DashboardChiPhiHoatDongImpl dashboardChiPhiHoatDongImpl =
			new DashboardChiPhiHoatDongImpl();

		dashboardChiPhiHoatDongImpl.setId(id);
		dashboardChiPhiHoatDongImpl.setMucBc(mucBc);
		dashboardChiPhiHoatDongImpl.setNam(nam);
		dashboardChiPhiHoatDongImpl.setOrgId(orgId);

		if (orgName == null) {
			dashboardChiPhiHoatDongImpl.setOrgName("");
		}
		else {
			dashboardChiPhiHoatDongImpl.setOrgName(orgName);
		}

		if (thanhPhanId == null) {
			dashboardChiPhiHoatDongImpl.setThanhPhanId("");
		}
		else {
			dashboardChiPhiHoatDongImpl.setThanhPhanId(thanhPhanId);
		}

		if (thanhPhanMa == null) {
			dashboardChiPhiHoatDongImpl.setThanhPhanMa("");
		}
		else {
			dashboardChiPhiHoatDongImpl.setThanhPhanMa(thanhPhanMa);
		}

		if (thanhPhanTen == null) {
			dashboardChiPhiHoatDongImpl.setThanhPhanTen("");
		}
		else {
			dashboardChiPhiHoatDongImpl.setThanhPhanTen(thanhPhanTen);
		}

		dashboardChiPhiHoatDongImpl.setDrgPhiDv(drgPhiDv);
		dashboardChiPhiHoatDongImpl.setDrgDinhSuat(drgDinhSuat);
		dashboardChiPhiHoatDongImpl.setDrgValues(drgValues);

		dashboardChiPhiHoatDongImpl.resetOriginalValues();

		return dashboardChiPhiHoatDongImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mucBc = objectInput.readInt();

		nam = objectInput.readInt();

		orgId = objectInput.readLong();
		orgName = objectInput.readUTF();
		thanhPhanId = objectInput.readUTF();
		thanhPhanMa = objectInput.readUTF();
		thanhPhanTen = objectInput.readUTF();

		drgPhiDv = objectInput.readDouble();

		drgDinhSuat = objectInput.readDouble();

		drgValues = objectInput.readDouble();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(id);

		objectOutput.writeInt(mucBc);

		objectOutput.writeInt(nam);

		objectOutput.writeLong(orgId);

		if (orgName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(orgName);
		}

		if (thanhPhanId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thanhPhanId);
		}

		if (thanhPhanMa == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thanhPhanMa);
		}

		if (thanhPhanTen == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(thanhPhanTen);
		}

		objectOutput.writeDouble(drgPhiDv);

		objectOutput.writeDouble(drgDinhSuat);

		objectOutput.writeDouble(drgValues);
	}

	public long id;
	public int mucBc;
	public int nam;
	public long orgId;
	public String orgName;
	public String thanhPhanId;
	public String thanhPhanMa;
	public String thanhPhanTen;
	public double drgPhiDv;
	public double drgDinhSuat;
	public double drgValues;

}