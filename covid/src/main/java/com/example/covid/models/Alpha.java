package com.example.covid.models;

public class Alpha extends CovidModel {
 
	
	public Alpha(String name, double maxSpeed) {
		super(name, maxSpeed);
	}
	public Alpha() {
		
	}

	@Override
	public void symptom() {
		super.symptom();
		System.out.println("Đau họng");
	}
	@Override
	public String toString() {
		return "name:" + this.getName() + "speed:" + this.getSpeed();
	}

}
