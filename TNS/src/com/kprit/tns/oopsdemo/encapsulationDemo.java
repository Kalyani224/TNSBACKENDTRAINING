package com.kprit.tns.oopsdemo;
//encapsulation
public class encapsulationDemo {
		
	    private int sid;
	    private String sname;
	     
	    public int getSid() {
			return sid;
		}


		public void setSid(int sid) {
			this.sid = sid;
		}


		public String getSname() {
			return sname;
		}


		public void setSname(String sname) {
			this.sname = sname;
		}


		public void display() {
	    	System.out.println("The student details are:"+sid +sname);
	    }


}
