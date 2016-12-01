package com.estafeta.businessentities;

import java.io.Serializable;

public class TransportUnit implements Serializable{
	private String code;
	private String name;
	private String registrationNumber;
	private Integer year;
	private String licencePlate;
	private String vehicleNumber;
	private String circulationCard;
	private String model;
	private String brand;
	private String manufacturerName;
	private String manufacturerSerialNumber;
	private String engineSerialNumber;
	private Location maintenanceLocation;
	private String storageCapacity;
	private String companyOwner;
	private TransportUnitType transportUnitType;
	private TransportUnitSubType transportUnitSubType;
	private LinkedTransportUnit linkedTransportUnit;
	
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
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getLicencePlate() {
		return licencePlate;
	}
	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getCirculationCard() {
		return circulationCard;
	}
	public void setCirculationCard(String circulationCard) {
		this.circulationCard = circulationCard;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getManufacturerName() {
		return manufacturerName;
	}
	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}
	public String getManufacturerSerialNumber() {
		return manufacturerSerialNumber;
	}
	public void setManufacturerSerialNumber(String manufacturerSerialNumber) {
		this.manufacturerSerialNumber = manufacturerSerialNumber;
	}
	public String getEngineSerialNumber() {
		return engineSerialNumber;
	}
	public void setEngineSerialNumber(String engineSerialNumber) {
		this.engineSerialNumber = engineSerialNumber;
	}
	public Location getMaintenanceLocation() {
		return maintenanceLocation;
	}
	public void setMaintenanceLocation(Location maintenanceLocation) {
		this.maintenanceLocation = maintenanceLocation;
	}
	public String getStorageCapacity() {
		return storageCapacity;
	}
	public void setStorageCapacity(String storageCapacity) {
		this.storageCapacity = storageCapacity;
	}
	public String getCompanyOwner() {
		return companyOwner;
	}
	public void setCompanyOwner(String companyOwner) {
		this.companyOwner = companyOwner;
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
	public LinkedTransportUnit getLinkedTransportUnit() {
		return linkedTransportUnit;
	}
	public void setLinkedTransportUnit(LinkedTransportUnit linkedTransportUnit) {
		this.linkedTransportUnit = linkedTransportUnit;
	}
	
}
