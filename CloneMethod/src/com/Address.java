package com;

public class Address {
	private int pinCode;
	private String city;
	
	public Address(int pinCode, String city) {
		this.pinCode = pinCode;
		this.city = city;
	}
	
	public Address(Address adr) {
		this.pinCode = adr.pinCode;
		this.city = adr.city;
	}
	
	public Address() {
		
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", city=" + city + "]";
	}
}
