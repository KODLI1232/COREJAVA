package Com.tnsif.Practice2;

public class palindrome
{
	//int r,sum=0,temp;
	//int n=2045;
	//temp=n;
	//while(n>0)
	//{
//		r=n%10;
//		sum=(sum*10)+r;
//		n=n/10;
	//}
	//if(temp==sum)
//		System.out.println("palindrome number");
	//else
//		System.out.println("Not a palindrome number");
	public static void main(String args[])
	{
			String str="madam";
			String reversed =new StringBuilder(str).reverse().toString();
			System.out.println(str.equals(reversed));
}
}
