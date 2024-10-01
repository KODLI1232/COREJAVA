package Com.tnsif.Practice2;

import java.util.Scanner;
public class PrimeNumbers
{

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("Enter numbers:");
int n=s.nextInt();
if(isPrime(n))
{
	System.out.println(n+"is prime number");
}
else
{
System.out.println(n+"is not prime");	
}	
}
public static boolean isPrime(int n)
{
	if(n<=1)
	{
		return false;
	}
	
	for(int i=2;i<Math.sqrt(n);i++)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
}
}
