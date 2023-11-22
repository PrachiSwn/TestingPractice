package seleniumBasics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderConcepts {

    //DataProvider ---> Provides the test data for the test cases

    @DataProvider(name = "testData")
    public Object[][] getData()
    {
        Object[][] o1=new Object[2][3];

        o1[0][0]="Name";
        o1[0][1]="Email";
        o1[0][2]="PhoneNumber";
        o1[1][0]="njsgd";
        o1[1][1]="sbc@gmail.com";
        o1[1][2]="8359346347";

        return o1;
    }

    //I have passed two arguments because I have 2 columns in the data provider
    //Below test case will run for two times because total number of rows present is 2

    @Test(dataProvider = "testData")
    public void prepareTestData(String name, String email,String phoneNumber)
    {
        System.out.println(name+"-----"+email+"-----"+phoneNumber);
    }
}
