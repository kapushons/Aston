import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ByButton {
    private WebDriver driver;

    public ByButton(WebDriver driver) {
        this.driver = driver;
    }

    // Заполнение полей для ввода данных
    public void testServiceContinueButton() {
        WebElement servicesTab = driver.findElement(By.className("select__now"));
        servicesTab.click();

        WebElement phoneNumberField = driver.findElement(By.id("connection-phone"));
        phoneNumberField.sendKeys("297777777");

        WebElement sumField = driver.findElement(By.id("connection-sum"));
        sumField.sendKeys("100");

        WebElement continueButton = driver.findElement(By.cssSelector("#pay-connection button"));
        continueButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(2));
        WebElement frame = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        driver.switchTo().frame(frame);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
