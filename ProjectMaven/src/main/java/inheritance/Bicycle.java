package inheritance;

public class Bicycle extends Vehicle {
	
	String type;
	Bicycle(String brand,int speed,String type)
	{
		super(brand,speed);
		this.type=type;
	}
	public void move()
	{
		
		System.out.println("The bicycle is pedaling forward");
	}
	public void displayInfo()
	{
		super.displayInfo();
		System.out.println("TYPE"+type);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v=new Vehicle("BMW",200);
		v.displayInfo();
		v.move();
		Car c=new Car("7 series",300,4);
		c.displayInfo();
		c.move();
		Bicycle b=new Bicycle("BSA",60,"Mountain");
		b.displayInfo();
		b.move();
		
		

	}

}
