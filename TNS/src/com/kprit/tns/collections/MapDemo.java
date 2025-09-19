package com.kprit.tns.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Demo for MapDemo
public class MapDemo {
	public static void main(String[] args) {
		//Map follows key - value(key,value)
		//Hash map gives data in random order
		Map<String,Integer> mp=new HashMap<String,Integer>();
		
		mp.put("kalyani",34);
		mp.put("bhagya", 14);
		mp.put("jyosna",32);
		mp.put("karthik",35);
		//mp.put(null,null);
		
		for(Map.Entry<String,Integer> entry:mp.entrySet()) {
			String key=entry.getKey();
			int value=entry.getValue();
			System.out.println(key+":"+value);
		}
	System.out.println("The Linked Hashmap data ");	
	
Map<String,Integer> m=new LinkedHashMap<String,Integer>();
		
		m.put("kalyani",34);
		m.put("bhagya", 14);
		m.put("jyosna",32);
		m.put("karthik",35);
		//m.put(null,null);
		for(Map.Entry<String,Integer> entry:m.entrySet()) {
			String key=entry.getKey();
			int value=entry.getValue();
			System.out.println(key+":"+value);
		}
		
		System.out.println("The Treemap data");	
		
		 Map<String,Integer> tm=new TreeMap<String,Integer>();
				
				tm.put("kalyani",34);
				tm.put("bhagya", 14);
				tm.put("jyosna",32);
				tm.put("kalyani",34);
				//m.put(null,null);
				for(Map.Entry<String,Integer> entry:tm.entrySet()) {
					String key=entry.getKey();
					int value=entry.getValue();
					System.out.println(key+":"+value);
				}
				
		
		
	}
}

