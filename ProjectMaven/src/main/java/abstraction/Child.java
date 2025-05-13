package abstraction;

public  class Child extends Parent {

	public static void main(String[] args) {
		
Child obj1=new Child();
obj1.sum2();
	}

	
public void sum2()
{
	int a=5;
	int b=4;
	int c=a+b;
	System.out.println("sum "+c);
}
}
//abstract keyword is used in parent class and working is checked in child class