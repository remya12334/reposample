package polymorphism;

public class Employee {
	String name;
	int employeeId;
	Employee(String name,int employeeId)
	{
		this.name=name;
		this.employeeId=employeeId;
		
	}
	public double calculateSalary()
	{
		return 0;
	}
public void displayDetails()
{
	System.out.println("NAME :"+name);
	System.out.println("EMPLOYEE ID :"+employeeId);
}
}
