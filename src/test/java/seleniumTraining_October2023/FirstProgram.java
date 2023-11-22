package seleniumTraining_October2023;

import java.util.Scanner;

//Class is nothing but an entity or a blueprint of objects, classes, methods, variables

public class FirstProgram {

	//Whatever the logic you want to be executed should be present within the main method
	
	public static void main(String[] args)
	{
		//Print "Hello World" Onto the Console
		//println() ---> prints the data onto the console and moves the cursor to the next line
		System.out.println("Hello World");
		
		System.out.println("This is a new line");
		
		//print() ---> Simply prints the data
		System.out.print("Yes");
		
		System.out.print(200+300);
		
		System.out.println(true);
		
		//Shortcut for typing System.out.println()
		//type sysout followed by ctrl+space then press the ENTER Key
		
		System.out.println(400-500+200-300);
		
		//Whenever we are performing any arithmetic operations , we will 
		//follow BODMAS Rule
		
		//Bracket of division multiplication Addition Subraction
		
		System.out.println(300-200*20/4+500);
		
		//42/4*2 - 301 *2
		//10*2-301*2
		//20-602
		//-582
		System.out.println(42/4*2-(35+500-234)*2);
		
		//400 - 1 + 100 - 20 * 2
		//400 - 1 + 100 - 40
		//399+60
		//459
		System.out.println(400-200/200+100-20*2);
		
		System.out.println("Enter the Number to be printed: ");
		//Helps us in reading the values from the console
		Scanner s=new Scanner(System.in);
		
		System.out.println(s.nextInt());
		
	}
}
