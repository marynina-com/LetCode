package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.back;

public class HomePage {

    public SelenideElement mainPageText = $(byXpath("//h1[@class='title is-title is-size-1-desktop is-size-3-mobile is-size-2-tablet has-text-weight-bold has-text-primary']"));

    public void backToButtonPage() {
        mainPageText.shouldHave(Condition.text("LetCode with Koushik"));
        back();
    }



}
