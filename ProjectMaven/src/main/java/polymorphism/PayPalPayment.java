package polymorphism;

public class PayPalPayment extends Payment {
	
	
	
	public void pay()
	{
		System.out.println("PAYPAL PAYMENT");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Payment p;
	p=new CreditCardPayment();
	p.pay();
	p=new PayPalPayment();
	p.pay();
	}

}
