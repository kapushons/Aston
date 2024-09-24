import org.junit.jupiter.api.Test;

public class MtsTests extends BaseTest {

    String BY = "BY";
    String WORLD = "WORLD";

    @Test
    public void testBlockTitle() {
        CookiesPage cookiesPage = new CookiesPage(driver);
        cookiesPage.acceptCookies();

        RefillBlockPage refillBlockPage = new RefillBlockPage(driver);
        String expectedTitle = "Онлайн пополнение\nбез комиссии";
        refillBlockPage.verifyBlockTitle(expectedTitle);
    }

    @Test
    public void testPaymentSystemVisa() {
        CookiesPage cookiesPage = new CookiesPage(driver);
        cookiesPage.acceptCookies();

        PaymentSystemsPage paymentSystemsPage = new PaymentSystemsPage(driver);
        paymentSystemsPage.checkPaymentSystem("Visa");
    }

    @Test
    public void testPaymentSystemMasterCard() {
        CookiesPage cookiesPage = new CookiesPage(driver);
        cookiesPage.acceptCookies();

        PaymentSystemsPage paymentSystemsPage = new PaymentSystemsPage(driver);
        paymentSystemsPage.checkPaymentSystem("MasterCard");
    }

    @Test
    public void testPaymentSystemVerifiedByVisa() {
        CookiesPage cookiesPage = new CookiesPage(driver);
        cookiesPage.acceptCookies();

        PaymentSystemsPage paymentSystemsPage = new PaymentSystemsPage(driver);
        paymentSystemsPage.checkPaymentSystem("Verified By Visa");
    }

    @Test
    public void testPaymentSystemMasterCardSecureCode() {
        CookiesPage cookiesPage = new CookiesPage(driver);
        cookiesPage.acceptCookies();

        PaymentSystemsPage paymentSystemsPage = new PaymentSystemsPage(driver);
        paymentSystemsPage.checkPaymentSystem("MasterCard Secure Code");
    }

    @Test
    public void testPaymentSystemBelkart() {
        CookiesPage cookiesPage = new CookiesPage(driver);
        cookiesPage.acceptCookies();

        PaymentSystemsPage paymentSystemsPage = new PaymentSystemsPage(driver);
        paymentSystemsPage.checkPaymentSystem("Белкарт");
    }

    @Test
    public void testByBatton() {
        CookiesPage cookiesPage = new CookiesPage(driver);
        cookiesPage.acceptCookies();

        ByButton byButton = new ByButton(driver);
        byButton.testServiceContinueButton();
    }

    @Test
    public void testCheckPaymentSystem() {
        CookiesPage cookiesPage = new CookiesPage(driver);
        cookiesPage.acceptCookies();

        ByButton byButton = new ByButton(driver);
        byButton.testServiceContinueButton();

        CheckingPaymentSystemBlock checkingPaymentSystemBlock = new CheckingPaymentSystemBlock(driver);
        checkingPaymentSystemBlock.testCheckPaymentSystemSumm();

    }

    @Test
    public void testBlankFields() {
        CookiesPage cookiesPage = new CookiesPage(driver);
        cookiesPage.acceptCookies();

        ByButton byButton = new ByButton(driver);
        byButton.testServiceContinueButton();

        BlankFields blankFields = new BlankFields(driver);
        blankFields.testBlankFields("Номер карты", "creditCard");
        blankFields.testBlankFields("Срок действия", "expirationDate");
        blankFields.testBlankFields("CVC", "cvc");
        blankFields.testBlankFields("Имя держателя (как на карте)", "holder");
    }

    @Test
    public void testPhoneNumberData() {
        CookiesPage cookiesPage = new CookiesPage(driver);
        cookiesPage.acceptCookies();

        ByButton byButton = new ByButton(driver);
        byButton.testServiceContinueButton();

        PhoneNumberData phoneNumberData = new PhoneNumberData(driver);
        phoneNumberData.testPhoneNumberData("Оплата: Услуги связи\n" +
                "Номер:375297777777");
    }

    @Test
    public void testCheckingPaymentSystemIcon() {
        CookiesPage cookiesPage = new CookiesPage(driver);
        cookiesPage.acceptCookies();

        ByButton byButton = new ByButton(driver);
        byButton.testServiceContinueButton();

        CheckingPaymentSystemIcon checkingPaymentSystemIcon = new CheckingPaymentSystemIcon(driver);
        checkingPaymentSystemIcon.testCheckingPaymentSystemIcon("assets/images/payment-icons/card-types/visa-system.svg", BY);
        checkingPaymentSystemIcon.testCheckingPaymentSystemIcon("assets/images/payment-icons/card-types/mastercard-system.svg", BY);
        checkingPaymentSystemIcon.testCheckingPaymentSystemIcon("assets/images/payment-icons/card-types/belkart-system.svg", BY);
        checkingPaymentSystemIcon.testCheckingPaymentSystemIcon("assets/images/payment-icons/card-types/mir-system-ru.svg", WORLD);
    }

    @Test
    public void testCheckinGdropDownListCommunicationServices() {
        String[] expected = new String[]{"Номер телефона", "Сумма", "E-mail для отправки чека"};
        String[] xPathFields = new String[]{"connection-phone", "connection-sum", "connection-email"};
        CheckinGdropDownList checkinGdropDownList = new CheckinGdropDownList(driver);
        checkinGdropDownList.testCheckinGdropDownList(expected, xPathFields);
    }

    @Test
    public void testCheckinGdropDownListHomeInternet () {
        String[] expected = new String[]{"Номер абонента", "Сумма", "E-mail для отправки чека"};
        String[] xPathFields = new String[]{"internet-phone", "internet-sum", "internet-email"};
        CheckinGdropDownList checkinGdropDownList = new CheckinGdropDownList(driver);
        checkinGdropDownList.testCheckinGdropDownList(expected, xPathFields);
    }

    @Test
    public void testCheckinGdropDownListInstallment () {
        String[] expected = new String[]{"Номер счета на 44", "Сумма", "E-mail для отправки чека"};
        String[] xPathFields = new String[]{"score-instalment", "instalment-sum", "instalment-email"};
        CheckinGdropDownList checkinGdropDownList = new CheckinGdropDownList(driver);
        checkinGdropDownList.testCheckinGdropDownList(expected, xPathFields);
    }

    @Test
    public void testCheckinGdropDownListIndebtedness() {
        String[] expected = new String[]{"Номер счета на 2073", "Сумма", "E-mail для отправки чека"};
        String[] xPathFields = new String[]{"score-arrears", "arrears-sum", "arrears-email"};
        CheckinGdropDownList checkinGdropDownList = new CheckinGdropDownList(driver);
        checkinGdropDownList.testCheckinGdropDownList(expected, xPathFields);
    }

}

