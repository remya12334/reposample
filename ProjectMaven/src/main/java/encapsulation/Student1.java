package encapsulation;

public class Student1 {
	private String name;
	private int rollNumber;
	private int mark;
	
	public void setname(String name)
	{
		this.name=name;
	}
public void setrollnum(int rollNumber)
{
	this.rollNumber=rollNumber;
}
public void setmark(int mark)
{
	this.mark=mark;
}

public void getname()
{
	System.out.println("NAME :"+name);
}
public void getrollnum()
{
	System.out.println("ROLL NUMBER :"+rollNumber);
}
public void getmark()
{
	System.out.println("MARK :"+mark);
}
}
