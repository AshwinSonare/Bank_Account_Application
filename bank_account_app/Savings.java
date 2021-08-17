package bank_account_app;

public class Savings extends Account {
	// List of properties specific to Savings account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
    // Constructor to initialize settings for savings properties
	public Savings(String name, String sSN, double initDeposit)
	{
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate()
	{
		rate = getBaseRate() - 0.25;
	}

	private void setSafetyDepositBox()
	{
		safetyDepositBoxID = (int)(Math.random()*Math.pow(10,3));
		safetyDepositBoxKey = (int)(Math.random()*Math.pow(10,4));
	}
		
    // List of any methods specific to Saving account
	public void showInfo()
	{
		super.showInfo();
		System.out.print(
				"\nYour Savings Account Features" +
		        "\n Safety Deposit Box ID :" + safetyDepositBoxID +
		        "\n Safety Deposit Box Key :" + safetyDepositBoxKey
				);	
	}
}
