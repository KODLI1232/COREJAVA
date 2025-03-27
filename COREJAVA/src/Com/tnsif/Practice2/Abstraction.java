package Com.tnsif.Practice2;

public abstract class Abstraction
{
abstract void run ();
}
class bike extends Abstraction
{
	void run()
	{
		System.out.println("running");
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
bike b=new bike();
b.run();
	}
}

