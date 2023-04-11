package com.order;
import com.expe.*;
import com.controller.*;
import java.io.*;


public class UsernotFound implements Serializable {

	
	public static void main(String[] args)throws IOException {
		try {
		String uname,pwd;
		InputStreamReader ip = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(ip);
		System.out.println("Enter Name:");
		uname = bf.readLine();
		System.out.println("Enter PWD:");
		pwd = bf.readLine();
		if (uname.equals("Tharun") && pwd.equals("PmmT@10"))
		{
			System.out.println("Welome Mr." + uname);
			EmployeeController emp = new EmployeeController();
					emp.addEmployee();
					emp.viewEmployee();
					emp.serilizeEmp();
					emp.deserilizeEmp();
					emp.sortbyEid();
					emp.sortbyEName();
		}
		else{
			throw new UserNotFoundException();
		}
		}
		catch(UserNotFoundException unf)
		{
			System.out.println(unf);
		}
	}




}
