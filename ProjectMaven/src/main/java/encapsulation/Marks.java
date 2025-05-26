package encapsulation;

public class Marks {
	private String studentName;
	private String subject;
	private int mark;
	
	public void setname(String studentName)
	{
		this.studentName=studentName;
	}
public void setsub(String subject)
{
	this.subject=subject;
}
public void setmark(int mark)
{
	this.mark=mark;
}
public String getname()
{
	return studentName;
}
public String getsub()
{
	return subject;
}
public int getmark()
{
	return mark;
}
}
