package Loop;

import java.util.Scanner;

public class Reverse {
	
	int reverse = 0;
	int remainder;
	int number;	

	public void numberReverse(int number) {
		
		while (number >0) {

			remainder = number % 10;
			reverse = (reverse * 10) + remainder;
			number = number / 10;

		}

		System.out.println("Reverse the number:" + reverse);
	}

}
