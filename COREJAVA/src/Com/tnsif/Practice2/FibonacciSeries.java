package Com.tnsif.Practice2;

public class FibonacciSeries 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
int n1=0;
int n2=1;
int n3;
int n=10;
for(int i = 2;i<n;i++) 
{
	n3=n1+n2;
	System.out.println(""+n3);
	n1=n2;
	n2=n3;
}	
}
}
