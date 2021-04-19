package renastech.day5;

import org.testng.annotations.*;

public class C2_TestNGPractice {

    @BeforeClass // this one will only run once before everything that you have in the class
    public void setUpClass(){
        System.out.println("Before Class is Running");
    }
    @AfterClass //this one will run after everything that you have in the class also this is only once
    public void setupAfterClass(){
        System.out.println("After Class is Running");
    }
    @BeforeMethod// this method will run before each test annotation
    public void setUp(){
        System.out.println("Before Method Running");
    }
    @AfterMethod // this method will  run after each test annotation
    public void closing(){
        System.out.println("After Method Running");
    }

    // helping you to run your class without main method
    //it comes from TestNG
    @Test
    public void TC1_test(){
        System.out.println("Test 1 is running!!");
    }

    @Test
    public void TC3_test(){
        System.out.println("Test 3 is running!!");
    }

    @Test
    public void TC2_test(){
        System.out.println("Test 2 is running!!");
    }

}
