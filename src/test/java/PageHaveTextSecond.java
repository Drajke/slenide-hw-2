import com.codeborne.selenide.Selenide;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Condition.text;
import org.junit.jupiter.api.Test;

public class PageHaveTextSecond {
    //На главной странице GitHub выберите меню Solutions -> Enterprize с помощью команды hover для Solutions.
    // Убедитесь что загрузилась нужная страница, например что заголовок - "Build like the best."
    @Test
    void GitHoverTest() {
        Selenide.open("https://github.com/");
        Selenide.$(byText("Solutions")).hover();
        Selenide.$(byText("Enterprise")).click();
        Selenide.$("div.col-9-max h1").shouldHave(text("Build like the best"));
    }
}