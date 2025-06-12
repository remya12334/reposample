package encapsulation;

public class MobilePhoneMain {

	public static void main(String[] args) {
MobilePhone m=new MobilePhone();
m.setbrand("SAMSUNG");
m.setmodel("GALAXY S 25");
m.setprice(150000);
System.out.println(m.getbrand());
System.out.println(m.getmodel());
System.out.println(m.getprice());
	}

}
