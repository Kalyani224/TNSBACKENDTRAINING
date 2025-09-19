package com.kprit.tns.collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class DemoTreeset {
	public static void main(String[] args) {
		//treeset--> follows natural sorting order(hence it is good for fast accessing of data)
		//will not allow duplicates
	SortedSet<String> ss=new TreeSet<String>();
	ss.add("bujjii");
	ss.add("shiva");
	ss.add("kalyani");
	ss.add("bhagya");
	ss.add("chittyy");
	for(String s:ss) {
		System.out.println("The data "+s);
	}
	}
}
