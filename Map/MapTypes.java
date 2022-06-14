package Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MapTypes {

	public void hashMap() {

		HashMap<Integer, String> Raw = new HashMap<Integer, String>();
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter te Size of the Map");
		int size = 0;

		try {

			size = scan.nextInt();

		} catch (InputMismatchException exception1) {

			System.out.println("Integer Inputs only allows");
		}

		for (int index = 0; index < size; index++) {

			System.out.println("Enter the Map Keys and Values");

			try {

				Raw.put(scan.nextInt(), scan.next());
			} catch (Exception exception2) {

				System.out.println("Enter the integer first Then String");
			}

		}

		System.out.println("Hash Map:" + Raw);

		for (Entry<Integer, String> entry : Raw.entrySet()) {

			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

	}

	public void linkedMap() {

		LinkedHashMap<Integer, String> smackdown = new LinkedHashMap<Integer, String>();

		smackdown.put(2, "Seth rollins");
		smackdown.put(3, "Usos");
		smackdown.put(4, "AJ Styles");
		smackdown.put(6, "Dean ambrose");
		smackdown.put(8, "The Rock");

		System.out.println("Linked HashMap:" + smackdown);

		// ArrayList<String> key=new ArrayList<String>(smackdown.values());

		// ArrayList<Integer> values=new ArrayList<Integer>(smackdown.keySet());

		// System.out.println("List"+values);

		// System.out.println("List" +key);
	}

	public void treeMap() {

		TreeMap<Integer, String> Nxt = new TreeMap<Integer, String>(Collections.reverseOrder());

		Nxt.put(4, "Finn palour");
		Nxt.put(6, "Kevin ownes");
		Nxt.put(5, "CM Punk");
		Nxt.put(8, "Daniel Bryan");
		Nxt.put(9, "Shawn");

		System.out.println("Tree Map:" + Nxt);

//	Map<Integer, String> reverse = Nxt.descendingMap();
//
//		System.out.println(reverse);

		for (Entry<Integer, String> entry : Nxt.entrySet()) {
			Integer key = entry.getKey();
			String value = entry.getValue();

			System.out.println(key);
			System.out.println(value);
		}
	}

}