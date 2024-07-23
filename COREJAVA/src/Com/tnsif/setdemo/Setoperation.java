package Com.tnsif.setdemo;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
public class Setoperation 
{
	public static void operation()
	{
	Set<Integer> nu=new HashSet<Integer>();
	nu.add(3);
	nu.add(5);
	nu.add(7);
	nu.add(9);
	System.out.println(nu);
	nu.addAll(Arrays.asList(new Integer[] {1,5,6}));
	System.out.println(nu.size());
	Set<Integer> oddset=new HashSet<Integer>();
	oddset.addAll(Arrays.asList(new Integer[]{3,5,8}));
	System.out.println("oddset"+oddset);
	Set<Integer> intersection=new HashSet<>(nu);
	intersection.retainAll(oddset);
	System.out.println(intersection);
	}
}
