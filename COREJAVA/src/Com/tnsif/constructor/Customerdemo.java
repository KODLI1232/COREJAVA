package Com.tnsif.constructor;

import java.util.Scanner;

public class Customerdemo {

//	private static final String Sytsem = null;
//	private static final Customer d = null;

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.nextLine();
		System.out.println("enter your cid");
		int id=sc.nextInt();
		System.out.println("enter your caddress");
		String add=sc.nextLine();
		Customer c=new Customer();
		c.setCname(name);
		c.setCid(id);
		c.setCaddress(add);
		System.out.println(c);
		boolean out=c instanceof Customer;
		System.out.println(out);
	}
}
