package aggregation;

public class Computer {
	String brand;
	KeyBoard key;
	Computer(String brand,KeyBoard key)
	
	{
		this.brand=brand;
		this.key=key;
	}
public void showComputerDetail()
{
	System.out.println("BRAND OF COMPUTER IS "+brand);
	key.showKeyBoardType();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KeyBoard k=new KeyBoard("wireless");
		//k.showKeyBoardType();
		Computer c=new Computer("HP",k);
		c.showComputerDetail();

	}

}
