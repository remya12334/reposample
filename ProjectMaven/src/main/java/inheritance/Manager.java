package inheritance;

public class Manager extends Employee {

	String department;
	Manager(String name,double salary,String department)
	{
		super(name, salary); //call Employee constructor to initialize the inherited fields from super class
		this.department=department;
		
		
		
	}
	
	public void displayInfo() //method overriding
	{
		super.displayInfo(); //call parent class
		System.out.println("department is "+department);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Employee e=new Employee("remya",1000000);
//e.displayInfo();
Manager m=new Manager("Mythily",5000000,"HR DEPARTMENT");
m.displayInfo();
	}

}
