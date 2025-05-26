package aggregation;

public class Laptop {
	Battery bat;
	String brand;
	Laptop(String brand,Battery bat)
	{
		this.brand=brand;
		this.bat=bat;
	}
	
	public void showLaptopDetails()
	{
		System.out.println("LAPTOP BRAND IS :"+brand);
		bat.showBatteryDetails();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Battery b=new Battery(1500);
Laptop l=new Laptop("HP",b);
l.showLaptopDetails();
	}

}
