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

import drg.moh.service.model.DashboardChiPhiThanhPhan;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing DashboardChiPhiThanhPhan in entity cache.
 *
 * @author SON
 * @generated
 */
public class DashboardChiPhiThanhPhanCacheModel
	implements CacheModel<DashboardChiPhiThanhPhan>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof DashboardChiPhiThanhPhanCacheModel)) {
			return false;
		}

		DashboardChiPhiThanhPhanCacheModel dashboardChiPhiThanhPhanCacheModel =
			(DashboardChiPhiThanhPhanCacheModel)object;

		if (id == dashboardChiPhiThanhPhanCacheModel.id) {
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
		sb.append(", orgId=");
		sb.append(orgId);
		sb.append(", orgName=");
		sb.append(orgName);
		sb.append(", phi=");
		sb.append(phi);
		sb.append(", dinhSuat=");
		sb.append(dinhSuat);
		sb.append(", drg=");
		sb.append(drg);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DashboardChiPhiThanhPhan toEntityModel() {
		DashboardChiPhiThanhPhanImpl dashboardChiPhiThanhPhanImpl =
			new DashboardChiPhiThanhPhanImpl();

		dashboardChiPhiThanhPhanImpl.setId(id);
		dashboardChiPhiThanhPhanImpl.setMucBc(mucBc);
		dashboardChiPhiThanhPhanImpl.setNam(nam);
		dashboardChiPhiThanhPhanImpl.setOrgId(orgId);

		if (orgName == null) {
			dashboardChiPhiThanhPhanImpl.setOrgName("");
		}
		else {
			dashboardChiPhiThanhPhanImpl.setOrgName(orgName);
		}

		dashboardChiPhiThanhPhanImpl.setPhi(phi);
		dashboardChiPhiThanhPhanImpl.setDinhSuat(dinhSuat);
		dashboardChiPhiThanhPhanImpl.setDrg(drg);

		dashboardChiPhiThanhPhanImpl.resetOriginalValues();

		return dashboardChiPhiThanhPhanImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		id = objectInput.readLong();

		mucBc = objectInput.readInt();

		nam = objectInput.readInt();

		orgId = objectInput.readLong();
		orgName = objectInput.readUTF();

		phi = objectInput.readDouble();

		dinhSuat = objectInput.readDouble();

		drg = objectInput.readDouble();
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

		objectOutput.writeDouble(phi);

		objectOutput.writeDouble(dinhSuat);

		objectOutput.writeDouble(drg);
	}

	public long id;
	public int mucBc;
	public int nam;
	public long orgId;
	public String orgName;
	public double phi;
	public double dinhSuat;
	public double drg;

}