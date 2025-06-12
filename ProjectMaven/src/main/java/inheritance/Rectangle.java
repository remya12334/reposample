package inheritance;

public class Rectangle extends Shape {
	int length;
	int width;
	Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
		
	}
	
	public void area()
	{
		int area=length*width;
		System.out.println("the area of rectangle is "+area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r=new Rectangle(3,4);
		r.area();

	}

}
