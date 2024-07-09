package Com.tnsif.inheritance;

public class Student extends Citizen
{
	private int rollno;
	private String collegename;
public Student(String name, long aadharno, String address, int phno) {
		super(name, aadharno, address, phno);
		this.rollno= rollno;
		this.collegename= collegename;
		// TODO Auto-generated constructor stub
		
	}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getCollegename() {
	return collegename;
}
public void setCollegename(String collegename) {
	this.collegename = collegename;
}
@Override
public String toString() {
	return super.toString()+"Student [rollno=" + rollno + ", collegename=" + collegename + "]";
}
}



