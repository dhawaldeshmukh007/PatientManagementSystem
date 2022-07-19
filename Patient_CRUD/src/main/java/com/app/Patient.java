 package com.app;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="patient")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="pid")
	private int pId;
	
	@Column(name="pname")
	private String pName;
	
	@Column(name="paddress")
	private String pAddress;
	
	
	
	public Patient(int pId, String pName, String pAddress) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAddress = pAddress;
	}
	public Patient() {


	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	@Override
	public String toString() {
		return "Patient [pId=" + pId + ", pName=" + pName + ", pAddress=" + pAddress + "]";
	}
	
	
}
