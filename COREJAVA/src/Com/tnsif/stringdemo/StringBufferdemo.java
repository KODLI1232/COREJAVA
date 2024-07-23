package Com.tnsif.stringdemo;

public class StringBufferdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer b=new StringBuffer("welcome");
b.append("to siiet");
System.out.println(b);
b.insert(1, "hi");
System.out.println(b);
b.delete(1, 3);
System.out.println(b);
System.out.println(b.reverse());
	}
}
