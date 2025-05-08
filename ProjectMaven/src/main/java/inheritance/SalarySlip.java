package inheritance;

public class SalarySlip extends Calculation {

	void displayslip()
	{
		Float totalsalary=(basicpay+hra-pf-deduction+bonus);
		System.out.println("Basic pay is "+basicpay);
		System.out.println("Deduction is "+deduction);
		System.out.println("HRA is "+hra);
		System.out.println("PF is "+pf);
		System.out.println("bonus is "+bonus);
		System.out.println("total salary is "+totalsalary);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	SalarySlip obj=new SalarySlip();
	obj.getinput();
	obj.calculate();
	obj.displayslip();
			
		

	}

}
