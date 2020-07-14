package com.classofmay;

public class scannerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		


//ClassName  == Account

		//
		//Variables  - accountName
//		         - accountNumber
//		         - accountDeposit (Deposit has to be greater than 0)
//		         - accountBalance (pre Balance + deposit) 
		//
		//All of the variables access modifier is private
		//use getter and setter.
		//
		//Account Name : name
		//Account Number: accountNumber
		//Account Deposit: accountDeposit
		//Account Balance: accountBalance

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

		public class AccountScanner {

			public static void main(String[] args) {
				// TODO Auto-generated method stub

			
			OneAcct Acct = new OneAcct();
			
			Scanner input = new Scanner(System.in);
				
			
			
				System.out.println("Please enter your name.");
				
				String Name = input.next();

				Acct.setAccountName(Name);
				
				
				System.out.println("Please enter your Acct #");
				
				int AcctNumb = input.nextInt();
				
				Acct.setAccountNumber(AcctNumb);
				
		System.out.println("Please enter your Deposit Amount");
				
				double Deposit = input.nextDouble();
				
				Acct.setAccountDeposit(Deposit);
				
				
		System.out.println("Please enter your intial balace.");
				
				double InitialBalance = input.nextDouble();
				
				
				Acct.setAccountBalance(InitialBalance);
				
				
				

				double Balance = Acct.getAccountBalance() + Acct.getAccountDeposit();

				System.out.println("Account Name :" + Acct.getAccountName());
				System.out.println("Account Number : " + Acct.getAccountNumber());
				System.out.println("Account initial balance : " +InitialBalance);
				System.out.println("Account Deposit: " + Acct.getAccountDeposit());
				System.out.println("Final Balance :" + Balance);

			}

		}	
		
		
		
		
		
	}

	}

}
