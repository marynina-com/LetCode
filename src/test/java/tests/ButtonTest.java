package tests;

import org.testng.annotations.Test;

public class ButtonTest extends BaseTest {

    @Test
    public void checkGoToHomeButton() {
        basePage.clickOnButtonBlock();
        buttonPage.clickOnGoToHomeButton();
        homePage.backToButtonPage();
        buttonPage.checkH1Text();
    }


}
