package com.kprit.tns.oopsdemo;

//Demo for single inheritance
public class Student {

	public int sid;
	public String name;
	public String branch;
	public long contactno;

	public Student(int sid, String name, String branch, long contactno) {
		super();
		// this keyword refers to current class variables
		this.sid = sid;
		this.name = name;
		this.branch = branch;
		this.contactno = contactno;
	}
}