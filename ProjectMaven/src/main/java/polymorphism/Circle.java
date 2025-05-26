package polymorphism;

public class Circle extends Shape{
public void area()
{
	System.out.println("area of circle");
}
public void area(double radius)
{
	double a=3.14*radius*radius;
	System.out.println("area of circle is "+a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle cir=new Circle();
		Shape sha=new Shape();
		cir.area(2.5);
		cir.area();
		sha.area();
		sha.area(4);

	}

}
