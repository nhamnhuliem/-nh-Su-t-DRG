package com.dtt.lgsp.app.core;

public enum TrangThaiEnum {
	CHODONGBO(1,"Chờ đồng bộ"),
	DADONGBO(2,"Đã đồng bộ"), // da co ho so
	TAOKETQUA(3,"Đã tính toán"),
	LOIDONGBO(4,"Lỗi đồng bộ");
	
	private final Integer key;
	private final String value;
	TrangThaiEnum(Integer key, String value) {
        this.key = key;
        this.value = value;
    }
	public int getKey() {
		return key;
	}
	public String getValue() {
		return value;
	}
	
	
	
}
