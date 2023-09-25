package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$x;



public class SelectPage extends BasePage{
    private static final SelenideElement fruit = $x("//select[@id='fruits']");
    private static final SelenideElement superhero = $x("//select[@id='superheros']");

    private static final SelenideElement programmingLanguage = $x("//select[@id='lang']");

    private static final SelenideElement country = $x("//select[@id='country']");

    public static int selectSize;

    public SelectPage selectFruit(int youValue) {
        Select select = new Select(fruit);
        select.selectByValue(String.valueOf(youValue));
        SelenideElement selectedFruit = $x("//p[normalize-space()='You have selected " + select.getFirstSelectedOption().getText() + "']");
        selectedFruit.shouldBe(Condition.visible);
        return this;
    }

    public SelectPage selectSuperhero() {
        Select select = new Select(superhero);
        selectSize = select.getOptions().size();
        System.out.println(select.getOptions().size());
        int selectedHero = random.nextInt(selectSize);
        System.out.println(selectedHero);
        select.selectByIndex(selectedHero);
        SelenideElement selectedSuperhero = $x("//p[normalize-space()='You have selected " + select.getFirstSelectedOption().getText() + "']");
        selectedSuperhero.shouldBe(Condition.visible);
        return this;
    }

    public SelectPage selectLastProgrammingLanguage() {
        Select select = new Select(programmingLanguage);
        selectSize = select.getOptions().size();
        select.selectByIndex(selectSize-1);
        SelenideElement selectedProgrammingLanguage = $x("//p[normalize-space()='You have selected " + select.getFirstSelectedOption().getText() + "']");
        selectedProgrammingLanguage.shouldBe(Condition.visible);
        return this;
    }
    public void printAllProgrammingLanguageOptions() {
        Select select = new Select(programmingLanguage);
        selectSize = select.getOptions().size();
        for (int i = 0; i < selectSize; i++) {
            System.out.println(select.getOptions().get(i).getText());
        }
    }

    public SelectPage selectCountry(String selectYouCountry) {
        Select select = new Select(country);
        select.selectByValue(String.valueOf(selectYouCountry));
        System.out.println(select.getFirstSelectedOption().getText());
        return this;
    }
}
