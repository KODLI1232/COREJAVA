package Com.tnsif.Practice2;

import java.util.Scanner;

public class SumofNumbers 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
//int a=74;
//int b=36;
//
//int sum=a+b;
//System.out.println("sumof numbers is:"+sum);
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the first number:");
		int num1=sc.nextInt();
		System.out.println("Input the second number:");
		int num2=sc.nextInt();
		int sum=num1+num2;
		System.out.println("Sum of numbers:"+sum);
	}

}
