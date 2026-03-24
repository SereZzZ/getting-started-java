package СssAnd$$;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.actions;

public class Comands {

@Test
    void comand(){
    actions().sendKeys(Keys.ESCAPE); // передать всей странице команду эскейп
}
}
