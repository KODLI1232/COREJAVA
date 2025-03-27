package Com.tnsif.TcsNqt;

	import java.util.Scanner;

	public class mixedSeries {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter numbers");
	        int n = sc.nextInt();
	        if (n % 2 == 1) {
	            // Odd index: Sequence of even numbers (0, 2, 4, 6, ...)
	            System.out.println((n / 2) * 2);
	          }
	        else {
	            // Even index: Previous term / 2
	            System.out.println(((n / 2) - 1) * 2 / 2);
	        }
	    }
	}


