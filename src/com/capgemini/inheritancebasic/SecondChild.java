package com.capgemini.inheritancebasic;

public class SecondChild extends Parent{ // secondChild is extending the Parent class
	
	private int k;
	
	// C'tor without args
	public SecondChild() {
		System.out.println("Second child created.");
	}
	
	// C'tor with args
	public SecondChild(int i, int k){
		
		super(i);
		this.k = k;
	}
	
	public void disp() {
		super.disp();
		System.out.println("Second child: " + k);
	}

}
