import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseTest {
    protected static WebDriver driver;

    // Работа всех тестов в одном окне
    @BeforeAll
    public static void beforeAll() {
        driver = new ChromeDriver();
    }

    // Открытие браузера
    @BeforeEach
    public void setUp() {
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    // Закрытие браузера
    @AfterAll
    public static void closeWebDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
