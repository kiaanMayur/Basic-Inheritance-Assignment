package com.capgemini.inheritancebasic;

public class FirstChild extends Parent{ // parent is inheriting firschild
	
	private int j;
	
	// C'tor without args
	public FirstChild() {
		System.out.println("First child created.");
	}
	
	// C'tor with args
	public FirstChild(int i , int j) {
		super(i); //to invoke the parent class c'tor
		this.j = j;
	}
	
	public void disp() {
		super.disp(); //invoke the disp() method of Parent Class
		System.out.println("First child: " + j);
	}

}

