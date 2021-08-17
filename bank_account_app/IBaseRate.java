package bank_account_app;

public interface IBaseRate {
	
	// Write method that returns Base rate
	default double getBaseRate()
	{
		return 2.5;
	}
}
