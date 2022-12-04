package autoPaymentMobilePhone.positive;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static constants.Constant.MobileTopUpTestData.*;
import static constants.Constant.Urls.AUTO_PAYMENT_URL;


public class AutoPaymentPositiveTest extends BaseTest {
    @Test
    public void dailyAutoPayment(){
     basePage.goToUrl(AUTO_PAYMENT_URL);
     autoPaymentPage
             .selectTabMobileTelephone()
             .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
             .clickOnListOfSchedule()
             .clickDailyTypeOfSchedule()
             .clickDayPickerButton()
             .clickDayOfTheMonth()
             .clearAndInputScheduleTime(AUTO_PAYMENT_SCHEDULE_TIME)
             .clearAndInputSumOfPayment(AUTO_PAYMENT_ACTUAL_SUM)
             .clickButtonSubmit();
     basePage.isAuthWidgetPresent();
  }

    @Test
    public void weeklyAutoPayment(){
        basePage.goToUrl(AUTO_PAYMENT_URL);
        autoPaymentPage
                .selectTabMobileTelephone()
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .clickOnListOfSchedule()
                .clickWeeklyTypeOfSchedule()
                .clickOnListOfDaysOfTheWeek()
                .clickOnDayOfTheWeek()
                .clickDayPickerButton()
                .clickDayOfTheMonth()
                .clearAndInputScheduleTime(AUTO_PAYMENT_SCHEDULE_TIME)
                .clearAndInputSumOfPayment(AUTO_PAYMENT_ACTUAL_SUM)
                .clickButtonSubmit();
        basePage.isAuthWidgetPresent();

    }

    @Test
    public void monthlyAutoPayment() {
        basePage.goToUrl(AUTO_PAYMENT_URL);
        autoPaymentPage
                .selectTabMobileTelephone()
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .clickOnListOfSchedule()
                .clickMonthlyTypeOfSchedule()
                .clickDayPickerButton()
                .clickDayOfTheMonth()
                .clearAndInputScheduleTime(AUTO_PAYMENT_SCHEDULE_TIME)
                .clearAndInputSumOfPayment(AUTO_PAYMENT_ACTUAL_SUM)
                .clickButtonSubmit();
        basePage.isAuthWidgetPresent();

    }

    @Test
    public void periodicallyAutoPayment() {
        basePage.goToUrl(AUTO_PAYMENT_URL);
        autoPaymentPage
                .selectTabMobileTelephone()
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .clickOnListOfSchedule()
                .clickMonthlyTypeOfSchedule()
                .clickInputPeriodFieldAndSendKeys(AUTO_PAYMENT_PERIOD_DAYS)
                .clickDayPickerButton()
                .clickDayOfTheMonth()
                .clearAndInputScheduleTime(AUTO_PAYMENT_SCHEDULE_TIME)
                .clearAndInputSumOfPayment(AUTO_PAYMENT_ACTUAL_SUM)
                .clickButtonSubmit();
        basePage.isAuthWidgetPresent();

    }
}
