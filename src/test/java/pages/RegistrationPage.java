package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.selector.ByTagAndText;
import pages.components.CalendarComponent;
import pages.components.RegistrationResultsModal;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    CalendarComponent calendarComponent = new CalendarComponent();
    RegistrationResultsModal resultsModale = new RegistrationResultsModal();

    private final String titleText = "Student Registration Form";
    private SelenideElement firstNameInput = $("[id=firstName]");
    private SelenideElement lastNameInput = $("[id=lastName]");
    private SelenideElement emailImput = $("[id=email]"),
                            genderInputMale = $("[id=gender-male]"),
                            phoneInput = $("[id=mobile]");

    public RegistrationPage openPage(){
        open("https://demoqa.ru/qa-auto/forms");
        $("button.inline-flex.text-gray-400").click();
       $(byTagAndText("div", "Student Registration Form")).shouldHave(Condition.text(titleText));
        return this;
    }

    public RegistrationPage setfristName(String valueName ){   // так считается хорошо потому что при вызове метода мы можем передать любое значение не меняя метод
        firstNameInput.setValue(valueName);
        return this;
    }

    public RegistrationPage setlastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public RegistrationPage setEmail(String value) {
        emailImput.setValue(value);
        return this;
    }

    public RegistrationPage setGender() {
        genderInputMale.click();
        return this;
    }

    public RegistrationPage setPhone(String valuePhone) {
        phoneInput.setValue(valuePhone);
        return this;
    }

    public RegistrationPage setData() {
        calendarComponent.Date();
        return this;
    }

    public RegistrationPage verifyModal(){
        resultsModale.verifyModal();
        return this;
    }

    public RegistrationPage verifyResult(String key, String value){
        resultsModale.verifyResultString(key, value);
        return this;
    }


}
