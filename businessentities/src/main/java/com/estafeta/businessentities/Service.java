package com.estafeta.businessentities;

import java.io.Serializable;

public class Service implements Serializable {
	private Integer id;
	private String description;
	private Double actualDurationInHours;
	private Double actualDistanceInKm;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getActualDurationInHours() {
		return actualDurationInHours;
	}
	public void setActualDurationInHours(Double actualDurationInHours) {
		this.actualDurationInHours = actualDurationInHours;
	}
	public Double getActualDistanceInKm() {
		return actualDistanceInKm;
	}
	public void setActualDistanceInKm(Double actualDistanceInKm) {
		this.actualDistanceInKm = actualDistanceInKm;
	}
}
