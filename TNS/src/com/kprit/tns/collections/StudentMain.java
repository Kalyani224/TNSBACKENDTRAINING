package com.kprit.tns.collections;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"kalyani",20));
		al.add(new Student(103,"shiva",25));
		al.add(new Student(102,"jeevan",23));
		al.add(new Student(104,"jyosna",21));
		al.add(new Student(105,"bhagya",22));
		Collections.sort(al);
		for(Student st:al) {
			System.out.println(st.sid+" "+st.name+" "+st.age);
		}
		
		
	}

}
