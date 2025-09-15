package com.kprit.tns.oopsdemo;

//Demo for single inheritance
public class SportsDepartment extends Student{
	public float height;
	public float weight;
	
	public SportsDepartment(int sid, String name, String branch,long contactno, float height, float weight) {
		//super keyword is referring to base class/parent class variables
		super(sid, name, branch, contactno);
		//this keyword is referring derived class (means current class)
		this.height = height;
		this.weight = weight;
	}
	//for returning object value
	@Override
	public String toString() {
		return "SportsDepartment [height=" + height + ", weight=" + weight + ", sid=" + sid + ", name=" + name	+ ", branch=" + branch + ", contactno=" + contactno + "]";
	}
	
}