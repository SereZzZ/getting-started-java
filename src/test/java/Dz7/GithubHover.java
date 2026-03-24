package Dz7;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubHover {

        @BeforeAll
        static void beforeAlll() {
            Configuration.browserSize = "1920x1080";
            Configuration.holdBrowserOpen = true;
            open("https://github.com/selenide/selenide");
        }

        @Test
        void gitHover(){
            $(byTagAndText("button", "Solutions")).hover();
            $(byText("Enterprises")).click();
            $(byText("To build, scale, and deliver secure software.")).shouldBe(visible);
        }
        }
