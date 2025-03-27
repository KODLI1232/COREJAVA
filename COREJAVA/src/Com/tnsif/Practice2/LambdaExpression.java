package Com.tnsif.Practice2;

interface LambdaExpression
{
public  void draw();
}
 class Lambda
{
	public static void main (String args[])
	{
		// TODO Auto-generated method stub
	int width=10;
	LambdaExpression d2=()->{
		System.out.println("drawing"+width);
	};
d2.draw();
	}
}


