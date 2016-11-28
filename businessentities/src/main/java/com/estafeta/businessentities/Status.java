package com.estafeta.businessentities;

import java.io.Serializable;

public class Status implements Serializable {
	private Integer id;
	private String code;
	private StatusReason statusReason;
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
	public StatusReason getStatusReason() {
		return statusReason;
	}
	public void setStatusReason(StatusReason statusReason) {
		this.statusReason = statusReason;
	}
	
	
}
