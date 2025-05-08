package inheritance;
import java.util.Scanner; // for importing scanner

public class Input {

	Float basicpay;
	Float deduction;
	Float bonus;
	void getinput()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter basic pay");
		basicpay=sc.nextFloat(); // for inputing next value
		System.out.println("enter deduction");
		deduction=sc.nextFloat();
		System.out.println("enter bonus");
		bonus=sc.nextFloat();
		
	}
}
