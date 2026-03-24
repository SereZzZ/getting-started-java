package pages.components;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationResultsModal {
    public void verifyModal(){
        $(".space-y-3").shouldBe(visible);
    }

    public void verifyResultString (String key, String value){
$(".space-y-3").$(byText(key)).parent().shouldHave(text(value));
    }
}
