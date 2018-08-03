package com.capgemini.parentchildinheritance;

public class Children extends Parents { // Children class is extending to Parent class
	
	private int j;
	
	public Children(int i, int j) {
		super(i); // invoking the c'tor of parent class
		this.j = j;
	}
	
	public void display() {
		System.out.println(j);
	}

}
