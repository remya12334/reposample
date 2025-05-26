package encapsulation;

public class Student {
	private String name;
	private int rollNumber;
	private char grade;
	
	public void setter(String name,int rollNumber,char grade)
	{
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade=grade;
	}
public void getter()
{
	System.out.println("name is :"+name);
	System.out.println("roll number "+rollNumber);
	System.out.println("grade" +grade);
}
}
