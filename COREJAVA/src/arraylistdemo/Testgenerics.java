package arraylistdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class Testgenerics {

	public static void main(String[] args) {
ArrayList<String> al=new ArrayList<String>();
al.add("KSK");
al.add("DSK");
al.add("TSK");
System.out.println("al");
Iterator<String> itr=al.iterator();
while(itr.hasNext());
{
	System.out.println(itr.next());
}
	}
}
