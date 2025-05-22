package collections;

import java.util.ArrayList;

public class NongenericEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a=new ArrayList();
		a.add("java");
		a.add(10);
		String str=(String) a.get(0); //type casting
		int num=(Integer) a.get(1);
		for(Object b:a)  // foreach - in nongeneric datatype is defined as object
		{
			System.out.println(b);
		}
		

	}

}
