package aggregation;
//main class 
public class Student {

	public static void main(String[] args) {
		
		Address obj1=new Address("ABC1","tvm","kerala");
		Student obj2=new Student("remya",22,obj1);
		obj2.displaydetails();
	}
		String name;
		int rollnumber;
		Address address;// new object is created to build a HAS-A relationship between class A and class B(class A has Class B),AGGREGATION
   Student(String name,int rollnumber,Address address)
{
			this.name=name;
			this.rollnumber=rollnumber;
			this.address=address;
}
		void displaydetails()
		{
			System.out.println("name -  "+name);
			System.out.println("roll number - "+rollnumber);
			System.out.println("address -"+address.house);
			System.out.println(address.city);
			System.out.println(address.state);
		
	}

}
