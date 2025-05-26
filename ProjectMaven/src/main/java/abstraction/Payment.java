package abstraction;

public abstract class Payment {
	protected double amount;
	Payment(double amount)
	{
		this.amount=amount;
	}

	public abstract void processPayment();
	public void showAmount()
	{
		System.out.println("amount is "+amount);
	}
}
