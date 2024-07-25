package Com.tnsif.Application;
import Com.tnsif.Framework.NormalAcc;
//import Com.tnsif.Framework.PrimeAcc;

public class GSNormal extends NormalAcc{
	


	public GSNormal(int accNo, String accNm, float charges, float deliverycharges2) {
		super(accNo, accNm, charges, deliverycharges2);
		// TODO Auto-generated constructor stub
	}

	public void bookproduct(float charges) {
		System.out.println("dear normal account user . your product charges are :"+getCharges()+"delivery charges"+getDeliverycharges());
	}

}
