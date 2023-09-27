package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class InputPage extends BasePage {
        private static final SelenideElement fullNameField= $x("//input[@id='fullName']");
        private static final SelenideElement boardTabField= $x("");
        private static final SelenideElement textBoxField= $x("");
        private static final SelenideElement textField= $x("");
        private static final SelenideElement editField= $x("");
        private static final SelenideElement textReadonlyField= $x("");

        public void enterName(String name){
                $(fullNameField).click();
                $(fullNameField).val(name);

        }

        public void AppendAText(){

        }

}
