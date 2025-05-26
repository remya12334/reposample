package abstraction;

public class CreditCardPayment extends Payment {
 CreditCardPayment(double amount)
 {
	 super(amount);
 }
	public void processPayment()
	{
		System.out.println("The amount is processed through Creditcard Payment ");
	}
}
