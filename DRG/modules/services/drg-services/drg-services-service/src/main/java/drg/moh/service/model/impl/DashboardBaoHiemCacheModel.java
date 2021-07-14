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

import drg.moh.service.model.DashboardBaoHiem;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DashboardBaoHiem in entity cache.
 *
 * @author SON
 * @generated
 */
public class DashboardBaoHiemCacheModel
	implements CacheModel<DashboardBaoHiem>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DashboardBaoHiemCacheModel)) {
			return false;
		}

		DashboardBaoHiemCacheModel dashboardBaoHiemCacheModel =
			(DashboardBaoHiemCacheModel)object;

		if (id == dashboardBaoHiemCacheModel.id) {
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
		sb.append(", thang=");
		sb.append(thang);
		sb.append(", orgId=");
		sb.append(orgId);
		sb.append(", orgName=");
		sb.append(orgName);
		sb.append(", drgMa=");
		sb.append(drgMa);
		sb.append(", drgTen=");
		sb.append(drgTen);
		sb.append(", drgValue=");
		sb.append(drgValue);
		sb.append(", drgUp=");
		sb.append(drgUp);
		sb.append(", drgDown=");
		sb.append(drgDown);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DashboardBaoHiem toEntityModel() {
		DashboardBaoHiemImpl dashboardBaoHiemImpl = new DashboardBaoHiemImpl();

		dashboardBaoHiemImpl.setId(id);
		dashboardBaoHiemImpl.setMucBc(mucBc);
		dashboardBaoHiemImpl.setNam(nam);
		dashboardBaoHiemImpl.setThang(thang);
		dashboardBaoHiemImpl.setOrgId(orgId);

		if (orgName == null) {
			dashboardBaoHiemImpl.setOrgName("");
		}
		else {
			dashboardBaoHiemImpl.setOrgName(orgName);
		}

		if (drgMa == null) {
			dashboardBaoHiemImpl.setDrgMa("");
		}
		else {
			dashboardBaoHiemImpl.setDrgMa(drgMa);
		}

		if (drgTen == null) {
			dashboardBaoHiemImpl.setDrgTen("");
		}
		else {
			dashboardBaoHiemImpl.setDrgTen(drgTen);
		}

		dashboardBaoHiemImpl.setDrgValue(drgValue);
		dashboardBaoHiemImpl.setDrgUp(drgUp);
		dashboardBaoHiemImpl.setDrgDown(drgDown);

		dashboardBaoHiemImpl.resetOriginalValues();

		return dashboardBaoHiemImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mucBc = objectInput.readInt();

		nam = objectInput.readInt();

		thang = objectInput.readInt();

		orgId = objectInput.readLong();
		orgName = objectInput.readUTF();
		drgMa = objectInput.readUTF();
		drgTen = objectInput.readUTF();

		drgValue = objectInput.readDouble();

		drgUp = objectInput.readDouble();

		drgDown = objectInput.readDouble();
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

		if (drgMa == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(drgMa);
		}

		if (drgTen == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(drgTen);
		}

		objectOutput.writeDouble(drgValue);

		objectOutput.writeDouble(drgUp);

		objectOutput.writeDouble(drgDown);
	}

	public long id;
	public int mucBc;
	public int nam;
	public int thang;
	public long orgId;
	public String orgName;
	public String drgMa;
	public String drgTen;
	public double drgValue;
	public double drgUp;
	public double drgDown;

}