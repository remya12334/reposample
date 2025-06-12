package abstraction;

public class WashingMachine extends Appliance
{
	
	
	double powerPerHour;
	WashingMachine(String brandName,double powerPerHour)
	{
		super(brandName);
		this.powerPerHour=powerPerHour;
	}
	public void getPowerUsage()
	{
		double power=powerPerHour*10;
		System.out.println("power usage is "+power+"watts");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Appliance a=new WashingMachine("IFB",700);
a.showBrand();
a.getPowerUsage();



	}

}
