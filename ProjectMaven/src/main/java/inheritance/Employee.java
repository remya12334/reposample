package inheritance;

public class Employee {
	String name;
	double salary;
	Employee(String name,double salary) //constructor
	{
		this.name=name;  //assigns parameter to instance variable,it initializes employee obj with name and salary.
		this.salary=salary; 
	}
public void displayInfo()
{
	System.out.println("the name of employee is"+name);
	System.out.println("the salary is "+salary);
}
}
