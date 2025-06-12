package polymorphism;

public class Bike extends Vehicle {
	public void move()
	{
		System.out.println("super bikes move faster than car and truck");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v;
		v=new Car();
		v.move();
		v=new Truck();
		v.move();
		v=new Bike();
		v.move();

	}

}
