package Com.tnsif.Practice2;

import java.util.function.Predicate;

public class LE_StrEmptyorNot
{

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
@SuppressWarnings("unused")
Predicate isEmptyString=str->((String) str).isEmpty();
String str1="";
String str2="KSK";
System.out.println("str1 is empty:"+str1);
System.out.println("str1 is empty:"+str2);
System.out.println("str2 is Empty:"+isEmptyString.test(str1));
System.out.println("str2 is Empty:"+isEmptyString.test(str2));
	}

}
