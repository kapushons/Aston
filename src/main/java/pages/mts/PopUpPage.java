package pages.mts;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class PopUpPage extends BasePage {


    private final By sumText = By.xpath("//div[@class='pay-description__cost']/span[1]");
    private final By telephoneNumber = By.xpath("//div[@class='pay-description__text']/span");
    private final By sumButton = By.xpath("//button[@class='colored disabled']");

    public PopUpPage(WebDriver driver) {
        super(driver);
    }

    public PopUpPage checkSum() {
        String textSum = getAttributeInnerHTMLText(driver.findElement(sumText));
        String textTelephone = getAttributeInnerHTMLText(driver.findElement(telephoneNumber));
        String textSumButton = getAttributeInnerHTMLText(driver.findElement(sumButton));
        Assertions.assertAll(
                () -> Assertions.assertEquals("100.00 BYN", textSum),
                () -> Assertions.assertEquals("Оплата: Услуги связи\nНомер:375297777777", textTelephone),
                () -> Assertions.assertEquals(" Оплатить  100.00 BYN <!---->", textSumButton)
        );
        return this;
    }

    public PopUpPage checkIsDisplayedIcon(String paymentSystem) {
        String firsPart = "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/%s.svg";
        String expected = String.format(firsPart, paymentSystem);

        String actual = driver.findElement(By.xpath(
                "//div[@class='icons-container ng-tns-c46-1']//img[@src='assets/images/payment-icons/card-types/"
                        + paymentSystem + ".svg']")).getAttribute("src");

        Assertions.assertEquals(expected, actual, paymentSystem + " не отображается");

        return this;
    }
}
