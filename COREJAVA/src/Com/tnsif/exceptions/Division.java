package Com.tnsif.exceptions;

import java.util.InputMismatchException;

public class Division {

	public static void divide() 
	{
		// TODO Auto-generated method stub
int a=6,b=0,c;
try
{
	c=a/b;
	System.out.println("Division");
}
catch(ArithmeticException e)
{
	System.out.println("exception");
}
catch(InputMismatchException e)
{
	System.out.println("exception caught");
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("exception caught");
}
	}

}
