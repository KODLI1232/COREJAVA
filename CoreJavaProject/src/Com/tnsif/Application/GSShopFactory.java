package Com.tnsif.Application;

import Com.tnsif.Framework.NormalAcc;
import Com.tnsif.Framework.PrimeAcc;
import Com.tnsif.Framework.ShopFactory;

public class GSShopFactory implements ShopFactory{

	@Override
	public PrimeAcc getPrimeAccount(int accno, String accNm, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		PrimeAcc primeacc=new GSPrime (accno,accNm,charges,isPrime);
		return primeacc;
	}

	@Override
	public NormalAcc getPrimeAccount(int accno, String accNm, float charges, float deliverycharges) {
		// TODO Auto-generated method stub
		NormalAcc normalacc=new GSNormal( accno, accNm, charges,deliverycharges);
		return normalacc;
	}

	
	}





