package abstraction;

public class FullTimeEmployee extends Employee
{

	public void CalculateSalary()
	{
		int salary=50000;
		System.out.println("the salary is "+salary);
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
FullTimeEmployee obj=new FullTimeEmployee();
obj.displayInfo();

obj.CalculateSalary();


	}

}
