package drg.dtt.vn.model.nghiepvu;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hsbhyt_tonghop")
public class TongHop{
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  	@Column(name="id")
    private Long id;
	
	private String ma_lk;
	private int stt;
	private String ma_bn;
	private String ho_ten;
	private String ngay_sinh;
	private int gioi_tinh;
	private String dia_chi;
	private String ma_the;
	private String ma_dkbd;
	private String gt_the_tu;
	private String gt_the_den;
	private String mien_cung_ct;
	private String ten_benh;
	private String ma_benh;
	private String ma_benhkhac;
	private int ma_lydo_vvien;
	private String ma_noi_chuyen;
	private int ma_tai_nan;
	private String ngay_vao;
	private String ngay_ra;
	private double so_ngay_dtri;
	private int ket_qua_dtri;
	private int tinh_trang_rv;
	private String ngay_ttoan;
	private double t_thuoc;
	private double t_vtyt;
	private double t_tongchi;
	private double t_bntt;
	private double t_bncct;
	private double t_bhtt;
	private double t_nguonkhac;
	private double t_ngoaids;
	private int nam_qt;
	private int thang_qt;
	private int ma_loai_kcb;
	private String ma_khoa;
	private String ma_cskcb;
	private String ma_khuvuc;
	private String ma_pttt_qt;
	private double can_nang;
	
	private Date ngay_tao;
	private int trangthai;
	
