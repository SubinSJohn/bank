package com.siet.framework;

public abstract class CurrentAcc extends BankAcc{
	
	private static float creditLimit=10000;

	public CurrentAcc(int accNo, String accNm, float accBal,float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit=creditLimit;
	}
	
	public void withdraw(float amount) {
		while(amount<getAccBal()&&(amount-getAccBal()<minBal)) {
			setAccBal(amount-getAccBal());
		}

}
