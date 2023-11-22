package seleniumBasics;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGBasics {

    //In a single JAVA File, we can have multiple test cases

    //Whenever a method is associated with @Test annotation that is called as Test Method

    //By Default, the test cases will be executed in alphabetical order of test methods
    //priority ---> Helps us in changing the order of the execution
    //priority ranges from -n to n

    //invocationCount ---> Determines how many times we have to run the test case
    //suiteName ---> We will be mentioning under which suite the test case comes under

    //enabled=false ---> we are skipping/avoiding the execution of that particular test case
    //By Default, it will be enabled=true

    //dependsOnMethods ---> It indicates that the execution of the current test case is dependent on the result of the previous test case
    //expectedExceptions ---> Ignores the error message and continues the execution of the test cases

    //When the dependsOnMethods is checking for the method that does not exist, then it will block the complete execution of the suite

    //ignoreMissingDependencies = true ---> If the test case is dependent on a particular test method which does not exist,then it will ignore that issue and continue the execution
    //By Default, ignoreMissingDependencies = false

    @Test(description = "First Test Case",priority = 4,invocationCount = 4,
            suiteName = "Smoke",dependsOnMethods = "jbdshg",ignoreMissingDependencies = true,groups = "Smoke")
    public void firstTestCase()
    {
        System.out.println("First Test Case");
    }

    @Test(description = "Second Test Case",priority = 2,suiteName = "Regression",enabled = false,groups = "Regression")
    public void secondTestCase()
    {
        System.out.println("Second Test Case");
    }

    @Parameters({"A","B"})
    @Test(description = "Third Test Case",priority = 1,suiteName = "Sanity",expectedExceptions = Exception.class,groups = {"Sanity","Smoke"})
    public void thirdTestCase(String a,String b) throws Exception
    {
        System.out.println("Third Test Case: "+a+b);
        throw new Exception("");
    }

    @Test(description = "Fourth Test Case",priority = 3,suiteName = "Regression",dependsOnMethods = "thirdTestCase",groups = "Regression")
    public void fourthTestCase()
    {
        System.out.println("First Test Case");
    }
}
