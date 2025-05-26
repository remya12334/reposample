package abstraction;

public abstract class Appliance {
protected  String brandName;

Appliance(String brandName)
{
	this.brandName=brandName;
}
public abstract void getPowerUsage();
public void showBrand()
{
	System.out.println("brand name :"+this.brandName);
}
}
