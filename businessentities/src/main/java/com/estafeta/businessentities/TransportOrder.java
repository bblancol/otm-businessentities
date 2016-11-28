package com.estafeta.businessentities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TransportOrder implements Serializable {
	private Integer id;
	private String code;
	private GenericType orderType;
	private Location sourceLocation;
	private Location destinationLocation;
	private Date orderDate;
	private Integer packageItemCount;
	private Currency monetaryAmount;
	private List<Shipment> shipments;
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
	public GenericType getOrderType() {
		return orderType;
	}
	public void setOrderType(GenericType orderType) {
		this.orderType = orderType;
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
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Integer getPackageItemCount() {
		return packageItemCount;
	}
	public void setPackageItemCount(Integer packageItemCount) {
		this.packageItemCount = packageItemCount;
	}
	public Currency getMonetaryAmount() {
		return monetaryAmount;
	}
	public void setMonetaryAmount(Currency monetaryAmount) {
		this.monetaryAmount = monetaryAmount;
	}
	public List<Shipment> getShipments() {
		return shipments;
	}
	public void setShipments(List<Shipment> shipments) {
		this.shipments = shipments;
	}
	
}
