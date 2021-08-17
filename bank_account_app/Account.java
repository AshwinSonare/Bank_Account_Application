package bank_account_app;

public abstract class Account implements IBaseRate {
	// List of common properties for savings and checking accounts
	private String name;
	private String sSN;
	private double balance;
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	// Constructor to set base properties and initialize account
	public Account(String name, String sSN, double initDeposit)
	{
		this.name = name;
		this.sSN = sSN;
		balance = initDeposit;
		
		// Set Account Number
		index++;
		this.accountNumber = setAccountNumber();
		
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber()
	{
		String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
		int uniqueID = index;
		int randomNumber = (int)(Math.random() * Math.pow(10, 3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void compound()
	{
		double accruedInterest = balance*(rate/100);
		balance = balance + accruedInterest;
		System.out.print("\nAccrued Interest : Rs" + accruedInterest);
		printBalance();
	}
	
	// List of common methods - transactions
	public void deposit(double amount)
	{
		balance = balance + amount;
		System.out.print("\nDepositing Rs." + amount);
		printBalance();
	}
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
		System.out.print("\nWithdrawing Rs." + amount);
		printBalance();
	}
	
	public void transfer(String toWhere, double amount)
	{
		balance = balance - amount;
		System.out.print("\nTransfering Rs." + amount + " to " + toWhere);
		printBalance();
	}
	
	public void printBalance()
	{
		System.out.print("\nYour Balance is now Rs." + balance);
	}
	
	public void showInfo()
	{
		System.out.print(
				"\nNAME :" + name +
				"\nACCOUNT NUMBER :" + accountNumber +
				"\nBALANCE :" + balance +
				"\nRATE :" + rate + "%"
				);
	}
}
