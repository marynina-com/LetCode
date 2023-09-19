package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class ButtonPage extends BasePage {

    public SelenideElement goToHomeButton = $(byId("home"));

    public void clickOnGoToHomeButton(){
        goToHomeButton.should(exist);
        goToHomeButton.click();
    }
}
// проверки should be, shouldHave должны быть здесь
