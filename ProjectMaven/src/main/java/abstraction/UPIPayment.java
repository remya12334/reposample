package abstraction;

public class UPIPayment extends Payment{
	UPIPayment(double amount)
	{
		super(amount);
	}
	
	public void processPayment()
	{
		System.out.println("The payment processed through UPI");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreditCardPayment obj1=new CreditCardPayment(50000.00);
		obj1.showAmount();
	obj1.processPayment();
	UPIPayment obj2=new UPIPayment(6000.00);
	obj2.showAmount();
	obj2.processPayment();

	}

}
