package com.tnsif.mainmethod;

import com.tnsif.Application.MMBankFactory;
import com.tnsif.Application.MMCurrentAcc;
import com.tnsif.Application.MMSavingAcc;

public class Client
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
@SuppressWarnings("unused")
MMBankFactory obj= new MMBankFactory();
	}
	MMSavingAcc sa=new MMSavingAcc(15, "KSK", 5000, true);
	
MMCurrentAcc se=new MMCurrentAcc(12, "DSK", 5400, false);


}

