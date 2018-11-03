package org.choco.bean;

import java.io.Serializable;

import javax.persistence.Table;

@Table(name = "box_tbl")
public class Box implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String box_name;
	
	private String address;
	
	private String longitude;
	
	private String latitude;
	
	private double distance;


	public String getBox_name() {
		return box_name;
	}

	public void setBox_name(String box_name) {
		this.box_name = box_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public Box() {
		super();
	}

}
