import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MtsTests {
    private static WebDriver driver;
    private static WebDriverWait wait;
    private static boolean cookieAccepted = false; // Переменная для отслеживания нажатия кнопки

    public static void main(String[] args) {
        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(1));

        // Пробуем принять cookies в начале теста
        acceptCookiesIfPresent();

        try {
            // Ожидание и проверка названия блока
            WebElement blockTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//h2[contains(text(), 'Онлайн пополнение ')]")));
            System.out.println("Название блока найдено: " + blockTitle.getText());
        } catch (Exception e) {
            System.out.println("Название блока не найдено: " + e.getMessage());
        }

        // Повторное обращение к функции перед каждым действием, где это может понадобиться
        acceptCookiesIfPresent();

        try {
            // Ожидание и проверка наличия логотипов платежных систем
            WebElement logos = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//div[@class='pay__partners']")));
            System.out.println("Логотипы платежных систем найдены");
        } catch (Exception e) {
            System.out.println("Логотипы платежных систем не найдены: " + e.getMessage());
        }

        acceptCookiesIfPresent();

        try {
            // Ожидание работы ссылки "Подробнее о сервисе"
            WebElement moreInfoLink = wait.until(ExpectedConditions.elementToBeClickable(
                    By.linkText("Подробнее о сервисе")));
            moreInfoLink.click();
            System.out.println("-Нажата кнопка подробнее о сервисе-");
        } catch (Exception e) {
            System.out.println("Не удалось кликнуть по ссылке 'Подробнее о сервисе': " + e.getMessage());
        }

        acceptCookiesIfPresent();

        try {
            // Возврат по ссылке "Главная"
            WebElement mainLink = wait.until(ExpectedConditions.elementToBeClickable(
                    By.linkText("Главная")));
            mainLink.click();
            System.out.println("Нажата кнопка -Главная-");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        acceptCookiesIfPresent();

        try {
            // Ожидание заполнения полей и работы кнопки "Продолжить"
            WebElement phoneNumberField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("connection-phone")));
            phoneNumberField.sendKeys("297777777");
            WebElement summaButton = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.id("connection-sum")));
            summaButton.sendKeys("100");

            WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'Продолжить')]")));
            continueButton.click();
        } catch (Exception e) {
            System.out.println("Ошибка при взаимодействии с полями формы: " + e.getMessage());
        }

        acceptCookiesIfPresent();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Закрытие браузера
        driver.quit();
    }

    private static void acceptCookiesIfPresent() {
        if (cookieAccepted) {
            return; // Если кнопка уже была нажата, выходим из метода
        }

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            WebElement cookieAcceptButton = wait.until(ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[contains(text(), 'Принять')]")));
            cookieAcceptButton.click();
            cookieAccepted = true; // Устанавливаем, что кнопка была нажата
            System.out.println("Нажата кнопка подтверждения файлов cookie");
        } catch (Exception e) {
            System.out.println("Кнопка подтверждения cookie не найдена.");
        }
    }
}

