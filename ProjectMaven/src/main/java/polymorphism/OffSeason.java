package polymorphism;

public class OffSeason {
	
	
	public void discount()
	
	{  float totpurchase=6000f;
		if (totpurchase>5000f)
		{
			float discount=totpurchase*(15/100f);
			System.out.println("discount on Off season is "+discount);
		}
	}

}
