package pages.topUpMobilePhone;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

public class MobilePhoneTopUpPage extends BasePage {

    public MobilePhoneTopUpPage(WebDriver driver) {
        super(driver);
    }

    private final By buttonLogin = By.xpath("//div[@class='b-radio__label']");
    private final By inputPhoneNumber = By.xpath("(//input[@data-type='phone'])[1]");
    private final By inputPaymentAmount = By.xpath("//input[@name='Sum']");
    private final By inputCardFrom = By.xpath("(//input[@name='Pan'])[2]");
    private final By inputCardExpDate = By.xpath("(//input[@name='ExpiryMonthYear'])[2]");
    private final By inputCardCvv = By.xpath("(//input[@name='Cvc'])[2]");
    private final By buttonSubmitToPay = By.xpath("//button[@name='btn_submit']");
    private final By paymentDetails = By.xpath("//span[contains(text(),'Извините, платеж')]");
    private final By phoneNumberErrorMessage = By.xpath("//div[@data-error_holder='Parameter[0]_NUMBER']");
    private final By paymentAmountErrorMessage = By.xpath("//div[@data-error_holder='Sum']");
    private final By cardFormErrorMessage = By.xpath("//div[@data-error_holder='Pan']");
    private final By cardExpDateErrorMessage = By.xpath("//div[@data-error_holder='Exp']");
    private final By cardCvvErrorMessage = By.xpath("//div[@data-error_holder='Cvc']");


    public MobilePhoneTopUpPage selectNumberToLogin(){
        driver.findElement(buttonLogin).click();
        return this;
    }

    public MobilePhoneTopUpPage enterPhoneNumber(String number){
        driver.findElement(inputPhoneNumber).sendKeys(number);
        return this;
    }

    public MobilePhoneTopUpPage enterPaymentAmount(String amount){
        driver.findElement(inputPaymentAmount).sendKeys(amount);
        return this;
    }

    public MobilePhoneTopUpPage enterCardFrom(String card){
        driver.findElement(inputCardFrom).sendKeys(card);
        return this;
    }

    public MobilePhoneTopUpPage enterCardExpDate(String expDate){
        driver.findElement(inputCardExpDate).sendKeys(expDate);
        return this;
    }

    public MobilePhoneTopUpPage enterCardCvv (String cvv){
        driver.findElement(inputCardCvv).sendKeys(cvv);
        return this;
    }

    public MobilePhoneTopUpPage submitToPay(){
        driver.findElement(buttonSubmitToPay).click();
        return this;
    }

    public MobilePhoneTopUpPage checkPaymentDetailsArePresent(String text){
        waitElementIsVisible(driver.findElement(paymentDetails));
        WebElement details = driver.findElement(paymentDetails);
        Assertions.assertEquals(text, details.getText());
        return this;
    }

    public MobilePhoneTopUpPage checkPhoneNumberErrorMessage(String text){
        WebElement errorMessage = driver.findElement(phoneNumberErrorMessage);
        waitElementIsVisible(errorMessage);
        Assertions.assertEquals(text, errorMessage.getText());
        return this;
    }

    public MobilePhoneTopUpPage checkPaymentAmountErrorMessage(String text){
        waitElementIsVisible(driver.findElement(paymentAmountErrorMessage));
        WebElement errorMessage = driver.findElement(paymentAmountErrorMessage);
        Assertions.assertEquals(text, errorMessage.getText());
        return this;
    }

    public MobilePhoneTopUpPage checkCardFormErrorMessage(String text){
        waitElementIsVisible(driver.findElement(cardFormErrorMessage));
        WebElement errorMessage = driver.findElement(cardFormErrorMessage);
        Assertions.assertEquals(text, errorMessage.getText());
        return this;
    }

    public MobilePhoneTopUpPage checkCardExpDateErrorMessage(String text){
        waitElementIsVisible(driver.findElement(cardExpDateErrorMessage));
        WebElement errorMessage = driver.findElement(cardExpDateErrorMessage);
        Assertions.assertEquals(text, errorMessage.getText());
        return this;
    }

    public MobilePhoneTopUpPage checkCardCvvErrorMessage(String text){
        waitElementIsVisible(driver.findElement(cardCvvErrorMessage));
        WebElement errorMessage = driver.findElement(cardCvvErrorMessage);
        Assertions.assertEquals(text, errorMessage.getText());
        return this;
    }


}
