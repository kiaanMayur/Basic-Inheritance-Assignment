package com.capgemini.training;

/*class which is extending the training class to implement the egtOrerValues method differently*/
public class CorporateTraining extends Training{ // Training class is inherited by CorporateTraining class
	
	private int days;
	
	public CorporateTraining(int id, String subject, int fees, int days) {
		super(id, subject, fees);
		this.days = days;
	}
	
	@Override
	public int getOrderValues() {
		
		return (getFees() * days);
	}

}
