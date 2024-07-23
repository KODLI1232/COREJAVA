package Com.tnsif.Collections;

import java.util.Vector;

public class Vectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector<String> v =new Vector<String>();
System.out.println("size of vector"+v.size());
v.add("red");
v.add("blue");
v.add("black");
v.add("orangearmy");
int capacity=v.capacity();
System.out.println(v);
v.add("red");
v.add("red");
int capacity1=v.capacity();
System.out.println(capacity);
}

}
