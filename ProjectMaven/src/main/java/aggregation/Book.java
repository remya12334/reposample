package aggregation;

public class Book {
	String title;
	String author;
	Book(String title,String author)
	{
		this.title=title;
		this.author=author;
	}
	public void displayBook()
	{
		System.out.println("Title : "+title);
		System.out.println("Author :"+author);
	}

}
