package Com.tnsif.Collections;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack <Integer> ob=new Stack <Integer>();
ob.push(1);
ob.push(3);
ob.push(8);
ob.push(2);
System.out.println(ob);
//System.out.println(ob.peek());
if(ob.isEmpty())
{
	System.out.println("stack is empty");
}
else
{
	System.out.println("not empty");
}
	}

}
