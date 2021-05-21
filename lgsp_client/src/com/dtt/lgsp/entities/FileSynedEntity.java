package com.dtt.lgsp.entities;

public class FileSynedEntity {
	private String id;
	private String filename;
	private String status;
	private String count;
	private String createdate;
	private String desc;
	
	public FileSynedEntity(String id,String filename,String status,String count,String createdate,String desc) {
		this.id=id;
		this.filename =filename;
		this.status=status;
		this.count=count;
		this.createdate=createdate;
		this.desc =desc;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
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
