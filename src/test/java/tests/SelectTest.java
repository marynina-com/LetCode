package tests;

import org.testng.annotations.Test;
import pages.BasePage;

import static pages.SelectPage.selectSize;

public class SelectTest extends BaseTest {

    @Test
    public void checkSelectFruitNew() {

        new BasePage()
                .checkBasePageSelectBlock()
                .clickOnSelectBlock()
                .selectFruitNew(random.nextInt(5))
                .checkSelectedFruit();
    }

    @Test
    public void checkSelectSuperheroNew() {

        new BasePage()
                .checkBasePageSelectBlock()
                .clickOnSelectBlock()
                .selectSuperheroNew()
                .checkSelectedSuperhero();
    }

    //    Task: select the last programming language and print all the options
    @Test
    public void checkLastProgrammingLanguage() {

        new BasePage()
                .checkBasePageSelectBlock()
                .clickOnSelectBlock()
                .selectLastProgrammingLanguage()
                .checkLastProgrammingLanguage()
                .printAllProgrammingLanguageOptions();
    }

    //    Task: select India using value & print the selected value
    @Test
    public void checkCountry() {

        new BasePage()
                .checkBasePageSelectBlock()
                .clickOnSelectBlock()
                .selectCountry("India")
                .checkSelectedCountry("India")
                .printSelectedCountry();
    }
}
