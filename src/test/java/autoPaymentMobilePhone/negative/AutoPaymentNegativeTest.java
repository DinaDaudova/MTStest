package autoPaymentMobilePhone.negative;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static constants.Constant.MobileTopUpTestData.*;
import static constants.Constant.Urls.AUTO_PAYMENT_URL;

public class AutoPaymentNegativeTest extends BaseTest{

    @Test
    public void checkAutoPaymentInvalidCredsErrorMessage() {
        basePage.goToUrl(AUTO_PAYMENT_URL);
        autoPaymentPage
                .clickOnPaymentField(INVALID_AUTO_PAYMENT_FIELD_NAME)
                .autopayFieldInvalidCredsErrorMessage(INVALID_AUTO_PAYMENT_FIELD_ERROR_MESSAGE);
    }

    @Test
    public void checkPhoneNumberFieldEmptyDataErrorMessage(){
        basePage.goToUrl(AUTO_PAYMENT_URL);
        autoPaymentPage
                .selectTabMobileTelephone()
                .clickButtonSubmit()
                .checkPhoneNumberErrorMessage(EMPTY_DATA_ERROR_MESSAGE);
    }

    @Test
    public void checkPhoneNumberFieldInvalidCredsErrorMessage() {
        basePage.goToUrl(AUTO_PAYMENT_URL);
        autoPaymentPage
                .selectTabMobileTelephone()
                .enterPhoneNumber(INVALID_MOBILE_PAYMENT_PHONE_NUMBER)
                .clickButtonSubmit()
                .checkPhoneNumberErrorMessage(MOBILE_PAYMENT_PHONE_NUMBER_INVALID_CREDS_MESSAGE);
    }

    @Test
    public void checkScheduleTimeAndSumEmptyDataErrorMessage() {
        basePage.goToUrl(AUTO_PAYMENT_URL);
        autoPaymentPage
                .selectTabMobileTelephone()
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .clickOnListOfSchedule()
                .clickDailyTypeOfSchedule()
                .clickDayPickerButton()
                .clickDayOfTheMonth()
                .clearAndInputScheduleTime("")
                .clearAndInputSumOfPayment("")
                .clickButtonSubmit()
                .checkScheduleTimeErrorMessage(EMPTY_DATA_ERROR_MESSAGE)
                .checkSumOfPaymentErrorMessage(EMPTY_DATA_ERROR_MESSAGE);
    }


    @Test
    public void checkScheduleTimeAndMinimumSumInvalidCredsErrorMessage() {
        basePage.goToUrl(AUTO_PAYMENT_URL);
        autoPaymentPage
                .selectTabMobileTelephone()
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .clickOnListOfSchedule()
                .clickDailyTypeOfSchedule()
                .clickDayPickerButton()
                .clickDayOfTheMonth()
                .clearAndInputScheduleTime(INVALID_AUTO_PAYMENT_SCHEDULE_TIME)
                .clearAndInputSumOfPayment(INVALID_AUTO_PAYMENT_MINIMUM_SUM)
                .clickButtonSubmit()
                .checkScheduleTimeErrorMessage(SCHEDULE_TIME_INVALID_CREDS_MESSAGE)
                .checkSumOfPaymentErrorMessage(AUTO_PAYMENT_MINIMUM_AMOUNT_ERROR_MESSAGE);
    }

    @Test
    public void checkScheduleTimeAndMaximumSumInvalidCredsErrorMessage() {
        basePage.goToUrl(AUTO_PAYMENT_URL);
        autoPaymentPage
                .selectTabMobileTelephone()
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .clickOnListOfSchedule()
                .clickDailyTypeOfSchedule()
                .clickDayPickerButton()
                .clickDayOfTheMonth()
                .clearAndInputScheduleTime(INVALID_AUTO_PAYMENT_SCHEDULE_TIME)
                .clearAndInputSumOfPayment(INVALID_AUTO_PAYMENT_MAXIMUM_SUM)
                .clickButtonSubmit()
                .checkScheduleTimeErrorMessage(SCHEDULE_TIME_INVALID_CREDS_MESSAGE)
                .checkSumOfPaymentErrorMessage(AUTO_PAYMENT_MAXIMUM_AMOUNT_ERROR_MESSAGE);
    }
}
