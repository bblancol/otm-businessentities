package com.estafeta.businessentities;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	private Integer id;
	private String code;
	private String firstName;
	private String middleName;
	private String lastName1;
	private String lastName2;
	private GenericType employeeType;
	private GenericType employeePosition;
	private String drivingLicenceNumber;
	private LocatedDate drivingLicenceDueDate;
	private State drivingLicenceIssueState;
	private Location defaultWorkLocation;
	private Status status;
	private Double dailyCost;
	private GenericType company;
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName1() {
		return lastName1;
	}
	public void setLastName1(String lastName1) {
		this.lastName1 = lastName1;
	}
	public String getLastName2() {
		return lastName2;
	}
	public void setLastName2(String lastName2) {
		this.lastName2 = lastName2;
	}
	public GenericType getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(GenericType employeeType) {
		this.employeeType = employeeType;
	}
	public GenericType getEmployeePosition() {
		return employeePosition;
	}
	public void setEmployeePosition(GenericType employeePosition) {
		this.employeePosition = employeePosition;
	}
	public String getDrivingLicenceNumber() {
		return drivingLicenceNumber;
	}
	public void setDrivingLicenceNumber(String drivingLicenceNumber) {
		this.drivingLicenceNumber = drivingLicenceNumber;
	}
	public LocatedDate getDrivingLicenceDueDate() {
		return drivingLicenceDueDate;
	}
	public void setDrivingLicenceDueDate(LocatedDate drivingLicenceDueDate) {
		this.drivingLicenceDueDate = drivingLicenceDueDate;
	}
	public State getDrivingLicenceIssueState() {
		return drivingLicenceIssueState;
	}
	public void setDrivingLicenceIssueState(State drivingLicenceIssueState) {
		this.drivingLicenceIssueState = drivingLicenceIssueState;
	}

	public void setDefaultWorkLocation(Location defaultWorkLocation) {
		this.defaultWorkLocation = defaultWorkLocation;
	}
	public Location getDefaultWorkLocation() {
		return defaultWorkLocation;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public Double getDailyCost() {
		return dailyCost;
	}
	public void setDailyCost(Double dailyCost) {
		this.dailyCost = dailyCost;
	}
	public GenericType getCompany() {
		return company;
	}
	public void setCompany(GenericType company) {
		this.company = company;
	}
	
	
	
}
