package topUpMobilePhone.positive;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static constants.Constant.MobileTopUpTestData.*;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneTopUpPositiveTest extends BaseTest {
    @Test
    public void checkIsRedirectToAuth(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneTopUpPage.selectNumberToLogin();
        basePage.isAuthWidgetPresent();
    }

    @Test
    public void checkMinimumTopUpAmount(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneTopUpPage
                .enterPhoneNumber(MOBILE_PAYMENT_PHONE_NUMBER)
                .enterPaymentAmount(MOBILE_PAYMENT_ACTUAL_SUM)
                .enterCardFrom(MOBILE_PAYMENT_CARD)
                .enterCardExpDate(MOBILE_PAYMENT_CARD_EXP_DATE)
                .enterCardCvv(MOBILE_PAYMENT_CARD_CVV)
                .submitToPay()
                .checkPaymentDetailsArePresent(MOBILE_PAYMENT_DETAILS_TEST);
    }
}
