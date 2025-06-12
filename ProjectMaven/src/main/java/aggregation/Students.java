package aggregation;

public class Students {
	String name;
	int rollNumber;
	Students(String name,int rollNumber)
	{
		this.name=name;
		this.rollNumber=rollNumber;
	}
public void displayDetails()
{
	System.out.println("name is "+name);
	System.out.println("rollnumber is "+rollNumber);
}
}
