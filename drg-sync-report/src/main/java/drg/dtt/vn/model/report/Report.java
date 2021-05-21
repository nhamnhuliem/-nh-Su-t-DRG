package drg.dtt.vn.model.report;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hsbhyt_report")
public class Report {
  	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  	@Column(name="id")
    private Long id;
  	@Column(name = "cskcb")
    private String maCoSo;
  	@Column(name = "ma_lk")
    private String maLk;
  	@Column(name = "loai")
  	private int loaiHoSo;
  	@Column(name = "nam")
    private int nam;
  	@Column(name = "thang")
    private int thang;
  	@Column(name = "trangthai")
    private int trangThai;
  	
	@Column(name = "tongchi")
    private double tongChi;
	
	@Column(name = "tong_bhtt")
    private double tongBHTT;
  	
  	
  	
  	
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

	public Report(String maCoSo, String maLk, int loaiHoSo, int nam, int thang, int trangThai, double tongChi,
			double tongBHTT) {
		super();
		this.maCoSo = maCoSo;
		this.maLk = maLk;
		this.loaiHoSo = loaiHoSo;
		this.nam = nam;
		this.thang = thang;
		this.trangThai = trangThai;
		this.tongChi = tongChi;
		this.tongBHTT = tongBHTT;
	}
	public Report() {
		
	}
  	
  	
}
