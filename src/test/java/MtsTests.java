import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTests extends BaseTest {

    @Test
    public void blockTitle() {
        // Проверка названия блока "Онлайн пополнение без комиссии"
        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение ')]"));
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        assertEquals(expectedTitle, blockTitle.getText(), "Название блока не соответствует ожидаемому");
    }

    @Test
    public void paymentSystemVisa() {
        WebElement visaLogo = driver.findElement(By.xpath("//div[@class='pay__partners']//ul//img[@alt='Visa']"));
        assertTrue(visaLogo.isDisplayed(), "Логотип платежной системы VISA не найден на странице");
    }

    @Test
    public void paymentSystemVerifiedByVisa() {
        WebElement visaLogo = driver.findElement(By.xpath("//div[@class='pay__partners']//ul//img[@alt='Verified By Visa']"));
        assertTrue(visaLogo.isDisplayed(), "Логотип платежной системы Verified By Visa не найден на странице");
    }

    @Test
    public void paymentSystemMasterCard() {
        WebElement visaLogo = driver.findElement(By.xpath("//div[@class='pay__partners']//ul//img[@alt='MasterCard']"));
        assertTrue(visaLogo.isDisplayed(), "Логотип платежной системы MasterCard не найден на странице");
    }

    @Test
    public void paymentSystemMasterCardSecureCode() {
        WebElement visaLogo = driver.findElement(By.xpath("//div[@class='pay__partners']//ul//img[@alt='MasterCard Secure Code']"));
        assertTrue(visaLogo.isDisplayed(), "Логотип платежной системы MasterCard Secure Code не найден на странице");
    }

    @Test
    public void paymentSystemBelkart() {
        WebElement visaLogo = driver.findElement(By.xpath("//div[@class='pay__partners']//ul//img[@alt='Белкарт']"));
        assertTrue(visaLogo.isDisplayed(), "Логотип платежной системы Белкарт не найден на странице");
    }

    @Test
    public void moreInfoLink() {
        WebElement serviceLink = driver.findElement(By.xpath("//div[@class='pay__wrapper']//a[@href]"));
        assertTrue(serviceLink.isDisplayed(), "Ссылка 'Подробнее о сервисе' не найдена на странице");
        serviceLink.click();
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        assertEquals(expectedUrl, driver.getCurrentUrl(), "Ссылка не ведет на правильную страницу");
    }

    @Test
    public void testServiceContinueButton() {
        WebElement servicesTab = driver.findElement(By.className("select__now"));
        servicesTab.click();
        WebElement phoneNumberField = driver.findElement(By.id("connection-phone"));
        phoneNumberField.sendKeys("297777777");
        WebElement sumField = driver.findElement(By.id("connection-sum"));
        sumField.sendKeys("100");
        WebElement continueButton = driver.findElement(By.cssSelector("#pay-connection button"));
        continueButton.click();
    }
}