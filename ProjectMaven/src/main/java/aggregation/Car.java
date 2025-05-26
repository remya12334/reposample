package aggregation;

public class Car {

	Engine engine;
	 String model;
	Car(String model,Engine engine)
	{
		this.model=model;
		this.engine=engine;
	}
	public void showCarDetails()
	{
		System.out.println("the car model is "+model);
		engine.showEngine();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine e=new Engine("v8");
		Car c=new Car("sedan",e);
		c.showCarDetails();

	}

}
