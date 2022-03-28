package com.example.covid.models;

public class Omicron extends CovidModel {
	public Omicron(String name, double maxSpeed) {
		super(name, maxSpeed);

	}

	public Omicron() {
		
	}

	@Override
	public void symptom() {

		System.out.println("Không có triệu chứng");
	}
	
	@Override
	public String toString() {
		return "name:" + this.getName() + "speed:" + this.getSpeed();
	}
}
