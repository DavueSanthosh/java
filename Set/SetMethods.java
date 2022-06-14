package Set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetMethods {

 public void remove() {
		
		Set csk = new LinkedHashSet();

		Scanner team = new Scanner(System.in);
		
		System.out.println("Enter the Size of the Set:");
		int size = team.nextInt();

		for (int index = 0; index < size; index++) {
			System.out.println("Enter the name");
			csk.add(team.next());
		
		}
		
		System.out.println(csk);
		
		
		System.out.println("Enter the remove name");
		csk.remove(team.next());
		System.out.println("Remove name:"+csk);
		
	}
	
	
	public void removeAll() {

		Set Mi = new LinkedHashSet();
		Set MiMain11 = new LinkedHashSet();

		Scanner team = new Scanner(System.in);

		System.out.println("Enter the Size of the First Set:");
		int size = team.nextInt();

		for (int index = 0; index < size; index++) {
			System.out.println("Enter the name");
			Mi.add(team.next());

		}

		System.out.println("Set No-1:" + Mi);
		System.out.println(" ");

		System.out.println("Enter the Size of the  Second Set");
		int size2 = team.nextInt();

		for (int index = 0; index < size2; index++) {
			System.out.println("Enter the name");

			MiMain11.add(team.next());

		}
		System.out.println("Set No-2:" + MiMain11);
		System.out.println(" ");

		Mi.removeAll(MiMain11);

		System.out.println("Remove All:" + " " + Mi);

	}

	public void clear() {

		Set csk = new LinkedHashSet();

		csk.clear();
		System.out.println("Clear method:" + csk);

	}
	public void duplicates() {
		
		Set RR = new LinkedHashSet();
		RR.add("Boult");
		RR.add("Ashwin");
		RR.add("Chahal");
		RR.add("Butler");
		RR.add("Boult");
		
     System.out.println("Set not allows the duplicates");
     System.out.println(RR);
	}

	public void retinAll() {

		Set Rcb = new LinkedHashSet();

		Set RcbMain11 = new LinkedHashSet();

		Rcb.add("Virat");
		Rcb.add("Faf");
		Rcb.add("Chahal");
		Rcb.add("DK");
		Rcb.add("Siraj");

		RcbMain11.add("Virat");
		RcbMain11.add("Siraj");

		Rcb.retainAll(RcbMain11);

		System.out.println("Retain method:" + Rcb);

	}

	public void size() {
		Set DC = new LinkedHashSet();
		DC.add("Pant");
		DC.add("shaw");

		System.out.println("Method size:" + DC.size());

	}

	public void empty() {
		Set Lsg = new LinkedHashSet();
		Lsg.add("KL rahul");
		Lsg.add("Bishoni");
		Lsg.add("Dekock");

		boolean empty = Lsg.isEmpty();
		System.out.println("Empty method:" + empty);

	}

	public void contains() {
		Set GT = new LinkedHashSet();

		GT.add("Hardik");
		GT.add("Rashid");
		GT.add("Shami");

		System.out.println("Contain Method:" + GT.contains("Hardik"));

	}

}	
