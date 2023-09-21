package tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class FrameTest extends BaseTest {


    @Test
    public void checkAllFieldsWithPositiveCred() {

        String fName = faker.name().firstName();
        String lName = faker.name().lastName();
        System.out.println(fName + lName);

        basePage.clickOnFrameBlock();
        framePage.fieldAllFields(fName, lName, "jane@gmail.com", "Marynina"); //"Marynina", "jane@gmail.com"
    }
}
