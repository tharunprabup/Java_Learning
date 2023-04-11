package com.extra;

class Emp{
	int empid;
	String empname="Arun";
	final int x=999;
	
	
	
	public Emp(int empid) {
		this("hello");
		this.empid = empid;
		 System.out.println("Enter Emp Constr" + empid);
	}
	
	public Emp(String str) {
		 System.out.println("Enter Emp Constr with srt:"+x);
	}

	public String getDetails() {
		return empid+ "--"+empname;
	}
}
class Manager extends Emp{
 String dept="IT";
 
 public Manager() {
	 super(500); //invoke base class contstr
	 System.out.println("Enter mgr Constr");

}

public String getDetails() {
	 return super.getDetails() +"--"+dept;
 }
	
}
class Salary{
	
}
public class InMainClass {
public static void main(String[] args) {
 Emp em= new Emp(0);
 System.out.println(em.getDetails());
 Manager mgr = new Manager();
 System.out.println(mgr.getDetails());
 
 
 
}
}
