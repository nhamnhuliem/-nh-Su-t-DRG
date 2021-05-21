package drg.dtt.vn.model.nghiepvu;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "hsbhyt_chitieuvattu")
public class ChiTietVatTu {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  	@Column(name="id")
    private long id;
	
	private long tonghop_id;
	private String ma_lk;
	private int stt;
	private String ma_dich_vu;
	private String ma_vat_tu;
	private int ma_nhom;
	private String goi_vtyt;
	private String ten_vat_tu;
	private String ten_dich_vu;
	private String don_vi_tinh;
	private int pham_vi;
	private double so_luong;
	private double don_gia;
	private String tt_thau;
	private double tyle_tt;
	private double thanh_tien;
	private double t_trantt;
	private double muc_huong;
	private double t_nguonkhac;
	private double t_bntt;
	private double t_bhtt;
	private double t_bncct;
	private double t_ngoalds;
	private String ma_khoa;
	private String ma_giuong;
	private String ma_bac_si;
	private String ma_benh;
	private String ngay_yl;
	private String ngay_kq;
	private double ma_pttt;
	private Date ngay_tao;
	private int trangthai;
	
	@Column(name="ma_cskcb")
	private String maCoSo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	public String getMa_dich_vu() {
		return ma_dich_vu;
	}
	public void setMa_dich_vu(String ma_dich_vu) {
		this.ma_dich_vu = ma_dich_vu;
	}
	public String getMa_vat_tu() {
		return ma_vat_tu;
	}
	public void setMa_vat_tu(String ma_vat_tu) {
		this.ma_vat_tu = ma_vat_tu;
	}
	public int getMa_nhom() {
		return ma_nhom;
	}
	public void setMa_nhom(int ma_nhom) {
		this.ma_nhom = ma_nhom;
	}
	public String getGoi_vtyt() {
		return goi_vtyt;
	}
	public void setGoi_vtyt(String goi_vtyt) {
		this.goi_vtyt = goi_vtyt;
	}
	public String getTen_vat_tu() {
		return ten_vat_tu;
	}
	public void setTen_vat_tu(String ten_vat_tu) {
		this.ten_vat_tu = ten_vat_tu;
	}
	public String getTen_dich_vu() {
		return ten_dich_vu;
	}
	public void setTen_dich_vu(String ten_dich_vu) {
		this.ten_dich_vu = ten_dich_vu;
	}
	public String getDon_vi_tinh() {
		return don_vi_tinh;
	}
	public void setDon_vi_tinh(String don_vi_tinh) {
		this.don_vi_tinh = don_vi_tinh;
	}
	public int getPham_vi() {
		return pham_vi;
	}
	public void setPham_vi(int pham_vi) {
		this.pham_vi = pham_vi;
	}
	public double getSo_luong() {
		return so_luong;
	}
	public void setSo_luong(double so_luong) {
		this.so_luong = so_luong;
	}
	public double getDon_gia() {
		return don_gia;
	}
	public void setDon_gia(double don_gia) {
		this.don_gia = don_gia;
	}
	public String getTt_thau() {
		return tt_thau;
	}
	public void setTt_thau(String tt_thau) {
		this.tt_thau = tt_thau;
	}
	public double getTyle_tt() {
		return tyle_tt;
	}
	public void setTyle_tt(double tyle_tt) {
		this.tyle_tt = tyle_tt;
	}
	public double getThanh_tien() {
		return thanh_tien;
	}
	public void setThanh_tien(double thanh_tien) {
		this.thanh_tien = thanh_tien;
	}
	public double getT_trantt() {
		return t_trantt;
	}
	public void setT_trantt(double t_trantt) {
		this.t_trantt = t_trantt;
	}
	public double getMuc_huong() {
		return muc_huong;
	}
	public void setMuc_huong(double muc_huong) {
		this.muc_huong = muc_huong;
	}
	public double getT_nguonkhac() {
		return t_nguonkhac;
	}
	public void setT_nguonkhac(double t_nguonkhac) {
		this.t_nguonkhac = t_nguonkhac;
	}
	public double getT_bntt() {
		return t_bntt;
	}
	public void setT_bntt(double t_bntt) {
		this.t_bntt = t_bntt;
	}
	public double getT_bhtt() {
		return t_bhtt;
	}
	public void setT_bhtt(double t_bhtt) {
		this.t_bhtt = t_bhtt;
	}
	public double getT_bncct() {
		return t_bncct;
	}
	public void setT_bncct(double t_bncct) {
		this.t_bncct = t_bncct;
	}
	public double getT_ngoalds() {
		return t_ngoalds;
	}
	public void setT_ngoalds(double t_ngoalds) {
		this.t_ngoalds = t_ngoalds;
	}
	public String getMa_khoa() {
		return ma_khoa;
	}
	public void setMa_khoa(String ma_khoa) {
		this.ma_khoa = ma_khoa;
	}
	public String getMa_giuong() {
		return ma_giuong;
	}
	public void setMa_giuong(String ma_giuong) {
		this.ma_giuong = ma_giuong;
	}
	public String getMa_bac_si() {
		return ma_bac_si;
	}
	public void setMa_bac_si(String ma_bac_si) {
		this.ma_bac_si = ma_bac_si;
	}
	public String getMa_benh() {
		return ma_benh;
	}
	public void setMa_benh(String ma_benh) {
		this.ma_benh = ma_benh;
	}
	public String getNgay_yl() {
		return ngay_yl;
	}
	public void setNgay_yl(String ngay_yl) {
		this.ngay_yl = ngay_yl;
	}
	public String getNgay_kq() {
		return ngay_kq;
	}
	public void setNgay_kq(String ngay_kq) {
		this.ngay_kq = ngay_kq;
	}
	public double getMa_pttt() {
		return ma_pttt;
	}
	public void setMa_pttt(double ma_pttt) {
		this.ma_pttt = ma_pttt;
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
	
	
	
	
	public long getTonghop_id() {
		return tonghop_id;
	}
	public void setTonghop_id(long tonghop_id) {
		this.tonghop_id = tonghop_id;
	}
	public String getMaCoSo() {
		return maCoSo;
	}
	public void setMaCoSo(String maCoSo) {
		this.maCoSo = maCoSo;
	}
	public ChiTietVatTu(String ma_lk, int stt, String ma_dich_vu, String ma_vat_tu, int ma_nhom, String goi_vtyt,
			String ten_vat_tu, String ten_dich_vu, String don_vi_tinh, int pham_vi, double so_luong, double don_gia,
			String tt_thau, double tyle_tt, double thanh_tien, double t_trantt, double muc_huong, double t_nguonkhac,
			double t_bntt, double t_bhtt, double t_bncct, double t_ngoalds, String ma_khoa, String ma_giuong,
			String ma_bac_si, String ma_benh, String ngay_yl, String ngay_kq, double ma_pttt, Date ngay_tao,
			int trangthai, String maCoSo, long tonghop_id) {
		super();
		this.ma_lk = ma_lk;
		this.stt = stt;
		this.ma_dich_vu = ma_dich_vu;
		this.ma_vat_tu = ma_vat_tu;
		this.ma_nhom = ma_nhom;
		this.goi_vtyt = goi_vtyt;
		this.ten_vat_tu = ten_vat_tu;
		this.ten_dich_vu = ten_dich_vu;
		this.don_vi_tinh = don_vi_tinh;
		this.pham_vi = pham_vi;
		this.so_luong = so_luong;
		this.don_gia = don_gia;
		this.tt_thau = tt_thau;
		this.tyle_tt = tyle_tt;
		this.thanh_tien = thanh_tien;
		this.t_trantt = t_trantt;
		this.muc_huong = muc_huong;
		this.t_nguonkhac = t_nguonkhac;
		this.t_bntt = t_bntt;
		this.t_bhtt = t_bhtt;
		this.t_bncct = t_bncct;
		this.t_ngoalds = t_ngoalds;
		this.ma_khoa = ma_khoa;
		this.ma_giuong = ma_giuong;
		this.ma_bac_si = ma_bac_si;
		this.ma_benh = ma_benh;
		this.ngay_yl = ngay_yl;
		this.ngay_kq = ngay_kq;
		this.ma_pttt = ma_pttt;
		this.ngay_tao = ngay_tao;
		this.trangthai = trangthai;
		this.maCoSo = maCoSo;
		this.tonghop_id =tonghop_id;
	}

}
