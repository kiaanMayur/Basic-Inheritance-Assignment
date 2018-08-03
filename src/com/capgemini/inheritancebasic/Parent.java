package com.capgemini.inheritancebasic;

/*sample class Parent*/
public class Parent {
	
	private int i;
	
	// C'tor without args
	public Parent() {
		System.out.println("Parent created.");
	}
	
	// C'tor with args
	public Parent(int i) {
		this.i = i;
	}
	
	public void disp() {
		System.out.println("Parent :" + i);
	}

}
