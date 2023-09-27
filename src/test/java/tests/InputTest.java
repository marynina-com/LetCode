package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InputTest extends BaseTest {

    @BeforeMethod
    public void preconditions(){
        basePage.clickOnInputBlock();
    }
@Test
    public void enterYourFullName(){

    inputPage.enterName("Masha Ivanova");
}
    @Test
    public void AppendATextAndPressKeyboardTab(){

    }
    @Test
    public void WhatIsInsideTheTextBox(){

    }
    @Test
    public void ClearTheText(){

    }
    @Test
    public void ConfirmEditFieldIsDisabled(){

    }
    @Test
    public void ConfirmTextIsReadonly(){

    }

//    sendKeys():
//    Этот метод используется для имитации ввода текста в поле ввода или отправки клавиатурного ввода в веб-элемент. С его помощью можно вводить текст или специальные клавиши, такие как Enter, Escape или стрелки.
//
//    Keyboard TAB:
//    Это, по-видимому, является заполнителем или комментарием, указывающим на использование клавиши TAB на клавиатуре. Это часто используется для перемещения фокуса между различными элементами на веб-странице, такими как поля ввода, кнопки или ссылки.
//
//    getAttribute():
//    Этот метод используется для получения значения указанного атрибута веб-элемента. Например, его можно использовать для получения атрибута "href" ссылки или атрибута "value" поля ввода.
//
//    clear():
//    Этот метод используется для очистки текста или ввода из поля ввода или текстовой области. Его часто используют перед вводом нового текста в поле, чтобы убедиться, что поле пустое.

//    isEnabled():
//    Этот метод используется для проверки, включен ли веб-элемент или выключен. Его часто используют для определения, можно ли взаимодействовать с элементом, таким как кнопка или флажок. Отключенные элементы обычно нельзя активировать или нажать.
}
