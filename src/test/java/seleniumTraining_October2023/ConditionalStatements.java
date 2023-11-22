package seleniumTraining_October2023;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		//Conditional Statements : if else statements
		
		//Syntax of a if: 
		//if(condition to be satisfied)
//		{
//			//Block of code to be executed	
//		}
		
		int a=100;
		
		if(a>10)
			System.out.println(a+" is greater than 10");
		
		// % ---> Remainder of a number
		// == means value present on the right hand side is same as the value present on the left hand side
		
		//100 - 5*5+204
		//100-25+204
		//304-25
		//279
		
		int b=100-20/4*5+204;
		
		System.out.println(b);
		if(b%2==0)
			System.out.println(b+" is divisible by 2");
		else
			System.out.println(b+" is not divisible by 2");

		// 250 - 200 * 4 *20+2058
		//250-16000+2058
		//2308-16000
		//-13692
		b=250-200*24/6*20+2058;
		
		System.out.println(b);
		if(b%3==0)
			System.out.println(b+" is divisible by 3");
		else
			System.out.println(b+" is not divisible by 3");

		// 210 -8*20+300/20-200%20
		//210-8*20+15-0
		//210-160+15
		//50+15
		//65
		b=210-8*20+300/20-200%20;
		
		System.out.println(b);
		if(b%5==0)
			System.out.println(b+" is divisible by 5");
		
		else if(b%2==0)
			System.out.println(b+" is divisible by 2");
		
		else
			System.out.println(b+" is divisible by 2 nor 5");
			
		
		//Between a if and a else you can have multiple else if blocks 
		
	}
}
