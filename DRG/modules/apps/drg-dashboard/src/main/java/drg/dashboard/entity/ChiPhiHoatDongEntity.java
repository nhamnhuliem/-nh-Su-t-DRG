package drg.dashboard.entity;

public class ChiPhiHoatDongEntity {
	private ChiPhiHoatDongData drg;
	private ChiPhiHoatDongData dinhSuat;
	private ChiPhiHoatDongData phiDichVu;
	private TinhThanhData[] tinhThanh;
	private String[] labels;
	public String[] getLabels() {
		return labels;
	}
	public void setLabels(String[] labels) {
		this.labels = labels;
	}
	public ChiPhiHoatDongData getDrg() {
		return drg;
	}
	public void setDrg(ChiPhiHoatDongData drg) {
		this.drg = drg;
	}
	public ChiPhiHoatDongData getDinhSuat() {
		return dinhSuat;
	}
	public void setDinhSuat(ChiPhiHoatDongData dinhSuat) {
		this.dinhSuat = dinhSuat;
	}
	public ChiPhiHoatDongData getPhiDichVu() {
		return phiDichVu;
	}
	public void setPhiDichVu(ChiPhiHoatDongData phiDichVu) {
		this.phiDichVu = phiDichVu;
	}
	public TinhThanhData[] getTinhThanh() {
		return tinhThanh;
	}
	public void setTinhThanh(TinhThanhData[] tinhThanh) {
		this.tinhThanh = tinhThanh;
	}
	
}
