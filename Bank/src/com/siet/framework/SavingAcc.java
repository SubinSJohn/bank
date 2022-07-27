package com.siet.framework;

public class SavingAcc extends BankAcc  {
	
	
	private  boolean isSalaried ;
	private static float minBal=1000.0f;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	@Override
	public void withdraw(float amount) {
		while(amount<getAccBal()&&(amount-getAccBal()<minBal)) {
			setAccBal(amount-getAccBal());
		}
		
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", getAccBal()=" + getAccBal() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
