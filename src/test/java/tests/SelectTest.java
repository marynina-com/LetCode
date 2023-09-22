package tests;

import org.testng.annotations.Test;
import pages.BasePage;

public class SelectTest extends BaseTest {

    @Test
    public void checkSelectFruit() {

        new BasePage()
                .checkBasePageSelectBlock()
                .clickOnSelectBlock()
                .selectFruit(random.nextInt(5));
    }
    @Test
    public void checkSelectSuperhero() {

        new BasePage()
                .checkBasePageSelectBlock()
                .clickOnSelectBlock()
                .selectSuperhero();
    }

}
