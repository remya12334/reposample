package polymorphism;

public class PartTimeEmployee extends Employee{
	
	int hoursWorked;
	int hourlyRate;
	PartTimeEmployee(String name,int employeeId,int hoursWorked,int hourlyRate)
	{
		super(name,employeeId);
		this.hoursWorked=hoursWorked;
		this.hourlyRate=hourlyRate;
	}
	public double calculateSalary()
	{
	return hoursWorked*hourlyRate;
	}
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Salary Type : PART TIME");
	}
		
			
		
public static void main(String args[])
{
	FullTimeEmployee e= new FullTimeEmployee("remya",100,50000);
	e.displayDetails();
	System.out.println(e.calculateSalary());
	PartTimeEmployee p=new PartTimeEmployee("mythly",101,80,300);
	p.displayDetails();
	System.out.println(p.calculateSalary());
	
	
	
}
}