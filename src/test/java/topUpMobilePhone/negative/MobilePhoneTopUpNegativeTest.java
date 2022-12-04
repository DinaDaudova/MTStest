package topUpMobilePhone.negative;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static constants.Constant.MobileTopUpTestData.*;
import static constants.Constant.Urls.MOBILE_PAYMENT_URL;

public class MobilePhoneTopUpNegativeTest extends BaseTest {
    @Test
    public void inputEmptyData(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneTopUpPage
                .submitToPay()
                .checkPhoneNumberErrorMessage(EMPTY_DATA_ERROR_MESSAGE)
                .checkPaymentAmountErrorMessage(EMPTY_DATA_ERROR_MESSAGE)
                .checkCardFormErrorMessage(EMPTY_DATA_ERROR_MESSAGE)
                .checkCardExpDateErrorMessage(EMPTY_DATA_ERROR_MESSAGE)
                .checkCardCvvErrorMessage(EMPTY_DATA_ERROR_MESSAGE);

    }

    @Test
    public void inputInvalidCredsWithMinimumSumWithExpiredCard(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneTopUpPage
                .enterPhoneNumber(INVALID_MOBILE_PAYMENT_PHONE_NUMBER)
                .enterPaymentAmount(INVALID_MOBILE_PAYMENT_MINIMUM_SUM)
                .enterCardFrom(INVALID_MOBILE_PAYMENT_CARD)
                .enterCardExpDate(INVALID_MOBILE_PAYMENT_CARD_EXP_DATE)
                .enterCardCvv(INVALID_MOBILE_PAYMENT_CARD_CVV)
                .submitToPay()
                .checkPhoneNumberErrorMessage(MOBILE_PAYMENT_PHONE_NUMBER_INVALID_CREDS_MESSAGE)
                .checkPaymentAmountErrorMessage(MOBILE_PAYMENT_MINIMUM_AMOUNT_ERROR_MESSAGE)
                .checkCardFormErrorMessage(MOBILE_PAYMENT_CARD_FORM_INVALID_CREDS_ERROR_MESSAGE)
                .checkCardExpDateErrorMessage(MOBILE_PAYMENT_CARD_HAS_EXPIRED_ERROR_MESSAGE)
                .checkCardCvvErrorMessage(MOBILE_PAYMENT_CARD_CVV_NOT_ENOUGH_DIGITS_ERROR_MESSAGE);

    }

    @Test
    public void inputInvalidCredsWithMaximumSumAndExpDateInvalidDigits(){
        basePage.goToUrl(MOBILE_PAYMENT_URL);
        mobilePhoneTopUpPage
                .enterPhoneNumber(INVALID_MOBILE_PAYMENT_PHONE_NUMBER)
                .enterPaymentAmount(INVALID_MOBILE_PAYMENT_MAXIMUM_SUM)
                .enterCardFrom(INVALID_MOBILE_PAYMENT_CARD)
                .enterCardExpDate(INVALID_MOBILE_PAYMENT_CARD_EXP_DATE)
                .enterCardCvv(INVALID_MOBILE_PAYMENT_CARD_CVV)
                .submitToPay()
                .checkPhoneNumberErrorMessage(MOBILE_PAYMENT_PHONE_NUMBER_INVALID_CREDS_MESSAGE)
                .checkPaymentAmountErrorMessage(MOBILE_PAYMENT_MAXIMUM_AMOUNT_ERROR_MESSAGE)
                .checkCardFormErrorMessage(MOBILE_PAYMENT_CARD_FORM_INVALID_CREDS_ERROR_MESSAGE)
                .checkCardExpDateErrorMessage(MOBILE_PAYMENT_CARD_HAS_EXPIRED_ERROR_MESSAGE)
                .checkCardCvvErrorMessage(MOBILE_PAYMENT_CARD_CVV_NOT_ENOUGH_DIGITS_ERROR_MESSAGE);

    }

}
