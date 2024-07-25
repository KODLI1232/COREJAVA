package Com.tnsif.mainmethod;

import Com.tnsif.Application.GSNormal;
import Com.tnsif.Application.GSPrime;
import Com.tnsif.Application.GSShopFactory;

public class Client {

	public static void main(String[] args) {
		GSShopFactory obj=new GSShopFactory();
		
		// prime account creation
		
		GSPrime ga=(GSPrime)obj.getPrimeAccount(12, "java", 500.6f, true);
		ga.bookproduct(ga.getCharges());
		
		//normal account creation
		
		GSNormal ge=(GSNormal)obj.getPrimeAccount(13, "spring", 500.6f, 65.4f);
		ge.bookproduct(ge.getCharges());
	}
}





