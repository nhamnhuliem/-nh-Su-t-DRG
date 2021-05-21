package com.dtt.lgsp.app.config;

public enum CrontabConfiguration {
	MAX_ITEMS("MAX_ITEM", 100),
	MAX_LENGTH("MAX_LENGTH",1024); // 5mb
    private final String key;
    private final Integer value;

    CrontabConfiguration(String key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }
    public Integer getValue() {
        return value;
    }
}
