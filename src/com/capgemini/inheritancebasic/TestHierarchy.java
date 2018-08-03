package com.capgemini.inheritancebasic;

/*class to test the inheritance hierarchy of the  parent, firstchild, secondchild, grandchild*/
public class TestHierarchy {

	public static void main(String[] args) {
		
		GrandChild grandChild = new GrandChild();
		GrandChild grandSon = new GrandChild(1,2,3); 
//		1 is for class parent(i)
//		2 is for FirstChild(j)
//		3 is for GrandChild(gc)
		
		grandChild.disp();
		grandSon.disp();
		
		Parent parent = new GrandChild(); // Upcasting
		FirstChild firstChild = new GrandChild(); // Upcasting

	}

}
