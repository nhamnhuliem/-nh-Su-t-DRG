package drg.dtt.vn.model.json;

import java.util.List;

public class HoSo {
	private TongHop tongHop;
	private List<ChiTietThuoc> chiTietThuoc;
	private List<ChiTietVatTu> chiTietVatTu;
	private ThongKe thongKe;
	public TongHop getTongHop() {
		return tongHop;
	}
	public void setTongHop(TongHop tongHop) {
		this.tongHop = tongHop;
	}
	public List<ChiTietThuoc> getChiTietThuoc() {
		return chiTietThuoc;
	}
	public void setChiTietThuoc(List<ChiTietThuoc> chiTietThuoc) {
		this.chiTietThuoc = chiTietThuoc;
	}
	public List<ChiTietVatTu> getChiTietVatTu() {
		return chiTietVatTu;
	}
	public void setChiTietVatTu(List<ChiTietVatTu> chiTietVatTu) {
		this.chiTietVatTu = chiTietVatTu;
	}
	public ThongKe getThongKe() {
		return thongKe;
	}
	public void setThongKe(ThongKe thongKe) {
		this.thongKe = thongKe;
	}
	public HoSo(TongHop tongHop, List<ChiTietThuoc> chiTietThuoc, List<ChiTietVatTu> chiTietVatTu, ThongKe thongKe) {
		super();
		this.tongHop = tongHop;
		this.chiTietThuoc = chiTietThuoc;
		this.chiTietVatTu = chiTietVatTu;
		this.thongKe = thongKe;
	}
	
	
}
