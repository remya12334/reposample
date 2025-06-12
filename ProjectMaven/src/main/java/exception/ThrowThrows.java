package exception;

public class ThrowThrows {

	public static void div(int a,int b) throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException("cannot divide by zero");
		}
		else
		{
			System.out.println("RESULT :"+(a/b));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			div(10,0);
		    }
        catch(ArithmeticException e)
		{
        	System.out.println("exception  "+e.getMessage());
		}
	
	}

}
