package Com.tnsif.staticexample;

public class Student
{
int rollno;
String name;
static String college="SIIET"; //static member
static void change()
{
college="IIT";

}
Student(int r,String n)
{
	rollno=r;
	name=n;
	
}
 
public void display1() {
	// TODO Auto-generated method stub
	System.out.println(rollno +""+name+""+college+ "");
	
}
}
