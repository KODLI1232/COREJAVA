package ExtendingThread;

public class ExtendingThread extends Thread{
	public void run() {
		System.out.println("helllllo");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendingThread a =new ExtendingThread();
		a.start();//runnable method
	}

}
