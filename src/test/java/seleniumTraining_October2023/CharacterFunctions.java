package seleniumTraining_October2023;

public class CharacterFunctions {

	//Shortcut for typing: public static void main
	//Type main followed by ctrl+space then press the enter key
	
	public static void main(String[] args) {
		
		char c1='2';
		
		//Checks if the given character is a number or not
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(Character.isDigit(c1));
		
		//Checks if the given character is a alphabet or not
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(Character.isAlphabetic(c1));
		
		c1=' ';
		
		//Checks if the given character is a white space or not
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(Character.isWhitespace(c1));
		
		c1='g';

		//Converts the given character to a capital letter
		System.out.println(Character.toUpperCase(c1));
		
		c1='O';
		
		//Converts the given character to a small letter
		System.out.println(Character.toLowerCase(c1));
		
		c1='9';
		
		//Converting the character to a integer value
		System.out.println(Character.getNumericValue(c1));
		
		c1='P';
		
		//Converting the Character to a String Value
		System.out.println(Character.toString(c1));
	}
	
}
