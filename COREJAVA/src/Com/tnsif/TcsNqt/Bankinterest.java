package Com.tnsif.TcsNqt;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Bankinterest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
double p,s,mi,sum,emi,sq;
int y,n,k,l=0;
int yrs = 0;
double[] bank=new double[2];
System.out.println("Enter the prncipal amount");
p=sc.nextDouble();
System.out.println("Enter tenature year");
y=sc.nextInt();
for(k=0;k<2;k++) {
	System.out.println("Enter the no of slabs");
	n=sc.nextInt();
	sum=0;
	for(int i=0;i<n;i++) {
		System.out.println("enter period");
		yrs=sc.nextInt();
  }
	System.out.println("Enter interest:");
	s=sc.nextDouble();
	mi=0;
	sq=Math.pow((1+s),yrs*12);
	emi=(p*(s))/(1-1/sq);
	sum=sum+emi;
	bank[l++]=sum;
}
if(bank[0]<bank[1]) {
	System.out.println("Bank A");
}
else {
	System.out.println("Bank B");
}
	}

}
