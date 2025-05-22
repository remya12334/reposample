package exception;

public class Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(25);
		

	}
	static void sum(int a) throws ArithmeticException
	{
		
		if(a>20)
		{
			throw new ArithmeticException("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
