package com.dtt.lgsp.entities;


public class DataConfig {
	private Long id;
    private String ma;
    private String value;
    private String description;
	public DataConfig(Long id, String ma, String value, String description) {
		super();
		this.id = id;
		this.ma = ma;
		this.value = value;
		this.description = description;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
    
    
}
