package СssAnd$$;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class CssXpathExamples1 {
    void cssXpathExamples() {

        //.hover - команда чтобы подвинуть мышку к элементу, например на подсказку

        //.closest - команда чтобы подняться вверх по дереву и ищет только ближайший элемент например: .closest("h1") ищет ближайший h1 сверху
        //.parent - команда чтобы спуститься вниз по дереву и ищет только ближайший элемент например: .parent("h1") ищет ближайший h1 снизу по дереву
        //.sibling - это команда чтобы искать элемент на одном уровне например если у нас много ls пишем  .sibling("0 или 1") найдет следущей или второй элемент на этом уровне

        //$$("ul li") - два доллара значит искать все. В данном случае искать все ul li

        //.findBy(Condition.visible) - найти первый видимый элемент в нашем случае поп ап

        //.shouldHave(text("")) - ищет подстраку (то есть может найти не полный текс и пройдет )
        //.shouldHave(exactText("")) - ищет полное совпадение по тексту

        //shouldBe(hidden); - проверяет что текст НЕ виден
        //shouldBe(visible); - проверяет что текст виден

        // .а.б так мы ищем два класса одновременно у одного элемента
        // .а .б так мы ищем класс .а в котором еще есть класс .б
        // $(byTagAndText("strong", "Закрыть")) - byTagAndText - позваляет найти элемент с помощью тега и текста в этом теге в нашем случае: <strong>Закрыть</strong>



        //чтобы себя проверить можно искать элемент в консоли, то же самое только в начале всегда ставим $$("тут ищем элемент как в ccs")


        //пример сложного СSS:
        //$(".product-cell__row:not(.disebled)") - такая запись нам говорит что у класса дожен быть product-cell__row и не должно быть disebled


















        // https://help.carrotquest.io/article/224 - все про css
        //https://devhints.io/xpath все про локаторыыыы !!!!!!!!!!!!!!!!!! ахуенно

        // как искать CSS локаторы
        //1 ‹input type="email" class="inputtext login_form_input_box" name="email" id="email" data_testid="email">
        $( "[data-testid=email]"). setValue("1");
        или
        $(by("data-testid", "email")). setValue("1");



        //2 ‹input type="email" class="inputtext login_form_input_box" name="email" id="email">
        $( "[id=email]"). setValue("1");
        или
        $( "#email").setValue("1");
        или
        $( "input#email").setValue("1");
        или икспатч
        $x ( "//*[@id='email']"). setValue ("1");
        или
        $x ( "//input[@id='email']"). setValue ("1");



        //3 ‹input type="email" class="inputtext login_form_input_box" name="email">
        $("[name=email]").setValue("1");
        или
        $(byName("email")).setValue("1");



        //4 ‹input type="email" class="inputtext login_form_input_box"> тут мы берем самый уникальный класс по описанию
        $( "[class=login_form_input_box]"). setValue("1");
        или
        $( ".login_form_input_box"). setValue("1");
        или
        $( ".inputtext.login_form_input_box"). setValue("1");
        или
        $( ".input.inputtext.login_form_input_box"). setValue("1");
        или икспач
        $x ( "//input[@class='inputtext'][@class='login_form_input_box']"). setValue ("1");
        // .а.б так мы ищем два класса одновременно у одного элемента
        // .а .б так мы ищем класс .а в котором еще есть класс .б
        // например
        //5 <div class="inputtext">
        //       <input type="email" class="login_form_input_box">
        // </div>
        $( ".inputtext .login_form_input_box").setValue("1");
        или
        $( ".inputtext").$(".login_form_input_box").setValue("1");


        //6 поиск по тексту
        // <div>Hallo mom!</div>
        $(byText("Hallo mom!")).click(); //- весь текст
        $(withText("lo mo")).click(); // по частичному совпадению текста
        и икспатч
        $x ( "//div[text()='Hallo mom!']").click();









    }
}
