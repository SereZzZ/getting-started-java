import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;

public class TestBase {
    RegistrationPage reg = new RegistrationPage();

    @BeforeAll
    static void setting() {
        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

    }
}
