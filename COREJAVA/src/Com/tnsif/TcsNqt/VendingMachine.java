package Com.tnsif.TcsNqt;

	import java.util.Scanner;

	public class VendingMachine {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter word");
	        char mainMenu = sc.next().toLowerCase().charAt(0); 
	        int subMenu = sc.nextInt(); 
	        sc.close();

	        String[][] menu = {
	            {}, 
	            {"Espresso Coffee", "Cappuccino Coffee", "Latte Coffee"}, // Coffee
	            {"Plain Tea", "Assam Tea", "Ginger Tea", "Cardamom Tea", "Masala Tea", "Lemon Tea", "Green Tea", "Organic Darjeeling Tea"}, // Tea
	            {"Hot and Sour Soup", "Veg Corn Soup", "Tomato Soup", "Spicy Tomato Soup"}, // Soups
	            {"Hot Chocolate Drink", "Badam Drink", "Badam-Pista Drink"} // Beverages
	        };

	        int category = switch (mainMenu) {
	            case 'c' -> 1; // Coffee
	            case 't' -> 2; // Tea
	            case 's' -> 3; // Soups
	            case 'b' -> 4; // Beverages
	            default -> -1; // Invalid category
	        };

	        if (category == -1 || subMenu < 1 || subMenu > menu[category].length) {
	            System.out.println("INVALID OUTPUT!");
	        } else {
	            System.out.println("Welcome to CCD!");
	            System.out.println("Enjoy your " + menu[category][subMenu - 1] + "!");
	        }
	    }
	}


