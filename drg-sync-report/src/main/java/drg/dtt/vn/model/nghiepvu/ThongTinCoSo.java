package drg.dtt.vn.model.nghiepvu;

public class ThongTinCoSo {

	private String ma;
	private String ten;
	private String nguoiLienHe;
	private String email;
	private String dienThoai;
	private String giamDocBV;
	private String diaChi;
	private String tuyen;

	public ThongTinCoSo() {
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

	public String getNguoiLienHe() {
		return nguoiLienHe;
	}

	public void setNguoiLienHe(String nguoiLienHe) {
		this.nguoiLienHe = nguoiLienHe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDienThoai() {
		return dienThoai;
	}

	public void setDienThoai(String dienThoai) {
		this.dienThoai = dienThoai;
	}

	public String getGiamDocBV() {
		return giamDocBV;
	}

	public void setGiamDocBV(String giamDocBV) {
		this.giamDocBV = giamDocBV;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getTuyen() {
		return tuyen;
	}

	public void setTuyen(String tuyen) {
		this.tuyen = tuyen;
	}

	public ThongTinCoSo(String ma, String ten, String nguoiLienHe, String email, String dienThoai, String giamDocBV,
			String diaChi, String tuyen) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.nguoiLienHe = nguoiLienHe;
		this.email = email;
		this.dienThoai = dienThoai;
		this.giamDocBV = giamDocBV;
		this.diaChi = diaChi;
		this.tuyen = tuyen;
	}

	

	

}
