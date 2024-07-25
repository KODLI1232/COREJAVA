package Com.tnsif.Framework;

public abstract class NormalAcc extends ShopAcc
{
public NormalAcc(int accNo, String accNm, float charges, float deliverycharges) {
		super(accNo, accNm, charges);
		this.deliverycharges=deliverycharges;
		// TODO Auto-generated constructor stub
	}
private float deliverycharges;
public void bookProduct(float charges)
{
	
}

@Override
public String toString() {
	return "NormalAcc [deliverycharges=" + deliverycharges + "]";
}

public float getDeliverycharges() {
	return deliverycharges;
}
public void setDeliverycharges(float deliverycharges) {
	this.deliverycharges = deliverycharges;
}
}


