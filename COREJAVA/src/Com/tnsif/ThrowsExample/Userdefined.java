package Com.tnsif.ThrowsExample;
import java.util.Scanner;
public class Userdefined{
	private static int age;
	static void volidate()throws Age{
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age<18) {
			throw new Age("invalid age,not eligible");
		}
		else
			System.out.println("yes");
	}
	public static void main(String args)
	{
		try {
			Userdefined.volidate();
		}
		catch(Age e) {
			System.out.println("age");
		}
	}
}