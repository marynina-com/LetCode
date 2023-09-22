package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.ui.Select;

import static com.codeborne.selenide.Selenide.$x;
import static pages.BasePage.random;



public class SelectPage {
    private static final SelenideElement fruit = $x("//select[@id='fruits']");
    private static final SelenideElement superhero = $x("//select[@id='superheros']");

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
}
