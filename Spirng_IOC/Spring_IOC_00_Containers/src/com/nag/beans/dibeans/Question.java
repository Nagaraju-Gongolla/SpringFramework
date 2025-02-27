package com.nag.beans.dibeans;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String qname;
	private List<Answers> answers;

	public Question() {
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getQname() {
		return qname;
	}

	public final void setQname(String qname) {
		this.qname = qname;
	}

	public final List<Answers> getAnswers() {
		return answers;
	}

	public final void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println(id + " " + qname);
		System.out.println("answers are");

		Iterator<Answers> itr = answers.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
