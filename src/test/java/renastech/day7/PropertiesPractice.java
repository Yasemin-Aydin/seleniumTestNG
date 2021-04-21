package renastech.day7;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesPractice {

    @Test
    public void TC1_systemProperties(){
        //java also has some ready properties file that you can get some information realated your system
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
    }

    @Test
    public void TC2_configurationProperties() throws FileNotFoundException {
        //to be able to make java understand my configuration file i need to cennect and then open the file
        Properties properties=new Properties();// allows us to read .properties file

        String pathForProperties="configuration.properties";
        // need to get path from file it can be absulate path or root path
//        /Users/sevginhekimoglu/IdeaProjects/seleniumTestNG/configuration.properties

        // we need to tell compiler to open our file
        // fileinputstream method will throw an exception (FileNotFoundException)
        // you need to handle with try catch or throws keyword
        FileInputStream fileInputStream=new FileInputStream(pathForProperties);

        try {
            properties.load(fileInputStream); // file needs to be loaded in the automation
            // we use load method that comes from properties
            //this throw an exaption  IOException
        } catch (IOException e) {
            e.printStackTrace();
        }

        //time to read file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"SmartBear_url\") = " + properties.getProperty("SmartBear_url"));
        System.out.println("properties.getProperty(\"SmartBear_username\") = " + properties.getProperty("SmartBear_username"));

    }
}
