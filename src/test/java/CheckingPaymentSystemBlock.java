import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckingPaymentSystemBlock {
    private WebDriver driver;

    public CheckingPaymentSystemBlock(WebDriver driver) {
        this.driver = driver;
    }

    // Проверка корректности отображения суммы в поп-ап и на кнопке
    public void testCheckPaymentSystemSumm() {
        String summText = "100.00 BYN";
        String summText1 = " Оплатить  100.00 BYN <!---->";

        WebElement summa = driver.findElement(By.xpath("//div[@class='pay-description__cost']//span[text()='" + summText + "']"));
        WebElement summa1 = driver.findElement(By.xpath("//div[@class='card-page__card']//button[@class='colored disabled']"));

        assertEquals(summText, summa.getAttribute("innerHTML"));
        assertEquals(summText1, summa1.getAttribute("innerHTML"));
    }
}
