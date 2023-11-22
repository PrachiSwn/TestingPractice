package seleniumTraining_October2023;

import java.util.ArrayList;
import java.util.List;

public class ListConcepts {

	public static void main(String[] args) {
		
		//Object is the parent class of all data Types
		//Collection ---> Combination of heterogenous set of data
		
		//Collection works under dynamic memory allocation
		
		//List:
		//1. It is an interface
		//2. It allows null values
		//3. It allows Duplicate Values
		//4. It preserves the data as per the insertion order
		//5. List is an interface that is being implemented in ArrayList, LinkedList, etc....
		
		//Syntax of creating a list:
		//List<dataType> listName=new ArrayList<dataType>();
		
		List<Object> l1=new ArrayList<Object>();
		
		l1.add(false); //Adding the values to the list
		l1.add(true);
		l1.add(' ');
		l1.add(null);
		l1.add("Automation");
		l1.add(295);
		l1.add(295);
		l1.add(825.235325);
		
		System.out.println(l1);

		//Prints the number of values present in the list
		System.out.println(l1.size());
		
		//When there is no data in the list then it is empty
		//Checks if the given list is empty 
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(l1.isEmpty());
		
		//Erase the complete data from the list
		l1.clear();
		
		System.out.println(l1.isEmpty());
		
		l1.add(false); //Adding the values to the list
		l1.add(true);
		l1.add(' ');
		l1.add(null);
		l1.add("Automation");
		l1.add(295);
		l1.add(295);
		l1.add(825.235325);
		
		//Checks if the value 300 is present in the list
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(l1.contains(true));
		
		//Prints the value that is present at 5th index position
		System.out.println(l1.get(5));
		System.out.println(l1.get(7));
		
		//Throw an error because we are trying to access a index position that is greater than the size of the list
//		System.out.println(l1.get(200));
		
		//Prints the index position of 'false' value in the list
		System.out.println(l1.indexOf(false));
		
		//Prints the index position of first occurence of '295' 
		System.out.println(l1.indexOf(295));
		
		//Returns -1 if the value is not present in the list
		System.out.println(l1.indexOf(500));
		
		//Removes null value from the list
		l1.remove(null);
		
		System.out.println(l1);
		
		//Removing the value from the list based on index position
		l1.remove(0);
		
		System.out.println(l1);
		
		//Prints the index position of the last occurence of '295' value in the list
		System.out.println(l1.lastIndexOf(295));
		
		//Replacing the value in the first index position with 'Hello World'
		l1.set(1, "Hello World");
		
		System.out.println(l1);
		
//		l1.clear();
		
		List<Object> l2=new ArrayList<Object>();
		
		l2.add('4');
		l2.add('%');
		l2.add("Strings");
		l2.add(29152.5232);
		
		//Combines values present in both the lists and it will be stored in l1 
		l1.addAll(l2);
		
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println("**********************FOR LOOP*******************************");
		
		for(int i=0;i<l1.size();i=i+1)
		{
			System.out.println(l1.get(i));
		}
	}
}
