package inheritance;

public class Car extends Vehicle {
int numDoors;
Car(String brand,int speed,int numDoors)
{
	super(brand,speed);
	this.numDoors=numDoors;
}
public  void move()
{
	super.move();
	System.out.println("The car is driving on the road");
}
public void displayInfo()
{
	super.displayInfo();
	System.out.println("number of doors "+numDoors);
}
}
