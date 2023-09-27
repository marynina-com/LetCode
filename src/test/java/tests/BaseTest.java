package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.github.javafaker.Faker;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.Random;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class BaseTest {

    public Faker faker = new Faker();
    public static Random random = new Random();

    private SelenideElement confirmation = $(byXpath("//p[normalize-space()='Consent']"));

    BasePage basePage = new BasePage();

    InputPage inputPage = new InputPage();
    ButtonPage buttonPage = new ButtonPage();
    FramePage framePage = new FramePage();
    HomePage homePage = new HomePage();


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
