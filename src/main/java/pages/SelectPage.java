package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$x;

public class SelectPage {
    private static final SelenideElement fruit = $x("//select[@id='fruits']");

    public SelectPage selectFruit(int youValue) {
        Select select = new Select(fruit);
        select.selectByValue(String.valueOf(youValue));
        SelenideElement selectedFruit = $x("//p[normalize-space()='You have selected " + select.getFirstSelectedOption().getText() + "']");
        selectedFruit.shouldBe(Condition.visible);
        return this;
    }
}
