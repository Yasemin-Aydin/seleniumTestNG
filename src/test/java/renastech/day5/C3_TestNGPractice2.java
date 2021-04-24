package renastech.day5;

import org.testng.Assert;
import org.testng.annotations.*;

public class C3_TestNGPractice2 {
//    @BeforeClass // this one will only run once before everything that you have in the class
//    public void setUpClass(){
//        System.out.println("Before Class is Running");
//    }
//    @AfterClass //this one will run after everything that you have in the class also this is only once
//    public void setupAfterClass(){
//        System.out.println("After Class is Running");
//    }
//    @BeforeMethod// this method will run before each test annotation
//    public void setUp(){
//        System.out.println("Before Method Running");
//    }
//    @AfterMethod // this method will  run after each test annotation
//    public void closing(){
//        System.out.println("After Method Running");
//    }

    // helping you to run your class without main method
    //it comes from TestNG
    @Test(priority = 2,dependsOnMethods = "TC3_test")
    public void TC1_test(){
        //dependsOnMethods will be running if the depending method has passed
        System.out.println("Test 1 is running!!");
    }

    @Test(priority = 1)
    public void TC3_test(){
        System.out.println("Test 3 is running!!");
        String actualWord="Hello";
        String expectedWord="welcome";

        Assert.assertEquals(actualWord,expectedWord);

    }

    @Test(priority = 3)
    public void TC2_test(){
        System.out.println("Test 2 is running!!");
        String str="renastech54345";
        String str2="renastech";

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);
        Assert.assertTrue(str.equals(str2));
    }

    @Ignore //will ignore current test you have and it is not going to run this test
    @Test
    public void TC4_test(){
        System.out.println("Runiing test4");
    }
}
