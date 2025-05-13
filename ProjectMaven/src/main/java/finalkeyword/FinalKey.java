package finalkeyword;

public class FinalKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalKey obj1=new FinalKey();
obj1.display();
	}
	
	final int age=15;
	
	void display()
	{
		 //age=20;   final int age is assigned as 15 so we cannot change it.
		System.out.println(age);
	}

}
