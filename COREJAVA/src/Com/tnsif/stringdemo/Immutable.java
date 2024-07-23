package Com.tnsif.stringdemo;

public class Immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="KL";
String str2=str1;
String str3=str2;
System.out.println("before modification");
System.out.println("str1"+str1);
System.out.println("str2"+str2);
System.out.println("str3"+str3);
str1="RAHUL";
System.out.println("after modifaction");
System.out.println("str1"+str1);
System.out.println("str2"+str2);
System.out.println("str3"+str3);
	}

}
