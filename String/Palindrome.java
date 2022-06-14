package String;

public class Palindrome {
	String words;

	public void checkTheWords(String words) {

		String emptySpace = "";

		for (int index = words.length() - 1; index >= 0; index--) {
			emptySpace = emptySpace + words.charAt(index);

		}

		if (words.equals(emptySpace)) {

			System.out.println("Name is palindrome");
		}

		else {

			System.out.println("Name is not palindrome");

		}
	}

}
