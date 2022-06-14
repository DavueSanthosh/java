package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Array {

	int[] temp;

	DataStorage array = new DataStorage();

	Scanner scan = new Scanner(System.in);

	void getTheArrayElements() {

		System.out.println("Enter the length of the array");

		// try {

		array.setLengthOfTheArray(scan.nextInt());

		// }

		// catch (InputMismatchException ex) {

		// System.err.println("Enter the integer Input");
		// System.exit(0);
		// }

		System.out.println("Ener the elements of unsorted Array");

		int[] temp = new int[array.getLengthOfTheArray()];

		// try {

		for (int index = 0; index < temp.length; index++) {

			temp[index] = scan.nextInt();

		}

		// }
		// catch (InputMismatchException ex) {
		// System.err.println("Enter the integer Input");
		// System.exit(0);
		// }

		array.setUnsortedArray(temp);
		scan.close();
	}

	void sortTheArrayInAscendingOrder() {

		temp = array.getUnsortedArray();

		int tempStore;

		Arrays.sort(temp);
		System.out.println("Elements of array sorted in ascending order : " + Arrays.toString(temp));

		array.setArraySortedInAscendingOrder(temp);
	}

	void displayTheArraySortedInAscendingOrder() {

		temp = array.getArraySortedInAscendingOrder();

	}

	void sortTheArrayInDescendingOrder() {

		temp = array.getUnsortedArray();
		int tempStore;

		Arrays.sort(temp);
		System.out.println(" Descending order:" + Arrays.toString(temp));

		array.setArraySortedInDescendingOrder(temp);
	}

}