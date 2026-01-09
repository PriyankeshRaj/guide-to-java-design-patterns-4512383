package com.example;

public class CheckoutPage {

    public void payForItems(Payment paymentMethod) {
        paymentMethod.pay();
    }
}
