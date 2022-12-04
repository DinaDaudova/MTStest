package pages.autoPaymentMobilePhone;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;


public class AutoPaymentPage extends BasePage {
    public final By tabMobileTelephone = By.xpath("//div[contains(text(), 'Моб. телефон МТС')]");
    public final By inputPhoneNumber = By.xpath("//input[@data-type='phone']");
    public final By listOfSchedule = By.xpath("//div[@class='b-select__select js__select-select']");
    public final By dailyTypeOfSchedule = By.xpath("//div[@class='b-select__list js__select-list is-show']//div[@class='b-select__item-link']");
    public final By weeklyTypeOfSchedule = By.xpath("(//div[@class='b-select__list js__select-list is-show']//div[@class='b-select__item-link'])[2]");
    public final By monthlyTypeOfSchedule = By.xpath("(//div[@class='b-select__list js__select-list is-show']//div[@class='b-select__item-link'])[3]");
    public final By periodicallyTypeOfSchedule = By.xpath("(//div[@class='b-select__list js__select-list is-show']//div[@class='b-select__item-link'])[4]");
    public final By listOfDaysOfTheWeek = By.xpath("(//div[@class='b-select__select js__select-select'])[2]");
    public final By selectDaysOfTheWeek = By.xpath("(//div[@class='b-select__list js__select-list is-show']//div[@class='b-select__item-link'])[3]");
    public final By buttonDatePicker = By.xpath("//button[@class='ui-datepicker-trigger']");
    public final By selectDayOfTheMonth = By.xpath("(//div[@id='ui-datepicker-div']//a[@class='ui-state-default'])[7]");
    public final By inputScheduleTime = By.xpath("//input[@data-internalid='Schedule.Time']");
    public final By inputSumOfPayment = By.xpath("//input[@data-internalid='Sum']");
    public final By buttonSubmit = By.xpath("//button[@name='btn_submit']");
    public final By inputPeriodField = By.xpath("//input[@data-internalid='Schedule.Period']");
    public final By autoPaymentFieldInvalidCreds = By.xpath("//ul[@id='ui-id-2']");
    public final By inputPaymentField = By.xpath("//input[@name='SelectedItemText']");
    public final By invalidCredsInPhoneNumberFieldErrorMessage = By.xpath("//div[@data-error_holder='Parameter[0]_NUMBER']");
    public final By invalidCredsInScheduleTimeFieldErrorMessage = By.xpath("//div[@data-error_holder='Schedule.Time']");
    public final By invalidCredsInSumOfPaymentFieldErrorMessage = By.xpath("//div[@data-error_holder='Sum']");


    public AutoPaymentPage(WebDriver driver) {
        super(driver);
    }

    public AutoPaymentPage checkPhoneNumberErrorMessage (String errorText){
       String ErrorMessage = driver.findElement(invalidCredsInPhoneNumberFieldErrorMessage).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }

    public AutoPaymentPage checkScheduleTimeErrorMessage (String errorText){
       String ErrorMessage = driver.findElement(invalidCredsInScheduleTimeFieldErrorMessage).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }

    public AutoPaymentPage checkSumOfPaymentErrorMessage (String errorText){
       String ErrorMessage = driver.findElement(invalidCredsInSumOfPaymentFieldErrorMessage).getText();
        Assert.assertEquals(errorText, ErrorMessage);
        return this;
    }

    public AutoPaymentPage selectTabMobileTelephone(){
        driver.findElement(tabMobileTelephone).click();
        return this;
    }

    public AutoPaymentPage enterPhoneNumber(String number){
        WebElement phoneNumber = driver.findElement(inputPhoneNumber);
        waitElementIsVisible(phoneNumber);
        phoneNumber.sendKeys(number);
        return this;
    }

    public AutoPaymentPage clickOnPaymentField(String nameOfAutoPay){
        driver.findElement(inputPaymentField).click();
        driver.findElement(inputPaymentField).sendKeys(nameOfAutoPay);
        return this;
    }
    public AutoPaymentPage autopayFieldInvalidCredsErrorMessage(String errorMessage){
        waitElementIsVisible(driver.findElement(autoPaymentFieldInvalidCreds));
        String autopayFieldErrorMessageText = driver.findElement(autoPaymentFieldInvalidCreds).getText();
        Assert.assertEquals(errorMessage, autopayFieldErrorMessageText);
        return this;
    }

    public AutoPaymentPage clickOnListOfSchedule(){
        WebElement selectSchedule = driver.findElement(listOfSchedule);
        waitElementIsVisible(selectSchedule);
        selectSchedule.click();
        return this;
    }

    public AutoPaymentPage clickOnListOfDaysOfTheWeek(){
        WebElement selectDayOfTheWeek = driver.findElement(listOfDaysOfTheWeek);
        waitElementIsVisible(selectDayOfTheWeek);
        selectDayOfTheWeek.click();
        return this;
    }

    public AutoPaymentPage clickOnDayOfTheWeek(){
        driver.findElement(selectDaysOfTheWeek).click();
        return this;
    }


    public AutoPaymentPage clickDailyTypeOfSchedule(){
        WebElement daily = driver.findElement(dailyTypeOfSchedule);
        waitElementIsVisible(daily);
        daily.click();
        return this;
    }


    public AutoPaymentPage clickWeeklyTypeOfSchedule(){
        WebElement daily = driver.findElement(weeklyTypeOfSchedule);
        waitElementIsVisible(daily);
        daily.click();
        return this;
    }
    public AutoPaymentPage clickMonthlyTypeOfSchedule(){
        WebElement periodically = driver.findElement(periodicallyTypeOfSchedule);
        waitElementIsVisible(periodically);
        periodically.click();
        return this;
    }
    public AutoPaymentPage periodicallyTypeOfSchedule(){
        WebElement monthly = driver.findElement(monthlyTypeOfSchedule);
        waitElementIsVisible(monthly);
        monthly.click();
        return this;
    }

    public AutoPaymentPage clickDayPickerButton(){
        driver.findElement(buttonDatePicker).click();
        return this;
    }


    public AutoPaymentPage clickDayOfTheMonth(){
        WebElement dayNumber = driver.findElement(selectDayOfTheMonth);
        waitElementIsVisible(dayNumber);
        dayNumber.click();
        return this;
    }

    public AutoPaymentPage clearAndInputScheduleTime(String number){
        driver.findElement(inputScheduleTime).sendKeys(Keys.CONTROL,"a");
        driver.findElement(inputScheduleTime).sendKeys(Keys.BACK_SPACE);
        driver.findElement(inputScheduleTime).sendKeys(number);
        return this;
    }

    public AutoPaymentPage clearAndInputSumOfPayment(String number){
        driver.findElement(inputSumOfPayment).click();
        driver.findElement(inputSumOfPayment).sendKeys(Keys.CONTROL,"a");
        driver.findElement(inputSumOfPayment).sendKeys(Keys.BACK_SPACE);
        driver.findElement(inputSumOfPayment).sendKeys(number);
        return this;
    }

    public AutoPaymentPage clickButtonSubmit(){
        driver.findElement(buttonSubmit).click();
        return this;
    }
     public AutoPaymentPage clickInputPeriodFieldAndSendKeys(String days){
        driver.findElement(inputPeriodField).click();
        driver.findElement(inputPeriodField).sendKeys(days);
        return this;
    }



}
