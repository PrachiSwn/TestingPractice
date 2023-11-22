package seleniumBasics;

import org.testng.annotations.*;

public class TESTNGAnnotations {

    //There are total 9 annotations in TESTNG:
    //1. BeforeSuite  ---> Gets Triggered before the start of any test suite execution
            //Ex: Initialization of framework related objects, killing of existing browsers
    //2. AfterSuite ---> Gets triggered after the completion of test suite execution
           //Ex: Generation of Reports, Excel Reports, PDF etc...
    //3. BeforeTest ---> Gets executed before the start of the test cases in the XML file

    //4. AfterTest ---> Gets executed after the completion of test cases in the XML file

    //5. BeforeClass  ---> Gets executed before the start of the test cases in the given class
         //Ex: Creation of objects specific to that class
    //6. AfterClass ---> Gets executed after the completion of the test cases in the given class
         //Ex: Killing of the objects created for the specific class, Generation of Reports for the test cases executed in the given class
    //7. BeforeMethod ---> Gets executed before every test case/ test method
    //8. AfterMethod ---> Gets executed after every test case/ test method

    //9. Test  ---> This is where we write the logic for the test case

    @BeforeSuite
    public void beforeTestSuite() {
        System.out.println("Before the Test Suite Execution");
    }

    @AfterSuite
    public void afterTestSuite()
    {
        System.out.println("After the Test Suite Execution");
    }

    @BeforeTest
    public void beforeTestCases()
    {
        System.out.println("Before the Test Cases Execution");
    }

    @AfterTest
    public void afterTestCases()
    {
        System.out.println("After the Test Cases Execution");
    }

    @BeforeClass
    public void beforeClassExecution()
    {
        System.out.println("Before the test cases execution in the given class");
    }

    @AfterClass
    public void afterClassExecution()
    {
        System.out.println("After the test cases execution in the given class");
    }

    @BeforeMethod
    public void beforeTestMethod() {
        System.out.println("Before the execution of test method");
    }

    @AfterMethod
    public void afterTestMethod()
    {
        System.out.println("After the execution of test method");
    }

    @Test
    public void firstTestCase()
    {
        System.out.println("First Test Case Execution");
    }

    @Test
    public void secondTestCase()
    {
        System.out.println("Second Test Case Execution");
    }

    @Test
    public void thirdTestCase()
    {
        System.out.println("Third Test Case Execution");
    }

}
