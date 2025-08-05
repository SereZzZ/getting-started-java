import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class OtpBankCloseCookie {

    @Test
    void closeCookie(){
        open("https://www.otpbank.ru/?utm_source=google.com&utm_medium=organic&utm_campaign=google.com&utm_referrer=google.com");
        $(withText("Продолжая просмотр сайта")).shouldBe(visible);
        $(byTagAndText("strong", "Закрыть")).click();
        $(withText("Продолжая просмотр сайта")).shouldBe(hidden);
        sleep(5000);

    }







    @Test
    void closeeCoocie(){
        open("https://www.otpbank.ru/?utm_source=google.com&utm_medium=organic&utm_campaign=google.com&utm_referrer=google.com");
        $(withText("Продолжая просмотр сайта")).shouldBe(visible);
        $(byTagAndText("strong", "Закрыть")).click();
        $(withText("Продолжая просмотр сайта")).shouldBe(hidden);
        sleep(5000);



    }
}
