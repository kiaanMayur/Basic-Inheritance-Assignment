package com.capgemini.shape;

public class Polygon extends Shape { //class Polygon inherits class Shape
	
	private int totalSides; // instance members
	
	public Polygon(int totalSides) {
		this.totalSides = totalSides;
	}
	
	//overriding method
	@Override
	public void draw() {
		System.out.println("A polygon with sides " + totalSides);		
	}
}
