package arraylist;

import java.util.ArrayList;

public class TestArraylist {

	
	
	public static void main(String[] args) {
		ArrayList<String > name = new ArrayList<>();
		name.add("shyam");
		name.add("chinna");
		name.add("chinni");
		
		for(String n: name) {
						
			System.out.print(n+",");
		}

	}
}
