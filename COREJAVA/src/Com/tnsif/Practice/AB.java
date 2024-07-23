package Com.tnsif.Practice;

public class AB {
interface Message{
	void msg();
}
}
class TestNestedinterface implements AB.Message{
	public void msg()
	{
		System.out.println("Hii");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AB.Message message=new TestNestedinterface Message();
		message.msg();

	}
	

}
