package com.arun.designpattern.chainofresonsibility;

public class INR50Dispenser implements DispenserChain {

    private DispenserChain dispenserChain;

    @Override
    public void dispense(Currency currency) {
        if (currency.getValue() >= 50) {
            int num = currency.getValue()/50;
            System.out.println("Dispensing " + num + " INR50 note");
            int remainder = currency.getValue()%50;
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
