package ExtendingThread;

public class Implementingrunnable implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Implementingrunnable r=new Implementingrunnable();
Thread t1=new Thread(r);
t1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("implementing runnable Interface");
	}

}
