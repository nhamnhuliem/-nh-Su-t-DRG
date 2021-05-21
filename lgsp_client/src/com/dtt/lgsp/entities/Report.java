package com.dtt.lgsp.entities;

public class Report {
	private long id;
	private String maCoSo;
	private String maLk;
	private int loaiHoSo;
	private int nam;
	private int thang;
	private int trangThai;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMaCoSo() {
		return maCoSo;
	}
	public void setMaCoSo(String maCoSo) {
		this.maCoSo = maCoSo;
	}
	public String getMaLk() {
		return maLk;
	}
	public void setMaLk(String maLk) {
		this.maLk = maLk;
	}
	public int getLoaiHoSo() {
		return loaiHoSo;
	}
	public void setLoaiHoSo(int loaiHoSo) {
		this.loaiHoSo = loaiHoSo;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getTrangThai() {
		return trangThai;
	}
	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	public Report(long id, String maCoSo, String maLk, int loaiHoSo, int nam, int thang, int trangThai) {
		super();
		this.id = id;
		this.maCoSo = maCoSo;
		this.maLk = maLk;
		this.loaiHoSo = loaiHoSo;
		this.nam = nam;
		this.thang = thang;
		this.trangThai = trangThai;
	}
	
	
}
