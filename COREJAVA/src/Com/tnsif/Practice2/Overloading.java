package Com.tnsif.Practice2;

public class Overloading 
{
	static int print(int a,int b)
	{
		return a+b;
	}
	static int print(int a,int b,int c)
	{
		return a+b+c;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Overloading s=new Overloading();
		System.out.println(Overloading.print(2,4));
		System.out.println(Overloading.print(2,4,5));
		

	}

}
