import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PhoneNumberData {
    private WebDriver driver;

    public PhoneNumberData(WebDriver driver) {
        this.driver = driver;
    }

    // Проверка отображения номера телефона
    public void testPhoneNumberData(String expected) {
        String actual = driver.findElement(By.xpath("//div[@class='pay-description__text']/span")).getAttribute("innerHTML");
        Assertions.assertEquals(expected, actual);
    }
}
