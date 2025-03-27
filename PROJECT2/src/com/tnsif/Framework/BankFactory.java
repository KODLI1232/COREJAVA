package com.tnsif.Framework;

public interface  BankFactory
{
public SavingAcc getNewSavingAccount(int accNo,String accNm,int accBal,boolean isSalaried);
public CurrentAcc getNewCurrentAccAccount(int accNo,String accNm,int accBal,boolean creditLimit);
//SavingAcc getNewSavingAcc(int accno, String accNm, float charges, boolean isSalaried);
//CurrentAcc getNewCurrentAcc(int accNo, String accNm, int accBal, boolean creditLimit);
}
