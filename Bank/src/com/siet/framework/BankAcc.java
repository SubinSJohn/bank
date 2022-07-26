package com.siet.framework;

public abstract class BankAcc {
	protected static int accNo;
	protected static String accNm;
	private float accBal;
	
	
	public static int getAccNo() {
		return accNo;
	}
	public static void setAccNo(int accNo) {
		BankAcc.accNo = accNo;
	}
	public static String getAccNm() {
		return accNm;
	}
	public static void setAccNm(String accNm) {
		BankAcc.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	public BankAcc(int accNo, String accNm, float accBal) 
	{
		this.setAccNo(accNo);
		this.setAccNm(accNm);
		this.accBal=accBal;
	}
	
	public void withdraw(float amount)
	{
		System.out.println("amount deposited is "+amount);
	}
	public void deposite(float ammount)
	{
		System.out.println("Items are delivered with charges :"+ammount);
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + getAccNo() + ", accNm=" + getAccNm() + ", balance=" + accBal;
	}
	
	
	
	

}
