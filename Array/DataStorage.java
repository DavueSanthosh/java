package Array;

public class DataStorage {

	private int lengthOfTheArray;
	private int[] unsortedArray;
	private int[] arraySortedInAscendingOrder;
	private int[] arraySortedInDescendingOrder;

	public int getLengthOfTheArray() {
		return lengthOfTheArray;
	}

	public void setLengthOfTheArray(int lengthOfTheArray) {
		this.lengthOfTheArray = lengthOfTheArray;
	}

	public int[] getUnsortedArray() {
		return unsortedArray;
	}

	public void setUnsortedArray(int[] temp) {
		this.unsortedArray = temp;
	}

	public int[] getArraySortedInAscendingOrder() {
		return arraySortedInAscendingOrder;
	}

	public void setArraySortedInAscendingOrder(int[] temp) {
		this.arraySortedInAscendingOrder = temp;
	}

	public int[] getArraySortedInDescendingOrder() {
		return arraySortedInDescendingOrder;
	}

	public void setArraySortedInDescendingOrder(int[] temp) {
		this.arraySortedInDescendingOrder = temp;
	}

}
