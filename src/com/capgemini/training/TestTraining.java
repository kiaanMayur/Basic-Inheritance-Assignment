package com.capgemini.training;

/*class to test the Training, PublicTraining and CorporateTraining classes*/
public class TestTraining {

	public static void main(String[] args) {
		
		//instantiating the object of public class with the reference type of training class
		Training publicTraining = new PublicTraining(1, "Java", 5000, 50); // Upcasting
		System.out.println("Public training cost: " + publicTraining.getOrderValues());
		Training corporateTraining = new CorporateTraining(2, "Big Data", 35000, 4); // Upcasting
		System.out.println("Corporate training cost: " + corporateTraining.getOrderValues());
	}

}
