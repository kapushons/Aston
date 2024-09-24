import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CookiesPage {
    private WebDriver driver;
    private WebDriverWait wait;

    public CookiesPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(2));
    }

    public void acceptCookies() {
        try {
            WebElement cookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("cookie-agree")));
            cookiesButton.click();
            System.out.println("Cookies подтверждены.");
        } catch (TimeoutException e) {
            System.out.println("Подтверждение cookies не потребовалось.");
        }
    }
}

