import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class gitHubSolutions {
    @Test
    void gitHubSolutions () {
        /*
        На главной странице GitHub выберите: Меню -> Solutions -> Enterprize
        (с помощью команды hover для Solutions). Убедитесь, что загрузилась
        нужная страница (например, что заголовок: "The AI-powered developer platform.").
         */
        open("https://github.com");
        $$(".HeaderMenu-link.border-0.width-full.width-lg-auto.px-0.px-lg-2.py-lg-2.no-wrap.d-flex.flex-items-center.flex-justify-between.js-details-target").findBy(text("Solutions")).hover();
        $$(".HeaderMenu-dropdown-link.d-block.no-underline.position-relative.py-2.Link--secondary").findBy(text("Enterprises")).click();
        $(".Primer_Brand__Hero-module__Hero___EM3jf").shouldHave(text("The AI-powered\n" + "developer platform"));
    }
}
