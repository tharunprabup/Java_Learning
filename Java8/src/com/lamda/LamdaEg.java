package com.lamda;

import java.util.*;

public class LamdaEg {

	public static void main(String[] args) {
		//Java 7 syntax1
		//Task task = new Task();
		//task.connect();
		
		//Java 7 syntax2
		//Runnable r = new MyTaskThread();
		//Thread thread = new Thread(r);
		//thread.start();

		//Java 7 syntax3
		//Runnable r = new Runnable() {

		//	@Override
		//	public void run() {
		//		Task task = new Task();
		//		task.connect();
				
		//	}
			
		//};
		//Thread t1 = new Thread(r);
		//t1.start();
		
		
		//Java 8 syntax1
		//Runnable r = () -> { Task task = new Task(); task.connect();};
		//Thread t1 = new Thread(r);
		//t1.start();
		
		//Java 8 syntax2
		/*Thread t1 = new Thread(()-> {
			Task task = new Task();
			task.connect();
		});
		t1.start();
		*/
		
		//Java 8 syntax3
		//new Thread(()-> { new Task().connect();}).start();
		
		//Java 8 syntax4
		//new Thread(new Task()::connect).start();
		
		User u1 = new User(11,"Nilima","nilima@gmail.com");
		User u2 = new User(12,"Praveen","prav@gmail.com"); 
		User u3 = new User(13,"Aarika","arika@gmail.com");
		
		List<User> li = new ArrayList<User>(); 
		li.add(u1); 
		li.add(u2); 
		li.add(u3);
		 System.out.println("User List :" + li);

		 //Iterator<User> i = li.iterator(); 
		 //while (i.hasNext()) {
		 //System.out.println(i.next());
		 //}
		 li.forEach(lis->System.out.println(lis));
		 li.forEach(System.out::println);
	}



}
