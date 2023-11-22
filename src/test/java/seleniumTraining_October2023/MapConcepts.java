package seleniumTraining_October2023;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapConcepts {

	public static void main(String[] args) {
		
		//Map ---> Data will be stored in the form of key value pair
		
		//Each key value pair is known as entry
		
		//Map:
		//1. It allows one null key but multiple null values
		//2. Does not allow duplicate keys but allows duplicate values
		//3. Data will be stored in a random order
		
		//Syntax of creating a map:
		//Map<dataType,dataType> mapname=new HashMap<dataType,dataType>();
		
		Map<String, Integer> m1=new HashMap<String, Integer>();
		
		m1.put("First", 1); //Adding the values to the map
		m1.put("Second", 2);
		m1.put("Third", 3);
		m1.put("Fourth", 4);
		m1.put("Fifth", 5);
		m1.put("Third", 30);
		
		System.out.println(m1);
		
		//Prints the number of entries present in the map
		System.out.println(m1.size());
		
		//Checks whether the given map is empty or not
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(m1.isEmpty());
		
		//Prints the value that is present against the key 'Fourth'
		System.out.println(m1.get("Fourth"));
		
		//Prints null if the key is not present in the hash map
		System.out.println(m1.get("Tenth"));
		
		//Prints zero if the key is not present in the hash map
		System.out.println(m1.getOrDefault("Tenth", 0));

		//Adds the key to the map only if the key is not present
		m1.putIfAbsent("Tenth", 10);
		
		System.out.println(m1);
		
		m1.putIfAbsent("Second", 20);
		
		System.out.println(m1);
		
		//Prints the list of keys present in the map
		System.out.println(m1.keySet());
		
		//Prints the list of values present in the map
		System.out.println(m1.values());
	
		//Checks if "Tenth" is present in the list of keys that is present in the map
		//Returns true if the above condition is satisfied else returns false
		System.out.println(m1.containsKey("Tenth"));
		System.out.println(m1.containsKey("Eight"));
		
		
		System.out.println(m1.containsValue(100));
		System.out.println(m1.containsValue(30));
		
		//Replacing the value for the key 'First' present in the map
		m1.replace("First", 10);
		
		System.out.println(m1);
		
		//Removes the entry from the map based on the key
		m1.remove("First");
		
		System.out.println(m1);
		
		/*******************************************************************************************/
		
		//Converting the complete map into a set of entries
		Set<Map.Entry<String,Integer>> s1=m1.entrySet();
		
		for(Map.Entry<String, Integer> s:s1)
		{
			System.out.println(s.getKey()+"----"+s.getValue());
		}
	}
}
