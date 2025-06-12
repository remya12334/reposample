package exception;

public class Unchecked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=null;
		try
		{
			System.out.println("the length of string is "+s.length());
		}
catch(NullPointerException e)
		{
	
	System.out.println("null poin exception identified"+e.getMessage());
		}
	}

}
