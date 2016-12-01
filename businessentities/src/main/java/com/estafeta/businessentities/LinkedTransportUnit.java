package com.estafeta.businessentities;

import java.io.Serializable;

public class LinkedTransportUnit implements Serializable{
	private String code;
	private String name;
	private TransportUnitType transportUnitType;
	private TransportUnitSubType transportUnitSubType;
	
	private Status status;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TransportUnitType getTransportUnitType() {
		return transportUnitType;
	}
	public void setTransportUnitType(TransportUnitType transportUnitType) {
		this.transportUnitType = transportUnitType;
	}
	public TransportUnitSubType getTransportUnitSubType() {
		return transportUnitSubType;
	}
	public void setTransportUnitSubType(TransportUnitSubType transportUnitSubType) {
		this.transportUnitSubType = transportUnitSubType;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	
}
