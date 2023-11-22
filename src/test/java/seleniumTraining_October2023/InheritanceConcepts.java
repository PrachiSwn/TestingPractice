package seleniumTraining_October2023;

import otherClasses.FirstInterface;
import otherClasses.ParentClass;

//extends is the keyword used to inherit the methods from the parent class

class ChildClass extends ParentClass
{
	public void display()
	{
		//Protected Methods can be called here only
		square();
	}
	
	//Method Overriding:
	
	//When both the methods are having same name and same set of arguments
	//in both parent and child class
	//Then the logic that is present in the child class will be executed and overrrides the logic present in the parent class
	public void circle()
	{
		//super keyword is used to call the methods or variables that is present in the parent class
		super.circle();
		
		System.out.println("Circle Method from Child Class");
	}

}

public class InheritanceConcepts {

	public static void main(String[] args) {
		
		ChildClass c1=new ChildClass();
		
		c1.circle();
		
		c1.display();
		
//		c1.square();
	}
}
