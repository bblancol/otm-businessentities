package com.estafeta.businessentities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Shipment implements Serializable {

	private Integer id;
	private String code;
	private Status shipmentStatus;
	private Provider provider;
	private Location sourceLocation;
	private Location destinationLocation;
	private GenericType profitCenter;
	private GenericType SAPMaterial;
	private List<Service> specialServices;
	private Double grossWeigthInKg;
	private Double grossVolumeInM3;
	private Double netWeigthInKg;
	private Double netVolumeInM3;
	private LocatedDate startDate;
	private LocatedDate endDate; 
	private Employee employee;
	private TransportUnit transporUnit;
	private Double salePrice;
	
	/**
	   * This is the main method which makes use of addNum method.
	   * @param args Unused.
	   * @return Nothing.
	   * @exception IOException On input error.
	   * @see IOException
	   */
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
	public Status getShipmentStatus() {
		return shipmentStatus;
	}
	public void setShipmentStatus(Status shipmentStatus) {
		this.shipmentStatus = shipmentStatus;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public Location getSourceLocation() {
		return sourceLocation;
	}
	public void setSourceLocation(Location sourceLocation) {
		this.sourceLocation = sourceLocation;
	}
	public Location getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(Location destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	
	public GenericType getProfitCenter() {
		return profitCenter;
	}
	public void setProfitCenter(GenericType profitCenter) {
		this.profitCenter = profitCenter;
	}
	public GenericType getSAPMaterial() {
		return SAPMaterial;
	}
	public void setSAPMaterial(GenericType sAPMaterial) {
		SAPMaterial = sAPMaterial;
	}
	public List<Service> getSpecialServices() {
		return specialServices;
	}
	public void setSpecialServices(List<Service> specialServices) {
		this.specialServices = specialServices;
	}
	public Double getGrossWeigthInKg() {
		return grossWeigthInKg;
	}
	public void setGrossWeigthInKg(Double grossWeigthInKg) {
		this.grossWeigthInKg = grossWeigthInKg;
	}
	public Double getGrossVolumeInM3() {
		return grossVolumeInM3;
	}
	public void setGrossVolumeInM3(Double grossVolumeInM3) {
		this.grossVolumeInM3 = grossVolumeInM3;
	}
	public Double getNetWeigthInKg() {
		return netWeigthInKg;
	}
	public void setNetWeigthInKg(Double netWeigthInKg) {
		this.netWeigthInKg = netWeigthInKg;
	}
	public Double getNetVolumeInM3() {
		return netVolumeInM3;
	}
	public void setNetVolumeInM3(Double netVolumeInM3) {
		this.netVolumeInM3 = netVolumeInM3;
	}
	public LocatedDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocatedDate startDate) {
		this.startDate = startDate;
	}
	public LocatedDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocatedDate endDate) {
		this.endDate = endDate;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public TransportUnit getTransporUnit() {
		return transporUnit;
	}
	public void setTransporUnit(TransportUnit transporUnit) {
		this.transporUnit = transporUnit;
	}
	public Double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

}
