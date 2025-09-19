package com.kprit.tns.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Demo for List and set difference in Collection
public class DemoCollection {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();
		al.add(23);
		al.add(65);
		al.add(876);
		al.add(12);
		al.add(123);
		
		for(int i:al) {
			System.out.println("The data "+i);
		}
		
		Set<Integer> hs=new HashSet<Integer>();
		hs.add(23);
		hs.add(876);
		hs.add(56);
		hs.add(12);
		hs.add(123);
		
	for(int i:hs) {
		System.out.println("The data of hashset "+i);
	}		
	}
}
