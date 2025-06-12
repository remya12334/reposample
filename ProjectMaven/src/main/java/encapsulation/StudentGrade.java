package encapsulation;

public class StudentGrade {
private String name;
private char grade;

public  void setname(String name)
{
	this.name=name;
}

public void setgrade(char grade)
{
	this.grade=grade;
	
}

public String getname()
{
	return name;
}
public char getgrade()
{
	return grade;
}
}
