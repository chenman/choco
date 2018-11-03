package org.choco.bean;

import javax.persistence.Table;

@Table(name = "address_tbl")
public class Address {

	private String qx;
	private String village;
	private String address;
	private String addid;
	private String addqr;
	private String latitude;
	private String longitude;
	public String getQx() {
		return qx;
	}
	public void setQx(String qx) {
		this.qx = qx;
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddid() {
		return addid;
	}
	public void setAddid(String addid) {
		this.addid = addid;
	}
	public String getAddqr() {
		return addqr;
	}
	public void setAddqr(String addqr) {
		this.addqr = addqr;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	

}
