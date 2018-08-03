package com.capgemini.training;

/*Training class which is an abstract class and contains an abstract method getOrderValues*/
public abstract class Training {
	
	private int id;
	private String subject;
	private int fees;
	
	// C'tor with arguments
	public Training(int id, String subject, int fees) {
		this.id = id;
		this.subject = subject;
		this.fees = fees;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	public abstract int getOrderValues(); // Abstract method

}
