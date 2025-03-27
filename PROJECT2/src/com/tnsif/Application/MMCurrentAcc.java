package com.tnsif.Application;

import com.tnsif.Framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc
{

	public MMCurrentAcc(int accNo, String accNm, float accBal, boolean creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}
public void withdraw(float charges)
{
	System.out.println("dear customer your creditLimit is:"+isCreditLimit());
}
}
