package Com.tnsif.LambdaExpression;

public class Parameterdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cube c=(a)->{return a*a*a;};
System.out.println("cube of number is: "+c.calculate(5));
	}

}
