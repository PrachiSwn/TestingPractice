package seleniumTraining_October2023;

//In a single file, you can have multiple classes, but only one public class should be present in one file.
//Whenever we are using public class, the class name and the file name should be the same.

//By default it will take null, if we do not assign any value to the string
//By default it will take 0, if we do not assign any value to the integer,long,short,byte
//By default it will take 0.0, if we do not assign any value to the double
//By default it will take false, if we do not assign any value to the boolean
//By default it will take ' ', if we do not assign any value to the character

//Whenever we are creating an object, a constructor is being triggered/called implicitly
//Constructor is also a method which gets executed on the creation of object.

//A Class can have only one default constructor
//A Class can have more than one parameterized constructor

//If a class has a parameterized constructor and no default constructor, then we need to pass the arguments at all the times during object creation
//Static methods are always binded to the class
//Non Static methods are always binded to the heap memory

class Names
{
	String firstName;
	String lastName;
	String middleName;

	//Syntax of using default constructor:
	//public ClassName()
//	{
		//Block Of Code to be executed
//	}
	
	public Names()
	{
		System.out.println("Default Constructor Called");
		firstName="First Name";
		lastName="Last Name";
		middleName="Middle Name";
	}
	
	
	//Syntax of using parameterized constructor
//	public ClassName(pass the arguments)
//	{
//		Block of code to be executed	
//	}
	
	public Names(String firstName, String lastName, String middleName)
	{
		//this is the keyword used to get the current value of a variable, method, object etc..
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.middleName=middleName;
	}
	
	public Names(String fName, String lName)
	{
		firstName=fName;
		lastName=lName;
//		middleName=mName;
	}
	
	public void displayName()
	{
		System.out.println(firstName+"-"+middleName+"-"+lastName);
	}
}

class Students
{
	public static void displayStudentsList()
	{
		System.out.println("Student Details");
	}
}

class PlayerDetails
{
	
}

public class ConstructorConcepts {

	public static void main(String[] args) {
		
		//In Order to call a method from another class, we need to create the objects
		//Objects serves as a reference of that particular class.
		
		//Syntax of creating an object:
		//ClassName objName=new ClassName();
		
		//objName can be anything of your choice, but we need to follow the rules used to declare the variables
		
		Names n1=new Names();
		
		//Syntax of calling a method from another class using the object reference:
		//objName.methodName();
		
		n1.displayName();
		
		//In order to trigger a parameterized constructor, you need to pass the values during the object creation
		Names n2=new Names("Lavisha","Prachi","Prasanthi");
		
		n2.displayName();
		
		Names n3=new Names("Basvaraj","Rahul");
		n3.displayName();
		
		//Syntax for calling static methods from another class:
		//ClassName.methodName();
		
		Students.displayStudentsList();
	}
}

//public class ConstructorConceptsOne {
//
//}
