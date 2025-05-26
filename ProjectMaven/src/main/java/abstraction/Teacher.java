package abstraction;

public class Teacher extends Person {
	double monthlyPay;
	
	Teacher(double pay,String name)
	{
	super(name);
	this.monthlyPay=pay;
	
	}
	
	public void showIncome()
	{
		double income=monthlyPay*12;
		System.out.println("The yearly income is "+income);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Teacher obj=new Teacher(50000,"remya");
obj.printDetails();
obj.showIncome();
	
}
	}


