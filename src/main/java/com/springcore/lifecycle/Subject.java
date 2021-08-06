package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Subject {
	private String name;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Subject() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Subject [name=" + name + ", marks=" + marks + "]";
	}
	
	@PostConstruct
	public void Start()
	{
		System.out.println("Inside Start Method");
	}
	
	@PreDestroy
	public void End()
	{
		System.out.println("Inside End method");
	}

}
