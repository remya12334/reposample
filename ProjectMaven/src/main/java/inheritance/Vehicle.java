package inheritance;

public class Vehicle {
	String brand;
	int speed;
	Vehicle(String brand,int speed)
	{
		this.brand=brand;
		this.speed=speed;
	}
public void displayInfo()
{
	System.out.println("BRAND "+brand);
	System.out.println("SPEED "+speed);
	
}
public void move()
{
	System.out.println("Vehicle is moving......");
}
}
