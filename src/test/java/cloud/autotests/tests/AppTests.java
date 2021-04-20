package cloud.autotests.tests;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

@Epic("any")
@Feature("your")
@Story("metadata")
public class AppTests extends TestBase {

    @Test
    @Description("Soon to be implemented by QA.GURU engineers")
    @DisplayName("Пыщь-Пыщь")
    void test() {

        step("1) Open leprosorium.ru", () -> {
            // todo
        });

        step("2) Жепь ебрило!", () -> {
            // todo
        });

        step("3) ...", () -> {
            // todo
        });

        step("4) Profit!", () -> {
            // todo
        });

    }
}