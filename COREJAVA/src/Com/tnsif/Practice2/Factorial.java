package Com.tnsif.Practice2;

public class Factorial
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

int i,fact=1;
int num=6;
for(i=1;i<=num;i++)
{
	fact=fact*i;
}
	System.out.println("Factorial of num is: "+ fact);	
	}

}
