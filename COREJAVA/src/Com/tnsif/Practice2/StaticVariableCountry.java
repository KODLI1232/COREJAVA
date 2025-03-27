package Com.tnsif.Practice2;

public class StaticVariableCountry 
{
	    static int countryCounter = 0;

	    public StaticVariableCountry() {
	        countryCounter++;
	    }

	    public static int getCountryCounter() {
	        return countryCounter;
	    }
	    @SuppressWarnings("unused")
		public static void main(String[] args) {
	    	StaticVariableCountry ob1 = new StaticVariableCountry();
	    	StaticVariableCountry ob2 = new StaticVariableCountry();
	        System.out.println(StaticVariableCountry.getCountryCounter());  // Outputs 2
	    }
	}

