package Loop;

import java.util.Scanner;

public class RandomNumbers {

	int answer;

	int generateNumber(int min, int max) {

		answer = (int) (Math.random() * (max - min + 1) + min);
		return answer;

	}

	void checkNumber() {

		Scanner scan = new Scanner(System.in);
		int predict;
		boolean correct = false;

		while (!correct) {

		System.out.println("Predict a number between 1 and 30: ");
			predict = scan.nextInt();

			if (predict > 30 ) {

				System.out.println("The limit only is 0 to 30");
			}
			
			else if(predict <1) {
				System.out.println("The limit only is 0 to 30");
			}

			else if (predict > answer) {

				System.out.println("Too High, Try again");
			}

			else if (predict < answer) {

				System.out.println("Too Low, Try again");

			}

			else if (predict == answer) {

				System.out.println("Yes, you guessed the number.");

				correct = true;
			}

		}
		System.exit(0);
	}

}
