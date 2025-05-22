package exception;

public class Throw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;
		if(a>20)
		{
			System.out.println("false");
		}
		else
		{
			throw new ArithmeticException("true");
		}
	}

}
