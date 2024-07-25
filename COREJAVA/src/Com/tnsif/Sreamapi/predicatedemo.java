package Com.tnsif.Sreamapi;
import java.util.function.Predicate;
public class predicatedemo
{
	public class Predicatedemo {
	public static void main(String[] args) {
		Predicate<Integer> pr=a->(a>18);  
		System.out.println(pr.test(7));   
	}
	}
}
