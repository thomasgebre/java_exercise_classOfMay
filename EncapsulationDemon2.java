package com.classofmay;

class Account {
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
		return accountDeposit;
	}
	public void setAccountDeposit(double accountDeposit) {
		if (accountDeposit <= 0 ) {

			System.out.println(" * You gave wrong deposit amount.*"
					          + "\n * Please enter a valid number.*\n");
		} else {
			this.accountDeposit = accountDeposit;

		}
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}

public class EncapsulationDemon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account myAcc = new Account();
		
		myAcc.setAccountName("thomas");
		myAcc.setAccountNumber(1000056);
		myAcc.setAccountDeposit(600);
		myAcc.setAccountBalance(4500);
		
		double Balance = myAcc.getAccountBalance() + myAcc.getAccountDeposit();
		
		System.out.println(myAcc.getAccountName());
		System.out.println(myAcc.getAccountNumber());
		System.out.println(myAcc.getAccountDeposit());
		System.out.println(myAcc.getAccountBalance());
		System.out.println("Final Balance is: " + Balance);
	}

}
