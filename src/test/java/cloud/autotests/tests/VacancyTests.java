package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class VacancyTests extends TestBase {
    @Test
    @Description("test tries to find some QA vacancies on Ozon")
    @DisplayName("Ozon has some QA vacancies")
    void generatedTest() {
        step("Open https://job.ozon.ru/vacancy/?department=Ozon%20Fintech&experience=%D0%9E%D1%82%201%20%D0%B3%D0%BE%D0%B4%D0%B0%20%D0%B4%D0%BE%203%20%D0%BB%D0%B5%D1%82&query=%D0%B0%D0%B2%D1%82%D0%BE%D0%BC%D0%B0", () -> {
            open("https://job.ozon.ru/vacancy/?department=Ozon%20Fintech&experience=%D0%9E%D1%82%201%20%D0%B3%D0%BE%D0%B4%D0%B0%20%D0%B4%D0%BE%203%20%D0%BB%D0%B5%D1%82&query=%D0%B0%D0%B2%D1%82%D0%BE%D0%BC%D0%B0");
        });

        step("Select city St-Petersburg", () -> {
            $("[placeholder=\"Город\"]").click();
            $$(".select__list__item").filterBy(text("Санкт-Петербург")).first().click();
            $(byText("Сохранить")).click();
        });

        step("results__items wr", () -> {
            step("Number of vacancies should be more then 1", () -> {
                int number_of_vacancies = $$(".vacancy .desktop .wr").size();

                assertThat(number_of_vacancies).isGreaterThan(1);
            });
        });
    }

    @Test
    @Description("Simple test")
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
    @Description("Simple test")
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