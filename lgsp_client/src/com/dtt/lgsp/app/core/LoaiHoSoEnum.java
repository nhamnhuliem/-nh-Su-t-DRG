package com.dtt.lgsp.app.core;

public enum LoaiHoSoEnum {
	QD4210("4210/QĐ-BYT", "1"), 
	QD3360("3360/BHXH-CSYT", "2");
    private final String key;
    private final String value;

    LoaiHoSoEnum(String key, String value) {
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
