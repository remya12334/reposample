package aggregation;

public class Employee {
	String name;
	int employeeID;
	Company com;
	Employee(String name,int employeeID,Company com)
	{
		this.name=name;
		this.employeeID=employeeID;
		this.com=com;
	}
	public void showEmployeeDetails()
	{
		System.out.println("NAME : "+name);
		System.out.println("EMPLOYEE ID : "+employeeID);
		com.showCompanyDetails();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company c=new Company("MICROSOFT","USA");
		//c.showCompanyDetails();
		Employee e=new Employee("REMYA",112233,c);
        e.showEmployeeDetails();
	}

}
