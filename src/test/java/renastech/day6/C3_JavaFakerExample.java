package renastech.day6;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class C3_JavaFakerExample {

    @Test
    public void TC1_javaFakerExample(){
        // to be able to use libraarry you need to create instance from Faker class
        Faker faker=new Faker();

        //each time you run you will have new fake results
        System.out.println(faker.name().fullName());
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.address().cityName() = " + faker.address().cityName());

        System.out.println("faker.gameOfThrones().dragon() = " + faker.gameOfThrones().dragon());
        System.out.println("faker.lordOfTheRings().character() = " + faker.lordOfTheRings().character());
        System.out.println("faker.rickAndMorty().location() = " + faker.rickAndMorty().location());


    }
}
