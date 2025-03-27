package Com.tnsif.Practice2;

public class Overriding
{
void print()
{
	System.out.println("Helloo");
}
}
class OVD2 extends Overriding
{
	void print()
	{
		System.out.println("World");
	}
}
class OVD3 extends Overriding
{
	void print()
	{
		System.out.println("Hiiiii");
	}
}
class Testing
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Overriding s;
s=new OVD2();
s.print();
s=new OVD3();
s.print();
}
}