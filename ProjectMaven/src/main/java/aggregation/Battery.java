package aggregation;

public class Battery {
	int capacity;
	Battery(int capacity)
	{
		this.capacity=capacity;
	}
	public void showBatteryDetails()
	{
		System.out.println("THE BATTERY CAPACITY IS IN mAh : "+capacity);
	}

}
