package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BasePage {

    public final String BASE_URL = "https://letcode.in/test";
    private SelenideElement buttonBlock = $(byXpath("//a[normalize-space()='Click']"));

    public void openBaseUrl(){
        open(BASE_URL);
    }

    public void clickOnButtonBlock(){
        buttonBlock.click();
    }
}
