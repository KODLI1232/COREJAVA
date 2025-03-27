package com.tnsif.Application;

import com.tnsif.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
public MMSavingAcc(int accNo, String accNm,int accBal,boolean isSalaried)
{
		super(accNo, accNm, accBal,isSalaried);
		// TODO Auto-generated constructor stub
	}

//public MMSavingAcc(int accno, String accNm, Object accBal, boolean isSalaried) {
//	// TODO Auto-generated constructor stub
//}

public void withdraw(float charges)
{
	System.out.println("dear customer your creditLimit is :"+isSalary());
}

@Override
public String toString() {
	return "MMSavingAcc [isSalary()=" + isSalary() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
			+ ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass()
			+ ", hashCode()="+ hashCode() + "]";
}

}



