package String;

public class StringMethod {

	String Statement;
	String Statement1;
	String Stroage;

	public StringMethod(String Statement, String Statement1, String Stroage) {
		this.Statement = Statement;
		this.Statement1 = Statement1;
		this.Stroage = Stroage;
	}

	public void startwith() {

		boolean check = Statement.startsWith("C");
		System.out.println("The Word StartsWith:" + " " + check);
		System.out.println(" ");
	}

	public void endWith() {

		boolean end = Statement.endsWith("y");
		System.out.println("The Word EndWith:" + " " + end);
		System.out.println(" ");
	}

	public void indexOf() {

		int position = Statement.indexOf("c");
		System.out.println("Check the postion of the character:" + " " + position);
		System.out.println(" ");
	}

	public void lastIndex() {

		int index = Statement.lastIndexOf("d");
		System.out.println("Check the postion of the last character:" + " " + index);
		System.out.println(" ");

	}

	public void length() {

		System.out.println("The Length of the Statement:" + " " + Statement.length());
		System.out.println(" ");
	}

	public void upperCase() {

		System.out.println("The Uppercase of the Statement:" + "  " + Statement.toUpperCase());
		System.out.println(" ");
	}

	public void lowerCase() {

		System.out.println("The Lowercase of the Statement:" + " " + Statement.toLowerCase());
		System.out.println(" ");
	}

	public void split() {

		System.out.println("Split character of  the Statement:" + Statement.charAt(2));
		System.out.println(" ");

	}

	public void substring() {

		System.out.println("Substring index:" + " " + Statement.substring(4));
		System.out.println(" ");
	}

	public void substringIndex() {

		System.out.println("Substring index Begin and End:" + " " + Statement.substring(0, 7));
		System.out.println(" ");
	}

	public void trim() {

		System.out.println("Remove Unwanted Space:" + " " + Statement.trim());
		System.out.println(" ");
	}

	public void concat() {

		System.out.println("Add the two String:" + " " + Statement.concat(Stroage));
		System.out.println(" ");
	}

	public void equal() {

		System.out.println("Check the two String:" + " " + Statement.equals(Statement1));
		System.out.println(" ");
	}

	public void equalIgnoreCase() {

		System.out.println("Check the two String:" + " " + Statement.equalsIgnoreCase(Statement1));
		System.out.println(" ");
	}

	public void replace() {

		System.out.println("Replace the Character:" + " " + Statement.replace('D', 'F'));
		System.out.println(" ");
	}

	public void replaceCase() {

		System.out.println("Replace the Case:" + " " + Statement.replaceAll(Statement, Statement1));
		System.out.println(" ");
	}

	public void empty() {

		System.out.println("Check the String is Empty or not:" + " " + Statement.isEmpty());
		System.out.println(" ");
	}

	public void contains() {

		System.out.println("The Value is present or Not:" + " " + Statement.contains("can"));
		System.out.println(" ");
	}
}
