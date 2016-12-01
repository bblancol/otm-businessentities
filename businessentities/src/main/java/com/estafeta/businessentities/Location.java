package com.estafeta.businessentities;

import java.io.Serializable; 

import com.fasterxml.jackson.annotation.JsonAutoDetect; 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.ws.rs.Path; 
import javax.ws.rs.PathParam;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
 
@JsonRootName(value="Location")
@JsonAutoDetect
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location implements Serializable {
	@PathParam("id")	
	private Integer id;
	@PathParam("code")
	private String code;
	@PathParam("name")
	private String name;
	@PathParam("address")
	private String address;
	private String address2;
	private String additionalNotes;
	private String outdoorNumber;
	private String interiorNumber;
	private String referenceStreet1;
	private String referenceStreet2;
	
	private District district;
	private City city;
	private Province province;
	private State state;
	private Country country;
	private String postalCode;
	private Double latitude;
	private Double longitude;
	
	@Getter
	public Integer getId() {
		return id;
	}
	
	@Setter
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Getter
	public String getCode() {
		return code;
	}
	
	@Setter
	public void setCode(String code) {
		this.code = code;
	}
	
	@Getter
	public String getName() {
		return name;
	}
	
	@Setter
	public void setName(String name) {
		this.name = name;
	}
	
	@Getter
	public String getAddress() {
		return address;
	}
	
	@Setter
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getAdditionalNotes() {
		return additionalNotes;
	}
	public void setAdditionalNotes(String additionalNotes) {
		this.additionalNotes = additionalNotes;
	}
	public String getOutdoorNumber() {
		return outdoorNumber;
	}
	public void setOutdoorNumber(String outdoorNumber) {
		this.outdoorNumber = outdoorNumber;
	}
	public String getInteriorNumber() {
		return interiorNumber;
	}
	public void setInteriorNumber(String interiorNumber) {
		this.interiorNumber = interiorNumber;
	}
	public String getReferenceStreet1() {
		return referenceStreet1;
	}
	public void setReferenceStreet1(String referenceStreet1) {
		this.referenceStreet1 = referenceStreet1;
	}
	public String getReferenceStreet2() {
		return referenceStreet2;
	}
	public void setReferenceStreet2(String referenceStreet2) {
		this.referenceStreet2 = referenceStreet2;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	public Province getProvince() {
		return province;
	}
	public void setProvince(Province province) {
		this.province = province;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	
	
}
