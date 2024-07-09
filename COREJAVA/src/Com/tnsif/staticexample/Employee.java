package Com.tnsif.staticexample;
//static demo
public class Employee 
{
int cid;
String name;
static String company="TNS";
Employee(int r,String n)
{
	cid=r;
	name=n;
}
void display(String cname) {
	System.out.println(cid+ "" +name+""+company+"" );
}
public void display() {
	// TODO Auto-generated method stub
	System.out.println(cid+ "" +name+""+company+"" );
}
}
