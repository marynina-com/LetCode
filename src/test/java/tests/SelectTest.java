package tests;

import org.testng.annotations.Test;
import pages.BasePage;

public class SelectTest extends BaseTest {

    @Test
    public void checkSelect() throws InterruptedException {

        new BasePage()
                .checkBasePageSelectBlock()
                .clickOnSelectBlock()
                .selectFruit(random.nextInt(5));
    }
}
