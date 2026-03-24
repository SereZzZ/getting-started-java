package Dz7;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class  Drag_and_drop {

    @BeforeAll
    static void beforeAllll() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;
        open("https://the-internet.herokuapp.com/drag_and_drop");
    }

    @Test
    void dragTest() {
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
        sleep(5000);
    }

}
