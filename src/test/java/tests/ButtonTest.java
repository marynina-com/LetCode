package tests;

import org.testng.annotations.Test;

public class ButtonTest extends BaseTest {

    @Test
    public void buttonPositiveTest() {
        basePage.clickOnButtonBlock();
        buttonPage.clickOnGoToHomeButton();
    }
}
