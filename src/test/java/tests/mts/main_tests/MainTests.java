package tests.mts.main_tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tests.base.BaseTest;

import java.util.stream.Stream;

import static constans.Constant.Url.URL;

public class MainTests extends BaseTest {

    @ParameterizedTest
    @MethodSource("parametersPlaceholderName")
    @DisplayName("Проверка плейсхолдеров")
    public void checkPlaceholder(String[] expected, String[] description) {
        basePage
                .open(URL);

        mtsPage
                .checkDownList(expected, description);
    }

    private static Stream<Arguments> parametersPlaceholderName() {

        return Stream.of(
                Arguments.of(
                        new String[]{"Номер телефона", "Сумма", "E-mail для отправки чека"},
                        new String[]{"connection-phone", "connection-sum", "connection-email"}
                ),
                Arguments.of(
                        new String[]{"Номер абонента", "Сумма", "E-mail для отправки чека"},
                        new String[]{"internet-phone", "internet-sum", "internet-email"}
                ),
                Arguments.of(
                        new String[]{"Номер счета на 44", "Сумма", "E-mail для отправки чека"},
                        new String[]{"score-instalment", "instalment-sum", "instalment-email"}
                ),
                Arguments.of(
                        new String[]{"Номер счета на 2073", "Сумма", "E-mail для отправки чека"},
                        new String[]{"score-arrears", "arrears-sum", "arrears-email"}
                )
        );
    }

    @Test
    @DisplayName("Проверка названия блока")
    public void testBlockTitle() {
        basePage
                .open(URL);
        mtsPage
                .getBlockTitleText();

    }

    @ParameterizedTest
    @MethodSource("paymentSystemLogos")
    @DisplayName("Проверка наличия логотипов платежных систем")
    public void testPaymentSystemLogos(String logoAltText) {
        basePage
                .open(URL);
        mtsPage
                .isPaymentSystemLogoDisplayed(logoAltText);

    }

    @Test
    @DisplayName("Проверка ссылки 'подробнее о сервисе'")
    public void testMoreInfoLink() {
        basePage
                .open(URL);
        mtsPage
                .Cookies()
                .moreInfoLink();
    }

    private static Stream<Arguments> paymentSystemLogos() {
        return Stream.of(
                Arguments.of("Visa"),
                Arguments.of("Verified By Visa"),
                Arguments.of("MasterCard"),
                Arguments.of("MasterCard Secure Code"),
                Arguments.of("Белкарт")
        );
    }
}
