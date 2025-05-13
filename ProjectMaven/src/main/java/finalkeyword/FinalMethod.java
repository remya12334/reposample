package finalkeyword;

public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FinalMethod obj1=new FinalMethod();
obj1.sum();
	}

	
	final void sum()
	{
		System.out.println("sum is constant");
	}
	
	
	/*void sum()
	{
		System.out.println("sum");   // same method name cannot be used
	
}*/
}