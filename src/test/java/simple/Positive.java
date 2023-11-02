package simple;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;
@Tag("remote")
public class Positive {
    @BeforeAll
    public static void setupBrowser() {
        Configuration.browser = "chrome";
        System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver\\chromedriver-win64\\chromedriver.exe");
    }
    @Test
    void testTranslate1(){
        Configuration.browserSize = "1920x1080";
        Configuration.remote ="http://95.31.234.122:8080/wd/hub";
        Configuration.browserVersion = "118";
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browserName", "chrome");
//        capabilities.setCapability("browserVersion", "118.0");
        capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                        "enableVNC", true,
                        "enebleVideo", false
                ));
        Configuration.browserCapabilities = capabilities;

        open("https://wooordhunt.ru/word/word");
        $("#hunted_word").setValue("waterfall");
        $("#hunted_word_submit").click();
        $("#wd_title").$("h2").shouldHave(text("Waterfall"));
    }

}
