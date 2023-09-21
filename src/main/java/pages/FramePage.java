package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class FramePage {

    private SelenideElement mainFrame = $x("//iframe[@src='frameUI']");
    private SelenideElement firstNameFrame = $(By.name("fname"));
    private SelenideElement lastNameFrame = $(By.name("lname"));
    private SelenideElement titleHasText = $x("//p[@class='title has-text-info']");
    private SelenideElement email = $(By.name("email"));

    public void fieldAllFields(String fName, String lName, String fEmail, String correctLName) {

        switchTo().frame(mainFrame);

        firstNameFrame.setValue(fName);
        lastNameFrame.setValue(lName);
        titleHasText.shouldHave(Condition.exactText("You have entered " + fName + " " + lName));

        switchTo().frame(1);

        email.setValue(fEmail);

        switchTo().parentFrame();

        lastNameFrame.setValue(correctLName);
        titleHasText.shouldHave(Condition.exactText("You have entered " + fName + " " + correctLName));
    }
}
