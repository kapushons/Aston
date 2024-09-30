package pages.mts;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import pages.base.BasePage;

import static org.junit.jupiter.api.Assertions.*;

public class MtsPage extends BasePage {

    public MtsPage(WebDriver driver) {
        super(driver);
    }

    private final By continueButton = By.cssSelector("#pay-connection button");
    private final By phoneNumber = By.id("connection-phone");
    private final By summa = By.id("connection-sum");
    private final By cookiesBut = By.id("cookie-agree");
    private final By frame = By.xpath("//iframe[@class='bepaid-iframe']");
    private final By blockTitleLocator = By.xpath("//h2[contains(text(), 'Онлайн пополнение ')]");
    private final By serviceButton = By.xpath("//div[@class='pay__wrapper']//a[@href]");


    public MtsPage continueButton() {
        driver.findElement(continueButton).click();

        return this;
    }

    public MtsPage fillFields() {

        driver.findElement(phoneNumber).sendKeys("297777777");
        driver.findElement(summa).sendKeys("100");

        return this;
    }

    public MtsPage Cookies() {

        WebElement cookiesButton = driver.findElement(cookiesBut);
        try {
            waitElementToByClickable(cookiesButton).click();
        } catch (TimeoutException e) {
            System.out.println("Подтверждение cookies не потребовалось.");
        }
        return this;
    }

    public MtsPage checkDownList(String[] expected, String[] description) {
        String[] actual = new String[expected.length];

        for (int i = 0; i < description.length; i++) {
            actual[i] = driver.findElement(By.xpath("//input[@id='" + description[i] + "']"))
                    .getAttribute("placeholder");
        }
        Assertions.assertAll("Group by placeholder",
                () -> assertEquals(expected[0], actual[0], "Плейсхолдер " + expected[0] + " неверен"),
                () -> assertEquals(expected[1], actual[1], "Плейсхолдер " + expected[0] + " неверен"),
                () -> assertEquals(expected[2], actual[2], "Плейсхолдер " + expected[0] + " неверен")
        );
        return this;
    }

    public MtsPage switchFrame() {
        WebElement iFrame = driver.findElement(frame);
        try {
            driver.switchTo().frame(iFrame);
        } catch (NoSuchWindowException e) {
            System.out.println("Фрейм не обнаружен!");
        }
        return this;
    }

    public MtsPage getBlockTitleText() {
        WebElement blockTitle = driver.findElement(blockTitleLocator);
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        assertEquals(expectedTitle, blockTitle.getText(), "Название блока не соответствует ожидаемому");
        return this;
    }

    public MtsPage isPaymentSystemLogoDisplayed(String altText) {
        By logoLocator = By.xpath("//div[@class='pay__partners']//ul//img[@alt='" + altText + "']");
        try {
            assertTrue(driver.findElement(logoLocator).isDisplayed(),
                    "Логотип платежной системы " + altText + " не найден на странице");
        } catch (NoSuchElementException e) {
            fail("Логотип с alt='" + altText + "' не найден на странице");
        }
        return this;
    }

    public MtsPage moreInfoLink() {
        WebElement moreInfo = driver.findElement(serviceButton);
        assertTrue(moreInfo.isDisplayed(), "Ссылка 'Подробнее о сервисе' не найдена на странице");
        moreInfo.click();
        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        assertEquals(expectedUrl, driver.getCurrentUrl(), "Ссылка не ведет на правильную страницу");
        return this;
    }
}



