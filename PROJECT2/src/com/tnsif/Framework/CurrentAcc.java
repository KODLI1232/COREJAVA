package com.tnsif.Framework;

public abstract class CurrentAcc extends BankAcc
{
private boolean creditLimit;
public boolean iscreditLimit()
{
	return creditLimit;
}
public boolean isCreditLimit() 
{
	return creditLimit;
}
public void setCreditLimit(boolean creditLimit)
{
	this.creditLimit = creditLimit;
}
@Override
public String toString()
{
	return "CurrentAcc [creditLimit=" + creditLimit + "]";
}
public CurrentAcc(int accNo,String accNm,float accBal,boolean creditLimit) 
{
	super(accNo,accNm,accBal);
	this.creditLimit=creditLimit;
}
}
