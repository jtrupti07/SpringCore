package com.springcore.cons;

public class Addition {
	private int a;
	private int b;
	
	public Addition(double a,double b)
	{
		this.a=(int) a;
		this.b=(int) b;
		System.out.println("Constructor with double,double parameter");
	}
	
	public Addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Constructor with int,int parameter");
	}
	public Addition(String a,String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("Constructor with string,string parameter");
	}
	
	
	
	public void doSum()
	{
		System.out.println("Value of a: "+this.a);
		System.out.println("Value of b: "+this.b);
		System.out.println("Addition is: "+(this.a+this.b));
	}

}
