package String;

public class StringBufferClass {

	public void bufferMethods() {

		StringBuffer append = new StringBuffer("I am Ironman");
		append.append("Avengers");
		System.out.println("Append or Join the Words:" + " " + append);

		
		StringBuffer insert = new StringBuffer("Ironman");
		insert.insert(2, "Tony");
		System.out.println("Insert the pos and words" + " " + insert);

		
		StringBuffer replace = new StringBuffer("I can do this all day");
		replace.replace(1, 4, "Cap");
		System.out.println("Replace the word:" + " " + replace);

		
		
		StringBuffer delete = new StringBuffer("Captain America");
		delete.delete(1, 5);
		System.out.println("Delete the words:" + " " + delete);

		
		StringBuffer reverse = new StringBuffer("Bring me Thanos");
		reverse.reverse();
		System.out.println("Reverse the Words:" + " " + reverse);

		
		StringBuffer capacity = new StringBuffer();
		capacity.append("Thor");
		System.out.println("Capacity of the word:" + " " + capacity.capacity());
		capacity.append("Bring me thanos for aasagaurd");
		System.out.println("Capacity of the word:" + " " + capacity.capacity());

		
		StringBuffer ensureCapacity = new StringBuffer();
		ensureCapacity.append("Hulk");
		ensureCapacity.append("Hulk you attack the enemies");
		ensureCapacity.ensureCapacity(50);
		System.out.println("Ensure Capacity of the Word:" + " " + ensureCapacity.capacity());

	}

}