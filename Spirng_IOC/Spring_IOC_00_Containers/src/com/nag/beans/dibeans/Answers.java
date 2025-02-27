package com.nag.beans.dibeans;

public class Answers {
	private int id;
	private String name, by;

	public Answers() {

	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getBy() {
		return by;
	}

	public final void setBy(String by) {
		this.by = by;
	}

	public String toString() {
		return id + " " + name + " " + by;
	}
}