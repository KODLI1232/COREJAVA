package Com.tnsif.Practice2;

import java.util.Scanner;

public class EligibleorNot 
{
int s;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int s=sc.nextInt();
		if(s>18)
		{
			System.out.println("you are eligile");
			
		}
		else {
			System.out.println("you are not eligibile");
		}
	}

}
