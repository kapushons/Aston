import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckingPaymentSystemIcon {
    private WebDriver driver;

    public CheckingPaymentSystemIcon(WebDriver driver) {
        this.driver = driver;
    }

    // Проверка иконок платежных систем в поп-ап
    public void testCheckingPaymentSystemIcon(String paymentSrcText, String availability) {
        if (availability.equals("BY")) {
            WebElement paymentLogo = driver.findElement(By.xpath("//div[@class='icons-container ng-tns-c46-1']//img[@src='"
                    + paymentSrcText + "']"));
            assertTrue(paymentLogo.isDisplayed(), "Логотип платежной системы " + paymentSrcText + " не найден на странице");
        } else {
            WebElement paymentLogo = driver.findElement(By.xpath("//div[@class='icons-container ng-tns-c46-1']/div/div/div/img[@src='"
                    + paymentSrcText + "']"));
            assertTrue(paymentLogo.isDisplayed(), "Логотип платежной системы " + paymentSrcText + " не найден на странице");
        }
    }
}
