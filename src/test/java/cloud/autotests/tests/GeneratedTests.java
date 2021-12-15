package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Ozon has some QA vacancies")
    void generatedTest() {
        step("open https://job.ozon.ru/vacancy/?department=Ozon%20Fintech&experience=%D0%9E%D1%82%201%20%D0%B3%D0%BE%D0%B4%D0%B0%20%D0%B4%D0%BE%203%20%D0%BB%D0%B5%D1%82&query=%D0%B0%D0%B2%D1%82%D0%BE%D0%BC%D0%B0", () -> {
            step("// todo: just add selenium action");
        });

        step("results__items wr", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://job.ozon.ru/vacancy/?department=Ozon%20Fintech&experience=%D0%9E%D1%82%201%20%D0%B3%D0%BE%D0%B4%D0%B0%20%D0%B4%D0%BE%203%20%D0%BB%D0%B5%D1%82&query=%D0%B0%D0%B2%D1%82%D0%BE%D0%BC%D0%B0'", () ->
            open("https://job.ozon.ru/vacancy/?department=Ozon%20Fintech&experience=%D0%9E%D1%82%201%20%D0%B3%D0%BE%D0%B4%D0%B0%20%D0%B4%D0%BE%203%20%D0%BB%D0%B5%D1%82&query=%D0%B0%D0%B2%D1%82%D0%BE%D0%BC%D0%B0"));

        step("Page title should have text 'Вакансии компании Ozon – Работа в Ozon'", () -> {
            String expectedTitle = "Вакансии компании Ozon – Работа в Ozon";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://job.ozon.ru/vacancy/?department=Ozon%20Fintech&experience=%D0%9E%D1%82%201%20%D0%B3%D0%BE%D0%B4%D0%B0%20%D0%B4%D0%BE%203%20%D0%BB%D0%B5%D1%82&query=%D0%B0%D0%B2%D1%82%D0%BE%D0%BC%D0%B0'", () ->
            open("https://job.ozon.ru/vacancy/?department=Ozon%20Fintech&experience=%D0%9E%D1%82%201%20%D0%B3%D0%BE%D0%B4%D0%B0%20%D0%B4%D0%BE%203%20%D0%BB%D0%B5%D1%82&query=%D0%B0%D0%B2%D1%82%D0%BE%D0%BC%D0%B0"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}