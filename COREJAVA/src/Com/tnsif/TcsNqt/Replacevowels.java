package Com.tnsif.TcsNqt;
import java.util.Scanner;

public class Replacevowels {

	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

System.out.println("Enter words");
String word1=sc.next();
String word2=sc.next();
String word3=sc.next();

String transformed1=word1.replaceAll("[aeiouAEIOU]", "%");
String transformed2=word2.replaceAll("aeiouAEIOU", "#");
String transformed3=word3.toUpperCase();
System.out.println(transformed1+transformed2+transformed3);
	}

}
