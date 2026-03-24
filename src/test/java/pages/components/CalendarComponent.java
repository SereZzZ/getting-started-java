package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {

    public void Date() {
        $(byText("Выберите дату")).click();
        $(byText("6")).click();
    }
}
