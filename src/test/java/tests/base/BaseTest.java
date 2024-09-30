package tests.base;

import common.CommonAction;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
import pages.mts.MtsPage;
import pages.mts.PopUpPage;

import static common.Config.CLEAR_COOKIES;
import static common.Config.HOLD_BROWSER_OPEN;

public class BaseTest {
    protected WebDriver driver = CommonAction.createDriver();
    protected BasePage basePage = new BasePage(driver);
    protected MtsPage mtsPage = new MtsPage(driver);
    protected PopUpPage popUpPage = new PopUpPage(driver);

    @AfterEach
    public void clearCookies() {
        if (CLEAR_COOKIES) {
            driver.manage().deleteAllCookies();
        }
    }

    @AfterEach
    public void close() {
        if (HOLD_BROWSER_OPEN) {
            driver.quit();
        }
    }
}
