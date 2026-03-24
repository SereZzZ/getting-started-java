import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.components.CalendarComponent;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class TextBoxTest4DZPageObject extends TestBase {

    @Test
    void test4D() {
        reg.openPage()
                .setfristName("Сергей")
                .setlastName("Гаврилив")
                .setEmail("123S@mail.ru")
                .setGender()
                .setPhone("9969236311")
                .setData();
        $("[id=hobby-sports]").click();
        $("[id=picture-upload]").uploadFromClasspath("foto/Operator.png");
        $("[id=currentAddress]").setValue("Бебруашвилли дом 8");
        $("#state").setValue("Тверская обл");
        $("#city").setValue("Бурашево");
        $(byText("Отправить")).click();
        reg.verifyModal()
                .verifyResult("Имя:", "Сергей Гаврилив")
                .verifyResult("Email:", "123S@mail.ru");
    }
}


// File img = new File("C:/s/IDE Project/getting-started-java/src/test/resources/foto/Operator.png");

     /* @Test
    void formTest() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        open("https://demoqa.ru/qa-auto/elements/textbox");
        $("#fullName").setValue("sergey");
        $("#email").setValue("sergey@mail.ru");
        $("[id=currentAddress]").setValue("Тверь");
        $("[id=permanentAddress]").setValue("123");
        $("[type=submit]").click();
        $(".space-y-3").shouldHave(
                text("sergey"),
                text("sergey@mail.ru"),
                text("Тверь"),
                text("123"));
    } */

     /* @Test
     void formtest4dz() {
         $("[name=firstName]").setValue("Sergey");
         $("[name=lastName]").setValue("Gavriliv");
         $("[name=email]").setValue("Sergey@mail.ru");
         $("[name=email]").setValue("Sergey@mail.ru");
         $(byText("male")).click();
         $("[name=mobile]").setValue("1234567892");
         $("[name=dateOfBirth]").setValue("10-10-2010");
         $(byText("sports")).click();
        $(".hidden").uploadFromClasspath("foto/Operator.png");
        $("[name=currentAddress]").setValue("zZzZzZzZz");
        $("[name=state]").setValue("Россия");
        $("[name=city]").setValue("Тверь");
        $("[type=submit]").click();
        $("[class=space-y-3]").shouldHave(text("Sergey"));
     }*/




