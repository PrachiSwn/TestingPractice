package seleniumTraining_October2023;

import java.util.Scanner;

//Task is to prepare a dynamic calculator program which covers all mathematical operations
public class MethodConcepts {

	//Inside a static method, you can call other static methods, variables only
	//Inside a non static method, you can call both static and non static methods, variables only
	
	public static void main(String[] args) 
	{
		//Helps us in reading the values from the console
		Scanner s1=new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int a=s1.nextInt();
		
		System.out.println("Enter the second number:");
		int b=s1.nextInt();
		
		System.out.println(sumOfTwoNumbers(a,b));
		
		System.out.println(differenceOfTwoNumbers(20, 40.204));
		
		System.out.println(productOfTwoNumbers(20, 20));
	}
	
	//When two methods are having same name but different set of arguments, that is called as method overloading
	
	static int differenceOfTwoNumbers(int a, int b)
	{
		//return keyword is used to give an output method or give a value from the method
		return a-b;
	}
	
	static double differenceOfTwoNumbers(int a, double b)
	{
		//return keyword is used to give an output method or give a value from the method
		return a-b;
	}

	static int differenceOfTwoNumbers(int a, int b, int c)
	{
		//return keyword is used to give an output method or give a value from the method
		return a-b-c;
	}

	protected static int productOfTwoNumbers(int a, int b)
	{
		//return keyword is used to give an output method or give a value from the method
		return a*b;
	}
	
	private static int sumOfTwoNumbers(int a, int b)
	{
		//return keyword is used to give an output method or give a value from the method
		return a+b;
	}
	
	//Syntax of declaring a method: 
	//accessModifier returnType methodName(arguments to be passed if any)
	
	//accessModifier ---> Defines the scope/visibility of the method
	//1. public ---> Method is accessible anywhere within the project
	//2. private ---> Method is accessible anywhere within the class
	//3. protected ---> Method is accessible anywhere within the package, also can be accessible outside the package via inheritance
	//4. default ---> Method is accessible anywhere within the package
	
	//returnType ---> Output that you are expecting from the method
	
	//It can be integer, string, character, boolean etc... along with void
	
	//void ---> it simply executes the lines of code present inside the method and does not return anything
	
	//methodName ---> You can give any name of your choice which is understandable to the end user
	
	//Passing the arguments to the method is an optional thing
	
	
	
	
}
