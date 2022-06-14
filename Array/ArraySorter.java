package Array;

//import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySorter {
	
	int[] temporary;
	
	DataStorage array = new DataStorage();
	Scanner scan = new Scanner(System.in);

	
	
 void getTheArrayElements() {

		System.out.println("Enter the length of the array");

		try {
		
		array.setLengthOfTheArray(scan.nextInt());
		
		}
		
		catch (InputMismatchException exception1) {
	
			System.err.println("Only Integer Input will be allows");
			System.exit(0);
		}

		System.out.println("Ener the elements of unsorted Array");

		int[] temporary = new int[array.getLengthOfTheArray()];
		
		try {
			for (int index = 0; index < temporary.length; index++) {

				temporary[index] = scan.nextInt();
               System.out.println(" Unsorted Array:"+temporary[index]);
			}

		} 
		catch (InputMismatchException exception2) {
			System.err.println("Enter the integer Input");
			System.exit(0);
		}
		
			array.setUnsortedArray(temporary);
		    scan.close();
	}

	void sortTheArrayInAscendingOrder() {

		temporary = array.getUnsortedArray();
		
		int tempStore;
                                	
		for (int index = 0; index < temporary.length; index++) {
			for (int secondIndex = index + 1; secondIndex < temporary.length; secondIndex++) {
				
				if (temporary[index] > temporary[secondIndex]) {
					tempStore = temporary[index];
					temporary[index] = temporary[secondIndex];
					temporary[secondIndex] = tempStore;
				}

			}
		}
		
//		Arrays.sort(temp);
//		             
//		System.out.println("ascending order : "+ Arrays.toString(temp));
		
		array.setArraySortedInAscendingOrder(temporary);
	}

	void displayTheArraySortedInAscendingOrder() {
		

		System.out.print("Sorted array AscendingOrder  : ");
		temporary = array.getArraySortedInAscendingOrder();
		
		for (int index = 0; index < temporary.length; index++) {
			
			System.out.print(temporary[index] + " ");
		}

	}

	void sortTheArrayInDescendingOrder() {

		temporary = array.getUnsortedArray();
		int tempStore;
		
		for (int index = 0; index < temporary.length; index++) {
			for (int secondIndex = index + 1; secondIndex < temporary.length; secondIndex++) {
				
				if (temporary[index] < temporary[secondIndex]) {
					tempStore = temporary[index];
					temporary[index] = temporary[secondIndex];
					temporary[secondIndex] = tempStore;
				}

			}
		}
		
		array.setArraySortedInDescendingOrder(temporary);
	}

	void displayTheArraySortedInDescendingOrder() {
		
		
		System.out.println();
		System.out.print("Sorted array DescendingOrder  : ");

		temporary = array.getArraySortedInDescendingOrder();
		for (int index = 0; index < temporary.length; index++) {

			System.out.print(temporary[index] + " ");
		}

	}
}
