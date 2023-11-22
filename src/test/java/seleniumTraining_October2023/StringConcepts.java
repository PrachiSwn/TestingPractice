package seleniumTraining_October2023;

public class StringConcepts {

	public static void main(String [] args)
	{
		//String is nothing but a combination of characters
		
		String a1="This is my first String";
		
		//Prints the number of characters present in the string
		System.out.println(a1.length());
		
		//Checks if the given string is empty or not
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(a1.isEmpty());
		System.out.println(a1.isBlank());
		
		//Converts the complete string to capital letters
		System.out.println(a1.toUpperCase());
		
		//Converts the complete string to small letters
		System.out.println(a1.toLowerCase());
		
		//Checks if the given string starts with 'This' or not 
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(a1.startsWith("This"));
		System.out.println(a1.startsWith("this"));
		
		a1="This is my first String";
		
		//checks if the given string is ending with 'g' or not
		//Returns true if the above condition is satisfied else returns false
		System.out.println(a1.endsWith("g"));
		System.out.println(a1.endsWith("nG"));

		// \n represents a new line
		a1="This is my first String \n";
		//Repeats the same string for four times
		System.out.println(a1.repeat(4));
		
		a1="This is my first String";
		
		//Prints the character that is present at 4th index position
		System.out.println(a1.charAt(4));
		System.out.println(a1.charAt(18));
		
		//Below throws String Index Out Of Bounds Exception
		//It is because you are trying to access a character that is greater than the length of the string
//		System.out.println(a1.charAt(100));
		
		//Prints the string starting from 5th index position till the end of the string
		System.out.println(a1.substring(5));
		System.out.println(a1.substring(10));
		
		//Below throws String Index Out Of Bounds Exception
		//It is because you are trying to access a character that is greater than the length of the string
//		System.out.println(a1.substring(200));
		
		a1="This is my first String";
		//Prints the string starting from 10th index position till 20th Index position
		//Inclusive of starting index position and exclusive of ending index position
		System.out.println(a1.substring(10, 20));
		System.out.println(a1.substring(0,7));
		
		//Throws String Index Out Of Bounds Exception, because the starting index positioin is greater than the end index position
//		System.out.println(a1.substring(10,8));
		
		//Checks if the word 'first' is present in the string or not
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(a1.contains("first"));
		System.out.println(a1.contains("ft"));
		System.out.println(a1.contains("STRING"));
		
		String b1="this is my first string";
		a1="This is my first String";
		
		//Checking if both the strings are equal or not
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(a1.equals(b1));

		//Checking if both the strings are equal or not, by ignoring the case sensitivity
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(a1.equalsIgnoreCase(b1));
		
		//Replacing the word 'first' with the word 'second'
		System.out.println(a1.replace("first","second"));
		
		//below line will not throw any error, because if the word to be replaced is not 
		//present in the string, then it will display the original string
		System.out.println(a1.replace("firstnew","second"));
		
		a1="This is my first String";
		
		//Prints the index position of the value '6' in the given string
		//If it does not exist it will return -1
		System.out.println(a1.indexOf(6));
		
		//Prints the index position of the first occurence of the letter 'i'
		System.out.println(a1.indexOf('i'));
		System.out.println(a1.indexOf('g'));
		
		System.out.println(a1.indexOf('z'));
		
		//Prints the index position of the last occurence of the letter 'i'
		System.out.println(a1.lastIndexOf('i'));
		System.out.println(a1.lastIndexOf('t'));
		
		//Combining both the strings
		System.out.println(a1.concat(" Yes It Is!!!!!"));

		String c1="       New String in making          ";
		
		//Removes the white spaces that is present at the start and at the end of the string
		System.out.println(c1.trim());
		System.out.println(c1.strip());
		
		//Removes the white spaces that is present at the start of the string
		System.out.println(c1.stripLeading());
		
		//Removes the white spaces that is present at the end of the string
		System.out.println(c1.stripTrailing());

		/*******************************************************************************************************************************/
		
		//Wrapper Classes : Converting the String into an integer, double, float, boolean
		
		String d1="52015";
		
		//Convert this String into an integer
		int i1=Integer.parseInt(d1);
		System.out.println(i1);
		
		d1="92.4255";
		
		//Converting this string to a double value
		double d2=Double.parseDouble(d1);
		System.out.println(d2);
		
		d1="236237374";
		
		//Converting the String to a long value
		long l3=Long.parseLong(d1);
		System.out.println(l3);
		
		d1="true";
		
		//Converting the String to a boolean value
		boolean b4=Boolean.parseBoolean(d1);
		System.out.println(b4);
		
		int a2=29532;
		
		//Converting the integer to a string
		System.out.println(String.valueOf(a2));
		
		double d3=215.53262;
		
		//Converting the double to a string
		System.out.println(String.valueOf(d3));
	}
}
