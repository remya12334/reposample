package abstraction;

public class SavingsAccount extends Account {

	double balance;
	SavingsAccount(String accountHolder,double balance)
	{
		super(accountHolder);
		this.balance=balance;
	}
	public void calculateInterest()
	{
		double interest= balance*1*(0.05);
		System.out.println("the interest for 1 year is "+interest);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount obj=new SavingsAccount("remya",5000000);
		obj.displayHolder();
		obj.calculateInterest();
		
		

	}

}
