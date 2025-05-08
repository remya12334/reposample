package polymorphism;

public class PolyChild extends PolyParent{

	public static void main(String[] args) {
	
		PolyChild obj=new PolyChild();
		obj.sum(8, 4);
		
	}
		// TODO Auto-generated method stub

		public void sum(int a,int b)
		{
			int c=a-b;
			System.out.println("difference is "+c);
			super.sum(10,5);
		}
	}



