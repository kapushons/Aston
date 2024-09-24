import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BlankFields {
    private WebDriver driver;

    public BlankFields(WebDriver driver) {
        this.driver = driver;
    }

    // Проверка полей банковской карты
    public void testBlankFields(String expected, String data) {

        String actual = driver.findElement(By.xpath(
                "//input[@formcontrolname='" + data + "']/../label")).getAttribute("innerHTML");
        Assertions.assertEquals(expected, actual);
    }
}
