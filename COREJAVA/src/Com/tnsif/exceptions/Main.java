
package Com.tnsif.exceptions;
public class Main 
{
	public static void main(String[] args)
	{
	int d=0;
	try
	{
		int a=55/0;
	}
	catch(ArithmeticException exception )
	{
		System.out.println("hellooooo");
	}
}
}