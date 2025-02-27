package com.nag.beans.dibeans;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ChildCollectionDI {
	private Vector<String> fruits;
	private TreeSet<String> cricketers;
	private Hashtable<String, String> countriesandCapitals;
	
	public ChildCollectionDI() {
		// TODO Auto-generated constructor stub
	}

	public final Vector<String> getFruits() {
		return fruits;
	}

	public final void setFruits(Vector<String> fruits) {
		this.fruits = fruits;
	}

	public final TreeSet<String> getCricketers() {
		return cricketers;
	}

	public final void setCricketers(TreeSet<String> cricketers) {
		this.cricketers = cricketers;
	}

	public final Hashtable<String, String> getCountriesandCapitals() {
		return countriesandCapitals;
	}

	public final void setCountriesandCapitals(Hashtable<String, String> countriesandCapitals) {
		this.countriesandCapitals = countriesandCapitals;
	}
	
	public void printData() {
		System.out.println("Fruits................");
		for (Object fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println("Cricketers....");

		for (Object cricketer : cricketers) {
			System.out.println(cricketer);
		}
		System.out.println("Cuntry and Capital");

		Set keys = countriesandCapitals.keySet();
		for (Object key : keys) {
			System.out.println("Cuntry=" + key + "  Capital =" + countriesandCapitals.get(key));
		}

	}


}
