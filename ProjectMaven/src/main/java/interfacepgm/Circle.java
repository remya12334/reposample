package interfacepgm;

public class Circle implements Shape {
	double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
	public void area()
	{
		
		double a=3.14*radius*radius;
		System.out.println("area of circle :"+a);
	}

}
