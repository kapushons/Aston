import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PaymentSystemsPage {
    private WebDriver driver;

    public PaymentSystemsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Проверка иконок платежных систем в блоке
    public void checkPaymentSystem(String paymentSystemAltText) {
        WebElement paymentSystemLogo = driver.findElement(By.xpath("//div[@class='pay__partners']//ul//img[@alt='" + paymentSystemAltText + "']"));
        assertTrue(paymentSystemLogo.isDisplayed(), "Логотип платежной системы " + paymentSystemAltText + " не найден на странице");
    }
}
