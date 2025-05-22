package collections;

import java.util.HashSet;
import java.util.Set;

public class GenericSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> fruits=new HashSet<String>();
fruits.add("apple");
fruits.add("orange");
fruits.add("grapes");

Set<String> veg=new HashSet<String>();
veg.add("carrot");
veg.add("potato");
veg.add("spinach");

System.out.println(fruits);
System.out.println(veg);
fruits.addAll(veg);
System.out.println(veg);
System.out.println(fruits);
System.out.println(fruits.contains("lemon"));
System.out.println(veg.containsAll(fruits));
System.out.println(fruits.isEmpty());
System.out.println(fruits.size());
fruits.remove("grapes");
System.out.println(fruits);
fruits.removeAll(veg);
System.out.println(fruits);
fruits.clear();
System.out.println(fruits);





	}

}
