package Com.tnsif.Framework;

public interface ShopFactory {
public PrimeAcc getPrimeAccount(int accno,String accNm,float charges,boolean isPrime);
public NormalAcc getPrimeAccount(int accno,String accNm,float charges,float deliverycharges);
//PrimeAcc getNewPrimeAccount(int accno, String accNm, float charges, boolean isPrime);
//NormalAcc getNewNormalAccount(int accno, String accNm, float charges, float deliverycharges);
}
