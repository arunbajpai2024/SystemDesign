package com.arun.designpattern.chainofresonsibility;

public class INR100Dispenser implements DispenserChain {

    private DispenserChain dispenserChain;

    @Override
    public void dispense(Currency currency) {
        if (currency.getValue() >= 100) {
            int num = currency.getValue()/100;
            System.out.println("Dispensing " + num + " INR100 note");
            int remainder = currency.getValue()%100;
            if (remainder>0) {
                this.dispenserChain.dispense(new Currency(remainder));
            }
        } else {
            this.dispenserChain.dispense(currency);
        }
    }

    @Override
    public void setNextDispenseChain(DispenserChain dispenseChain) {
        this.dispenserChain = dispenseChain;
    }
}
