package inheritance;

public class Student extends Person{

	char grade;
	Student(String name,int age,char grade)
	{
		super(name,age);
		this.grade=grade;
	}
	
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("GRADE :"+grade);
	}
}
