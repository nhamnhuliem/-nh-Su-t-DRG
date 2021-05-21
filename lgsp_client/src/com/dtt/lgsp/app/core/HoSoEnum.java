package com.dtt.lgsp.app.core;

public enum HoSoEnum {
	HSVV("HSVV", "2"), HSQT("HSQT", "1"),
	TITLE("TITLE","HỆ THỐNG ĐỒNG BỘ DỮ LIỆU LGSP");
    private final String key;
    private final String value;

    HoSoEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
}
