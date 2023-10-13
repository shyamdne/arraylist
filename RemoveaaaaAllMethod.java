package arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveaaaaAllMethod {
	
	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Blue"); // Duplicate for demonstration

        // Creating another ArrayList to specify elements to remove
        List<String> colorsToRemove = new ArrayList<>();
        colorsToRemove.add("Blue");
        colorsToRemove.add("Yellow");

        // Removing elements from the 'colors' ArrayList
        colors.removeAll(colorsToRemove);

        // Displaying the modified 'colors' ArrayList
        System.out.println("Modified ArrayList after removing elements:");
        for (String color : colors) {
            System.out.println(color);
        }
            
            List< String> l1 = new ArrayList<>();
            l1.add("book");
            l1.add("pen");
            l1.add("paper");
            l1.add("bag");
            List< String> l2 = new ArrayList<>();
            l2.add("book");
            l2.add("pen");

            l1.removeAll(l2);
            System.out.println(l1);
	
	
	
	}

}
