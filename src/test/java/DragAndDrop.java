import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;

public class DragAndDrop {
    // (опциональное) Запрограммируйте Drag&Drop с помощью Selenide.actions()
    // - Откройте https://the-internet.herokuapp.com/drag_and_drop
    // - Перенесите прямоугольник А на место В
    // - Проверьте, что прямоугольники действительно поменялись
    // - В Selenide есть команда $(element).dragAndDrop($(to-element)), проверьте работает ли тест, если использовать её вместо actions()
    @Test
    void swapTest() {
        Selenide.open("https://the-internet.herokuapp.com/drag_and_drop");
        Selenide.$("#column-a").dragAndDropTo(Selenide.$("#column-b"));
        Selenide.$("#column-b").shouldHave(text("A"));

    }
}
