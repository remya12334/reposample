package encapsulation;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b=new Book();
		b.settitle("wings of fire");
		b.setauthor("APJ ABDUL KALAM");
		b.setprice(300);
		System.out.println(b.gettitle());
		System.out.println(b.getauthor());
		System.out.println(b.getprice());
	}

}
