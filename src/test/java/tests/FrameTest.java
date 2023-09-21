package tests;

import org.testng.annotations.Test;

public class FrameTest extends BaseTest {

    @Test
    public void checkAllFieldsWithPositiveCred() {
        basePage.clickOnFrameBlock();
        framePage.fieldAllFields("Jane", "Mar", "jane@gmail.com", "Marynina"); //"Marynina", "jane@gmail.com"
    }
}
