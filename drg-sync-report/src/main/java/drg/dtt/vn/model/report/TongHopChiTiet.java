package drg.dtt.vn.model.report;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hsbhyt_tonghop_chitiet")
public class TongHopChiTiet {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  	@Column(name="id")
    private Long id;
	@Column(name="ma_cskcb")
	private String maCoSo;
	@Column(name="ma_lk")
	private String maLk;
	@Column(name="trangthai")
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
