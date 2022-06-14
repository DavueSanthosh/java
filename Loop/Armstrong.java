package Loop;

public class Armstrong {
	
	int number;
	
	public void chekTheNumber(int number) {
		
		int armstrong = 0;
		int spiltTheNumber;
		int equal = number;	
		
		while (number!= 0) {

			spiltTheNumber = number % 10;
			armstrong = armstrong + (spiltTheNumber * spiltTheNumber * spiltTheNumber);
			number = number / 10;
		}

		if (armstrong == equal) {
			System.out.println(armstrong +" "+"the number is Armstrong");

		}

//		else {
//			System.out.println("the number is not armstrong");
//		}
	
		
	}
}
