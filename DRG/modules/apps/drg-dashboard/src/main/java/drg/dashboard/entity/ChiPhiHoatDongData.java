package drg.dashboard.entity;

public class ChiPhiHoatDongData{
	private String label;
	private String[] data;
	private String borderColor;
	private String[] backgroundColor;
	private String[] other;
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String[] getData() {
		return data;
	}
	public void setData(String[] data) {
		this.data = data;
	}
	public String getBorderColor() {
		return borderColor;
	}
	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}
	public String[] getBackgroundColor() {
		return backgroundColor;
	}
	public void setBackgroundColor(String[] backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
	public String[] getOther() {
		return other;
	}
	public void setOther(String[] other) {
		this.other = other;
	}
}
