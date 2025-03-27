package Com.tnsif.Practice2;

import java.util.Scanner;

interface Client 
{
void input();
void output();
}

	class Interface implements Client
	{
	String name;
	int salary;
	public void input()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter name");
		name=sc.nextLine();
		System.out.println("enter salary");
		salary=sc.nextInt();
	}
	public void output()
	{
		System.out.println(name + "" + salary);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Client c=new Interface();
		c.input();
		c.output();
	}
}
	


