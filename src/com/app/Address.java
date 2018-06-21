package com.app;

import java.io.Serializable;

public class Address implements Serializable {

	private int addrId;
	private String addrDetails;
	private String addrPin;

	public int getAddrId() {
		return addrId;
	}

	public void setAddrId(int addrId) {
		this.addrId = addrId;
	}

	public String getAddrDetails() {
		return addrDetails;
	}

	public void setAddrDetails(String addrDetails) {
		this.addrDetails = addrDetails;
	}

	public String getAddrPin() {
		return addrPin;
	}

	public void setAddrPin(String addrPin) {
		this.addrPin = addrPin;
	}

	public String toString() {
		return "Address [addrId=" + addrId + ", addrDetails=" + addrDetails
				+ ", addrPin=" + addrPin + "]";
	}

	public Address() {
		super();
	}

	public Address(int addrId, String addrDetails, String addrPin) {
		super();
		this.addrId = addrId;
		this.addrDetails = addrDetails;
		this.addrPin = addrPin;
	}

}
