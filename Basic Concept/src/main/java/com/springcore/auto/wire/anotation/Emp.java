package com.springcore.auto.wire.anotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
 private Address address;

public Address getAddress() {
	return address;
}
@Autowired
public void setAddress(Address address) {
	System.out.println("seterMethod");
	this.address = address;
}

public Emp() {
	super();
	// TODO Auto-generated constructor stub
}

public Emp(Address address) {
	super();
	this.address = address;
}

@Override
public String toString() {
	return "Emp [address=" + address + "]";
}

 
}
