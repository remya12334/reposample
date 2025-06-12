package aggregation;

public class EmployeeEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AddressEg a=new AddressEg("tvm","kerala");
a.display();
EmployeeEg e=new EmployeeEg("remya",a);
e.display();
	}

	AddressEg a;
	String name;
	EmployeeEg(String name,AddressEg a)

	{
		this.name=name;
		this.a=a;
	}
	public void display()
	{
		System.out.println("name "+name);
	
	}
}
