package Com.tnsif.inheritance;

public class Citizen {
private String name;
private long aadharno;
private String aaddress;
private long phno;
public Citizen(String name,long aadharno,String address,int phno) {
	super();
	
}
public Citizen(String name, long aadharno, String aaddress, long phno) {
	super();
	this.name = name;
	this.aadharno = aadharno;
	this.aaddress = aaddress;
	this.phno = phno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getAadharno() {
	return aadharno;
}
public void setAadharno(long aadharno) {
	this.aadharno = aadharno;
}
public String getAaddress() {
	return aaddress;
}
public void setAaddress(String aaddress) {
	this.aaddress = aaddress;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
@Override
public String toString() {
	return "Citizen [name=" + name + ", aadharno=" + aadharno + ", aaddress=" + aaddress + ", phno=" + phno + "]";
}
}
