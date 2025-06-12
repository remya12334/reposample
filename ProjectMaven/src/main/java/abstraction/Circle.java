package abstraction;

public class Circle extends Shape{
	public void CalArea()
	{ 
		double  r=2;
		double a=Math.PI*2*2; // Math.PI for accurate pi value
		System.out.println("area of circle is "+a);
	
	}


public static void main(String[]args)
{
	
	Shape obj=new Circle();
	 obj.display();
	obj.CalArea();
	
	
}
}