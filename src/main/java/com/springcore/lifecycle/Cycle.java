package com.springcore.lifecycle;

public class Cycle {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Cycle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cycle [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("Inside Init Method");
	}
	
	public void destroy()
	{
		System.out.println("Inside Destroy Method");
	}

}
