package ru.netology.web.data;

import lombok.Value;


import java.util.Random;

public class DataHelper {
    private DataHelper() {
    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123");
    }

    public static VerificationCodeFor getVerificationCodeFor(AuthInfo info) {
        return new VerificationCodeFor("12345");
    }

    public static CardInfo getFirstCardInfo() {
        return new CardInfo("5559000000000001", "92df3f1c-a033-48e6-8390-206f6b1f56c0");
    }

    public static CardInfo getSecondCardInfo() {
        return new CardInfo("5559000000000002", "0f3f5c2a-249e-4c3d-8287-09f7a039391d");
    }
    public static int generateValidAmount(int balance) {
        return new Random().nextInt(Math.abs(balance));
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
    }

    @Value
    public static class VerificationCodeFor {
        private String code;
    }

    @Value
    public static class CardInfo {
        String cardNumber;
        String Id;
    }
}



