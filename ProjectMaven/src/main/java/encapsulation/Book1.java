package encapsulation;

public class Book1 {

	private String name;
	private String author;
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setauthor(String author)
	{
		this.author=author;
	}
	
	public void getname()
	{
		System.out.println(name);
	}
	
	public void getauthor()
	{
		System.out.println(author);
	}
}

