package inheritance;

public class Person {
	String name;
	int age;
	Person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	public void displayInfo()
	{
	System.out.println("NAME : "+name);
	System.out.println("AGE  :"+age);
	}
}
