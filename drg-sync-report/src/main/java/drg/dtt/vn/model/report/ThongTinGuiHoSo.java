package drg.dtt.vn.model.report;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hsbhyt_thongtinguihoso")
public class ThongTinGuiHoSo {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  	@Column(name="id")
    private Long id;
	
	private String ma;
	private String ten;
	private String ten_nguoilh;
	private String email;
	private String dienthoai;
	private String activecode;
	private int trangthai;
	private int tonggui;
	private double time_sleep;
	private String giamdoc_bv;
	private String diachi;
	private String tuyen_coso;
	
	
	
	public ThongTinGuiHoSo() {
		super();
	}

	public ThongTinGuiHoSo(String ma, String ten, String ten_nguoilh, String email, String dienthoai, String activecode,
			int trangthai, int tonggui, double time_sleep, String giamdoc_bv, String diachi, String tuyen_coso) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.ten_nguoilh = ten_nguoilh;
		this.email = email;
		this.dienthoai = dienthoai;
		this.activecode = activecode;
		this.trangthai = trangthai;
		this.tonggui = tonggui;
		this.time_sleep = time_sleep;
		this.giamdoc_bv = giamdoc_bv;
		this.diachi = diachi;
		this.tuyen_coso = tuyen_coso;
	}

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getMa() {
		return ma;
	}



	public void setMa(String ma) {
		this.ma = ma;
	}



	public String getTen() {
		return ten;
	}



	public void setTen(String ten) {
		this.ten = ten;
	}



	public String getTen_nguoilh() {
		return ten_nguoilh;
	}



	public void setTen_nguoilh(String ten_nguoilh) {
		this.ten_nguoilh = ten_nguoilh;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getDienthoai() {
		return dienthoai;
	}



	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}



	public String getActivecode() {
		return activecode;
	}



	public void setActivecode(String activecode) {
		this.activecode = activecode;
	}



	public int getTrangthai() {
		return trangthai;
	}



	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}



	public int getTonggui() {
		return tonggui;
	}



	public void setTonggui(int tonggui) {
		this.tonggui = tonggui;
	}



	public double getTime_sleep() {
		return time_sleep;
	}



	public void setTime_sleep(double time_sleep) {
		this.time_sleep = time_sleep;
	}



	public String getGiamdoc_bv() {
		return giamdoc_bv;
	}



	public void setGiamdoc_bv(String giamdoc_bv) {
		this.giamdoc_bv = giamdoc_bv;
	}



	public String getDiachi() {
		return diachi;
	}



	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}



	public String getTuyen_coso() {
		return tuyen_coso;
	}



	public void setTuyen_coso(String tuyen_coso) {
		this.tuyen_coso = tuyen_coso;
	}
	
	

}
