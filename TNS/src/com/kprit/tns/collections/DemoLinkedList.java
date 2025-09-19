package com.kprit.tns.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

//Demo for linked list
public class DemoLinkedList {
	public static void main(String[] args) {
		//two ways of initialization
		LinkedList<String> ll=new LinkedList<String>();
		
		List<?> l=new LinkedList();
		
		//adding of data
		ll.add("kalyani");
		ll.add("bhagya");
		ll.add("jyosna");
		ll.add("bujjii");
		ll.add("shiva");
		ll.add(null);
		//ll.addFirst("Sam");
		//ll.addLast("Bindu");
		//ll.getFirst();
		//System.out.println(ll);
		
		//iterating through the linked list data structure
		
		Iterator<String> it=ll.iterator();
		while(it.hasNext()) {
			System.out.println("The data is "+it.next());
		}
		
		System.out.println("The data after removing");
		ll.remove(2);
		for(String s:ll) {
			System.out.println("The data "+s);
		}
		
		Stack<Integer> s=new Stack<Integer>();
		s.push(85);
		s.push(132);
		s.push(96);
		s.push(84);
		//s.pop();
		System.out.println(s);
	}
}
