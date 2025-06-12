package aggregation;

public class Schools {
 Teachers t;
 String schoolname;
 Schools(String schoolname,Teachers t)
 {
	 this.schoolname=schoolname;
	 this.t=t;
 }
	
	public void display()
	{
		t.display();
		System.out.println("school name is "+schoolname);
	}
	
	
	
	public static void main(String[] args) {
		Teachers teach=new Teachers("remya","maths");
		  Schools s=new Schools("svgvhss",teach);
s.display();
	}

}
