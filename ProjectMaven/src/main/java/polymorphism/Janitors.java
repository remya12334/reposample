package polymorphism;

public class Janitors extends Staffs {

	public void duty()
	{
		System.out.println("JANITORS HELP US TO KEEP EVERYTHING CLEAN");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staffs s;
		s=new Teachers();
		s.duty();
		s=new Manager();
		s.duty();
		s=new Janitors();
		s.duty();

	}

}
