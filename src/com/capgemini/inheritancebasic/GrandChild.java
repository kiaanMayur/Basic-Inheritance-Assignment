package com.capgemini.inheritancebasic;

public class GrandChild extends FirstChild { // grandchild is inherited by firstchild which is inherited by parent class
	
	private int gc;
	
	public GrandChild() {
		System.out.println("Grand child created.");
	}
	
	public  GrandChild(int i, int j, int gc) {
		super(i ,j); // to invoke the c'tor of firstchild class
		this.gc = gc;
	}
	
	public void disp() {
		super.disp(); //invoke the disp() method of Parent Class then FirstChild class
		System.out.println("Grand child: " + gc);
	}

}
