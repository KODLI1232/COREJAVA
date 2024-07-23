package Com.tnsif.synchronizationdemo;

public class Example
{
private static int i;

synchronized static void display()
{
	Thread g=Thread.currentThread();
	for(i=0;i<=3;i++)
	{
		try {
			Thread.sleep(1000);
			System.out.println(g.getName()+""+i);
		}
		catch(Exception e)
		{
			
		}
	}
}
}
