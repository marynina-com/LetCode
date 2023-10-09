package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$x;



public class SelectPage extends BasePage{
    private static final SelenideElement fruit = $x("//select[@id='fruits']");
    private static final SelenideElement superhero = $x("//select[@id='superheros']");

    private static final SelenideElement programmingLanguage = $x("//select[@id='lang']");

    private static final SelenideElement country = $x("//select[@id='country']");

    public static int selectSize;

    public SelectPage selectFruitNew(int youValue) {
        Select select = new Select(fruit);
        select.selectByValue(String.valueOf(youValue));
        return this;
    }

    public void checkSelectedFruit() {
        Select select = new Select(fruit);
        SelenideElement selectedFruit = $x("//p[normalize-space()='You have selected " + select.getFirstSelectedOption().getText() + "']");
        selectedFruit.shouldBe(Condition.visible);
    }

    public SelectPage selectSuperheroNew() {
        Select select = new Select(superhero);
        selectSize = select.getOptions().size();
        int selectedHero = random.nextInt(selectSize);
        select.selectByIndex(selectedHero);
        return this;
    }
    public void checkSelectedSuperhero() {
        Select select = new Select(superhero);
        SelenideElement selectedSuperhero = $x("//p[normalize-space()='You have selected " + select.getFirstSelectedOption().getText() + "']");
        selectedSuperhero.shouldBe(Condition.visible);
    }
    public SelectPage selectLastProgrammingLanguage() {
        Select select = new Select(programmingLanguage);
        selectSize = select.getOptions().size();
        select.selectByIndex(selectSize-1);
        return this;
    }
    public SelectPage checkLastProgrammingLanguage() {
        Select select = new Select(programmingLanguage);
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
        select.selectByValue(selectYouCountry);
        return this;
    }

    public SelectPage checkSelectedCountry(String checkCountry) {
        Select select = new Select(country);
        Assert.isTrue(select.getFirstSelectedOption().getText().equals(checkCountry), "Выбранная страна не " + checkCountry);
        return this;
    }

    public void printSelectedCountry() {
        Select select = new Select(country);
        System.out.println(select.getFirstSelectedOption().getText());
    }
}
