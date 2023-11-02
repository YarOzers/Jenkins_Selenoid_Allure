package simple;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TranslateTest extends TestBase{

    @Test
    @Tag("remote")
    void testOne(){
        step("Open website", ()->{
            open("https://wooordhunt.ru/word/word");
        });
        step("Enter word:'waterfall'",()->{
            $("#hunted_word").setValue("waterfall");
        });
        step("Click Find",()->{
            $("#hunted_word_submit").click();
        });
        step("Label contains text 'Waterfall'",()->{
            $("#wd_title").$("h2").shouldHave(text("Waterfall"));
        });

    }
}
