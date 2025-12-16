package com.example;

import com.example.WithdrawalRequest.Currency;

public class EuroATM extends ATM {

    private ATM nextATM;

    public EuroATM(ATM nextATM) {
        super(nextATM);
        this.nextATM = nextATM;
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getCurrency() == Currency.EUR) {
            System.out.println("Dispensing €" + request.getAmount());
        } else if (nextATM != null)
            nextATM.dispense(request);
    }
}
