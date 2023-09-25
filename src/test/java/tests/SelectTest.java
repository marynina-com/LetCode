package tests;

import org.testng.annotations.Test;
import pages.BasePage;

import static pages.SelectPage.selectSize;

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

    @Test
    public void checkLastProgrammingLanguage() {

        new BasePage()
                .checkBasePageSelectBlock()
                .clickOnSelectBlock()
                .selectLastProgrammingLanguage()
                .printAllProgrammingLanguageOptions();
    }

    @Test
    public void checkCountry() {

        new BasePage()
                .checkBasePageSelectBlock()
                .clickOnSelectBlock()
                .selectCountry("India");
    }
}
