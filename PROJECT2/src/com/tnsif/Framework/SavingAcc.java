package com.tnsif.Framework;

public abstract class SavingAcc extends BankAcc 
{
	private boolean isSalary;
	private static float creditLimit;
	public boolean isSalary()
	{
		return isSalary;
	}
	public void setSalary(boolean isSalary) 
	{
		this.isSalary = isSalary;
	}
	public static float getCreditLimit()
	{
		return creditLimit;
	}
	public static void setCreditLimit(float creditLimit) 
	{
		SavingAcc.creditLimit = creditLimit;
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}
	public SavingAcc(int accNo,String accNm,float accBal,boolean isSalary)
	{
		super(accNo,accNm,accBal);
		this.isSalary=isSalary;
	}
	
}
	
	
	


