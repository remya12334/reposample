package inheritance;

public class Student2 extends Person2 {

	public static void main(String[] args) {
		
		Student2 obj=new Student2("remya",10);
		obj.display();
		
	}
int rollNumber;
	Student2(String name,int rollNumber)
	{
		
		super(name);
		this.rollNumber=rollNumber;
	}
	public void display()
	{
		super.display();
		System.out.println("roll number is "+rollNumber);
	}
}
