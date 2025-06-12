package inheritance;

public class Animals {
	String name;
	int age;
	Animals(String name,int age)
	{
		this.name=name;
		this.age=age;
		}
public void display()
{
	System.out.println("name :"+name);
	System.out.println("age :"+age);
}
}
