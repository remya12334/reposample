package encapsulation;

public class BankAccount {
	private String accountNumber;
	private String accountHolderName;
	private double balance;

	
	public void setaccnum(String accountNumber)
	{
		this.accountNumber=accountNumber;
	}
	
	public void setaccname(String accountHolderName)
	{
		this.accountHolderName=accountHolderName;
	}
	public void setbalance(double balance)
	{
		this.balance=balance;
	}
	
	public String getaccnum()
	{
		return accountNumber;
	}
	public String getaccname()
	{
		return accountHolderName;
	}
	public double getbalance()
	{
		return balance;
	}
}
