package com.dtt.lgsp.entities;

public class HoSoSyncEntity {
	private String id;
	private String malk;
	private String createdate;
	private String desc;
	
	public HoSoSyncEntity(String id, String malk, String createdate, String desc) {
		super();
		this.id = id;
		this.malk = malk;
		this.createdate = createdate;
		this.desc = desc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMalk() {
		return malk;
	}
	public void setMalk(String malk) {
		this.malk = malk;
	}
	public String getCreatedate() {
		return createdate;
	}
	public void setCreatedate(String createdate) {
		this.createdate = createdate;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
}
