package drg.dashboard.entity;

public class DrgEntity {
	private String label;
	private Double[] data;
	private String borderColor;
	private String backgroundColor;
	private boolean fill;
	private int pointRadius;
	private int pointHoverRadius;
	private boolean showLine;
	public boolean isFill() {
		return fill;
	}

	public void setFill(boolean fill) {
		this.fill = fill;
	}

	public int getPointRadius() {
		return pointRadius;
	}

	public void setPointRadius(int pointRadius) {
		this.pointRadius = pointRadius;
	}

	public int getPointHoverRadius() {
		return pointHoverRadius;
	}

	public void setPointHoverRadius(int pointHoverRadius) {
		this.pointHoverRadius = pointHoverRadius;
	}

	public boolean isShowLine() {
		return showLine;
	}

	public void setShowLine(boolean showLine) {
		this.showLine = showLine;
	}

	public Double[] getData() {
		return data;
	}

	public void setData(Double[] data) {
		this.data = data;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}
}
