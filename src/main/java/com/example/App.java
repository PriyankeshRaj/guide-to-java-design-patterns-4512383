package com.example;

public class App {

    public static void main(String[] args) {
        var request = new WithdrawalRequest(20, WithdrawalRequest.Currency.EUR);
        var atm = buildATM(request);
        atm.dispense(request);
    }

    public static ATM buildATM(WithdrawalRequest request) {
        ATM usdATM = new UsDollarATM(null);
        ATM euroATM = new EuroATM(usdATM);
        return euroATM;
    }

}