	public TongHop() {}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMa_lk() {
		return ma_lk;
	}
	public void setMa_lk(String ma_lk) {
		this.ma_lk = ma_lk;
	}
	public int getStt() {
		return stt;
	}
	public void setStt(int stt) {
		this.stt = stt;
	}
	public String getMa_bn() {
		return ma_bn;
	}
	public void setMa_bn(String ma_bn) {
		this.ma_bn = ma_bn;
	}
	public String getHo_ten() {
		return ho_ten;
	}
	public void setHo_ten(String ho_ten) {
		this.ho_ten = ho_ten;
	}
	public String getNgay_sinh() {
		return ngay_sinh;
	}
	public void setNgay_sinh(String ngay_sinh) {
		this.ngay_sinh = ngay_sinh;
	}
	public int getGioi_tinh() {
		return gioi_tinh;
	}
	public void setGioi_tinh(int gioi_tinh) {
		this.gioi_tinh = gioi_tinh;
	}
	public String getDia_chi() {
		return dia_chi;
	}
	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}
	public String getMa_the() {
		return ma_the;
	}
	public void setMa_the(String ma_the) {
		this.ma_the = ma_the;
	}
	public String getMa_dkbd() {
		return ma_dkbd;
	}
	public void setMa_dkbd(String ma_dkbd) {
		this.ma_dkbd = ma_dkbd;
	}
	public String getGt_the_tu() {
		return gt_the_tu;
	}
	public void setGt_the_tu(String gt_the_tu) {
		this.gt_the_tu = gt_the_tu;
	}
	public String getGt_the_den() {
		return gt_the_den;
	}
	public void setGt_the_den(String gt_the_den) {
		this.gt_the_den = gt_the_den;
	}
	public String getMien_cung_ct() {
		return mien_cung_ct;
	}
	public void setMien_cung_ct(String mien_cung_ct) {
		this.mien_cung_ct = mien_cung_ct;
	}
	public String getTen_benh() {
		return ten_benh;
	}
	public void setTen_benh(String ten_benh) {
		this.ten_benh = ten_benh;
	}
	public String getMa_benh() {
		return ma_benh;
	}
	public void setMa_benh(String ma_benh) {
		this.ma_benh = ma_benh;
	}
	public String getMa_benhkhac() {
		return ma_benhkhac;
	}
	public void setMa_benhkhac(String ma_benhkhac) {
		this.ma_benhkhac = ma_benhkhac;
	}
	public int getMa_lydo_vvien() {
		return ma_lydo_vvien;
	}
	public void setMa_lydo_vvien(int ma_lydo_vvien) {
		this.ma_lydo_vvien = ma_lydo_vvien;
	}
	public String getMa_noi_chuyen() {
		return ma_noi_chuyen;
	}
	public void setMa_noi_chuyen(String ma_noi_chuyen) {
		this.ma_noi_chuyen = ma_noi_chuyen;
	}
	public int getMa_tai_nan() {
		return ma_tai_nan;
	}
	public void setMa_tai_nan(int ma_tai_nan) {
		this.ma_tai_nan = ma_tai_nan;
	}
	public String getNgay_vao() {
		return ngay_vao;
	}
	public void setNgay_vao(String ngay_vao) {
		this.ngay_vao = ngay_vao;
	}
	public String getNgay_ra() {
		return ngay_ra;
	}
	public void setNgay_ra(String ngay_ra) {
		this.ngay_ra = ngay_ra;
	}
	public double getSo_ngay_dtri() {
		return so_ngay_dtri;
	}
	public void setSo_ngay_dtri(double so_ngay_dtri) {
		this.so_ngay_dtri = so_ngay_dtri;
	}
	public int getKet_qua_dtri() {
		return ket_qua_dtri;
	}
	public void setKet_qua_dtri(int ket_qua_dtri) {
		this.ket_qua_dtri = ket_qua_dtri;
	}
	public int getTinh_trang_rv() {
		return tinh_trang_rv;
	}
	public void setTinh_trang_rv(int tinh_trang_rv) {
		this.tinh_trang_rv = tinh_trang_rv;
	}
	public String getNgay_ttoan() {
		return ngay_ttoan;
	}
	public void setNgay_ttoan(String ngay_ttoan) {
		this.ngay_ttoan = ngay_ttoan;
	}
	public double getT_thuoc() {
		return t_thuoc;
	}
	public void setT_thuoc(double t_thuoc) {
		this.t_thuoc = t_thuoc;
	}
	public double getT_vtyt() {
		return t_vtyt;
	}
	public void setT_vtyt(double t_vtyt) {
		this.t_vtyt = t_vtyt;
	}
	public double getT_tongchi() {
		return t_tongchi;
	}
	public void setT_tongchi(double t_tongchi) {
		this.t_tongchi = t_tongchi;
	}
	public double getT_bntt() {
		return t_bntt;
	}
	public void setT_bntt(double t_bntt) {
		this.t_bntt = t_bntt;
	}
	public double getT_bncct() {
		return t_bncct;
	}
	public void setT_bncct(double t_bncct) {
		this.t_bncct = t_bncct;
	}
	public double getT_bhtt() {
		return t_bhtt;
	}
	public void setT_bhtt(double t_bhtt) {
		this.t_bhtt = t_bhtt;
	}
	public double getT_nguonkhac() {
		return t_nguonkhac;
	}
	public void setT_nguonkhac(double t_nguonkhac) {
		this.t_nguonkhac = t_nguonkhac;
	}
	public double getT_ngoaids() {
		return t_ngoaids;
	}
	public void setT_ngoaids(double t_ngoaids) {
		this.t_ngoaids = t_ngoaids;
	}
	public int getNam_qt() {
		return nam_qt;
	}
	public void setNam_qt(int nam_qt) {
		this.nam_qt = nam_qt;
	}
	public int getThang_qt() {
		return thang_qt;
	}
	public void setThang_qt(int thang_qt) {
		this.thang_qt = thang_qt;
	}
	public int getMa_loai_kcb() {
		return ma_loai_kcb;
	}
	public void setMa_loai_kcb(int ma_loai_kcb) {
		this.ma_loai_kcb = ma_loai_kcb;
	}
	public String getMa_khoa() {
		return ma_khoa;
	}
	public void setMa_khoa(String ma_khoa) {
		this.ma_khoa = ma_khoa;
	}
	public String getMa_cskcb() {
		return ma_cskcb;
	}
	public void setMa_cskcb(String ma_cskcb) {
		this.ma_cskcb = ma_cskcb;
	}
	public String getMa_khuvuc() {
		return ma_khuvuc;
	}
	public void setMa_khuvuc(String ma_khuvuc) {
		this.ma_khuvuc = ma_khuvuc;
	}
	public String getMa_pttt_qt() {
		return ma_pttt_qt;
	}
	public void setMa_pttt_qt(String ma_pttt_qt) {
		this.ma_pttt_qt = ma_pttt_qt;
	}
	public double getCan_nang() {
		return can_nang;
	}
	public void setCan_nang(double can_nang) {
		this.can_nang = can_nang;
	}
	public Date getNgay_tao() {
		return ngay_tao;
	}
	public void setNgay_tao(Date ngay_tao) {
		this.ngay_tao = ngay_tao;
	}
	public int getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(int trangthai) {
		this.trangthai = trangthai;
	}
	public TongHop(String ma_lk, int stt, String ma_bn, String ho_ten, String ngay_sinh, int gioi_tinh, String dia_chi,
			String ma_the, String ma_dkbd, String gt_the_tu, String gt_the_den, String mien_cung_ct, String ten_benh,
			String ma_benh, String ma_benhkhac, int ma_lydo_vvien, String ma_noi_chuyen, int ma_tai_nan,
			String ngay_vao, String ngay_ra, double so_ngay_dtri, int ket_qua_dtri, int tinh_trang_rv, String ngay_ttoan,
			double t_thuoc, double t_vtyt, double t_tongchi, double t_bntt, double t_bncct, double t_bhtt,
			double t_nguonkhac, double t_ngoaids, int nam_qt, int thang_qt, int ma_loai_kcb, String ma_khoa,
			String ma_cskcb, String ma_khuvuc, String ma_pttt_qt, double can_nang, Date ngay_tao, int trangthai) {
		super();
		this.ma_lk = ma_lk;
		this.stt = stt;
		this.ma_bn = ma_bn;
		this.ho_ten = ho_ten;
		this.ngay_sinh = ngay_sinh;
		this.gioi_tinh = gioi_tinh;
		this.dia_chi = dia_chi;
		this.ma_the = ma_the;
		this.ma_dkbd = ma_dkbd;
		this.gt_the_tu = gt_the_tu;
		this.gt_the_den = gt_the_den;
		this.mien_cung_ct = mien_cung_ct;
		this.ten_benh = ten_benh;
		this.ma_benh = ma_benh;
		this.ma_benhkhac = ma_benhkhac;
		this.ma_lydo_vvien = ma_lydo_vvien;
		this.ma_noi_chuyen = ma_noi_chuyen;
		this.ma_tai_nan = ma_tai_nan;
		this.ngay_vao = ngay_vao;
		this.ngay_ra = ngay_ra;
		this.so_ngay_dtri = so_ngay_dtri;
		this.ket_qua_dtri = ket_qua_dtri;
		this.tinh_trang_rv = tinh_trang_rv;
		this.ngay_ttoan = ngay_ttoan;
		this.t_thuoc = t_thuoc;
		this.t_vtyt = t_vtyt;
		this.t_tongchi = t_tongchi;
		this.t_bntt = t_bntt;
		this.t_bncct = t_bncct;
		this.t_bhtt = t_bhtt;
		this.t_nguonkhac = t_nguonkhac;
		this.t_ngoaids = t_ngoaids;
		this.nam_qt = nam_qt;
		this.thang_qt = thang_qt;
		this.ma_loai_kcb = ma_loai_kcb;
		this.ma_khoa = ma_khoa;
		this.ma_cskcb = ma_cskcb;
		this.ma_khuvuc = ma_khuvuc;
		this.ma_pttt_qt = ma_pttt_qt;
		this.can_nang = can_nang;
		this.ngay_tao = ngay_tao;
		this.trangthai = trangthai;
	}
	
	
	
	

}
