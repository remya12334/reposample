package interfacepgm;

public class Rectangle implements Shape {
	int length;
	int breadth;
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	
	public void area()
	{
		int a=length*breadth;
		System.out.println("area of rectangle is :"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circle c=new Circle(3);
c.area();
Rectangle r=new Rectangle(2,3);
r.area();

	}

}
