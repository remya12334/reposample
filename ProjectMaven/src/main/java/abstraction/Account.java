package abstraction;

public abstract class Account {
	
	protected String accountHolder;
	Account(String accountHolder)
	{
		this.accountHolder=accountHolder;
	}
	public abstract void calculateInterest();
	public void displayHolder()
	{
		System.out.println("The name of account holder is "+this.accountHolder);
	}

}
