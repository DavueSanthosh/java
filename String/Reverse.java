package String;

public class Reverse {
	String name;
	
	public void nameReverse(String name) {

		String reverse = "";

		for (int index = name.length() - 1; index >= 0; index--) {
			reverse = reverse + name.charAt(index);

		}
		System.out.println("The Original word is"+" "+name);
		System.out.println(" ");
		System.out.println("The Reverse word is"+" "+reverse);

	}
}
