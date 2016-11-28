package com.estafeta.businessentities;

import java.io.Serializable;

public class Packing implements Serializable {
	private int id;
	private String code;
	private GenericType packingType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public GenericType getPackingType() {
		return packingType;
	}
	public void setPackingType(GenericType packingType) {
		this.packingType = packingType;
	}
	
}
