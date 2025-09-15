package com.kprit.tns.oopsdemo;

public class MultilevelInheritanceMain {
	public static void main(String[] args) {
      City ob=new City();
      ob.setCountryname("India");
      ob.setStatename("telangana");
      ob.setCityname("hyderabad");
	
      System.out.println(ob.getCountryname());
      System.out.println(ob.getStatename());
     System.out.println( ob.getCityname());
		
		
	}
}
