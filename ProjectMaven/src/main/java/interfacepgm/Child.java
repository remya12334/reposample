package interfacepgm;

public class Child implements Parent {
// here "implements" keyword is used to connect child class and parent class.
	public static void main(String[] args) {
		
Child obj1=new Child();
obj1.sum();
obj1.display();
	}
	
	public void sum()
	{
		int a=3;
		int b=1;
		int c=a+b;
		System.out.println("sum is "+c);
	}
	
	public void display()
	{
		System.out.println("hello world");
	}

}
