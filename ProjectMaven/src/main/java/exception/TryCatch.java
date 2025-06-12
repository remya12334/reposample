package exception;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4;
		int b=0;
		try
		{
		int c=a/b;
		}
		
		catch(ArithmeticException e)
		{
		 b=2;
			int d=a/b;
			System.out.println(d);
			System.out.println(e);
		}
finally {
	b=8;
	 int d=2;
	int f=b/d;
	System.out.println(f);
	
}
	}

}
