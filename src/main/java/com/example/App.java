package com.example;

public class App {

    public static void main(String[] args) {

        var checkoutPage = new CheckoutPage();

        checkoutPage.payForItems(Payment.payWithCard);
        checkoutPage.payForItems(Payment.payByBankTransfer);

    }

}
