import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;

public class PageHaveText  {
    //- Откройте страницу Selenide в Github

    //- Перейдите в раздел Wiki проекта

    //- Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions

    //- Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
    @Test
    void WikiTest(){
        Selenide.open("https://github.com/selenide/selenide");
        Selenide.$("#wiki-tab").click();
        Selenide.$("#wiki-pages-box button").click();
        Selenide.$("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        Selenide.$("#wiki-pages-box").$(byText("SoftAssertions")).click();
        Selenide.$("#wiki-body").$(byText("3. Using JUnit5 extend test class:"));
    }
}
