package com.nag.beans.dibeans;

public class ArrayDI {
	private String[] carnames;
	private Engine[] enginenames;
	public ArrayDI() {
	}
	
	
	public String[] getCarnames() {
		return carnames;
	}


	public void setCarnames(String[] carnames) {
		this.carnames = carnames;
	}


	public Engine[] getEnginenames() {
		return enginenames;
	}


	public void setEnginenames(Engine[] enginenames) {
		this.enginenames = enginenames;
	}


	public void printcarData()
	{
		for(String car :carnames)
		{
			System.out.println(car);
		}
		for(Engine e : enginenames)
		{
			System.out.println(e.getModelyear());
		}
	}
}
