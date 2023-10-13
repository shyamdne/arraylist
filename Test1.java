package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
	
	public static void main(String[] args) {
		
	
List<String> fruits = new ArrayList<>();

fruits.add("Orang");
fruits.add("Banana");
fruits.add("kiwi");
fruits.add("Apple");

System.out.println(fruits);
 for(String aa:fruits) {
	 System.out.println(aa);
 }

 List<String> fruits1 = new ArrayList<>();

 fruits1.add("Banana");
 fruits1.add("Apple");
 
 fruits1.addAll(fruits);
 System.out.println(fruits1);
 System.out.println("----------------------------");

System.out.println(fruits1.size());
System.out.println(fruits1.contains("Banana"));
System.out.println(fruits1.indexOf("Banana"));
System.out.println(fruits1.get(1));
System.out.println(fruits1.set(1, "dragon"));
 System.out.println(fruits1);
 System.out.println(fruits1.remove(1));
 System.out.println(fruits1);
 fruits1.removeAll(fruits1);
 System.out.println("----------------------------");
System.out.println(fruits1);

	}

}
