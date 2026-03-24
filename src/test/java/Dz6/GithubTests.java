package Dz6;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.byText;


public class GithubTests {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        open("https://github.com/selenide/selenide");
    }

    @Test
    void selenidePageCheck() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(withText("Show 3 more pages…")).click();
        $(byText("SoftAssertions")).shouldBe(visible);
        $(byText("SoftAssertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class:"));




    }
}
