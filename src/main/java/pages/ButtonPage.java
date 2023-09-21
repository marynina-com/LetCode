package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ButtonPage extends BasePage {

    public SelenideElement goToHomeButton = $(byId("home"));
    public SelenideElement h1Text = $(byXpath("//h1[@class='title is-title is-size-1-desktop is-size-3-mobile is-size-2-tablet has-text-weight-bold has-text-primary']"));

    public void clickOnGoToHomeButton() {
        goToHomeButton.should(exist);
        goToHomeButton.click();
    }

    public void checkH1Text() {
        h1Text.shouldHave(Condition.text("Button"));
    }
}
// проверки should be, shouldHave должны быть здесь
