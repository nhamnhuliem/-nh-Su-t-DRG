package com.dtt.lgsp.entities;

public class TongHopChiTiet {
    private Long id;
	private String maCoSo;
	private String maLk;
	private int trangThai;
	
	public TongHopChiTiet() {
		super();
	}

	public TongHopChiTiet(String maCoSo, String maLk, int trangThai) {
		super();
		this.maCoSo = maCoSo;
		this.maLk = maLk;
		this.trangThai = trangThai;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
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



	public int getTrangThai() {
		return trangThai;
	}



	public void setTrangThai(int trangThai) {
		this.trangThai = trangThai;
	}
	
	


	

}
