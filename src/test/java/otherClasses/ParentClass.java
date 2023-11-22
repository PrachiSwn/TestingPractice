package otherClasses;

//implements keyword to write the logic for all the methods present in the interface

public class ParentClass implements FirstInterface {

	public void circle()
	{
		System.out.println("Circle Method Displayed");
	}
	
	protected void square()
	{
		System.out.println("Square Method Displayed");
	}
	
	public void rhombus()
	{
		System.out.println("Rhombus Method Displayed");
	}
	
	public void triangle()
	{
		System.out.println("Triangle method displayed");
	}

	@Override
	public int sumOfTwoNumbers(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int productOfTwoNumbers(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
}
