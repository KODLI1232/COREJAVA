package Com.tnsif.finallyblock;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int data=25/0;
	System.out.println("welcome");
}
catch(NullPointerException e)
{
	System.out.println(e);
}
finally {
	System.out.println("finally block executed");
}
	}

}
