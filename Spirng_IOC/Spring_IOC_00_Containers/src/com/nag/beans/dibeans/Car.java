package com.nag.beans.dibeans;

public class Car {
	private String carName;
	private Engine engine;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void display() {
		System.out.println("carname :" + carName);
		System.out.println("model year :" + engine.getModelyear());
	}

}
