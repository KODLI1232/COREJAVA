package Com.tnsif.LambdaExpression;

public class Testdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable basic=()->{String threadname=Thread.currentThread().getName();
System.out.println("threadname"+threadname);
};
Thread th1=new Thread(basic);
Thread th2=new Thread(basic);
Thread th3=new Thread(basic);
th1.start();
th2.start();
th3.start();

	}

}

