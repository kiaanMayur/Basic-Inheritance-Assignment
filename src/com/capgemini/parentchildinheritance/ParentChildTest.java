package com.capgemini.parentchildinheritance;

/*sample class to test the hierarchy of parent and child classes*/
public class ParentChildTest {

	public static void main(String[] args) {
		
		Children child = new Children(10,20); // value 10 will be passed to parent class using super c'tor
		child.display();
		child.display("hello");

	}

}
