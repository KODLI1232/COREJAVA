package Com.tnsif.Practice;

import java.util.Scanner;

public class Evennumber {
int a;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
int a=sc.nextInt();
//System.out.println("Enter the number");
if(a%2==0) 
{
	System.out.println("number is even");
}
else {
	System.out.println("number is not even");
}
	}

}
