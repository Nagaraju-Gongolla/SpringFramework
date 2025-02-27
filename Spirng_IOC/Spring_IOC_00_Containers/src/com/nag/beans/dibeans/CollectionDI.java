package com.nag.beans.dibeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDI {
	private List fruits;
	private Set cricketers;
	private Map countryCapital;
	
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}

	
	public void setCountryCapital(Map countryCapital) {
		this.countryCapital = countryCapital;
	}
	
	public void printData()
	{
		System.out.println("Fruits................");
		for(Object fruit :fruits)
		{
			System.out.println(fruit);
			
		}
		System.out.println("Cricketers....");
		
		for(Object cricketer :cricketers)
		{
			System.out.println(cricketer);
		}
		System.out.println("Cuntry and Capital.....");
		
		Set keys =countryCapital.keySet();
		for(Object key :keys)
		{
			System.out.println("Cuntry="+key+"  Capital ="+countryCapital.get(key));
		}
		
	}
}
