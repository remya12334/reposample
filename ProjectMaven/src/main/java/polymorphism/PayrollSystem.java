package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee>employees=new ArrayList<>();
		employees.add(new FullTimeEmployee("Remya",101,50000));
		employees.add(new FullTimeEmployee("Mythily",102,60000));
		employees.add(new PartTimeEmployee("Mithra",103,6,100));
		employees.add(new PartTimeEmployee("Praveen",104,2,100));
		
		   for (Employee emp : employees) {
			   
	            emp.displayDetails();
	            System.out.println();
	        }
	}

} 
