package drg.dtt.vn.model.nghiepvu;

import java.math.BigDecimal;

public class JsonDataModel {
	private int thang;
	private int nam;
	private String maLk;
	private double tongChi;
	private double tongBHTT;
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public String getMaLk() {
		return maLk;
	}
	public void setMaLk(String maLk) {
		this.maLk = maLk;
	}
	public double getTongChi() {
		return tongChi;
	}
	public void setTongChi(double tongChi) {
		this.tongChi = tongChi;
	}
	public double getTongBHTT() {
		return tongBHTT;
	}
	public void setTongBHTT(double tongBHTT) {
		this.tongBHTT = tongBHTT;
	}
	public JsonDataModel(int thang, int nam, String maLk, double tongChi, double tongBHTT) {
		super();
		this.thang = thang;
		this.nam = nam;
		this.maLk = maLk;
		this.tongChi = tongChi;
		this.tongBHTT = tongBHTT;
	}
	
	
	
}
