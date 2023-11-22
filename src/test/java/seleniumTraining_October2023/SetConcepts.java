package seleniumTraining_October2023;

import java.util.HashSet;
import java.util.Set;

public class SetConcepts {

	public static void main(String[] args) {
		
		//Sets
		//1. It is an interface that is being implemented in TreeSet, hashset, linkedset
		//2. It does not allow duplicate values
		//3. It allows null values
		//4. Stores the data in a random order
		
		//Syntax of creating a set:
		//Set<dataType> setName=new HashSet<dataType>();
		
		Set<Integer> s1=new HashSet<Integer>();
		
		s1.add(232); //Adding the values to the set
		s1.add(-35932);
		s1.add(null);
		s1.add(9236);
		s1.add(9236);
		s1.add(92124556);
		
		System.out.println(s1);
		
		System.out.println(s1.size());
		
		System.out.println(s1.isEmpty());
		
		s1.remove(9236);
		
		System.out.println(s1);
		
		s1.clear();
		
		Set<Integer> s2=new HashSet<Integer>();
		
		s2.add(212);
		s2.add(-2935);
		s2.add(92125);
		s2.add(90155);
		s2.add(null);
		
		System.out.println(s2);
		
		//Combining the values present in both the sets
		s1.addAll(s2);
		
		System.out.println(s1);
		
		/******************************************************************************************/
		
		//For Each Loop
		
		//for(int i=0;i<s1.size();i=i+1)
		for(Integer i1:s1) //From the Set of Integers, we are trying to read a integer
		{
			System.out.println(i1);
		}
		
	}
}
