package encapsulation;

public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount b=new BankAccount();
b.setaccnum("AA123");
b.setaccname("REMYA");
b.setbalance(5000);
System.out.println(b.getaccnum());
System.out.println(b.getaccname());
System.out.println(b.getbalance());
	}

}
