package com.kprit.tns.collections;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeMain {
	public static void main(String[] args) {
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(101,"kalyani",24000.89f));
		al.add(new Employee(102,"shiva",34000.89f));
		al.add(new Employee(101,"Bujjii",21000.98f));
		System.out.println("sorting based on name");
		Collections.sort(al,new Ename());
		for(Employee e:al) {
			System.out.println(e.eid+" "+e.ename+" "+e.esal);
		}
		
		
		System.out.println("sorting based on salary");
		Collections.sort(al,new Esal());
		for(Employee e:al) {
			System.out.println(e.eid+" "+e.ename+" "+e.esal);
		}	
	}
}
