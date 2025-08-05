import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selectors;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


public class GitShouldBe {
    @Test
    void andreiShouldBe() {
        // открыть страницу
        Configuration.browserSize = "1920x1080";
        open("https://github.com/britka/playwrightium");
        // подвести мышку к первому оватару пользователя в блоке Contributors
        $("div.Layout-sidebar").$(byText("Contributors")).closest(".BorderGrid-cell").$$("ul.list-style-none li").first().hover();
        sleep(5000);
        $(".Popover-message").shouldHave(text("Sergey Brit"));
    }
}
