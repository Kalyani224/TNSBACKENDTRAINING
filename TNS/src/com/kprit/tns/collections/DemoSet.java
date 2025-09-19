package com.kprit.tns.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

//Demo for all implementation classes for set interface
public class DemoSet {
	public static void main(String[] args) {
		//Hashset (insertion order is not preserved)
		//will not store duplicate values
		Set<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(12);
		hs.add(30);
		hs.add(10);
		hs.add(3);
		
	for(int i:hs) {
		System.out.println("The data of hashset"+i);
	}
		
	System.out.println("Data from Linkedhashset");
	LinkedHashSet<Integer> lh=new LinkedHashSet<Integer>();
		
	lh.add(10);
	lh.add(12);
	lh.add(30);
	lh.add(10);
	lh.add(3);
		System.out.println(lh);
	}
}
