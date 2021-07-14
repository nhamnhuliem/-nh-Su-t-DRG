package drg.dashboard.entity;

public class DinhSuatChiTietEntity {
	private String[] labels;
	private double[] dinhSuat;
	private long[] maDonVi;
	public String[] getLabels() {
		return labels;
	}
	public void setLabels(String[] labels) {
		this.labels = labels;
	}
	public double[] getDinhSuat() {
		return dinhSuat;
	}
	public void setDinhSuat(double[] dinhSuat) {
		this.dinhSuat = dinhSuat;
	}
	public long[] getMaDonVi() {
		return maDonVi;
	}
	public void setMaDonVi(long[] maDonVi) {
		this.maDonVi = maDonVi;
	}
}
