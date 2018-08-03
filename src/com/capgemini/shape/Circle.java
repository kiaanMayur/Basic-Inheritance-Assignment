package com.capgemini.shape;
public class Circle extends Shape { //class Circle inherits class Shape
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;	
	}
	
	@Override
	public void draw() {		
		System.out.println("drawing a circle of radius " + radius);		
	}
}