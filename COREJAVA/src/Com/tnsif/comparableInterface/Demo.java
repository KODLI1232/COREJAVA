package Com.tnsif.comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
public class Demo
{
	public static void main(String[] args) {
		
		//ArrayList<String> al=new ArrayList<String>();
		
		//al.add("rterf");
		
		//user defined or customed class
		
		ArrayList<Student> al=new ArrayList<Student>();
		
		Student s=new Student(103,"KSK","IOT");
		al.add(s);
		 s=new Student(101,"DSK","AIML");
		 al.add(s);
		 s=new Student(102,"TSK","MECH");
		
		al.add(s);
		
		System.out.println("before sorting" +al);
		
		System.out.println("after sorting ");
		Collections.sort(al);
		System.out.println(al);
		
		
		
		
	}

}


