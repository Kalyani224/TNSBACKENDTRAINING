package com.kprit.tns.collections;

import java.util.Comparator;

public class Ename implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		//kalyani,shiva,bujjii
				return e1.ename.compareTo(e2.ename);
	}
}
