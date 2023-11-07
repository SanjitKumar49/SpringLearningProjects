package com.springcore.auto.wire.anotation;

public class Address {
	private String stree;
	private String city ;
	public String getStree() {
		return stree;
	}
	public void setStree(String stree) {
		this.stree = stree;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [stree=" + stree + ", city=" + city + "]";
	}
	

}
