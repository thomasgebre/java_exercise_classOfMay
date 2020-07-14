package com.classofmay;

import java.util.Scanner;

class OneAcct {
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
		

		if (accountDeposit <= 0 || accountDeposit >= 100000) {

			System.out.println("This is wrong deposit amt. Please enter a valid number");
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

public class EncapsulationDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		OneAcct Acct = new OneAcct();
		
		System.out.println("Please enter your name:");
		
		String Name = input.next();

		Acct.setAccountName(Name);
		
		
		System.out.println("Please enter your Account number: ");
		
		int accountNumber = input.nextInt();
		
		Acct.setAccountNumber(accountNumber);
		
		System.out.println("Please enter your Deposite: ");
		double accountDeposit = input.nextDouble();
		Acct.setAccountDeposit(accountDeposit);
		
		System.out.println("Please enter your balance: ");
		double accountBalance = input.nextDouble();
		Acct.setAccountBalance(accountBalance);
		
		double finalBalance = Acct.getAccountBalance() + Acct.getAccountDeposit();
		
		 System.out.println("The final Balance is: " + finalBalance);
		
		

}
}

