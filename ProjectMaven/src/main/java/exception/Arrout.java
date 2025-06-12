package exception;

public class Arrout {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,2,3};

try
{
	System.out.println(a[5]);
	
}
	catch(ArrayIndexOutOfBoundsException e)
{
		System.out.println("out of bound"+e.getMessage());
}
	finally
	{
		System.out.println(a[1]);
	}
	}

}
