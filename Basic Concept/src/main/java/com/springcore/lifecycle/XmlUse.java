package com.springcore.lifecycle;

public class XmlUse {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("setting property");
		this.price = price;
	}

	public XmlUse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	public void init() {
		System.out.println("Inside init Method");
	}
	public void destory() {
		System.out.println("inside destory Method");
	}
	
}
