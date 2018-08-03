package com.capgemini.training;

public class PublicTraining extends Training { // Training class is inherited by PublicTraining class
	
	private int participants;
	
	public PublicTraining(int id, String subject, int fees, int participants) {
		super(id, subject, fees); // To invoke the parent class c'tor
		this.participants = participants;
	}
	
	@Override
	public int getOrderValues() {
		
		return (getFees() * participants);
	}

}
