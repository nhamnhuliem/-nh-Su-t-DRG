package com.dtt.lgsp.entities;


public class TongHopThongKe {
    private Long id;
	private String maCoSo;
	private int namQT;
	private int thangQT;
	private long tongHoSo;
	private double tongChi;
	private double tongBaoHiemTT;
	
	public TongHopThongKe() {
		super();
	}

	public TongHopThongKe(String maCoSo, int namQT, int thangQT, long tongHoSo, double tongChi, double tongBaoHiemTT) {
		super();
		this.maCoSo = maCoSo;
		this.namQT = namQT;
		this.thangQT = thangQT;
		this.tongHoSo = tongHoSo;
		this.tongChi = tongChi;
		this.tongBaoHiemTT = tongBaoHiemTT;
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



	public int getNamQT() {
		return namQT;
	}



	public void setNamQT(int namQT) {
		this.namQT = namQT;
	}



	public int getThangQT() {
		return thangQT;
	}



	public void setThangQT(int thangQT) {
		this.thangQT = thangQT;
	}



	public long getTongHoSo() {
		return tongHoSo;
	}



	public void setTongHoSo(long tongHoSo) {
		this.tongHoSo = tongHoSo;
	}



	public double getTongChi() {
		return tongChi;
	}



	public void setTongChi(double tongChi) {
		this.tongChi = tongChi;
	}



	public double getTongBaoHiemTT() {
		return tongBaoHiemTT;
	}



	public void setTongBaoHiemTT(double tongBaoHiemTT) {
		this.tongBaoHiemTT = tongBaoHiemTT;
	}
	
	

	
	

}
