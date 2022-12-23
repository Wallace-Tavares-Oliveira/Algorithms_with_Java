package linear.table;

import java.util.Locale;

public class LinearTableDefinition {

	// =================== TO ATTACH NEW ITEMS =======================
	// To add more items
	public static int[] add(int[] array, int value) {
		// Create temporary array
		int[] tempArray = new int[array.length + 1];
		
		// Copy value from original array
		for (int i = 0; i< array.length; i++) {
			tempArray[i] = array[i];
		}
		
		// enter the value for the last index
		tempArray[array.length] = value;
		return tempArray;
	}
	
	// =================== MAIN =======================
	public static void main(String[] args) {

		Locale.setDefault(Locale.CANADA);

		// four position array starting at 0
		int[] array = { 30, 40, 50, 60 };
		
		// to print the values of the items in the table.
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ",");
		}
		
		// to print table size.
			System.out.println("\n"+array.length);
		
		// to print a specific table item, we use its index.
			System.out.println(array[2]);
		
		// change the value of a specific element.
			array[1] = 123;
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+",");
			}
			
			System.out.println();
			// To attach new items
			array = add(array, 987);
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+",");
			}
			
			
			
	}
}
