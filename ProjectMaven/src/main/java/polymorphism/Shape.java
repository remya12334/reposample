package polymorphism;

public class Shape {
	public void area()
	{
		System.out.println("Area of square");
	
	}
	
	public void area(int side)
	{
		int a=side*side;
		System.out.println("area of square is "+a);
	}

}
