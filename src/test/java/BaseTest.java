import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {
    protected WebDriver driver;  // Защищенное поле, чтобы дочерние классы могли использовать driver

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        clickCookies();  // Автоматическое нажатие на кнопку подтверждения cookies
    }

    @AfterEach
    public void closeWebDriver() {
        if (driver != null) {
            try {
                driver.quit();  // Закрытие драйвера
            } catch (Exception e) {  // Отчет если драйвер не закрылся
                System.out.println("Ошибка при закрытии WebDriver: " + e.getMessage());
            }
        }
    }

    // Метод для обработки окна с cookies
    public void clickCookies() {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            WebElement cookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("cookie-agree")));
            cookiesButton.click();
            System.out.println("Cookies подтверждены.");
        } catch (TimeoutException e) {
            System.out.println("Подтверждение cookies не потребовалось.");
        }
    }
}
