package Com.tnsif.Practice2;

public class sumoftwonumbers 
{
	interface SumCalculator{
		int sum(int a,int b);
	}
	
	public static void main(String[] args)
	{
		SumCalculator sumcalculator=(x,y)->x+y;
		int result=sumcalculator.sum(5,6 );
		System.out.println(""+result);

	}

}
