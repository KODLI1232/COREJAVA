package Com.tnsif.Practice2;

public class LEExample 
{
	public static void main(String[] args) 
	{
	   // TODO Auto-generated method stub
		LEForeach add=(a,b)->(a+b);
		System.out.println(add.add(10,60));
		LEForeach add1=(int a,int b)->(a+b);
		System.out.println(add1.add(34,70));
	}
	
}
