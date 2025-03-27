package Com.tnsif.Practice2;

public class instancevariable 
{
String name;
int age;
double weight;
public instancevariable(String name,int age,double weight)
{
	this.name=name;
	this.age=age;
    this.weight=weight;
}
public void displayinfo() {
	System.out.println("the person name is"+this.name);
	System.out.println("the person age is"+this.age);
	System.out.println("the person weight is"+this.weight);
}
}