package com.example.covid.models;

import java.security.SecureRandom;

public abstract class CovidModel {
	private String name;
	private double speed;
	private double maxSpeed;
	
	public CovidModel(String name, double maxSpeed) {
		this.name = name;
		this.speed = new SecureRandom().nextInt((int)maxSpeed);
	}
	public CovidModel() {
		
	}

	public String getName() {
		return name;
	}

	public double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void symptom() {
		System.out.print("Ho, Sốt");
	}

}
