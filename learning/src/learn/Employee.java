package learn;
import java.io.*;
import java.util.*;

public class Employee implements Serializable,Comparable<Employee>  {

	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	private int eid;
	private String ename;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public int compareTo(Employee o) {
		return this.eid - o.eid;
	}


	public static Comparator<Employee> NameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getEname().compareTo(e2.getEname());
		}
	
	
	};

}