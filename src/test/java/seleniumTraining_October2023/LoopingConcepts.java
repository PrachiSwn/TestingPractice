package seleniumTraining_October2023;

public class LoopingConcepts {

	public static void main(String[] args) {
		
		//Loop ---> Repeating the same action again and again
		
		//Different Types of Loops in Java:
		//while, do-while, for
		
		/**************************************************************************************************/
		//while loop ---> Loop Keeps on running until the condition is satisfied
		
		//Syntax of while loop:
		//while(condition to be satisfied)
//		{
//			Block of code to be executed	
//		}
		
		int a=200;
		while(a%5==0)
		{
			System.out.println(a);
			break; //To Come out of the loop immediately
		}
		
		a=40;
		
		while(a<80)
		{
			System.out.println(a);
			a=a+1;
		}
		
		a=200;
		
		while(a>=200)
		{
			System.out.println(a*5);
			a=a*5/5;
			
			break;
		}
		
		a=78-20/5*10-200;
		
		System.out.println(a);
		while(a/2>1 && a%3==0)
		{
			System.out.println(a);
			a=a*2;
		}
		
		/****************************************************************************************************/
		
		//do-while loop: Loop gets executed atleast once irrespective of whether the condition is satisfied or not
		
		//Syntax of do-while loop:
//		do
//		{
//			//block of code to be executed
//		}
//		while(condition to be satisfied);
		
		System.out.println("********************************DO WHILE LOOP*******************************************");
		
		String b="This";
		
		do
		{
			System.out.println(b.length());
		}
		while(b.length()>8);
		
		b="NEw World";
		int i=0;
		do
		{
			System.out.print(b.charAt(i));
			i=i+1;
		}
		while(i<b.length());
		
		do
		{
			System.out.println(b.charAt(b.length()/2));
			break;
		}
		while(b.length()/2 <b.length());
	
		/****************************************************************************************************/
		
		System.out.println("********************************FOR LOOP***********************************************************");
		
		//Loop keeps on running until the condition is satisfied
		
		//Syntax of for loop:
		//for(initial value;condition to be satisfied; iteration value)
//		{
//			//Block of Code to be executed	
//		}
		
		for(int j=0;j<5;j=j+1)
		{
			System.out.println(j);
		}
		
		for(int j=0;j<25;j=j+6)
		{
			System.out.println(j);
		}
		
		for(int j=1;j<25;j=j*(1+2))
		{
			System.out.println(j);
		}
		
		String b1="New Word in process";
		
		for(i=b1.length()-1;i>=0;i=i-1)
		{
			if(i%3==0)
			System.out.print(b1.charAt(i));
		}
		
		int b2=2502;
		
		for(i=20;i<b2;i=i*5)
		{
			System.out.println(i);
		}
		
		
	}
}
