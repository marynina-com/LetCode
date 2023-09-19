package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;
import pages.ButtonPage;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BaseTest {

    private SelenideElement confirmation = $(byXpath("//p[normalize-space()='Consent']"));

    BasePage basePage = new BasePage();
    ButtonPage buttonPage = new ButtonPage();

    @BeforeMethod
    public void init() {
//      System.setProperty("chromeoptions.args", "--remote-allow-origins=*");
        Configuration.browser = "firefox";
        basePage.openBaseUrl();
        WebDriverRunner.getWebDriver().manage().window().maximize();
        confirmation.click();

//      Configuration.holdBrowserOpen=true;
    }
}
