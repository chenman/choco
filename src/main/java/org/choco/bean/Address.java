package org.choco.bean;

import javax.persistence.Table;

@Table(name = "address_tbl")
public class Address {

	private String address;
	private String addqr;
	private String latitude;
	private String longitude;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
