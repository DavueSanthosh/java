package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapMethod {
	
	
	 Map<String,String> aboard=new HashMap<String,String>(); 

  public void putMethod() {
 
		aboard.put("Dubai", "Sky Diving");
		aboard.put("Maldives", "Deep sea diving");
		aboard.put("Abu dubai", "Desert driving");
		
		Map<String,String> place2=new HashMap<String,String>(); 
		
		place2.put("India", "Manali");
		place2.put("India", "Kerala");
		
		place2.putAll(aboard);
		System.out.println(place2);
	}
	
	public void size() {
	
		Map<Integer,String> india=new HashMap<Integer,String>(); 
		
		india.put(1, "Ladakh");
		india.put(2, null);
		india.put(null, null);
		india.put(null, null);
		
		System.out.println(india.size());
		System.out.println(india);
	}
	
	public void contains() {
		
		Map<Integer,String> swiss=new HashMap<Integer,String>();
		
        swiss.put(1, "Interlaken");
        swiss.put(2, "Matterhorn");
        swiss.put(3, "Geneva");
        swiss.put(4, "Hotel moritz");

        boolean contains = swiss.containsKey(2);
        System.out.println(contains);
        
        System.out.println(swiss.containsValue("Geneva"));
		
	}
	public void getValueAndKeys() {
		
	Map<Integer,String> maldives=new HashMap<Integer,String>(); 
		
		maldives.put(1, "Banana Reef");
		maldives.put(2, "Coca beach");
		maldives.put(4, "Baros Island");
		maldives.put(5, "Atoll");
		
		Set<Integer> key=maldives.keySet();
		System.out.println(key);
		
		Collection<String> values=maldives.values();
		System.out.println(values);
		
		Set<Entry<Integer,String>> entryset=maldives.entrySet();
		System.out.println(entryset);
	
	}
	
}
	
	