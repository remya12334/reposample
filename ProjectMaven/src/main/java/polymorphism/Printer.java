package polymorphism;

public class Printer {
	
	public void print(String message)
	{
		System.out.println("message :"+message);
		
	}

	public void print(int number)
	{
		System.out.println("number :"+number);
	}
	public void print(String message,int times)
	{
		for(int i=0;i<=times;i++)
		{
			System.out.println("message :"+message);
		}
	}
	
	public static void main(String args[])
	{
		Printer p=new Printer();
		p.print("hi");
		p.print(5);
		p.print("hello", 5);
	}
}
