package com.dtt.lgsp.app.core;

public enum DrgEnum {
	BACKUP("1", "KETQUA_GUIHOSO"),
	KHONGTHANHCONG("-1", "KHONGTHANHCONG"),
	KETQUA("4", "KETQUA"),
	LOI("2", "LOI"),
	SAVE("3", "THANHCONG"),
	TITLE("3","KETQUA_DRG");
    private final String key;
    private final String value;

    DrgEnum(String key, String value) {
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
