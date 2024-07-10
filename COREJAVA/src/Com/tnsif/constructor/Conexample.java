package Com.tnsif.constructor;

public class Conexample 
{
Conexample()
{
	System.out.println("default constructor");
}
Conexample(int i)
{
	System.out.println("hello");
}
Conexample(int i,int j)
{
	System.out.println("Helloworld");
}
Conexample(int i,String name)
{
	System.out.println("different type");
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
Conexample c=new Conexample();
Conexample c1=new Conexample(6);
Conexample c2=new Conexample(15,"KSK");
	}

}
