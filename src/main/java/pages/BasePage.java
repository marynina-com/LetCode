package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.util.Random;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class BasePage {

    public final String BASE_URL = "https://letcode.in/test";
    private SelenideElement buttonBlock = $(byXpath("//a[normalize-space()='Click']"));
    private SelenideElement frameBlock = $(byXpath("//a[normalize-space()='Inner HTML']"));
    private final SelenideElement basePageSelectBlock = $x("//p[normalize-space()='Select']");
    private final SelenideElement dropDown = $x("//a[normalize-space()='Drop-Down']");

    public static Random random = new Random();

    public void openBaseUrl() {
        open(BASE_URL);
    }

    public void clickOnButtonBlock() {
        buttonBlock.click();
    }

    public void clickOnFrameBlock() {
        frameBlock.click();
    }

    public BasePage checkBasePageSelectBlock() {

        basePageSelectBlock.shouldBe(Condition.visible);
        return this;
    }


    public SelectPage clickOnSelectBlock() {
        dropDown.click();
        return new SelectPage();
    }

}
