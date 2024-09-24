import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RefillBlockPage {
    private WebDriver driver;

    public RefillBlockPage(WebDriver driver) {
        this.driver = driver;
    }

    //    Проверка описания блока
    public void verifyBlockTitle(String expectedTitle) {
        WebElement blockTitle = driver.findElement(By.xpath("//h2[contains(text(), 'Онлайн пополнение')]"));
        assertEquals(expectedTitle, blockTitle.getText(), "Название блока не соответствует ожидаемому");
    }
}


