package bank_account_app;

public class Checking extends Account {
	// List of properties specific to Checking account
	private int debitCardNumber;
	private int debitCardPIN;
	
	// Constructor to initialize checking account properties
	public Checking(String name, String sSN, double initDeposit)
	{
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		setDebitCard();
	}
	
	@Override
	public void setRate()
	{
		rate = getBaseRate()*(0.15);
	}
	
	// List of any methods specific to Checking account
	private void setDebitCard()
	{
		debitCardNumber = (int)(Math.random()*Math.pow(10, 12));
		debitCardPIN = (int)(Math.random()*Math.pow(10, 4));	
	}
	
	public void showInfo()
	{
		super.showInfo();
		System.out.print("\nYour Checking Account Features" +
		      "\n Debit Card Number :" + debitCardNumber +
		      "\n Debit Card PIN :" + debitCardPIN
		      );
	}
}
