package exception;

public class ExceptionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=0;
		try
		{
			int c=a/b;
			
		}
		catch(ArithmeticException e) // e denotes exception variable name
		{
			 b=2;
			 int d=a/b;
			 System.out.println(d);
			 System.out.println(e);
			 
		}
		
		finally  // mandatory execution of finally will occur
		{
			 b=4;
			 float d=(float)a/b; //to get accurate result
			 System.out.println(d);
			
			
		}

	}

}







/*
 * 2 output of d
java.lang.ArithmeticException: / by zero   this is the output of e
1.25 output d
*/
