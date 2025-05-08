package aggregation;

public class Engine {   //class B

	public static void main(String[] args) {
//	Car obj1=new Car();
//	obj1.stop();

	
	}

	
	void start()
	{
		System.out.println("start engine");
	}
	

public class Car{  
	//class A
	
	
	Engine obj=new Engine();
	void stop()
	{
		obj.start();
		System.out.println("stop the car");
	}
	}



/*public static void main(String[] args) {
		Car obj1=new Car();
		obj1.stop();

	} */

}



