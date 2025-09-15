package com.kprit.tns.oopsdemo;

public class SingleInheritanceMain {
	public static void main(String[] args) {
		SportsDepartment sd=new SportsDepartment(34,"kalyani","AIML",98499591,5.0f,43f);
		
		if(sd instanceof Student) {
			System.out.println("The student details are"+sd);
		}
		else {
			System.out.println("object is not belongging to the specified instance");
		}
	}
	

}