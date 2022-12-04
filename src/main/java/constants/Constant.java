package constants;

public class Constant {
    public static class TimeoutVariables{
        public static final int IMPLICIT_WAIT = 20;
        public static final int EXPLICIT_WAIT = 20;
    }

    public static class Urls{
        public static final String MOBILE_PAYMENT_URL = "https://payment.mts.ru/pay/phone";

        public static final String AUTO_PAYMENT_URL = "https://payment.mts.ru/autopayment";

    }

    public static class MobileTopUpTestData{
        public static final String MOBILE_PAYMENT_PHONE_NUMBER = "9163559931";
        public static final String INVALID_MOBILE_PAYMENT_PHONE_NUMBER = "23232323";
        public static final String MOBILE_PAYMENT_CARD = "5189018580519605";
        public static final String INVALID_MOBILE_PAYMENT_CARD = "89898988";
        public static final String MOBILE_PAYMENT_CARD_EXP_DATE = "0124";
        public static final String INVALID_MOBILE_PAYMENT_CARD_EXP_DATE = "0101";
        public static final String MOBILE_PAYMENT_CARD_CVV = "123";
        public static final String INVALID_MOBILE_PAYMENT_CARD_CVV = "1";
        public static final String MOBILE_PAYMENT_ACTUAL_SUM = "1";
        public static final String INVALID_MOBILE_PAYMENT_MINIMUM_SUM = "0";
        public static final String INVALID_MOBILE_PAYMENT_MAXIMUM_SUM = "9090909";
        public static final String AUTO_PAYMENT_PERIOD_DAYS = "20";
        public static final String AUTO_PAYMENT_SCHEDULE_TIME = "0000";
        public static final String INVALID_AUTO_PAYMENT_SCHEDULE_TIME = "1";
        public static final String INVALID_AUTO_PAYMENT_MINIMUM_SUM = "0";
        public static final String INVALID_AUTO_PAYMENT_MAXIMUM_SUM = "9 090 909";
        public static final String AUTO_PAYMENT_ACTUAL_SUM = "51";
        public static final String INVALID_AUTO_PAYMENT_FIELD_NAME = "oxoxox";
        public static final String INVALID_AUTO_PAYMENT_FIELD_ERROR_MESSAGE = "Ничего не найдено";
        public static final String MOBILE_PAYMENT_DETAILS_TEST = "Извините, платеж не был совершен";
        public static final String EMPTY_DATA_ERROR_MESSAGE = "Это поле необходимо заполнить";
        public static final String MOBILE_PAYMENT_PHONE_NUMBER_INVALID_CREDS_MESSAGE = "Неверный формат";
        public static final String SCHEDULE_TIME_INVALID_CREDS_MESSAGE = "Некорректное время";
        public static final String MOBILE_PAYMENT_MINIMUM_AMOUNT_ERROR_MESSAGE = "Минимальная сумма платежа 0,01 руб.";
        public static final String AUTO_PAYMENT_MINIMUM_AMOUNT_ERROR_MESSAGE = "Минимальная сумма автоплатежа 50 руб.";
        public static final String MOBILE_PAYMENT_MAXIMUM_AMOUNT_ERROR_MESSAGE = "Максимальная сумма платежа 300 000 руб.";
        public static final String AUTO_PAYMENT_MAXIMUM_AMOUNT_ERROR_MESSAGE = "Максимальная сумма автоплатежа 10 000 руб.";
        public static final String MOBILE_PAYMENT_CARD_FORM_INVALID_CREDS_ERROR_MESSAGE = "Неверный номер карты";
        public static final String MOBILE_PAYMENT_CARD_HAS_EXPIRED_ERROR_MESSAGE = "Срок действия карты истек";
        public static final String MOBILE_PAYMENT_CARD_EXP_DATE_INVALID_DIGITS_ERROR_MESSAGE = "Значение должно быть от 1 до 12";
        public static final String MOBILE_PAYMENT_CARD_CVV_NOT_ENOUGH_DIGITS_ERROR_MESSAGE = "CVC должен содержать 3 цифры";

    }
}
