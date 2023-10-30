package com.springocre.constructor;

public class Addition {
	private int a;
	private int b;
	    
	
	// Ambiguity Problem //
	
	
	public Addition(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("Constructor: int,int");
	}
	public Addition(double a, double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("Constructor: double,double");

	}
	public Addition(String a, String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Constructor: string,string");

	}
	
	public void addSum() {
		System.out.println("Sum is= "+(this.a+this.b));
	}

}
