package tests.mts.popup_tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import tests.base.BaseTest;

import java.util.stream.Stream;

import static constans.Constant.Url.URL;

public class PopUpTests extends BaseTest {

    @Test
    @DisplayName("Проверка заполнения полей суммы и номера телефона")
    public void checkSumAndTelephone() {
        basePage.open(URL);

        mtsPage
                .Cookies()
                .fillFields()
                .continueButton()
                .switchFrame();

        popUpPage
                .checkSum();
    }

    @ParameterizedTest
    @MethodSource("checkLogoTest")
    @DisplayName("Проверка иконок платежных систем")
    public void checkLogo(String paymentSystem) {
        basePage.open(URL);

        mtsPage
                .Cookies()
                .fillFields()
                .continueButton()
                .switchFrame();

        popUpPage
                .checkIsDisplayedIcon(paymentSystem);
    }

    private static Stream<Arguments> checkLogoTest() {
        return Stream.of(
                Arguments.of("visa-system"),
                Arguments.of("mastercard-system"),
                Arguments.of("belkart-system"),
                Arguments.of("maestro-system"),
                Arguments.of("mir-system-ru")
        );
    }
}
