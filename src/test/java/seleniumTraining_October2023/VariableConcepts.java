package seleniumTraining_October2023;

public class VariableConcepts {

	public static void main(String[] args)
	{
		//Variable is nothing but a temporary storage of values
		
		//Scope of the variables remains during the execution life cycle
		
		//Different Data Types:
		//1. Primitive Data Type: int, char, boolean, long , float, double, short, byte
		//2. Non Primitive Data Type: Strings, Arrays, List, Set,....................................................
		
		//Rules to be followed while declaring a variable:
		//1. Variable name should start with a small letter
		//2. Variable name should not start with a number or a special character
		//3. Variable name cannot have any kind of spaces in between, instead you can use underscore
		//4. Java Keywords cannot be used as variable names.
		
		//Syntax of declaring a variable: dataType variableName;
		
		int a1; //Accepts a range of values from -2^31 to 2^31-1
		char c2; //Accepts a single value like ' ' , 'a', 'T', '4', '@'
		double d3; //Accepts upto 16 significant digits(accepts 16 digits after the decimal point)
		float f4; //Accepts upto 5 significant digits(accepts 5 digits after the decimal point)
		long l5; //Accepts a range of values from -2^63 to 2^63-1
		short s6; //Accepts a range of values from -32768 to 32767
		byte b7; // Accepts a range of values from -128 to 127
		boolean b8; //Accepts true or false
		
		//Syntax of initialzing the variable: variableName=value;
		
		a1=-400;
		c2='r';
		d3=23526.46346;
		f4=25.64f ; //Mention the letter f at the last when we are using float values
		l5=21252362;
		s6=2326;
		b7=-120;
		b8=true;
		
		System.out.println(a1);
		System.out.println(c2);
		System.out.println(d3);
		System.out.println(f4);
		System.out.println(l5);
		System.out.println(s6);
		System.out.println(b7);
		System.out.println(b8);
		
		//Printing all the variable names in one single line
		System.out.println(a1+" "+c2+" "+d3+" "+" "+f4+" "+l5+" "+s6+" "+b7+" "+b8);
		
	}
}
