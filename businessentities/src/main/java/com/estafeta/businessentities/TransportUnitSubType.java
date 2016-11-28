package com.estafeta.businessentities;

import java.io.Serializable;

public class TransportUnitSubType implements Serializable{
	private Integer id;
	private String code;
	private String denomination;
	private String denominationOTM;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDenomination() {
		return denomination;
	}
	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}
	public String getDenominationOTM() {
		return denominationOTM;
	}
	public void setDenominationOTM(String denominationOTM) {
		this.denominationOTM = denominationOTM;
	}
	
}
