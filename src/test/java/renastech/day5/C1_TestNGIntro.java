package renastech.day5;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class C1_TestNGIntro {


    @BeforeMethod// this method will run before each method
    public void setUp(){
        System.out.println("Before Method Running");
    }
    @AfterMethod // this method will also run after each method
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
