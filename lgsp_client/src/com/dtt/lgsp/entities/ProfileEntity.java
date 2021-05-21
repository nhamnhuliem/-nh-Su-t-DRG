package com.dtt.lgsp.entities;

public class ProfileEntity {
	private String folder;
	private String urlWs;
	private int secondRun;
	private boolean displayNotification;
	private String maCoSo;
	private String activecode;
	private String primaryActivecode;
	private boolean isActive;
	private double timeSlepp;
	private String version;
	private String clientVersion;
	private int loaiHoSo;

	public ProfileEntity() {
	}

	public ProfileEntity(String folder, String urlWs, int secondRun, boolean displayNotification, String maCoSo,
			String activecode, boolean isActive, double timeSlepp, String primaryActivecode, String version, String clientVersion, int loaiHoSo) {
		this.folder = folder;
		this.urlWs = urlWs;
		this.secondRun = secondRun;
		this.displayNotification = displayNotification;
		this.maCoSo = maCoSo;
		this.activecode = activecode;
		this.isActive = isActive;
		this.timeSlepp = timeSlepp;
		this.primaryActivecode = primaryActivecode;
		this.version = version;
		this.clientVersion = clientVersion;
		this.loaiHoSo=loaiHoSo;
	}

	public int getLoaiHoSo() {
		return loaiHoSo;
	}

	public void setLoaiHoSo(int loaiHoSo) {
		this.loaiHoSo = loaiHoSo;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public String getUrlWs() {
		return urlWs;
	}

	public void setUrlWs(String urlWs) {
		this.urlWs = urlWs;
	}

	public int getSecondRun() {
		return secondRun;
	}

	public void setSecondRun(int secondRun) {
		this.secondRun = secondRun;
	}

	public boolean isDisplayNotification() {
		return displayNotification;
	}

	public void setDisplayNotification(boolean displayNotification) {
		this.displayNotification = displayNotification;
	}

	public String getMaCoSo() {
		return maCoSo;
	}

	public void setMaCoSo(String maCoSo) {
		this.maCoSo = maCoSo;
	}

	public String getActivecode() {
		return activecode;
	}

	public void setActivecode(String activecode) {
		this.activecode = activecode;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public double getTimeSlepp() {
		return timeSlepp;
	}

	public void setTimeSlepp(double timeSlepp) {
		this.timeSlepp = timeSlepp;
	}

	public String getPrimaryActivecode() {
		return primaryActivecode;
	}

	public void setPrimaryActivecode(String primaryActivecode) {
		this.primaryActivecode = primaryActivecode;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getClientVersion() {
		return clientVersion;
	}

	public void setClientVersion(String clientVersion) {
		this.clientVersion = clientVersion;
	}
	
	

}
