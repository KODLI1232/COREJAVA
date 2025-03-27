package com.tnsif.Application;

import com.tnsif.Framework.BankFactory;
import com.tnsif.Framework.CurrentAcc;
import com.tnsif.Framework.SavingAcc;

public class MMBankFactory implements BankFactory
{
	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, int accBal, boolean isSalaried) 
	{
		// TODO Auto-generated method stub
		SavingAcc savingacc=new MMSavingAcc(accNo,accNm,accBal,isSalaried);
		return savingacc;
	}

	@Override
	public CurrentAcc getNewCurrentAccAccount(int accNo, String accNm, int accBal, boolean creditLimit) 
	{
		// TODO Auto-generated method stub
		CurrentAcc currentacc=new MMCurrentAcc(accNo,accNm,accBal,creditLimit);
		return  currentacc;
	}
}
