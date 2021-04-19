package renastech.utilities;

public class BrowserUtils {

    //create an utility method called wait
    //static method
    //return type void
    //parameter should be int second
    //goal of the method :
    //handle thread.sleep with try catch  multiple with second parameter

    public static void wait(int second){

        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
