package arraylistdemo;

import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l=new LinkedList();
l.add("hii");
l.add(2);
l.add("hello");
System.out.println("after invoking add()"+l);
l.add(1,"apple");
l.addFirst("mango");
l.addLast("guava");
System.out.println(l);
l.remove(0);
System.out.println(l);
//l.removeAll(l);
//System.out.println(l);
l.removeFirstOccurrence("hii");
System.out.println(l);
l.removeLastOccurrence("guava");
System.out.println(l);
	}

}
