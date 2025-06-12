package polymorphism;

public class FullTimeEmployee extends Employee{

	double monthlySalary;
	
	FullTimeEmployee(String name,int employeeId,double monthlySalary)
	{
		super(name,employeeId);
		this.monthlySalary=monthlySalary;
	}
	public double calculateSalary()
	{
		return monthlySalary;
	}
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Salary Type : FULL TIME");
	}
}
