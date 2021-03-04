package com.oops2;

class Account{
	
	private String accountName;
	private int accountNumber;
	private double accountDeposit;
	private double accountBalance;
	
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public int getAccountNumber() {		
		return accountNumber;
		
	
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountDeposit() {
		return accountDeposit;}
		
	public void setAccountDeposit(double accountDeposit) {
		if (accountDeposit<0) {System.out.println("error");}
		
		else {
		this.accountDeposit = accountDeposit;}
		
		
			 }
	
	public double getAccountBalance() {
		return accountBalance + + accountDeposit;
	}
	public void setAccountBalance(double accountBalance) {
			
		this.accountBalance = accountBalance;
	}
	
}

public class AccountMainD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account acc=new Account();
		
		acc.setAccountName("Miki");
		acc.setAccountNumber(12335);
		acc.setAccountDeposit(7000);
		acc.setAccountBalance(6000);
		
		System.out.println("AccountName:" + acc.getAccountName());
		System.out.println("Account Number:" + acc.getAccountNumber());
		System.out.println("Account Deposit:" +acc.getAccountDeposit());
		System.out.println("Account Balance:" + (acc.getAccountBalance() + acc.getAccountDeposit()));
		
		

	}

}
