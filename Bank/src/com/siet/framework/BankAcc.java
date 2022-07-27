package com.siet.framework;

public abstract class BankAcc {
	
	protected static int accNo;
	protected static String accNm;
	private float accBal;
	
	
	public static int getAccNo() {
		return accNo;
	}
	
	public static String getAccNm() {
		return accNm;
	}
	
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	public BankAcc(int accNo, String accNm, float accBal) 
	{
		this.accNo=accNo;
		this.accNm=accNm;
		this.accBal=accBal;
	}
	public abstract void withdraw(float amount);
	public void deposite(float ammount)
	{
		System.out.println("Items are delivered with charges :"+ammount);
	}
	@Override
	public abstract String toString() ;
	
	
	
	

}
