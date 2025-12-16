package com.example;

public class UsDollarATM extends ATM {

    private ATM nextATM;

    public UsDollarATM(ATM nextATM) {
        super(nextATM);
        this.nextATM = nextATM;
    }

    @Override
    public void dispense(WithdrawalRequest request) {
        if (request.getCurrency() == WithdrawalRequest.Currency.USD) {
            System.out.println("Dispensing $" + request.getAmount());
        } else if (nextATM != null)
            nextATM.dispense(request);
    }

}
