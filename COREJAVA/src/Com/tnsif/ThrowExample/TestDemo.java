package Com.tnsif.ThrowExample;

import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter rollno");
int rollno=s.nextInt();
if(rollno<0) {
	throw new ArithmeticException("shouldnot be less than 0");
	}
else {
	System.out.println("valid");
}
	
	}

}
