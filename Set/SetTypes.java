package Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SetTypes {

	public void hashSet() {

		Set food = new HashSet();

		food.add("Burger");
		food.add("Pizza");
		food.add("Fried chicken");

		System.out.println("Hash Set");
		System.out.println(food);

	}

	public void linkedSet() {
		
		List alist=Arrays.asList("S","d");
		

		Set drink = new LinkedHashSet(alist);

//		drink.add("Mojito");
//		drink.add("Milk shake");
//		drink.add("Sharja");
//		drink.add("Milk Lassi");

		System.out.println(drink);
		System.out.println(" ");

	}

	public void treeSet() {

			TreeSet starter = new TreeSet<>();
			starter.add("Sweet");
			starter.add("Curd");
			starter.add("Ghee");
			 
			System.out.println("Tree set");
			System.out.println(starter);
               
			
			TreeSet<String> star=(TreeSet<String>) starter.descendingSet();
			System.out.println(star);
			
			for (String string : star) {
				System.out.println(string);
				
			}
			Iterator<String> iterator= starter.descendingIterator();

			while (iterator.hasNext()) {

			System.out.println(iterator.next());
			}

			
	}		
	}		
		