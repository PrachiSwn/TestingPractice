package seleniumTraining_October2023;

public class ExceptionalHandling {

	public static void main(String[] args) throws Exception {
		
		//Syntax of using try & catch block
		
		try
		{
			//We write the code that is prone to throwing an error
			//Block of code to be executed
		}
		
		catch (Exception e) {
			// Block of code to be executed
		}
		
		//Exception is the parent class of all kinds of exception in JAVA
		//One Try Block can have multiple catch blocks
		
		try
		{
			int a=10/0;
			System.out.println(a);
		}
		
		catch(ArithmeticException e5)
		{
//			System.out.println("Arithmetic Exception Occured, please check");
			
			//Throwing my own error message
			throw new Exception("Arithmetic Exception Occured, please check");
		}
		
		catch (Exception e) {
		
			//Prints the trace/log of the error message.
			e.printStackTrace();
		}
		
		finally //Gets executed no matter what happens between the try and the catch block
		{
			System.out.println("Finally The Code got executed");
		}
	}
}
