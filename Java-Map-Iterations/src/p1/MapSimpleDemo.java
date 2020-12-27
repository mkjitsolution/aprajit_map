package p1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapSimpleDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		
		map.put("one", 1);
		map.put("two", 21);
		map.put("three", 331);
		map.put("Ten", 423);
		
		// ----- way to iterate ----
		
		//---1st approach using Iterator over key
		// --- through key we can get the data like
		int x = map.get("one");
		System.out.println(" it wil print 1 :- "+x);
		
		Iterator<String> itr = map.keySet().iterator(); // remember iterator over key , which is type of String in this case
		
		while(itr.hasNext())
		{
			String keyValue = itr.next(); // no need to typecast as iterator itself a type of String line number 25
			
			int data = map.get(keyValue); // same as line no 22
			System.out.println(data);
		}
		
		
		// ------- 2nd apprach ----
		// don't get confused with Entry its a Static nested interface inside Map interface
		// https://docs.oracle.com/javase/8/docs/api/java/util/Map.html
		for(Map.Entry<String, Integer> entry:map.entrySet()) 
		{
			String key = entry.getKey();
			int value = entry.getValue();
		}
	
		
	}
}
