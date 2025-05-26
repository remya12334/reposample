package aggregation;

public class Library {

	Book book;
	Library(Book book)
	{
		this.book=book;
	}
	public void showLibraryBook()
	{
		book.displayBook();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book("ABC","abc");
		Library l=new Library(b);
		l.showLibraryBook();

	}

}
