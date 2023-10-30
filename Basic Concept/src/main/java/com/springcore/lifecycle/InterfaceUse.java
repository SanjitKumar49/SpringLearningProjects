package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfaceUse  implements InitializingBean,DisposableBean{

	 private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public InterfaceUse(double price) {
		super();
		this.price = price;
	}

	@Override
	public String toString() {
		return "InterfaceUse [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("taking pepsi: init");
		
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
	 
	
}
