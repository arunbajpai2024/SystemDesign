package com.arun.designpattern.chainofresonsibility;

public class INR10Dispenser implements DispenserChain {

    private DispenserChain dispenserChain;

    @Override
    public void dispense(Currency currency) {
        if (currency.getValue() >= 10) {
            int num = currency.getValue()/10;
            System.out.println("Dispensing " + num + " INR10 note");
            int remainder = currency.getValue()%10;
            if (remainder>0) {
                System.out.println("Remaining amount " + remainder + " cannot be dispensed");
            }
        } else {
            System.out.println("Remaining amount " + currency.getValue() + " cannot be dispensed");
        }
    }

    @Override
    public void setNextDispenseChain(DispenserChain dispenseChain) {
        this.dispenserChain = dispenseChain;
    }
}
